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
		INVOKEFUNCTION=16, IFCHECK=17, ELSE=18, EQUAL=19, NOTEQUAL=20, GREATER=21,
		LOWER=22, INTLIT=23, DECLIT=24, PLUS=25, MINUS=26, ASTERISK=27, DIVISION=28,
		ASSIGN=29, LPAREN=30, RPAREN=31, COMMA=32, ID=33;
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
		"'I'", "'MAJSTRUJEMY_FUNKCYJKE'", "'KONIEC_MAJSTROWANIA'", "'I_TO'", "'PRZYZYWAM_CIE_FUNKCJOOO'",
		"'SPRAWDZANKO'", "'A_JAK_NIE'", "'SOM_TAKIE_SAME'", "'SOM_ROZNE'", "'WINCYJ_NIZ'",
		"'MNIJ_NIZ'", null, null, "'+'", "'-'", "'*'", "'/'", "'TO'", "'('", "')'",
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "WS", "VAR", "PRINT", "AS", "INT", "DECIMAL", "ADD",
		"SUB", "MUL", "DIV", "AND", "FUNCTION", "ENDFUNCTION", "ADDITIONALARG",
		"INVOKEFUNCTION", "IFCHECK", "ELSE", "EQUAL", "NOTEQUAL", "GREATER", "LOWER",
		"INTLIT", "DECLIT", "PLUS", "MINUS", "ASTERISK", "DIVISION", "ASSIGN",
		"LPAREN", "RPAREN", "COMMA", "ID"
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << FUNCTION) | (1L << INVOKEFUNCTION) | (1L << IFCHECK) | (1L << ID))) != 0) );
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
	public static class FunctionCallContext extends StatementContext {
		public TerminalNode INVOKEFUNCTION() { return getToken(PolcodexParser.INVOKEFUNCTION, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PolcodexParser.LPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PolcodexParser.RPAREN, 0); }
		public FunctionCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitFunctionCall(this);
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
			setState(47);
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
			case INVOKEFUNCTION:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				match(INVOKEFUNCTION);
				setState(42);
				functionName();
				setState(43);
				match(LPAREN);
				setState(44);
				argumentList();
				setState(45);
				match(RPAREN);
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
			setState(49);
			match(PRINT);
			setState(50);
			match(LPAREN);
			setState(51);
			expression(0);
			setState(52);
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
			setState(54);
			match(VAR);
			setState(55);
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
			setState(57);
			match(ID);
			setState(58);
			match(ASSIGN);
			setState(59);
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
			setState(61);
			match(FUNCTION);
			setState(62);
			functionName();
			setState(63);
			match(LPAREN);
			setState(64);
			argumentList();
			setState(65);
			match(RPAREN);
			setState(66);
			((FunctionDeclarationContext)_localctx).functionBody = block();
			setState(67);
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
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				statement();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << FUNCTION) | (1L << INVOKEFUNCTION) | (1L << IFCHECK) | (1L << ID))) != 0) );
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
		public ExpressionContext left;
		public Token cmp;
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			switch (_input.LA(1)) {
			case SUB:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(75);
				((BinaryOperationContext)_localctx).op = match(SUB);
				setState(76);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(77);
				match(AND);
				setState(78);
				((BinaryOperationContext)_localctx).right = expression(14);
				}
				break;
			case MUL:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				((BinaryOperationContext)_localctx).op = match(MUL);
				setState(81);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(82);
				match(AND);
				setState(83);
				((BinaryOperationContext)_localctx).right = expression(13);
				}
				break;
			case ADD:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				((BinaryOperationContext)_localctx).op = match(ADD);
				setState(86);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(87);
				match(AND);
				setState(88);
				((BinaryOperationContext)_localctx).right = expression(12);
				}
				break;
			case DIV:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				((BinaryOperationContext)_localctx).op = match(DIV);
				setState(91);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(92);
				match(AND);
				setState(93);
				((BinaryOperationContext)_localctx).right = expression(11);
				}
				break;
			case EQUAL:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				((ConditionalExpressionContext)_localctx).cmp = match(EQUAL);
				setState(96);
				((ConditionalExpressionContext)_localctx).left = expression(0);
				setState(97);
				match(AND);
				setState(98);
				((ConditionalExpressionContext)_localctx).right = expression(10);
				}
				break;
			case NOTEQUAL:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				((ConditionalExpressionContext)_localctx).cmp = match(NOTEQUAL);
				setState(101);
				((ConditionalExpressionContext)_localctx).left = expression(0);
				setState(102);
				match(AND);
				setState(103);
				((ConditionalExpressionContext)_localctx).right = expression(9);
				}
				break;
			case MINUS:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(MINUS);
				setState(106);
				expression(3);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(LPAREN);
				setState(108);
				expression(0);
				setState(109);
				match(RPAREN);
				}
				break;
			case ID:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(ID);
				}
				break;
			case INTLIT:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(INTLIT);
				}
				break;
			case DECLIT:
				{
				_localctx = new DecimalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(DECLIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(117);
						((ConditionalExpressionContext)_localctx).cmp = match(GREATER);
						setState(118);
						((ConditionalExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(120);
						((ConditionalExpressionContext)_localctx).cmp = match(LOWER);
						setState(121);
						((ConditionalExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 3:
						{
						_localctx = new TypeConversionContext(new ExpressionContext(_parentctx, _parentState));
						((TypeConversionContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(123);
						match(AS);
						setState(124);
						((TypeConversionContext)_localctx).targetType = type();
						}
						break;
					}
					}
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(130);
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
			setState(133);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << EQUAL) | (1L << NOTEQUAL) | (1L << INTLIT) | (1L << DECLIT) | (1L << MINUS) | (1L << LPAREN) | (1L << ID))) != 0)) {
				{
				setState(132);
				argument();
				}
			}

			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITIONALARG) {
				{
				{
				setState(135);
				match(ADDITIONALARG);
				setState(136);
				((ArgumentListContext)_localctx).a = argument();
				}
				}
				setState(141);
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
			setState(142);
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
			setState(144);
			match(IFCHECK);
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(145);
				match(LPAREN);
				}
				break;
			}
			setState(148);
			expression(0);
			setState(150);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(149);
				match(RPAREN);
				}
			}

			setState(152);
			((IfStmtContext)_localctx).trueStatement = statement();
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(153);
				match(ELSE);
				setState(154);
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
			setState(159);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(INT);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
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
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\6\tI\n\t\r\t\16\tJ\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nu\n\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16\n\u0083\13\n\3\13\3\13\3\f\5"+
		"\f\u0088\n\f\3\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f\13\f\3\r\3\r\3\16\3"+
		"\16\5\16\u0095\n\16\3\16\3\16\5\16\u0099\n\16\3\16\3\16\3\16\5\16\u009e"+
		"\n\16\3\17\3\17\5\17\u00a2\n\17\3\17\2\3\22\20\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\2\3\3\3\3\3\u00af\2\37\3\2\2\2\4#\3\2\2\2\6\61\3\2\2\2\b"+
		"\63\3\2\2\2\n8\3\2\2\2\f;\3\2\2\2\16?\3\2\2\2\20H\3\2\2\2\22t\3\2\2\2"+
		"\24\u0084\3\2\2\2\26\u0087\3\2\2\2\30\u0090\3\2\2\2\32\u0092\3\2\2\2\34"+
		"\u00a1\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2"+
		"\2\2\"\3\3\2\2\2#$\5\6\4\2$%\t\2\2\2%\5\3\2\2\2&\62\5\n\6\2\'\62\5\32"+
		"\16\2(\62\5\16\b\2)\62\5\f\7\2*\62\5\b\5\2+,\7\22\2\2,-\5\30\r\2-.\7 "+
		"\2\2./\5\26\f\2/\60\7!\2\2\60\62\3\2\2\2\61&\3\2\2\2\61\'\3\2\2\2\61("+
		"\3\2\2\2\61)\3\2\2\2\61*\3\2\2\2\61+\3\2\2\2\62\7\3\2\2\2\63\64\7\6\2"+
		"\2\64\65\7 \2\2\65\66\5\22\n\2\66\67\7!\2\2\67\t\3\2\2\289\7\5\2\29:\5"+
		"\f\7\2:\13\3\2\2\2;<\7#\2\2<=\7\37\2\2=>\5\22\n\2>\r\3\2\2\2?@\7\17\2"+
		"\2@A\5\30\r\2AB\7 \2\2BC\5\26\f\2CD\7!\2\2DE\5\20\t\2EF\7\20\2\2F\17\3"+
		"\2\2\2GI\5\6\4\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\21\3\2\2\2L"+
		"M\b\n\1\2MN\7\13\2\2NO\5\22\n\2OP\7\16\2\2PQ\5\22\n\20Qu\3\2\2\2RS\7\f"+
		"\2\2ST\5\22\n\2TU\7\16\2\2UV\5\22\n\17Vu\3\2\2\2WX\7\n\2\2XY\5\22\n\2"+
		"YZ\7\16\2\2Z[\5\22\n\16[u\3\2\2\2\\]\7\r\2\2]^\5\22\n\2^_\7\16\2\2_`\5"+
		"\22\n\r`u\3\2\2\2ab\7\25\2\2bc\5\22\n\2cd\7\16\2\2de\5\22\n\feu\3\2\2"+
		"\2fg\7\26\2\2gh\5\22\n\2hi\7\16\2\2ij\5\22\n\13ju\3\2\2\2kl\7\34\2\2l"+
		"u\5\22\n\5mn\7 \2\2no\5\22\n\2op\7!\2\2pu\3\2\2\2qu\7#\2\2ru\7\31\2\2"+
		"su\7\32\2\2tL\3\2\2\2tR\3\2\2\2tW\3\2\2\2t\\\3\2\2\2ta\3\2\2\2tf\3\2\2"+
		"\2tk\3\2\2\2tm\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\u0081\3\2\2\2vw"+
		"\f\n\2\2wx\7\27\2\2x\u0080\5\22\n\13yz\f\t\2\2z{\7\30\2\2{\u0080\5\22"+
		"\n\n|}\f\b\2\2}~\7\7\2\2~\u0080\5\34\17\2\177v\3\2\2\2\177y\3\2\2\2\177"+
		"|\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\23\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\5\22\n\2\u0085\25\3\2\2\2"+
		"\u0086\u0088\5\24\13\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008d"+
		"\3\2\2\2\u0089\u008a\7\21\2\2\u008a\u008c\5\24\13\2\u008b\u0089\3\2\2"+
		"\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\27"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7#\2\2\u0091\31\3\2\2\2\u0092"+
		"\u0094\7\23\2\2\u0093\u0095\7 \2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0098\5\22\n\2\u0097\u0099\7!\2\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\5\6"+
		"\4\2\u009b\u009c\7\24\2\2\u009c\u009e\5\6\4\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\33\3\2\2\2\u009f\u00a2\7\b\2\2\u00a0\u00a2\7\t\2"+
		"\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\35\3\2\2\2\16!\61Jt\177"+
		"\u0081\u0087\u008d\u0094\u0098\u009d\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
