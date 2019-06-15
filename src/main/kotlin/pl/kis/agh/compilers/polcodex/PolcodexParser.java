// Generated from /Users/michaldziedzic/mojestudiatozart/kompilatory/agh-polcodex/src/main/antlr/PolcodexParser.g4 by ANTLR 4.5.1
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
		LOWER=22, FOR=23, FROM=24, TO=25, ENDFOR=26, INTLIT=27, DECLIT=28, PLUS=29,
		MINUS=30, ASTERISK=31, DIVISION=32, ASSIGN=33, LPAREN=34, RPAREN=35, COMMA=36,
		ID=37;
	public static final int
		RULE_polcodexFile = 0, RULE_line = 1, RULE_statement = 2, RULE_print = 3,
		RULE_varDeclaration = 4, RULE_assignment = 5, RULE_functionDeclaration = 6,
		RULE_forStmt = 7, RULE_forConditions = 8, RULE_block = 9, RULE_expression = 10,
		RULE_argument = 11, RULE_argumentList = 12, RULE_functionName = 13, RULE_ifStmt = 14,
		RULE_type = 15;
	public static final String[] ruleNames = {
		"polcodexFile", "line", "statement", "print", "varDeclaration", "assignment",
		"functionDeclaration", "forStmt", "forConditions", "block", "expression",
		"argument", "argumentList", "functionName", "ifStmt", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'MAM'", "'WYPLUJ'", "'as'", "'Int'", "'Decimal'", "'ILE_TO_RAZEM_BENDZIE'",
		"'ODEJMNIJ_MIE_TO'", "'TABLICZKA_MNOZENIA_PROSZE'", "'PODZIEL_MIE_TO'",
		"'I'", "'MAJSTRUJEMY_FUNKCYJKE'", "'KONIEC_MAJSTROWANIA'", "'I_TO'", "'PRZYZYWAM_CIE_FUNKCJOOO'",
		"'SPRAWDZANKO'", "'A_JAK_NIE'", "'SOM_TAKIE_SAME'", "'SOM_ROZNE'", "'WINCYJ_NIZ'",
		"'MNIJ_NIZ'", "'TAK_DLUGO_JAK'", "'OD'", "'DO'", "'NO_I_KONIEC_TEGO'",
		null, null, "'+'", "'-'", "'*'", "'/'", "'TO'", "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "WS", "VAR", "PRINT", "AS", "INT", "DECIMAL", "ADD",
		"SUB", "MUL", "DIV", "AND", "FUNCTION", "ENDFUNCTION", "ADDITIONALARG",
		"INVOKEFUNCTION", "IFCHECK", "ELSE", "EQUAL", "NOTEQUAL", "GREATER", "LOWER",
		"FOR", "FROM", "TO", "ENDFOR", "INTLIT", "DECLIT", "PLUS", "MINUS", "ASTERISK",
		"DIVISION", "ASSIGN", "LPAREN", "RPAREN", "COMMA", "ID"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				((PolcodexFileContext)_localctx).lines = line();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << FUNCTION) | (1L << INVOKEFUNCTION) | (1L << IFCHECK) | (1L << FOR) | (1L << ID))) != 0) );
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
			setState(37);
			statement();
			setState(38);
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
	public static class ForStatementContext extends StatementContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitForStatement(this);
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
			setState(52);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new VarDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				varDeclaration();
				}
				break;
			case IFCHECK:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				ifStmt();
				}
				break;
			case FUNCTION:
				_localctx = new FunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				functionDeclaration();
				}
				break;
			case ID:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				assignment();
				}
				break;
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				print();
				}
				break;
			case INVOKEFUNCTION:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				match(INVOKEFUNCTION);
				setState(46);
				functionName();
				setState(47);
				match(LPAREN);
				setState(48);
				argumentList();
				setState(49);
				match(RPAREN);
				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				forStmt();
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
			setState(54);
			match(PRINT);
			setState(55);
			match(LPAREN);
			setState(56);
			expression(0);
			setState(57);
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
			setState(59);
			match(VAR);
			setState(60);
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
			setState(62);
			match(ID);
			setState(63);
			match(ASSIGN);
			setState(64);
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
			setState(66);
			match(FUNCTION);
			setState(67);
			functionName();
			setState(68);
			match(LPAREN);
			setState(69);
			argumentList();
			setState(70);
			match(RPAREN);
			setState(71);
			((FunctionDeclarationContext)_localctx).functionBody = block();
			setState(72);
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

	public static class ForStmtContext extends ParserRuleContext {
		public BlockContext forBody;
		public TerminalNode FOR() { return getToken(PolcodexParser.FOR, 0); }
		public ForConditionsContext forConditions() {
			return getRuleContext(ForConditionsContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(PolcodexParser.ENDFOR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PolcodexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PolcodexParser.RPAREN, 0); }
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitForStmt(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(FOR);
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(75);
				match(LPAREN);
				}
				break;
			}
			setState(78);
			forConditions();
			setState(80);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(79);
				match(RPAREN);
				}
			}

			setState(82);
			((ForStmtContext)_localctx).forBody = block();
			setState(83);
			match(ENDFOR);
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

	public static class ForConditionsContext extends ParserRuleContext {
		public ExpressionContext iterator;
		public ExpressionContext startExpr;
		public ExpressionContext endExpr;
		public TerminalNode FROM() { return getToken(PolcodexParser.FROM, 0); }
		public TerminalNode TO() { return getToken(PolcodexParser.TO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forConditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).enterForConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolcodexParserListener ) ((PolcodexParserListener)listener).exitForConditions(this);
		}
	}

	public final ForConditionsContext forConditions() throws RecognitionException {
		ForConditionsContext _localctx = new ForConditionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forConditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((ForConditionsContext)_localctx).iterator = expression(0);
			setState(86);
			match(FROM);
			setState(87);
			((ForConditionsContext)_localctx).startExpr = expression(0);
			setState(88);
			match(TO);
			setState(89);
			((ForConditionsContext)_localctx).endExpr = expression(0);
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
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				statement();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << FUNCTION) | (1L << INVOKEFUNCTION) | (1L << IFCHECK) | (1L << FOR) | (1L << ID))) != 0) );
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			switch (_input.LA(1)) {
			case SUB:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(97);
				((BinaryOperationContext)_localctx).op = match(SUB);
				setState(98);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(99);
				match(AND);
				setState(100);
				((BinaryOperationContext)_localctx).right = expression(14);
				}
				break;
			case MUL:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				((BinaryOperationContext)_localctx).op = match(MUL);
				setState(103);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(104);
				match(AND);
				setState(105);
				((BinaryOperationContext)_localctx).right = expression(13);
				}
				break;
			case ADD:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				((BinaryOperationContext)_localctx).op = match(ADD);
				setState(108);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(109);
				match(AND);
				setState(110);
				((BinaryOperationContext)_localctx).right = expression(12);
				}
				break;
			case DIV:
				{
				_localctx = new BinaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				((BinaryOperationContext)_localctx).op = match(DIV);
				setState(113);
				((BinaryOperationContext)_localctx).left = expression(0);
				setState(114);
				match(AND);
				setState(115);
				((BinaryOperationContext)_localctx).right = expression(11);
				}
				break;
			case EQUAL:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				((ConditionalExpressionContext)_localctx).cmp = match(EQUAL);
				setState(118);
				((ConditionalExpressionContext)_localctx).left = expression(0);
				setState(119);
				match(AND);
				setState(120);
				((ConditionalExpressionContext)_localctx).right = expression(10);
				}
				break;
			case NOTEQUAL:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				((ConditionalExpressionContext)_localctx).cmp = match(NOTEQUAL);
				setState(123);
				((ConditionalExpressionContext)_localctx).left = expression(0);
				setState(124);
				match(AND);
				setState(125);
				((ConditionalExpressionContext)_localctx).right = expression(9);
				}
				break;
			case MINUS:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(MINUS);
				setState(128);
				expression(3);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(LPAREN);
				setState(130);
				expression(0);
				setState(131);
				match(RPAREN);
				}
				break;
			case ID:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(ID);
				}
				break;
			case INTLIT:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(INTLIT);
				}
				break;
			case DECLIT:
				{
				_localctx = new DecimalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(DECLIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(139);
						((ConditionalExpressionContext)_localctx).cmp = match(GREATER);
						setState(140);
						((ConditionalExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(142);
						((ConditionalExpressionContext)_localctx).cmp = match(LOWER);
						setState(143);
						((ConditionalExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 3:
						{
						_localctx = new TypeConversionContext(new ExpressionContext(_parentctx, _parentState));
						((TypeConversionContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(145);
						match(AS);
						setState(146);
						((TypeConversionContext)_localctx).targetType = type();
						}
						break;
					}
					}
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 22, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
		enterRule(_localctx, 24, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << EQUAL) | (1L << NOTEQUAL) | (1L << INTLIT) | (1L << DECLIT) | (1L << MINUS) | (1L << LPAREN) | (1L << ID))) != 0)) {
				{
				setState(154);
				argument();
				}
			}

			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITIONALARG) {
				{
				{
				setState(157);
				match(ADDITIONALARG);
				setState(158);
				((ArgumentListContext)_localctx).a = argument();
				}
				}
				setState(163);
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
		enterRule(_localctx, 26, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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
		enterRule(_localctx, 28, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IFCHECK);
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(167);
				match(LPAREN);
				}
				break;
			}
			setState(170);
			expression(0);
			setState(172);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(171);
				match(RPAREN);
				}
			}

			setState(174);
			((IfStmtContext)_localctx).trueStatement = statement();
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(175);
				match(ELSE);
				setState(176);
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
		enterRule(_localctx, 30, RULE_type);
		try {
			setState(181);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(INT);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
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
		case 10:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\67\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\tO\n\t\3\t\3\t\5\tS\n\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13_\n\13\r\13\16\13`\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u008b\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0096\n\f\f\f"+
		"\16\f\u0099\13\f\3\r\3\r\3\16\5\16\u009e\n\16\3\16\3\16\7\16\u00a2\n\16"+
		"\f\16\16\16\u00a5\13\16\3\17\3\17\3\20\3\20\5\20\u00ab\n\20\3\20\3\20"+
		"\5\20\u00af\n\20\3\20\3\20\3\20\5\20\u00b4\n\20\3\21\3\21\5\21\u00b8\n"+
		"\21\3\21\2\3\26\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\3\3\3"+
		"\u00c6\2#\3\2\2\2\4\'\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2\n=\3\2\2\2\f@\3"+
		"\2\2\2\16D\3\2\2\2\20L\3\2\2\2\22W\3\2\2\2\24^\3\2\2\2\26\u008a\3\2\2"+
		"\2\30\u009a\3\2\2\2\32\u009d\3\2\2\2\34\u00a6\3\2\2\2\36\u00a8\3\2\2\2"+
		" \u00b7\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3"+
		"\3\2\2\2\'(\5\6\4\2()\t\2\2\2)\5\3\2\2\2*\67\5\n\6\2+\67\5\36\20\2,\67"+
		"\5\16\b\2-\67\5\f\7\2.\67\5\b\5\2/\60\7\22\2\2\60\61\5\34\17\2\61\62\7"+
		"$\2\2\62\63\5\32\16\2\63\64\7%\2\2\64\67\3\2\2\2\65\67\5\20\t\2\66*\3"+
		"\2\2\2\66+\3\2\2\2\66,\3\2\2\2\66-\3\2\2\2\66.\3\2\2\2\66/\3\2\2\2\66"+
		"\65\3\2\2\2\67\7\3\2\2\289\7\6\2\29:\7$\2\2:;\5\26\f\2;<\7%\2\2<\t\3\2"+
		"\2\2=>\7\5\2\2>?\5\f\7\2?\13\3\2\2\2@A\7\'\2\2AB\7#\2\2BC\5\26\f\2C\r"+
		"\3\2\2\2DE\7\17\2\2EF\5\34\17\2FG\7$\2\2GH\5\32\16\2HI\7%\2\2IJ\5\24\13"+
		"\2JK\7\20\2\2K\17\3\2\2\2LN\7\31\2\2MO\7$\2\2NM\3\2\2\2NO\3\2\2\2OP\3"+
		"\2\2\2PR\5\22\n\2QS\7%\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\5\24\13\2U"+
		"V\7\34\2\2V\21\3\2\2\2WX\5\26\f\2XY\7\32\2\2YZ\5\26\f\2Z[\7\33\2\2[\\"+
		"\5\26\f\2\\\23\3\2\2\2]_\5\6\4\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2"+
		"\2a\25\3\2\2\2bc\b\f\1\2cd\7\13\2\2de\5\26\f\2ef\7\16\2\2fg\5\26\f\20"+
		"g\u008b\3\2\2\2hi\7\f\2\2ij\5\26\f\2jk\7\16\2\2kl\5\26\f\17l\u008b\3\2"+
		"\2\2mn\7\n\2\2no\5\26\f\2op\7\16\2\2pq\5\26\f\16q\u008b\3\2\2\2rs\7\r"+
		"\2\2st\5\26\f\2tu\7\16\2\2uv\5\26\f\rv\u008b\3\2\2\2wx\7\25\2\2xy\5\26"+
		"\f\2yz\7\16\2\2z{\5\26\f\f{\u008b\3\2\2\2|}\7\26\2\2}~\5\26\f\2~\177\7"+
		"\16\2\2\177\u0080\5\26\f\13\u0080\u008b\3\2\2\2\u0081\u0082\7 \2\2\u0082"+
		"\u008b\5\26\f\5\u0083\u0084\7$\2\2\u0084\u0085\5\26\f\2\u0085\u0086\7"+
		"%\2\2\u0086\u008b\3\2\2\2\u0087\u008b\7\'\2\2\u0088\u008b\7\35\2\2\u0089"+
		"\u008b\7\36\2\2\u008ab\3\2\2\2\u008ah\3\2\2\2\u008am\3\2\2\2\u008ar\3"+
		"\2\2\2\u008aw\3\2\2\2\u008a|\3\2\2\2\u008a\u0081\3\2\2\2\u008a\u0083\3"+
		"\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u0097\3\2\2\2\u008c\u008d\f\n\2\2\u008d\u008e\7\27\2\2\u008e\u0096\5"+
		"\26\f\13\u008f\u0090\f\t\2\2\u0090\u0091\7\30\2\2\u0091\u0096\5\26\f\n"+
		"\u0092\u0093\f\b\2\2\u0093\u0094\7\7\2\2\u0094\u0096\5 \21\2\u0095\u008c"+
		"\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\27\3\2\2\2\u0099\u0097\3\2\2"+
		"\2\u009a\u009b\5\26\f\2\u009b\31\3\2\2\2\u009c\u009e\5\30\r\2\u009d\u009c"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a3\3\2\2\2\u009f\u00a0\7\21\2\2"+
		"\u00a0\u00a2\5\30\r\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\33\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\7\'\2\2\u00a7\35\3\2\2\2\u00a8\u00aa\7\23\2\2\u00a9\u00ab\7$\2"+
		"\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\5\26\f\2\u00ad\u00af\7%\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b3\5\6\4\2\u00b1\u00b2\7\24\2\2\u00b2\u00b4\5"+
		"\6\4\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\37\3\2\2\2\u00b5"+
		"\u00b8\7\b\2\2\u00b6\u00b8\7\t\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2"+
		"\2\2\u00b8!\3\2\2\2\20%\66NR`\u008a\u0095\u0097\u009d\u00a3\u00aa\u00ae"+
		"\u00b3\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
