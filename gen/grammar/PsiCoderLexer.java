// Generated from C:/Users/Albert/Documents/lenguajes/traductor/grammar\PsiCoder.g4 by ANTLR 4.9.1
package grammar;
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
		FP=1, FFP=2, LEER=3, IMPRIMIR=4, SI=5, ENTONCES=6, FIN_SI=7, SI_NO=8, 
		MIENTRAS=9, HACER=10, FIN_MIENTRAS=11, PARA=12, FIN_PARA=13, SELECCIONAR=14, 
		ENTRE=15, CASO=16, ROMPER=17, DEFECTO=18, FIN_SELECCIONAR=19, ESTRUCTURA=20, 
		FIN_ESTRUCTURA=21, FUNCION=22, RETORNAR=23, FIN_FUNCION=24, BOOLEANO=25, 
		ENTERO=26, REAL=27, CARACTER=28, CADENA=29, TK_PYC=30, TK_DOSP=31, TK_ASIG=32, 
		TK_COMA=33, TK_PUNTO=34, TK_MAS=35, TK_MENOS=36, TK_MULT=37, TK_DIV=38, 
		TK_MOD=39, TK_PAR_IZQ=40, TK_PAR_DER=41, TK_Y=42, TK_O=43, TK_MENOR=44, 
		TK_MAYOR=45, TK_MENOR_IGUAL=46, TK_MAYOR_IGUAL=47, TK_IGUAL=48, TK_DIF=49, 
		TK_BOOLEANO=50, ID=51, TK_ENTERO=52, TK_REAL=53, TK_CADENA=54, TK_CARACTER=55, 
		ESP=56, COMMENT=57, COMMENTS=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FP", "FFP", "LEER", "IMPRIMIR", "SI", "ENTONCES", "FIN_SI", "SI_NO", 
			"MIENTRAS", "HACER", "FIN_MIENTRAS", "PARA", "FIN_PARA", "SELECCIONAR", 
			"ENTRE", "CASO", "ROMPER", "DEFECTO", "FIN_SELECCIONAR", "ESTRUCTURA", 
			"FIN_ESTRUCTURA", "FUNCION", "RETORNAR", "FIN_FUNCION", "BOOLEANO", "ENTERO", 
			"REAL", "CARACTER", "CADENA", "TK_PYC", "TK_DOSP", "TK_ASIG", "TK_COMA", 
			"TK_PUNTO", "TK_MAS", "TK_MENOS", "TK_MULT", "TK_DIV", "TK_MOD", "TK_PAR_IZQ", 
			"TK_PAR_DER", "TK_Y", "TK_O", "TK_MENOR", "TK_MAYOR", "TK_MENOR_IGUAL", 
			"TK_MAYOR_IGUAL", "TK_IGUAL", "TK_DIF", "TK_BOOLEANO", "ID", "TK_ENTERO", 
			"TK_REAL", "TK_CADENA", "TK_CARACTER", "ESP", "COMMENT", "COMMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion_principal'", "'fin_principal'", "'leer'", "'imprimir'", 
			"'si'", "'entonces'", "'fin_si'", "'si_no'", "'mientras'", "'hacer'", 
			"'fin_mientras'", "'para'", "'fin_para'", "'seleccionar'", "'entre'", 
			"'caso'", "'romper'", "'defecto'", "'fin_seleccionar'", "'estructura'", 
			"'fin_estructura'", "'funcion'", "'retornar'", "'fin_funcion'", "'booleano'", 
			"'entero'", "'real'", "'caracter'", "'cadena'", "';'", "':'", "'='", 
			"','", "'.'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'&&'", 
			"'||'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FP", "FFP", "LEER", "IMPRIMIR", "SI", "ENTONCES", "FIN_SI", "SI_NO", 
			"MIENTRAS", "HACER", "FIN_MIENTRAS", "PARA", "FIN_PARA", "SELECCIONAR", 
			"ENTRE", "CASO", "ROMPER", "DEFECTO", "FIN_SELECCIONAR", "ESTRUCTURA", 
			"FIN_ESTRUCTURA", "FUNCION", "RETORNAR", "FIN_FUNCION", "BOOLEANO", "ENTERO", 
			"REAL", "CARACTER", "CADENA", "TK_PYC", "TK_DOSP", "TK_ASIG", "TK_COMA", 
			"TK_PUNTO", "TK_MAS", "TK_MENOS", "TK_MULT", "TK_DIV", "TK_MOD", "TK_PAR_IZQ", 
			"TK_PAR_DER", "TK_Y", "TK_O", "TK_MENOR", "TK_MAYOR", "TK_MENOR_IGUAL", 
			"TK_MAYOR_IGUAL", "TK_IGUAL", "TK_DIF", "TK_BOOLEANO", "ID", "TK_ENTERO", 
			"TK_REAL", "TK_CADENA", "TK_CARACTER", "ESP", "COMMENT", "COMMENTS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0209\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u01b7\n\63\3\64\6\64\u01ba\n\64\r\64\16\64\u01bb"+
		"\3\64\7\64\u01bf\n\64\f\64\16\64\u01c2\13\64\3\65\3\65\3\65\6\65\u01c7"+
		"\n\65\r\65\16\65\u01c8\5\65\u01cb\n\65\3\66\3\66\3\66\6\66\u01d0\n\66"+
		"\r\66\16\66\u01d1\5\66\u01d4\n\66\3\66\3\66\6\66\u01d8\n\66\r\66\16\66"+
		"\u01d9\3\67\3\67\6\67\u01de\n\67\r\67\16\67\u01df\3\67\3\67\38\38\38\3"+
		"8\39\69\u01e9\n9\r9\169\u01ea\39\39\3:\3:\3:\3:\7:\u01f3\n:\f:\16:\u01f6"+
		"\13:\3:\3:\3:\3:\3;\3;\3;\3;\7;\u0200\n;\f;\16;\u0203\13;\3;\3;\3;\3;"+
		"\3;\4\u01f4\u0201\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<\3\2\7\5\2C\\aac|\3\2\62;\3\2\60\60\t\2\13\f"+
		"\17\17\"\"\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0214\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5\u0089\3\2\2\2\7\u0097\3\2\2\2\t"+
		"\u009c\3\2\2\2\13\u00a5\3\2\2\2\r\u00a8\3\2\2\2\17\u00b1\3\2\2\2\21\u00b8"+
		"\3\2\2\2\23\u00be\3\2\2\2\25\u00c7\3\2\2\2\27\u00cd\3\2\2\2\31\u00da\3"+
		"\2\2\2\33\u00df\3\2\2\2\35\u00e8\3\2\2\2\37\u00f4\3\2\2\2!\u00fa\3\2\2"+
		"\2#\u00ff\3\2\2\2%\u0106\3\2\2\2\'\u010e\3\2\2\2)\u011e\3\2\2\2+\u0129"+
		"\3\2\2\2-\u0138\3\2\2\2/\u0140\3\2\2\2\61\u0149\3\2\2\2\63\u0155\3\2\2"+
		"\2\65\u015e\3\2\2\2\67\u0165\3\2\2\29\u016a\3\2\2\2;\u0173\3\2\2\2=\u017a"+
		"\3\2\2\2?\u017c\3\2\2\2A\u017e\3\2\2\2C\u0180\3\2\2\2E\u0182\3\2\2\2G"+
		"\u0184\3\2\2\2I\u0186\3\2\2\2K\u0188\3\2\2\2M\u018a\3\2\2\2O\u018c\3\2"+
		"\2\2Q\u018e\3\2\2\2S\u0190\3\2\2\2U\u0192\3\2\2\2W\u0195\3\2\2\2Y\u0198"+
		"\3\2\2\2[\u019a\3\2\2\2]\u019c\3\2\2\2_\u019f\3\2\2\2a\u01a2\3\2\2\2c"+
		"\u01a5\3\2\2\2e\u01b6\3\2\2\2g\u01b9\3\2\2\2i\u01ca\3\2\2\2k\u01d3\3\2"+
		"\2\2m\u01db\3\2\2\2o\u01e3\3\2\2\2q\u01e8\3\2\2\2s\u01ee\3\2\2\2u\u01fb"+
		"\3\2\2\2wx\7h\2\2xy\7w\2\2yz\7p\2\2z{\7e\2\2{|\7k\2\2|}\7q\2\2}~\7p\2"+
		"\2~\177\7a\2\2\177\u0080\7r\2\2\u0080\u0081\7t\2\2\u0081\u0082\7k\2\2"+
		"\u0082\u0083\7p\2\2\u0083\u0084\7e\2\2\u0084\u0085\7k\2\2\u0085\u0086"+
		"\7r\2\2\u0086\u0087\7c\2\2\u0087\u0088\7n\2\2\u0088\4\3\2\2\2\u0089\u008a"+
		"\7h\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c\u008d\7a\2\2\u008d"+
		"\u008e\7r\2\2\u008e\u008f\7t\2\2\u008f\u0090\7k\2\2\u0090\u0091\7p\2\2"+
		"\u0091\u0092\7e\2\2\u0092\u0093\7k\2\2\u0093\u0094\7r\2\2\u0094\u0095"+
		"\7c\2\2\u0095\u0096\7n\2\2\u0096\6\3\2\2\2\u0097\u0098\7n\2\2\u0098\u0099"+
		"\7g\2\2\u0099\u009a\7g\2\2\u009a\u009b\7t\2\2\u009b\b\3\2\2\2\u009c\u009d"+
		"\7k\2\2\u009d\u009e\7o\2\2\u009e\u009f\7r\2\2\u009f\u00a0\7t\2\2\u00a0"+
		"\u00a1\7k\2\2\u00a1\u00a2\7o\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7t\2\2"+
		"\u00a4\n\3\2\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7k\2\2\u00a7\f\3\2\2\2"+
		"\u00a8\u00a9\7g\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac"+
		"\7q\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7g\2\2\u00af"+
		"\u00b0\7u\2\2\u00b0\16\3\2\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7p\2\2\u00b4\u00b5\7a\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7k\2\2"+
		"\u00b7\20\3\2\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7"+
		"a\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7q\2\2\u00bd\22\3\2\2\2\u00be\u00bf"+
		"\7o\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7p\2\2\u00c2"+
		"\u00c3\7v\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7u\2\2"+
		"\u00c6\24\3\2\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7"+
		"e\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7t\2\2\u00cc\26\3\2\2\2\u00cd\u00ce"+
		"\7h\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7a\2\2\u00d1"+
		"\u00d2\7o\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7p\2\2"+
		"\u00d5\u00d6\7v\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9"+
		"\7u\2\2\u00d9\30\3\2\2\2\u00da\u00db\7r\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd\u00de\7c\2\2\u00de\32\3\2\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1"+
		"\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7a\2\2\u00e3\u00e4\7r\2\2\u00e4"+
		"\u00e5\7c\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7c\2\2\u00e7\34\3\2\2\2\u00e8"+
		"\u00e9\7u\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7g\2\2"+
		"\u00ec\u00ed\7e\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0"+
		"\7q\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7t\2\2\u00f3"+
		"\36\3\2\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7v\2\2\u00f7"+
		"\u00f8\7t\2\2\u00f8\u00f9\7g\2\2\u00f9 \3\2\2\2\u00fa\u00fb\7e\2\2\u00fb"+
		"\u00fc\7c\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7q\2\2\u00fe\"\3\2\2\2\u00ff"+
		"\u0100\7t\2\2\u0100\u0101\7q\2\2\u0101\u0102\7o\2\2\u0102\u0103\7r\2\2"+
		"\u0103\u0104\7g\2\2\u0104\u0105\7t\2\2\u0105$\3\2\2\2\u0106\u0107\7f\2"+
		"\2\u0107\u0108\7g\2\2\u0108\u0109\7h\2\2\u0109\u010a\7g\2\2\u010a\u010b"+
		"\7e\2\2\u010b\u010c\7v\2\2\u010c\u010d\7q\2\2\u010d&\3\2\2\2\u010e\u010f"+
		"\7h\2\2\u010f\u0110\7k\2\2\u0110\u0111\7p\2\2\u0111\u0112\7a\2\2\u0112"+
		"\u0113\7u\2\2\u0113\u0114\7g\2\2\u0114\u0115\7n\2\2\u0115\u0116\7g\2\2"+
		"\u0116\u0117\7e\2\2\u0117\u0118\7e\2\2\u0118\u0119\7k\2\2\u0119\u011a"+
		"\7q\2\2\u011a\u011b\7p\2\2\u011b\u011c\7c\2\2\u011c\u011d\7t\2\2\u011d"+
		"(\3\2\2\2\u011e\u011f\7g\2\2\u011f\u0120\7u\2\2\u0120\u0121\7v\2\2\u0121"+
		"\u0122\7t\2\2\u0122\u0123\7w\2\2\u0123\u0124\7e\2\2\u0124\u0125\7v\2\2"+
		"\u0125\u0126\7w\2\2\u0126\u0127\7t\2\2\u0127\u0128\7c\2\2\u0128*\3\2\2"+
		"\2\u0129\u012a\7h\2\2\u012a\u012b\7k\2\2\u012b\u012c\7p\2\2\u012c\u012d"+
		"\7a\2\2\u012d\u012e\7g\2\2\u012e\u012f\7u\2\2\u012f\u0130\7v\2\2\u0130"+
		"\u0131\7t\2\2\u0131\u0132\7w\2\2\u0132\u0133\7e\2\2\u0133\u0134\7v\2\2"+
		"\u0134\u0135\7w\2\2\u0135\u0136\7t\2\2\u0136\u0137\7c\2\2\u0137,\3\2\2"+
		"\2\u0138\u0139\7h\2\2\u0139\u013a\7w\2\2\u013a\u013b\7p\2\2\u013b\u013c"+
		"\7e\2\2\u013c\u013d\7k\2\2\u013d\u013e\7q\2\2\u013e\u013f\7p\2\2\u013f"+
		".\3\2\2\2\u0140\u0141\7t\2\2\u0141\u0142\7g\2\2\u0142\u0143\7v\2\2\u0143"+
		"\u0144\7q\2\2\u0144\u0145\7t\2\2\u0145\u0146\7p\2\2\u0146\u0147\7c\2\2"+
		"\u0147\u0148\7t\2\2\u0148\60\3\2\2\2\u0149\u014a\7h\2\2\u014a\u014b\7"+
		"k\2\2\u014b\u014c\7p\2\2\u014c\u014d\7a\2\2\u014d\u014e\7h\2\2\u014e\u014f"+
		"\7w\2\2\u014f\u0150\7p\2\2\u0150\u0151\7e\2\2\u0151\u0152\7k\2\2\u0152"+
		"\u0153\7q\2\2\u0153\u0154\7p\2\2\u0154\62\3\2\2\2\u0155\u0156\7d\2\2\u0156"+
		"\u0157\7q\2\2\u0157\u0158\7q\2\2\u0158\u0159\7n\2\2\u0159\u015a\7g\2\2"+
		"\u015a\u015b\7c\2\2\u015b\u015c\7p\2\2\u015c\u015d\7q\2\2\u015d\64\3\2"+
		"\2\2\u015e\u015f\7g\2\2\u015f\u0160\7p\2\2\u0160\u0161\7v\2\2\u0161\u0162"+
		"\7g\2\2\u0162\u0163\7t\2\2\u0163\u0164\7q\2\2\u0164\66\3\2\2\2\u0165\u0166"+
		"\7t\2\2\u0166\u0167\7g\2\2\u0167\u0168\7c\2\2\u0168\u0169\7n\2\2\u0169"+
		"8\3\2\2\2\u016a\u016b\7e\2\2\u016b\u016c\7c\2\2\u016c\u016d\7t\2\2\u016d"+
		"\u016e\7c\2\2\u016e\u016f\7e\2\2\u016f\u0170\7v\2\2\u0170\u0171\7g\2\2"+
		"\u0171\u0172\7t\2\2\u0172:\3\2\2\2\u0173\u0174\7e\2\2\u0174\u0175\7c\2"+
		"\2\u0175\u0176\7f\2\2\u0176\u0177\7g\2\2\u0177\u0178\7p\2\2\u0178\u0179"+
		"\7c\2\2\u0179<\3\2\2\2\u017a\u017b\7=\2\2\u017b>\3\2\2\2\u017c\u017d\7"+
		"<\2\2\u017d@\3\2\2\2\u017e\u017f\7?\2\2\u017fB\3\2\2\2\u0180\u0181\7."+
		"\2\2\u0181D\3\2\2\2\u0182\u0183\7\60\2\2\u0183F\3\2\2\2\u0184\u0185\7"+
		"-\2\2\u0185H\3\2\2\2\u0186\u0187\7/\2\2\u0187J\3\2\2\2\u0188\u0189\7,"+
		"\2\2\u0189L\3\2\2\2\u018a\u018b\7\61\2\2\u018bN\3\2\2\2\u018c\u018d\7"+
		"\'\2\2\u018dP\3\2\2\2\u018e\u018f\7*\2\2\u018fR\3\2\2\2\u0190\u0191\7"+
		"+\2\2\u0191T\3\2\2\2\u0192\u0193\7(\2\2\u0193\u0194\7(\2\2\u0194V\3\2"+
		"\2\2\u0195\u0196\7~\2\2\u0196\u0197\7~\2\2\u0197X\3\2\2\2\u0198\u0199"+
		"\7>\2\2\u0199Z\3\2\2\2\u019a\u019b\7@\2\2\u019b\\\3\2\2\2\u019c\u019d"+
		"\7>\2\2\u019d\u019e\7?\2\2\u019e^\3\2\2\2\u019f\u01a0\7@\2\2\u01a0\u01a1"+
		"\7?\2\2\u01a1`\3\2\2\2\u01a2\u01a3\7?\2\2\u01a3\u01a4\7?\2\2\u01a4b\3"+
		"\2\2\2\u01a5\u01a6\7#\2\2\u01a6\u01a7\7?\2\2\u01a7d\3\2\2\2\u01a8\u01a9"+
		"\7h\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ab\7n\2\2\u01ab\u01ac\7u\2\2\u01ac"+
		"\u01b7\7q\2\2\u01ad\u01ae\7x\2\2\u01ae\u01af\7g\2\2\u01af\u01b0\7t\2\2"+
		"\u01b0\u01b1\7f\2\2\u01b1\u01b2\7c\2\2\u01b2\u01b3\7f\2\2\u01b3\u01b4"+
		"\7g\2\2\u01b4\u01b5\7t\2\2\u01b5\u01b7\7q\2\2\u01b6\u01a8\3\2\2\2\u01b6"+
		"\u01ad\3\2\2\2\u01b7f\3\2\2\2\u01b8\u01ba\t\2\2\2\u01b9\u01b8\3\2\2\2"+
		"\u01ba\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c0"+
		"\3\2\2\2\u01bd\u01bf\t\3\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1h\3\2\2\2\u01c2\u01c0\3\2\2\2"+
		"\u01c3\u01cb\4\62;\2\u01c4\u01c6\4\63;\2\u01c5\u01c7\4\62;\2\u01c6\u01c5"+
		"\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01cb\3\2\2\2\u01ca\u01c3\3\2\2\2\u01ca\u01c4\3\2\2\2\u01cbj\3\2\2\2"+
		"\u01cc\u01d4\4\62;\2\u01cd\u01cf\4\63;\2\u01ce\u01d0\4\62;\2\u01cf\u01ce"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01cc\3\2\2\2\u01d3\u01cd\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5\u01d7\t\4\2\2\u01d6\u01d8\4\62;\2\u01d7\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01dal\3\2\2\2"+
		"\u01db\u01dd\7$\2\2\u01dc\u01de\t\5\2\2\u01dd\u01dc\3\2\2\2\u01de\u01df"+
		"\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e2\7$\2\2\u01e2n\3\2\2\2\u01e3\u01e4\7)\2\2\u01e4\u01e5\t\5\2\2\u01e5"+
		"\u01e6\7)\2\2\u01e6p\3\2\2\2\u01e7\u01e9\t\6\2\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01ed\b9\2\2\u01edr\3\2\2\2\u01ee\u01ef\7\61\2\2\u01ef\u01f0"+
		"\7\61\2\2\u01f0\u01f4\3\2\2\2\u01f1\u01f3\13\2\2\2\u01f2\u01f1\3\2\2\2"+
		"\u01f3\u01f6\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f7"+
		"\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\7\f\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fa\b:\2\2\u01fat\3\2\2\2\u01fb\u01fc\7\61\2\2\u01fc\u01fd\7,\2\2\u01fd"+
		"\u0201\3\2\2\2\u01fe\u0200\13\2\2\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3"+
		"\2\2\2\u0201\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0204\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0204\u0205\7,\2\2\u0205\u0206\7\61\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u0208\b;\2\2\u0208v\3\2\2\2\17\2\u01b6\u01bb\u01c0\u01c8\u01ca"+
		"\u01d1\u01d3\u01d9\u01df\u01ea\u01f4\u0201\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}