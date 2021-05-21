// Generated from D:/Biblioteca/Documents/Lenguajes/traductor/grammar\PsiCoder.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PsiCoderLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FP=1, FFP=2, LEER=3, IMPRIMIR=4, BOOLEANO=5, ENTERO=6, REAL=7, CARACTER=8, 
		CADENA=9, TK_PYC=10, TK_ASIG=11, TK_COMA=12, TK_MAS=13, TK_MENOS=14, TK_MULT=15, 
		TK_DIV=16, TK_MOD=17, TK_PAR_IZQ=18, TK_PAR_DER=19, TK_BOOLEANO=20, ID=21, 
		TK_ENTERO=22, TK_REAL=23, TK_CADENA=24, TK_CARACTER=25, ESP=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FP", "FFP", "LEER", "IMPRIMIR", "BOOLEANO", "ENTERO", "REAL", "CARACTER", 
			"CADENA", "TK_PYC", "TK_ASIG", "TK_COMA", "TK_MAS", "TK_MENOS", "TK_MULT", 
			"TK_DIV", "TK_MOD", "TK_PAR_IZQ", "TK_PAR_DER", "TK_BOOLEANO", "ID", 
			"TK_ENTERO", "TK_REAL", "TK_CADENA", "TK_CARACTER", "ESP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion_principal'", "'fin_principal'", "'leer'", "'imprimir'", 
			"'booleano'", "'entero'", "'real'", "'caracter'", "'cadena'", "';'", 
			"'='", "','", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FP", "FFP", "LEER", "IMPRIMIR", "BOOLEANO", "ENTERO", "REAL", 
			"CARACTER", "CADENA", "TK_PYC", "TK_ASIG", "TK_COMA", "TK_MAS", "TK_MENOS", 
			"TK_MULT", "TK_DIV", "TK_MOD", "TK_PAR_IZQ", "TK_PAR_DER", "TK_BOOLEANO", 
			"ID", "TK_ENTERO", "TK_REAL", "TK_CADENA", "TK_CARACTER", "ESP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public PsiCoderLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PsiCoder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00ea\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ad\n\25\3\26\6\26\u00b0\n"+
		"\26\r\26\16\26\u00b1\3\26\7\26\u00b5\n\26\f\26\16\26\u00b8\13\26\3\27"+
		"\5\27\u00bb\n\27\3\27\3\27\3\27\6\27\u00c0\n\27\r\27\16\27\u00c1\5\27"+
		"\u00c4\n\27\3\30\5\30\u00c7\n\30\3\30\3\30\3\30\6\30\u00cc\n\30\r\30\16"+
		"\30\u00cd\5\30\u00d0\n\30\3\30\3\30\6\30\u00d4\n\30\r\30\16\30\u00d5\3"+
		"\31\3\31\6\31\u00da\n\31\r\31\16\31\u00db\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\6\33\u00e5\n\33\r\33\16\33\u00e6\3\33\3\33\2\2\34\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\7\5\2C\\aac|\3\2\62;\3"+
		"\2\60\60\t\2\13\f\17\17\"\"\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00f5\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5I\3\2\2\2\7W\3\2\2"+
		"\2\t\\\3\2\2\2\13e\3\2\2\2\rn\3\2\2\2\17u\3\2\2\2\21z\3\2\2\2\23\u0083"+
		"\3\2\2\2\25\u008a\3\2\2\2\27\u008c\3\2\2\2\31\u008e\3\2\2\2\33\u0090\3"+
		"\2\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2!\u0096\3\2\2\2#\u0098\3\2\2\2"+
		"%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u00ac\3\2\2\2+\u00af\3\2\2\2-\u00ba\3"+
		"\2\2\2/\u00c6\3\2\2\2\61\u00d7\3\2\2\2\63\u00df\3\2\2\2\65\u00e4\3\2\2"+
		"\2\678\7h\2\289\7w\2\29:\7p\2\2:;\7e\2\2;<\7k\2\2<=\7q\2\2=>\7p\2\2>?"+
		"\7a\2\2?@\7r\2\2@A\7t\2\2AB\7k\2\2BC\7p\2\2CD\7e\2\2DE\7k\2\2EF\7r\2\2"+
		"FG\7c\2\2GH\7n\2\2H\4\3\2\2\2IJ\7h\2\2JK\7k\2\2KL\7p\2\2LM\7a\2\2MN\7"+
		"r\2\2NO\7t\2\2OP\7k\2\2PQ\7p\2\2QR\7e\2\2RS\7k\2\2ST\7r\2\2TU\7c\2\2U"+
		"V\7n\2\2V\6\3\2\2\2WX\7n\2\2XY\7g\2\2YZ\7g\2\2Z[\7t\2\2[\b\3\2\2\2\\]"+
		"\7k\2\2]^\7o\2\2^_\7r\2\2_`\7t\2\2`a\7k\2\2ab\7o\2\2bc\7k\2\2cd\7t\2\2"+
		"d\n\3\2\2\2ef\7d\2\2fg\7q\2\2gh\7q\2\2hi\7n\2\2ij\7g\2\2jk\7c\2\2kl\7"+
		"p\2\2lm\7q\2\2m\f\3\2\2\2no\7g\2\2op\7p\2\2pq\7v\2\2qr\7g\2\2rs\7t\2\2"+
		"st\7q\2\2t\16\3\2\2\2uv\7t\2\2vw\7g\2\2wx\7c\2\2xy\7n\2\2y\20\3\2\2\2"+
		"z{\7e\2\2{|\7c\2\2|}\7t\2\2}~\7c\2\2~\177\7e\2\2\177\u0080\7v\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7t\2\2\u0082\22\3\2\2\2\u0083\u0084\7e\2\2\u0084"+
		"\u0085\7c\2\2\u0085\u0086\7f\2\2\u0086\u0087\7g\2\2\u0087\u0088\7p\2\2"+
		"\u0088\u0089\7c\2\2\u0089\24\3\2\2\2\u008a\u008b\7=\2\2\u008b\26\3\2\2"+
		"\2\u008c\u008d\7?\2\2\u008d\30\3\2\2\2\u008e\u008f\7.\2\2\u008f\32\3\2"+
		"\2\2\u0090\u0091\7-\2\2\u0091\34\3\2\2\2\u0092\u0093\7/\2\2\u0093\36\3"+
		"\2\2\2\u0094\u0095\7,\2\2\u0095 \3\2\2\2\u0096\u0097\7\61\2\2\u0097\""+
		"\3\2\2\2\u0098\u0099\7\'\2\2\u0099$\3\2\2\2\u009a\u009b\7*\2\2\u009b&"+
		"\3\2\2\2\u009c\u009d\7+\2\2\u009d(\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0"+
		"\7c\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7u\2\2\u00a2\u00ad\7q\2\2\u00a3"+
		"\u00a4\7x\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7f\2\2"+
		"\u00a7\u00a8\7c\2\2\u00a8\u00a9\7f\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab"+
		"\7t\2\2\u00ab\u00ad\7q\2\2\u00ac\u009e\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ad"+
		"*\3\2\2\2\u00ae\u00b0\t\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\3\2\2\2\u00b3\u00b5"+
		"\t\3\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7,\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\7/\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c3\3\2\2\2\u00bc\u00c4\4\62"+
		";\2\u00bd\u00bf\4\63;\2\u00be\u00c0\4\62;\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00bc\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c4.\3\2\2\2\u00c5\u00c7"+
		"\7/\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cf\3\2\2\2\u00c8"+
		"\u00d0\4\62;\2\u00c9\u00cb\4\63;\2\u00ca\u00cc\4\62;\2\u00cb\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d3\t\4\2\2\u00d2\u00d4\4\62;\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\60\3\2\2"+
		"\2\u00d7\u00d9\7$\2\2\u00d8\u00da\t\5\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\7$\2\2\u00de\62\3\2\2\2\u00df\u00e0\7)\2\2\u00e0\u00e1\t\5\2\2"+
		"\u00e1\u00e2\7)\2\2\u00e2\64\3\2\2\2\u00e3\u00e5\t\6\2\2\u00e4\u00e3\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\b\33\2\2\u00e9\66\3\2\2\2\17\2\u00ac\u00b1"+
		"\u00b6\u00ba\u00c1\u00c3\u00c6\u00cd\u00cf\u00d5\u00db\u00e6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}