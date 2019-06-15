package pl.kis.agh.compilers.ast

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.Token
import pl.kis.agh.compilers.Config
import pl.kis.agh.compilers.polcodex.PolcodexParser.*

interface ParseTreeToAstMapper<in PTN : ParserRuleContext, out ASTN : Node> {
  fun map(parseTreeNode: PTN): ASTN
}

fun PolcodexFileContext.toAst(considerPosition: Boolean = false): SandyFile =
  SandyFile(
    this.line().map { it.statement().toAst(considerPosition) },
    toPosition(considerPosition)
  )

fun Token.startPoint() = Point(line, charPositionInLine)

fun Token.endPoint() = Point(line, charPositionInLine + text.length)

fun ParserRuleContext.toPosition(considerPosition: Boolean): Position? {
  return if (considerPosition) Position(
    start.startPoint(),
    stop.endPoint()
  ) else null
}

fun StatementContext.toAst(considerPosition: Boolean = false): Statement = when (this) {
  is VarDeclarationStatementContext -> VarDeclaration(
    varDeclaration().assignment().ID().text,
    varDeclaration().assignment().expression().toAst(considerPosition),
    toPosition(considerPosition)
  )
  is AssignmentStatementContext -> Assignment(
    assignment().ID().text,
    assignment().expression().toAst(considerPosition),
    toPosition(considerPosition)
  )
  is PrintStatementContext -> Print(
    print().expression().toAst(
      considerPosition
    ), toPosition(considerPosition)
  )
  is IfStatementContext -> IfStatement(
    ifStmt().expression().toAst(
      considerPosition
    ),
    ifStmt().trueStatement.toAst(considerPosition),
    ifStmt().falseStatement.toAst(considerPosition),
    toPosition(considerPosition)
  )
  is FunctionStatementContext -> FunctionStatement(
    functionDeclaration().functionName().ID().text,
    functionDeclaration().argumentList().argument().map { it.expression().toAst(considerPosition) },
    functionDeclaration().functionBody.statement().map { it.toAst(considerPosition) })
  is FunctionCallContext ->
    FunctionCall(
      functionName().text,
      argumentList().argument().map { it.expression().toAst(considerPosition) },
      toPosition(considerPosition)
    )
  is ForStatementContext -> ForStatement(
    forStmt().forConditions().iterator.toAst(considerPosition),
    forStmt().forConditions().startExpr.toAst(considerPosition),
    forStmt().forConditions().endExpr.toAst(considerPosition),
    forStmt().forBody.statement().map { it.toAst(considerPosition) },
    toPosition(considerPosition)
    )
  else -> throw UnsupportedOperationException(this.javaClass.canonicalName)
}

fun ExpressionContext.toAst(considerPosition: Boolean = false): Expression = when (this) {
  is BinaryOperationContext -> toAst(considerPosition)
  is ConditionalExpressionContext -> toAst(considerPosition)
  is IntLiteralContext -> IntLit(text, toPosition(considerPosition))
  is DecimalLiteralContext -> DecLit(text, toPosition(considerPosition))
  is ParenExpressionContext -> expression().toAst(considerPosition)
  is VarReferenceContext -> VarReference(
    text,
    toPosition(considerPosition)
  )
  is TypeConversionContext -> TypeConversion(
    expression().toAst(
      considerPosition
    ), targetType.toAst(considerPosition), toPosition(considerPosition)
  )
  else -> throw UnsupportedOperationException(this.javaClass.canonicalName)
}


fun TypeContext.toAst(considerPosition: Boolean = false): Type = when (this) {
  is IntegerContext -> IntType(toPosition(considerPosition))
  is DecimalContext -> DecimalType(toPosition(considerPosition))
  else -> throw UnsupportedOperationException(this.javaClass.canonicalName)
}

fun BinaryOperationContext.toAst(considerPosition: Boolean = false): Expression = when (op.text) {
  Config.ADD -> SumExpression(
    left.toAst(
      considerPosition
    ), right.toAst(considerPosition), toPosition(considerPosition)
  )
  Config.SUB -> SubtractionExpression(
    left.toAst(
      considerPosition
    ), right.toAst(considerPosition), toPosition(considerPosition)
  )
  Config.MUL -> MultiplicationExpression(
    left.toAst(
      considerPosition
    ), right.toAst(considerPosition), toPosition(considerPosition)
  )
  Config.DIV -> DivisionExpression(
    left.toAst(
      considerPosition
    ), right.toAst(considerPosition), toPosition(considerPosition)
  )
  else -> throw UnsupportedOperationException(this.javaClass.canonicalName)
}

fun ConditionalExpressionContext.toAst(considerPosition: Boolean = false): Expression =
  when (cmp.text) {
    Config.EQUAL -> EqualExpression(
      left.toAst(
        considerPosition
      ), right.toAst(considerPosition), toPosition(considerPosition)
    )
    Config.NOTEQUAL -> NotEqualExpression(
      left.toAst(
        considerPosition
      ), right.toAst(considerPosition), toPosition(considerPosition)
    )
    Config.GREATER -> GreaterExpression(
      left.toAst(
        considerPosition
      ), right.toAst(considerPosition), toPosition(considerPosition)
    )
    Config.LOWER -> LowerExpression(
      left.toAst(
        considerPosition
      ), right.toAst(considerPosition), toPosition(considerPosition)
    )
    else -> throw UnsupportedOperationException(this.javaClass.canonicalName)
  }
