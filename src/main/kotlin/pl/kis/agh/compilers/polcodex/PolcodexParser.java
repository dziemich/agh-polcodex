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
		MUL=10, DIV=11, AND=12, FUNCTION=13, ENDFUNCTION=14, ADDITIONALARG=15,
		IFCHECK=16, ELSE=17, EQUAL=18, NOTEQUAL=19, GREATER=20, LOWER=21, INTLIT=22,
		DECLIT=23, PLUS=24, MINUS=25, ASTERISK=26, DIVISION=27, ASSIGN=28, LPAREN=29,
		RPAREN=30, COMMA=31, ID=32;
	public static final int
		RULE_polcodexFile = 0, RULE_line = 1, RULE_statement = 2, RULE_print = 3,
		RULE_varDeclaration = 4, RULE_assignment = 5, RULE_functionDeclaration = 6,
		RULE_block = 7, RULE_expression = 8, RULE_argument = 9, RULE_argumentList = 10,
		RULE_functionName = 11, RULE_ifStmt = 12, RULE_type = 13;
	public static final String[] ruleNames = {
		"polcodexFile", "line", "statement", "print", "varDeclaration", "assignment",
		"functionDeclaration", "block", "expression", "argument", "argumentList",
		"functionName", "ifStmt", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'MAM'", "'WYPLUJ'", "'as'", "'Int'", "'Decimal'", "'ILE_TO_RAZEM_BENDZIE'",
		"'ODEJMNIJ_MIE_TO'", "'TABLICZKA_MNOZENIA_PROSZE'", "'PODZIEL_MIE_TO'",
		"'I'", "'MAJSTRUJEMY_FUNKCYJKE'", "'KONIEC_MAJSTROWANIA'", "'I_TO'", "'SPRAWDZANKO'",
		"'A_JAK_NIE'", "'SOM_TAKIE_SAME'", "'SOM_ROZNE'", "'WINCYJ_NIZ'", "'MNIJ_NIZ'",
		null, null, "'+'", "'-'", "'*'", "'/'", "'TO'", "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "WS", "VAR", "PRINT", "AS", "INT", "DECIMAL", "ADD",
		"SUB", "MUL", "DIV", "AND", "FUNCTION", "ENDFUNCTION", "ADDITIONALARG",
		"IFCHECK", "ELSE", "EQUAL", "NOTEQUAL", "GREATER", "LOWER", "INTLIT",
		"DECLIT", "PLUS", "MINUS", "ASTERISK", "DIVISION", "ASSIGN", "LPAREN",
		"RPAREN", "COMMA", "ID"
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				((PolcodexFileContext)_localctx).lines = line();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << FUNCTION) | (1L << IFCHECK) | (1L << ID))) != 0) );
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
			setState(33);
			statement();
			setState(34);
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
	public static class FunctionStatementContext extends StatementContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitFunctionStatement(this);
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
			setState(41);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new VarDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				varDeclaration();
				}
				break;
			case IFCHECK:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				ifStmt();
				}
				break;
			case FUNCTION:
				_localctx = new FunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				functionDeclaration();
				}
				break;
			case ID:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				assignment();
				}
				break;
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
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
			setState(43);
			match(PRINT);
			setState(44);
			match(LPAREN);
			setState(45);
			expression(0);
			setState(46);
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
			setState(48);
			match(VAR);
			setState(49);
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
			setState(51);
			match(ID);
			setState(52);
			match(ASSIGN);
			setState(53);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public BlockContext functionBody;
		public TerminalNode FUNCTION() { return getToken(PolcodexParser.FUNCTION, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PolcodexParser.LPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PolcodexParser.RPAREN, 0); }
		public TerminalNode ENDFUNCTION() { return getToken(PolcodexParser.ENDFUNCTION, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(FUNCTION);
			setState(56);
			functionName();
			setState(57);
			match(LPAREN);
			setState(58);
			argumentList();
			setState(59);
			match(RPAREN);
			setState(60);
			((FunctionDeclarationContext)_localctx).functionBody = block();
			setState(61);
			match(ENDFUNCTION);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				statement();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << FUNCTION) | (1L << IFCHECK) | (1L << ID))) != 0) );
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
	public static class FunctionCallContext extends ExpressionContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PolcodexParser.LPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PolcodexParser.RPAREN, 0); }
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitFunctionCall(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(69);
				((BinaryOperationContext)_localctx).op = match(SUB);
				setState(70);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(71);
				match(AND);
				setState(72);
				((BinaryOperationContext)_localctx).right = expression(15);
				}
				break;
			case 2:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				((BinaryOperationContext)_localctx).op = match(MUL);
				setState(75);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(76);
				match(AND);
				setState(77);
				((BinaryOperationContext)_localctx).right = expression(14);
				}
				break;
			case 3:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				((BinaryOperationContext)_localctx).op = match(ADD);
				setState(80);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(81);
				match(AND);
				setState(82);
				((BinaryOperationContext)_localctx).right = expression(13);
				}
				break;
			case 4:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				((BinaryOperationContext)_localctx).op = match(DIV);
				setState(85);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(86);
				match(AND);
				setState(87);
				((BinaryOperationContext)_localctx).right = expression(12);
				}
				break;
			case 5:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				((ConditionalExpressionContext)_localctx).cmp = match(EQUAL);
				setState(90);
				((ConditionalExpressionContext)_localctx).left = expression(0);
				setState(91);
				match(AND);
				setState(92);
				((ConditionalExpressionContext)_localctx).right = expression(11);
				}
				break;
			case 6:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				((ConditionalExpressionContext)_localctx).cmp = match(NOTEQUAL);
				setState(95);
				((ConditionalExpressionContext)_localctx).left = expression(0);
				setState(96);
				match(AND);
				setState(97);
				((ConditionalExpressionContext)_localctx).right = expression(10);
				}
				break;
			case 7:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				((ConditionalExpressionContext)_localctx).cmp = match(GREATER);
				setState(100);
				((ConditionalExpressionContext)_localctx).left = expression(0);
				setState(101);
				match(AND);
				setState(102);
				((ConditionalExpressionContext)_localctx).right = expression(9);
				}
				break;
			case 8:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				((ConditionalExpressionContext)_localctx).cmp = match(LOWER);
				setState(105);
				((ConditionalExpressionContext)_localctx).left = expression(0);
				setState(106);
				match(AND);
				setState(107);
				((ConditionalExpressionContext)_localctx).right = expression(8);
				}
				break;
			case 9:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(MINUS);
				setState(110);
				expression(3);
				}
				break;
			case 10:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				functionName();
				setState(112);
				match(LPAREN);
				setState(113);
				argumentList();
				setState(114);
				match(RPAREN);
				}
				break;
			case 11:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(LPAREN);
				setState(117);
				expression(0);
				setState(118);
				match(RPAREN);
				}
				break;
			case 12:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(ID);
				}
				break;
			case 13:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(INTLIT);
				}
				break;
			case 14:
				{
				_localctx = new DecimalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(DECLIT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeConversionContext(new ExpressionContext(_parentctx, _parentState));
					((TypeConversionContext)_localctx).value = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(125);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(126);
					match(AS);
					setState(127);
					((TypeConversionContext)_localctx).targetType = type();
					}
					}
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentContext a;
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> ADDITIONALARG() { return getTokens(PolcodexParser.ADDITIONALARG); }
		public TerminalNode ADDITIONALARG(int i) {
			return getToken(PolcodexParser.ADDITIONALARG, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << EQUAL) | (1L << NOTEQUAL) | (1L << GREATER) | (1L << LOWER) | (1L << INTLIT) | (1L << DECLIT) | (1L << MINUS) | (1L << LPAREN) | (1L << ID))) != 0)) {
				{
				setState(135);
				argument();
				}
			}

			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITIONALARG) {
				{
				{
				setState(138);
				match(ADDITIONALARG);
				setState(139);
				((ArgumentListContext)_localctx).a = argument();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PolcodexParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ID);
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
		enterRule(_localctx, 24, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IFCHECK);
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(148);
				match(LPAREN);
				}
				break;
			}
			setState(151);
			expression(0);
			setState(153);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(152);
				match(RPAREN);
				}
			}

			setState(155);
			((IfStmtContext)_localctx).trueStatement = statement();
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(156);
				match(ELSE);
				setState(157);
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
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(162);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(INT);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
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
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\6\tC\n\t\r\t\16\tD\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n~\n\n\3\n\3\n\3\n\7\n\u0083\n\n\f\n\16\n\u0086\13\n\3\13\3"+
		"\13\3\f\5\f\u008b\n\f\3\f\3\f\7\f\u008f\n\f\f\f\16\f\u0092\13\f\3\r\3"+
		"\r\3\16\3\16\5\16\u0098\n\16\3\16\3\16\5\16\u009c\n\16\3\16\3\16\3\16"+
		"\5\16\u00a1\n\16\3\17\3\17\5\17\u00a5\n\17\3\17\2\3\22\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\3\3\3\3\3\u00b2\2\37\3\2\2\2\4#\3\2\2\2\6+"+
		"\3\2\2\2\b-\3\2\2\2\n\62\3\2\2\2\f\65\3\2\2\2\169\3\2\2\2\20B\3\2\2\2"+
		"\22}\3\2\2\2\24\u0087\3\2\2\2\26\u008a\3\2\2\2\30\u0093\3\2\2\2\32\u0095"+
		"\3\2\2\2\34\u00a4\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2"+
		"\2\2!\"\3\2\2\2\"\3\3\2\2\2#$\5\6\4\2$%\t\2\2\2%\5\3\2\2\2&,\5\n\6\2\'"+
		",\5\32\16\2(,\5\16\b\2),\5\f\7\2*,\5\b\5\2+&\3\2\2\2+\'\3\2\2\2+(\3\2"+
		"\2\2+)\3\2\2\2+*\3\2\2\2,\7\3\2\2\2-.\7\6\2\2./\7\37\2\2/\60\5\22\n\2"+
		"\60\61\7 \2\2\61\t\3\2\2\2\62\63\7\5\2\2\63\64\5\f\7\2\64\13\3\2\2\2\65"+
		"\66\7\"\2\2\66\67\7\36\2\2\678\5\22\n\28\r\3\2\2\29:\7\17\2\2:;\5\30\r"+
		"\2;<\7\37\2\2<=\5\26\f\2=>\7 \2\2>?\5\20\t\2?@\7\20\2\2@\17\3\2\2\2AC"+
		"\5\6\4\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\21\3\2\2\2FG\b\n\1\2"+
		"GH\7\13\2\2HI\5\22\n\2IJ\7\16\2\2JK\5\22\n\21K~\3\2\2\2LM\7\f\2\2MN\5"+
		"\22\n\2NO\7\16\2\2OP\5\22\n\20P~\3\2\2\2QR\7\n\2\2RS\5\22\n\2ST\7\16\2"+
		"\2TU\5\22\n\17U~\3\2\2\2VW\7\r\2\2WX\5\22\n\2XY\7\16\2\2YZ\5\22\n\16Z"+
		"~\3\2\2\2[\\\7\24\2\2\\]\5\22\n\2]^\7\16\2\2^_\5\22\n\r_~\3\2\2\2`a\7"+
		"\25\2\2ab\5\22\n\2bc\7\16\2\2cd\5\22\n\fd~\3\2\2\2ef\7\26\2\2fg\5\22\n"+
		"\2gh\7\16\2\2hi\5\22\n\13i~\3\2\2\2jk\7\27\2\2kl\5\22\n\2lm\7\16\2\2m"+
		"n\5\22\n\nn~\3\2\2\2op\7\33\2\2p~\5\22\n\5qr\5\30\r\2rs\7\37\2\2st\5\26"+
		"\f\2tu\7 \2\2u~\3\2\2\2vw\7\37\2\2wx\5\22\n\2xy\7 \2\2y~\3\2\2\2z~\7\""+
		"\2\2{~\7\30\2\2|~\7\31\2\2}F\3\2\2\2}L\3\2\2\2}Q\3\2\2\2}V\3\2\2\2}[\3"+
		"\2\2\2}`\3\2\2\2}e\3\2\2\2}j\3\2\2\2}o\3\2\2\2}q\3\2\2\2}v\3\2\2\2}z\3"+
		"\2\2\2}{\3\2\2\2}|\3\2\2\2~\u0084\3\2\2\2\177\u0080\f\t\2\2\u0080\u0081"+
		"\7\7\2\2\u0081\u0083\5\34\17\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\23\3\2\2\2\u0086\u0084\3\2\2"+
		"\2\u0087\u0088\5\22\n\2\u0088\25\3\2\2\2\u0089\u008b\5\24\13\2\u008a\u0089"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0090\3\2\2\2\u008c\u008d\7\21\2\2"+
		"\u008d\u008f\5\24\13\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\27\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\7\"\2\2\u0094\31\3\2\2\2\u0095\u0097\7\22\2\2\u0096\u0098\7\37"+
		"\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\5\22\n\2\u009a\u009c\7 \2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\5\6\4\2\u009e\u009f\7\23\2\2\u009f"+
		"\u00a1\5\6\4\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\33\3\2\2"+
		"\2\u00a2\u00a5\7\b\2\2\u00a3\u00a5\7\t\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\35\3\2\2\2\r!+D}\u0084\u008a\u0090\u0097\u009b\u00a0\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
