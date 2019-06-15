// Generated from /Users/michaldziedzic/mojestudiatozart/kompilatory/agh-polcodex/src/main/antlr/PolcodexParser.g4 by ANTLR 4.5.1
package pl.kis.agh.compilers.polcodex;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PolcodexParser}.
 */
public interface PolcodexParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PolcodexParser#polcodexFile}.
	 * @param ctx the parse tree
	 */
	void enterPolcodexFile(PolcodexParser.PolcodexFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolcodexParser#polcodexFile}.
	 * @param ctx the parse tree
	 */
	void exitPolcodexFile(PolcodexParser.PolcodexFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolcodexParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(PolcodexParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolcodexParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(PolcodexParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclarationStatement}
	 * labeled alternative in {@link PolcodexParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationStatement(PolcodexParser.VarDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclarationStatement}
	 * labeled alternative in {@link PolcodexParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationStatement(PolcodexParser.VarDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link PolcodexParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PolcodexParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link PolcodexParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PolcodexParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionStatement}
	 * labeled alternative in {@link PolcodexParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(PolcodexParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionStatement}
	 * labeled alternative in {@link PolcodexParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(PolcodexParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link PolcodexParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PolcodexParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link PolcodexParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PolcodexParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link PolcodexParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(PolcodexParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link PolcodexParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(PolcodexParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link PolcodexParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PolcodexParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link PolcodexParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PolcodexParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link PolcodexParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PolcodexParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link PolcodexParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PolcodexParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolcodexParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PolcodexParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolcodexParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PolcodexParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolcodexParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(PolcodexParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolcodexParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(PolcodexParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolcodexParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PolcodexParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolcodexParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PolcodexParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolcodexParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(PolcodexParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolcodexParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(PolcodexParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolcodexParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(PolcodexParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolcodexParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(PolcodexParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolcodexParser#forConditions}.
	 * @param ctx the parse tree
	 */
	void enterForConditions(PolcodexParser.ForConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolcodexParser#forConditions}.
	 * @param ctx the parse tree
	 */
	void exitForConditions(PolcodexParser.ForConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolcodexParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PolcodexParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolcodexParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PolcodexParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(PolcodexParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(PolcodexParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(PolcodexParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(PolcodexParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(PolcodexParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(PolcodexParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(PolcodexParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(PolcodexParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(PolcodexParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(PolcodexParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(PolcodexParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(PolcodexParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(PolcodexParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(PolcodexParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varReference}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(PolcodexParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varReference}
	 * labeled alternative in {@link PolcodexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(PolcodexParser.VarReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolcodexParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PolcodexParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolcodexParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PolcodexParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolcodexParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(PolcodexParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolcodexParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(PolcodexParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolcodexParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(PolcodexParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolcodexParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(PolcodexParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolcodexParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(PolcodexParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolcodexParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(PolcodexParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link PolcodexParser#type}.
	 * @param ctx the parse tree
	 */
	void enterInteger(PolcodexParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link PolcodexParser#type}.
	 * @param ctx the parse tree
	 */
	void exitInteger(PolcodexParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link PolcodexParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(PolcodexParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link PolcodexParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(PolcodexParser.DecimalContext ctx);
}
