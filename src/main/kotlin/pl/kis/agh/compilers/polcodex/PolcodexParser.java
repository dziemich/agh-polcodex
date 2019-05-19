// Generated from /Users/michaldziedzic/Downloads/polcodex/src/main/antlr/PolcodexParser.g4 by ANTLR 4.5.1
package pl.kis.agh.compilers.polcodex;

import java.util.List;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PolcodexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WS=2, VAR=3, PRINT=4, AS=5, INT=6, DECIMAL=7, ADD=8, SUB=9,
		MUL=10, DIV=11, AND=12, IFCHECK=13, ELSE=14, EQUAL=15, NOTEQUAL=16, GREATER=17,
		LOWER=18, INTLIT=19, DECLIT=20, PLUS=21, MINUS=22, ASTERISK=23, DIVISION=24,
		ASSIGN=25, LPAREN=26, RPAREN=27, ID=28;
	public static final int
		RULE_polcodexFile = 0, RULE_line = 1, RULE_statement = 2, RULE_print = 3,
		RULE_varDeclaration = 4, RULE_assignment = 5, RULE_expression = 6, RULE_ifStmt = 7,
		RULE_type = 8;
	public static final String[] ruleNames = {
		"polcodexFile", "line", "statement", "print", "varDeclaration", "assignment",
		"expression", "ifStmt", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'MAM'", "'WYPLUJ'", "'as'", "'Int'", "'Decimal'", "'ILE_TO_RAZEM_BENDZIE'",
		"'ODEJMNIJ_MIE_TO'", "'TABLICZKA_MNOZENIA_PROSZE'", "'PODZIEL_MIE_TO'",
		"'I'", "'SPRAWDZANKO'", "'A_JAK_NIE'", "'SOM_TAKIE_SAME'", "'SOM_ROZNE'",
		"'WINCYJ_NIZ'", "'MNIJ_NIZ'", null, null, "'+'", "'-'", "'*'", "'/'",
		"'TO'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "WS", "VAR", "PRINT", "AS", "INT", "DECIMAL", "ADD",
		"SUB", "MUL", "DIV", "AND", "IFCHECK", "ELSE", "EQUAL", "NOTEQUAL", "GREATER",
		"LOWER", "INTLIT", "DECLIT", "PLUS", "MINUS", "ASTERISK", "DIVISION",
		"ASSIGN", "LPAREN", "RPAREN", "ID"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PolcodexParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PolcodexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PolcodexFileContext extends ParserRuleContext {
		public LineContext lines;
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public PolcodexFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polcodexFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterPolcodexFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitPolcodexFile(this);
		}
	}

	public final PolcodexFileContext polcodexFile() throws RecognitionException {
		PolcodexFileContext _localctx = new PolcodexFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_polcodexFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				((PolcodexFileContext)_localctx).lines = line();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << IFCHECK) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PolcodexParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(PolcodexParser.EOF, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			statement();
			setState(24);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }

		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitPrintStatement(this);
		}
	}
	public static class AssignmentStatementContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitAssignmentStatement(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitIfStatement(this);
		}
	}
	public static class VarDeclarationStatementContext extends StatementContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarDeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterVarDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitVarDeclarationStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(30);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new VarDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				varDeclaration();
				}
				break;
			case IFCHECK:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				ifStmt();
				}
				break;
			case ID:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				assignment();
				}
				break;
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				print();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(PolcodexParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(PolcodexParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PolcodexParser.RPAREN, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(PRINT);
			setState(33);
			match(LPAREN);
			setState(34);
			expression(0);
			setState(35);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PolcodexParser.VAR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(VAR);
			setState(38);
			assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PolcodexParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PolcodexParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ID);
			setState(41);
			match(ASSIGN);
			setState(42);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }

		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends ExpressionContext {
		public TerminalNode DECLIT() { return getToken(PolcodexParser.DECLIT, 0); }
		public DecimalLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitDecimalLiteral(this);
		}
	}
	public static class MinusExpressionContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(PolcodexParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitMinusExpression(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public Token cmp;
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode AND() { return getToken(PolcodexParser.AND, 0); }
		public TerminalNode EQUAL() { return getToken(PolcodexParser.EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOTEQUAL() { return getToken(PolcodexParser.NOTEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(PolcodexParser.GREATER, 0); }
		public TerminalNode LOWER() { return getToken(PolcodexParser.LOWER, 0); }
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitConditionalExpression(this);
		}
	}
	public static class IntLiteralContext extends ExpressionContext {
		public TerminalNode INTLIT() { return getToken(PolcodexParser.INTLIT, 0); }
		public IntLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitIntLiteral(this);
		}
	}
	public static class BinaryOperationContext extends ExpressionContext {
		public Token op;
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode AND() { return getToken(PolcodexParser.AND, 0); }
		public TerminalNode SUB() { return getToken(PolcodexParser.SUB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(PolcodexParser.MUL, 0); }
		public TerminalNode ADD() { return getToken(PolcodexParser.ADD, 0); }
		public TerminalNode DIV() { return getToken(PolcodexParser.DIV, 0); }
		public BinaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterBinaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitBinaryOperation(this);
		}
	}
	public static class ParenExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(PolcodexParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PolcodexParser.RPAREN, 0); }
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitParenExpression(this);
		}
	}
	public static class TypeConversionContext extends ExpressionContext {
		public ExpressionContext value;
		public TypeContext targetType;
		public TerminalNode AS() { return getToken(PolcodexParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterTypeConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitTypeConversion(this);
		}
	}
	public static class VarReferenceContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(PolcodexParser.ID, 0); }
		public VarReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterVarReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitVarReference(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			switch (_input.LA(1)) {
			case SUB:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(45);
				((BinaryOperationContext)_localctx).op = match(SUB);
				setState(46);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(47);
				match(AND);
				setState(48);
				((BinaryOperationContext)_localctx).right = expression(14);
				}
				break;
			case MUL:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				((BinaryOperationContext)_localctx).op = match(MUL);
				setState(51);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(52);
				match(AND);
				setState(53);
				((BinaryOperationContext)_localctx).right = expression(13);
				}
				break;
			case ADD:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				((BinaryOperationContext)_localctx).op = match(ADD);
				setState(56);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(57);
				match(AND);
				setState(58);
				((BinaryOperationContext)_localctx).right = expression(12);
				}
				break;
			case DIV:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				((BinaryOperationContext)_localctx).op = match(DIV);
				setState(61);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(62);
				match(AND);
				setState(63);
				((BinaryOperationContext)_localctx).right = expression(11);
				}
				break;
			case EQUAL:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				((ConditionalExpressionContext)_localctx).cmp = match(EQUAL);
				setState(66);
				((ConditionalExpressionContext)_localctx).left = expression(0);
				setState(67);
				match(AND);
				setState(68);
				((ConditionalExpressionContext)_localctx).right = expression(10);
				}
				break;
			case NOTEQUAL:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				((ConditionalExpressionContext)_localctx).cmp = match(NOTEQUAL);
				setState(71);
				((ConditionalExpressionContext)_localctx).left = expression(0);
				setState(72);
				match(AND);
				setState(73);
				((ConditionalExpressionContext)_localctx).right = expression(9);
				}
				break;
			case GREATER:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				((ConditionalExpressionContext)_localctx).cmp = match(GREATER);
				setState(76);
				((ConditionalExpressionContext)_localctx).left = expression(0);
				setState(77);
				match(AND);
				setState(78);
				((ConditionalExpressionContext)_localctx).right = expression(8);
				}
				break;
			case LOWER:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				((ConditionalExpressionContext)_localctx).cmp = match(LOWER);
				setState(81);
				((ConditionalExpressionContext)_localctx).left = expression(0);
				setState(82);
				match(AND);
				setState(83);
				((ConditionalExpressionContext)_localctx).right = expression(7);
				}
				break;
			case MINUS:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(MINUS);
				setState(86);
				expression(3);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(LPAREN);
				setState(88);
				expression(0);
				setState(89);
				match(RPAREN);
				}
				break;
			case ID:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(ID);
				}
				break;
			case INTLIT:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(INTLIT);
				}
				break;
			case DECLIT:
				{
				_localctx = new DecimalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(DECLIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeConversionContext(new ExpressionContext(_parentctx, _parentState));
					((TypeConversionContext)_localctx).value = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(96);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(97);
					match(AS);
					setState(98);
					((TypeConversionContext)_localctx).targetType = type();
					}
					}
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public StatementContext trueStatement;
		public StatementContext falseStatement;
		public TerminalNode IFCHECK() { return getToken(PolcodexParser.IFCHECK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PolcodexParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IFCHECK);
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(105);
				match(LPAREN);
				}
				break;
			}
			setState(108);
			expression(0);
			setState(110);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(109);
				match(RPAREN);
				}
			}

			setState(112);
			((IfStmtContext)_localctx).trueStatement = statement();
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(113);
				match(ELSE);
				setState(114);
				((IfStmtContext)_localctx).falseStatement = statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }

		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerContext extends TypeContext {
		public TerminalNode INT() { return getToken(PolcodexParser.INT, 0); }
		public IntegerContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitInteger(this);
		}
	}
	public static class DecimalContext extends TypeContext {
		public TerminalNode DECIMAL() { return getToken(PolcodexParser.DECIMAL, 0); }
		public DecimalContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitDecimal(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(119);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(INT);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4!\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3\b\3\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3"+
		"\t\3\t\5\tm\n\t\3\t\3\t\5\tq\n\t\3\t\3\t\3\t\5\tv\n\t\3\n\3\n\5\nz\n\n"+
		"\3\n\2\3\16\13\2\4\6\b\n\f\16\20\22\2\3\3\3\3\3\u0087\2\25\3\2\2\2\4\31"+
		"\3\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n\'\3\2\2\2\f*\3\2\2\2\16`\3\2\2\2\20"+
		"j\3\2\2\2\22y\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25"+
		"\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\32\5\6\4\2\32\33\t\2\2\2\33\5\3"+
		"\2\2\2\34!\5\n\6\2\35!\5\20\t\2\36!\5\f\7\2\37!\5\b\5\2 \34\3\2\2\2 \35"+
		"\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!\7\3\2\2\2\"#\7\6\2\2#$\7\34\2\2$%\5"+
		"\16\b\2%&\7\35\2\2&\t\3\2\2\2\'(\7\5\2\2()\5\f\7\2)\13\3\2\2\2*+\7\36"+
		"\2\2+,\7\33\2\2,-\5\16\b\2-\r\3\2\2\2./\b\b\1\2/\60\7\13\2\2\60\61\5\16"+
		"\b\2\61\62\7\16\2\2\62\63\5\16\b\20\63a\3\2\2\2\64\65\7\f\2\2\65\66\5"+
		"\16\b\2\66\67\7\16\2\2\678\5\16\b\178a\3\2\2\29:\7\n\2\2:;\5\16\b\2;<"+
		"\7\16\2\2<=\5\16\b\16=a\3\2\2\2>?\7\r\2\2?@\5\16\b\2@A\7\16\2\2AB\5\16"+
		"\b\rBa\3\2\2\2CD\7\21\2\2DE\5\16\b\2EF\7\16\2\2FG\5\16\b\fGa\3\2\2\2H"+
		"I\7\22\2\2IJ\5\16\b\2JK\7\16\2\2KL\5\16\b\13La\3\2\2\2MN\7\23\2\2NO\5"+
		"\16\b\2OP\7\16\2\2PQ\5\16\b\nQa\3\2\2\2RS\7\24\2\2ST\5\16\b\2TU\7\16\2"+
		"\2UV\5\16\b\tVa\3\2\2\2WX\7\30\2\2Xa\5\16\b\5YZ\7\34\2\2Z[\5\16\b\2[\\"+
		"\7\35\2\2\\a\3\2\2\2]a\7\36\2\2^a\7\25\2\2_a\7\26\2\2`.\3\2\2\2`\64\3"+
		"\2\2\2`9\3\2\2\2`>\3\2\2\2`C\3\2\2\2`H\3\2\2\2`M\3\2\2\2`R\3\2\2\2`W\3"+
		"\2\2\2`Y\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2ag\3\2\2\2bc\f\b\2\2cd\7"+
		"\7\2\2df\5\22\n\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\17\3\2\2\2"+
		"ig\3\2\2\2jl\7\17\2\2km\7\34\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\5\16"+
		"\b\2oq\7\35\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2ru\5\6\4\2st\7\20\2\2tv\5"+
		"\6\4\2us\3\2\2\2uv\3\2\2\2v\21\3\2\2\2wz\7\b\2\2xz\7\t\2\2yw\3\2\2\2y"+
		"x\3\2\2\2z\23\3\2\2\2\n\27 `glpuy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
