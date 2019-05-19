// Generated from /Users/michaldziedzic/Downloads/polcodex/src/main/antlr/PolcodexLexer.g4 by ANTLR 4.5.1
package pl.kis.agh.compilers.polcodex;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PolcodexLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NEWLINE", "WS", "VAR", "PRINT", "AS", "INT", "DECIMAL", "ADD", "SUB",
		"MUL", "DIV", "AND", "FUNCTION", "ENDFUNCTION", "ADDITIONALARG", "INVOKEFUNCTION",
		"IFCHECK", "ELSE", "EQUAL", "NOTEQUAL", "GREATER", "LOWER", "INTLIT",
		"DECLIT", "PLUS", "MINUS", "ASTERISK", "DIVISION", "ASSIGN", "LPAREN",
		"RPAREN", "COMMA", "ID"
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


	public PolcodexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PolcodexLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u017d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\5\2I\n\2\3\3\6\3L\n\3\r\3\16\3M\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0149\n\30\f\30\16\30\u014c\13\30"+
		"\5\30\u014e\n\30\3\31\3\31\3\31\7\31\u0153\n\31\f\31\16\31\u0156\13\31"+
		"\3\31\3\31\6\31\u015a\n\31\r\31\16\31\u015b\5\31\u015e\n\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\7\"\u0172\n\"\f\"\16\"\u0175\13\"\3\"\3\"\7\"\u0179\n\"\f\"\16\"\u017c"+
		"\13\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#\3\2\t\4\2\f\ftt\4\2\13\13\"\"\3\2\63;\3\2\62;\3\2"+
		"aa\3\2c|\6\2\62;C\\aac|\u0185\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\3H\3\2\2\2\5K\3\2\2\2\7Q\3\2\2\2\tU\3\2\2\2\13\\\3\2\2\2\r_"+
		"\3\2\2\2\17c\3\2\2\2\21k\3\2\2\2\23\u0080\3\2\2\2\25\u0090\3\2\2\2\27"+
		"\u00aa\3\2\2\2\31\u00b9\3\2\2\2\33\u00bb\3\2\2\2\35\u00d1\3\2\2\2\37\u00e5"+
		"\3\2\2\2!\u00ea\3\2\2\2#\u0102\3\2\2\2%\u010e\3\2\2\2\'\u0118\3\2\2\2"+
		")\u0127\3\2\2\2+\u0131\3\2\2\2-\u013c\3\2\2\2/\u014d\3\2\2\2\61\u015d"+
		"\3\2\2\2\63\u015f\3\2\2\2\65\u0161\3\2\2\2\67\u0163\3\2\2\29\u0165\3\2"+
		"\2\2;\u0167\3\2\2\2=\u016a\3\2\2\2?\u016c\3\2\2\2A\u016e\3\2\2\2C\u0173"+
		"\3\2\2\2EF\7\17\2\2FI\7\f\2\2GI\t\2\2\2HE\3\2\2\2HG\3\2\2\2I\4\3\2\2\2"+
		"JL\t\3\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\b\3\2\2"+
		"P\6\3\2\2\2QR\7O\2\2RS\7C\2\2ST\7O\2\2T\b\3\2\2\2UV\7Y\2\2VW\7[\2\2WX"+
		"\7R\2\2XY\7N\2\2YZ\7W\2\2Z[\7L\2\2[\n\3\2\2\2\\]\7c\2\2]^\7u\2\2^\f\3"+
		"\2\2\2_`\7K\2\2`a\7p\2\2ab\7v\2\2b\16\3\2\2\2cd\7F\2\2de\7g\2\2ef\7e\2"+
		"\2fg\7k\2\2gh\7o\2\2hi\7c\2\2ij\7n\2\2j\20\3\2\2\2kl\7K\2\2lm\7N\2\2m"+
		"n\7G\2\2no\7a\2\2op\7V\2\2pq\7Q\2\2qr\7a\2\2rs\7T\2\2st\7C\2\2tu\7\\\2"+
		"\2uv\7G\2\2vw\7O\2\2wx\7a\2\2xy\7D\2\2yz\7G\2\2z{\7P\2\2{|\7F\2\2|}\7"+
		"\\\2\2}~\7K\2\2~\177\7G\2\2\177\22\3\2\2\2\u0080\u0081\7Q\2\2\u0081\u0082"+
		"\7F\2\2\u0082\u0083\7G\2\2\u0083\u0084\7L\2\2\u0084\u0085\7O\2\2\u0085"+
		"\u0086\7P\2\2\u0086\u0087\7K\2\2\u0087\u0088\7L\2\2\u0088\u0089\7a\2\2"+
		"\u0089\u008a\7O\2\2\u008a\u008b\7K\2\2\u008b\u008c\7G\2\2\u008c\u008d"+
		"\7a\2\2\u008d\u008e\7V\2\2\u008e\u008f\7Q\2\2\u008f\24\3\2\2\2\u0090\u0091"+
		"\7V\2\2\u0091\u0092\7C\2\2\u0092\u0093\7D\2\2\u0093\u0094\7N\2\2\u0094"+
		"\u0095\7K\2\2\u0095\u0096\7E\2\2\u0096\u0097\7\\\2\2\u0097\u0098\7M\2"+
		"\2\u0098\u0099\7C\2\2\u0099\u009a\7a\2\2\u009a\u009b\7O\2\2\u009b\u009c"+
		"\7P\2\2\u009c\u009d\7Q\2\2\u009d\u009e\7\\\2\2\u009e\u009f\7G\2\2\u009f"+
		"\u00a0\7P\2\2\u00a0\u00a1\7K\2\2\u00a1\u00a2\7C\2\2\u00a2\u00a3\7a\2\2"+
		"\u00a3\u00a4\7R\2\2\u00a4\u00a5\7T\2\2\u00a5\u00a6\7Q\2\2\u00a6\u00a7"+
		"\7U\2\2\u00a7\u00a8\7\\\2\2\u00a8\u00a9\7G\2\2\u00a9\26\3\2\2\2\u00aa"+
		"\u00ab\7R\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad\7F\2\2\u00ad\u00ae\7\\\2"+
		"\2\u00ae\u00af\7K\2\2\u00af\u00b0\7G\2\2\u00b0\u00b1\7N\2\2\u00b1\u00b2"+
		"\7a\2\2\u00b2\u00b3\7O\2\2\u00b3\u00b4\7K\2\2\u00b4\u00b5\7G\2\2\u00b5"+
		"\u00b6\7a\2\2\u00b6\u00b7\7V\2\2\u00b7\u00b8\7Q\2\2\u00b8\30\3\2\2\2\u00b9"+
		"\u00ba\7K\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7O\2\2\u00bc\u00bd\7C\2\2\u00bd"+
		"\u00be\7L\2\2\u00be\u00bf\7U\2\2\u00bf\u00c0\7V\2\2\u00c0\u00c1\7T\2\2"+
		"\u00c1\u00c2\7W\2\2\u00c2\u00c3\7L\2\2\u00c3\u00c4\7G\2\2\u00c4\u00c5"+
		"\7O\2\2\u00c5\u00c6\7[\2\2\u00c6\u00c7\7a\2\2\u00c7\u00c8\7H\2\2\u00c8"+
		"\u00c9\7W\2\2\u00c9\u00ca\7P\2\2\u00ca\u00cb\7M\2\2\u00cb\u00cc\7E\2\2"+
		"\u00cc\u00cd\7[\2\2\u00cd\u00ce\7L\2\2\u00ce\u00cf\7M\2\2\u00cf\u00d0"+
		"\7G\2\2\u00d0\34\3\2\2\2\u00d1\u00d2\7M\2\2\u00d2\u00d3\7Q\2\2\u00d3\u00d4"+
		"\7P\2\2\u00d4\u00d5\7K\2\2\u00d5\u00d6\7G\2\2\u00d6\u00d7\7E\2\2\u00d7"+
		"\u00d8\7a\2\2\u00d8\u00d9\7O\2\2\u00d9\u00da\7C\2\2\u00da\u00db\7L\2\2"+
		"\u00db\u00dc\7U\2\2\u00dc\u00dd\7V\2\2\u00dd\u00de\7T\2\2\u00de\u00df"+
		"\7Q\2\2\u00df\u00e0\7Y\2\2\u00e0\u00e1\7C\2\2\u00e1\u00e2\7P\2\2\u00e2"+
		"\u00e3\7K\2\2\u00e3\u00e4\7C\2\2\u00e4\36\3\2\2\2\u00e5\u00e6\7K\2\2\u00e6"+
		"\u00e7\7a\2\2\u00e7\u00e8\7V\2\2\u00e8\u00e9\7Q\2\2\u00e9 \3\2\2\2\u00ea"+
		"\u00eb\7R\2\2\u00eb\u00ec\7T\2\2\u00ec\u00ed\7\\\2\2\u00ed\u00ee\7[\2"+
		"\2\u00ee\u00ef\7\\\2\2\u00ef\u00f0\7[\2\2\u00f0\u00f1\7Y\2\2\u00f1\u00f2"+
		"\7C\2\2\u00f2\u00f3\7O\2\2\u00f3\u00f4\7a\2\2\u00f4\u00f5\7E\2\2\u00f5"+
		"\u00f6\7K\2\2\u00f6\u00f7\7G\2\2\u00f7\u00f8\7a\2\2\u00f8\u00f9\7H\2\2"+
		"\u00f9\u00fa\7W\2\2\u00fa\u00fb\7P\2\2\u00fb\u00fc\7M\2\2\u00fc\u00fd"+
		"\7E\2\2\u00fd\u00fe\7L\2\2\u00fe\u00ff\7Q\2\2\u00ff\u0100\7Q\2\2\u0100"+
		"\u0101\7Q\2\2\u0101\"\3\2\2\2\u0102\u0103\7U\2\2\u0103\u0104\7R\2\2\u0104"+
		"\u0105\7T\2\2\u0105\u0106\7C\2\2\u0106\u0107\7Y\2\2\u0107\u0108\7F\2\2"+
		"\u0108\u0109\7\\\2\2\u0109\u010a\7C\2\2\u010a\u010b\7P\2\2\u010b\u010c"+
		"\7M\2\2\u010c\u010d\7Q\2\2\u010d$\3\2\2\2\u010e\u010f\7C\2\2\u010f\u0110"+
		"\7a\2\2\u0110\u0111\7L\2\2\u0111\u0112\7C\2\2\u0112\u0113\7M\2\2\u0113"+
		"\u0114\7a\2\2\u0114\u0115\7P\2\2\u0115\u0116\7K\2\2\u0116\u0117\7G\2\2"+
		"\u0117&\3\2\2\2\u0118\u0119\7U\2\2\u0119\u011a\7Q\2\2\u011a\u011b\7O\2"+
		"\2\u011b\u011c\7a\2\2\u011c\u011d\7V\2\2\u011d\u011e\7C\2\2\u011e\u011f"+
		"\7M\2\2\u011f\u0120\7K\2\2\u0120\u0121\7G\2\2\u0121\u0122\7a\2\2\u0122"+
		"\u0123\7U\2\2\u0123\u0124\7C\2\2\u0124\u0125\7O\2\2\u0125\u0126\7G\2\2"+
		"\u0126(\3\2\2\2\u0127\u0128\7U\2\2\u0128\u0129\7Q\2\2\u0129\u012a\7O\2"+
		"\2\u012a\u012b\7a\2\2\u012b\u012c\7T\2\2\u012c\u012d\7Q\2\2\u012d\u012e"+
		"\7\\\2\2\u012e\u012f\7P\2\2\u012f\u0130\7G\2\2\u0130*\3\2\2\2\u0131\u0132"+
		"\7Y\2\2\u0132\u0133\7K\2\2\u0133\u0134\7P\2\2\u0134\u0135\7E\2\2\u0135"+
		"\u0136\7[\2\2\u0136\u0137\7L\2\2\u0137\u0138\7a\2\2\u0138\u0139\7P\2\2"+
		"\u0139\u013a\7K\2\2\u013a\u013b\7\\\2\2\u013b,\3\2\2\2\u013c\u013d\7O"+
		"\2\2\u013d\u013e\7P\2\2\u013e\u013f\7K\2\2\u013f\u0140\7L\2\2\u0140\u0141"+
		"\7a\2\2\u0141\u0142\7P\2\2\u0142\u0143\7K\2\2\u0143\u0144\7\\\2\2\u0144"+
		".\3\2\2\2\u0145\u014e\7\62\2\2\u0146\u014a\t\4\2\2\u0147\u0149\t\5\2\2"+
		"\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0145\3\2\2\2\u014d"+
		"\u0146\3\2\2\2\u014e\60\3\2\2\2\u014f\u015e\7\62\2\2\u0150\u0154\t\4\2"+
		"\2\u0151\u0153\t\5\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0159\7\60\2\2\u0158\u015a\t\5\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3"+
		"\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u014f\3\2\2\2\u015d\u0150\3\2\2\2\u015e\62\3\2\2\2\u015f\u0160\7-\2\2"+
		"\u0160\64\3\2\2\2\u0161\u0162\7/\2\2\u0162\66\3\2\2\2\u0163\u0164\7,\2"+
		"\2\u01648\3\2\2\2\u0165\u0166\7\61\2\2\u0166:\3\2\2\2\u0167\u0168\7V\2"+
		"\2\u0168\u0169\7Q\2\2\u0169<\3\2\2\2\u016a\u016b\7*\2\2\u016b>\3\2\2\2"+
		"\u016c\u016d\7+\2\2\u016d@\3\2\2\2\u016e\u016f\7.\2\2\u016fB\3\2\2\2\u0170"+
		"\u0172\t\6\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u017a\t\7\2\2\u0177\u0179\t\b\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2"+
		"\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017bD\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\f\2HM\u014a\u014d\u0154\u015b\u015d\u0173\u017a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
