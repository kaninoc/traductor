// Generated from D:/Biblioteca/Documents/Lenguajes/traductor/grammar\PsiCoder.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PsiCoderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FP=1, FFP=2, LEER=3, IMPRIMIR=4, BOOLEANO=5, ENTERO=6, REAL=7, CARACTER=8, 
		CADENA=9, TK_PYC=10, TK_ASIG=11, TK_COMA=12, TK_MAS=13, TK_MENOS=14, TK_MULT=15, 
		TK_DIV=16, TK_MOD=17, TK_PAR_IZQ=18, TK_PAR_DER=19, TK_BOOLEANO=20, ID=21, 
		TK_ENTERO=22, TK_REAL=23, TK_CADENA=24, TK_CARACTER=25, ESP=26;
	public static final int
		RULE_raiz = 0, RULE_f_principal = 1, RULE_contenido = 2, RULE_declaracion = 3, 
		RULE_varBooleano = 4, RULE_extvarB = 5, RULE_varEntero = 6, RULE_extvarE = 7, 
		RULE_varReal = 8, RULE_extvarR = 9, RULE_varCaracter = 10, RULE_extvarC = 11, 
		RULE_varCadena = 12, RULE_extvarS = 13, RULE_operacion = 14, RULE_expresion = 15, 
		RULE_operador = 16, RULE_tipovar = 17, RULE_lectura = 18, RULE_imprimir = 19, 
		RULE_impresion = 20, RULE_varimpresion = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz", "f_principal", "contenido", "declaracion", "varBooleano", "extvarB", 
			"varEntero", "extvarE", "varReal", "extvarR", "varCaracter", "extvarC", 
			"varCadena", "extvarS", "operacion", "expresion", "operador", "tipovar", 
			"lectura", "imprimir", "impresion", "varimpresion"
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

	@Override
	public String getGrammarFileName() { return "PsiCoder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PsiCoderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RaizContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PsiCoderParser.EOF, 0); }
		public F_principalContext f_principal() {
			return getRuleContext(F_principalContext.class,0);
		}
		public RaizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterRaiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitRaiz(this);
		}
	}

	public final RaizContext raiz() throws RecognitionException {
		RaizContext _localctx = new RaizContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_raiz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(44);
			f_principal();
			}
			setState(45);
			match(EOF);
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

	public static class F_principalContext extends ParserRuleContext {
		public TerminalNode FP() { return getToken(PsiCoderParser.FP, 0); }
		public TerminalNode FFP() { return getToken(PsiCoderParser.FFP, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public F_principalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterF_principal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitF_principal(this);
		}
	}

	public final F_principalContext f_principal() throws RecognitionException {
		F_principalContext _localctx = new F_principalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_f_principal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(FP);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA))) != 0)) {
				{
				{
				setState(48);
				contenido();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(FFP);
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

	public static class ContenidoContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public ContenidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterContenido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitContenido(this);
		}
	}

	public final ContenidoContext contenido() throws RecognitionException {
		ContenidoContext _localctx = new ContenidoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_contenido);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANO:
			case ENTERO:
			case REAL:
			case CARACTER:
			case CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				declaracion();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				lectura();
				}
				break;
			case IMPRIMIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				imprimir();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public VarBooleanoContext varBooleano() {
			return getRuleContext(VarBooleanoContext.class,0);
		}
		public VarEnteroContext varEntero() {
			return getRuleContext(VarEnteroContext.class,0);
		}
		public VarRealContext varReal() {
			return getRuleContext(VarRealContext.class,0);
		}
		public VarCaracterContext varCaracter() {
			return getRuleContext(VarCaracterContext.class,0);
		}
		public VarCadenaContext varCadena() {
			return getRuleContext(VarCadenaContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANO:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				varBooleano();
				}
				break;
			case ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				varEntero();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				varReal();
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				varCaracter();
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				varCadena();
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

	public static class VarBooleanoContext extends ParserRuleContext {
		public TerminalNode BOOLEANO() { return getToken(PsiCoderParser.BOOLEANO, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public ExtvarBContext extvarB() {
			return getRuleContext(ExtvarBContext.class,0);
		}
		public VarBooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBooleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterVarBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitVarBooleano(this);
		}
	}

	public final VarBooleanoContext varBooleano() throws RecognitionException {
		VarBooleanoContext _localctx = new VarBooleanoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varBooleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(BOOLEANO);
			setState(69);
			match(ID);
			setState(70);
			extvarB();
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

	public static class ExtvarBContext extends ParserRuleContext {
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsiCoderParser.TK_ASIG, 0); }
		public TerminalNode TK_BOOLEANO() { return getToken(PsiCoderParser.TK_BOOLEANO, 0); }
		public ExtvarBContext extvarB() {
			return getRuleContext(ExtvarBContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsiCoderParser.TK_COMA, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public ExtvarBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extvarB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExtvarB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExtvarB(this);
		}
	}

	public final ExtvarBContext extvarB() throws RecognitionException {
		ExtvarBContext _localctx = new ExtvarBContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_extvarB);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(TK_ASIG);
				setState(74);
				match(TK_BOOLEANO);
				setState(75);
				extvarB();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(TK_COMA);
				setState(77);
				match(ID);
				setState(78);
				extvarB();
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

	public static class VarEnteroContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(PsiCoderParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public ExtvarEContext extvarE() {
			return getRuleContext(ExtvarEContext.class,0);
		}
		public VarEnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varEntero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterVarEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitVarEntero(this);
		}
	}

	public final VarEnteroContext varEntero() throws RecognitionException {
		VarEnteroContext _localctx = new VarEnteroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varEntero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ENTERO);
			setState(82);
			match(ID);
			setState(83);
			extvarE();
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

	public static class ExtvarEContext extends ParserRuleContext {
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsiCoderParser.TK_ASIG, 0); }
		public TerminalNode TK_ENTERO() { return getToken(PsiCoderParser.TK_ENTERO, 0); }
		public ExtvarEContext extvarE() {
			return getRuleContext(ExtvarEContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsiCoderParser.TK_COMA, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public ExtvarEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extvarE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExtvarE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExtvarE(this);
		}
	}

	public final ExtvarEContext extvarE() throws RecognitionException {
		ExtvarEContext _localctx = new ExtvarEContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_extvarE);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(TK_ASIG);
				setState(87);
				match(TK_ENTERO);
				setState(88);
				extvarE();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(TK_COMA);
				setState(90);
				match(ID);
				setState(91);
				extvarE();
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

	public static class VarRealContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(PsiCoderParser.REAL, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public ExtvarRContext extvarR() {
			return getRuleContext(ExtvarRContext.class,0);
		}
		public VarRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterVarReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitVarReal(this);
		}
	}

	public final VarRealContext varReal() throws RecognitionException {
		VarRealContext _localctx = new VarRealContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(REAL);
			setState(95);
			match(ID);
			setState(96);
			extvarR();
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

	public static class ExtvarRContext extends ParserRuleContext {
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsiCoderParser.TK_ASIG, 0); }
		public TerminalNode TK_REAL() { return getToken(PsiCoderParser.TK_REAL, 0); }
		public ExtvarRContext extvarR() {
			return getRuleContext(ExtvarRContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsiCoderParser.TK_COMA, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public ExtvarRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extvarR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExtvarR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExtvarR(this);
		}
	}

	public final ExtvarRContext extvarR() throws RecognitionException {
		ExtvarRContext _localctx = new ExtvarRContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_extvarR);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(TK_ASIG);
				setState(100);
				match(TK_REAL);
				setState(101);
				extvarR();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(TK_COMA);
				setState(103);
				match(ID);
				setState(104);
				extvarR();
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

	public static class VarCaracterContext extends ParserRuleContext {
		public TerminalNode CARACTER() { return getToken(PsiCoderParser.CARACTER, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public ExtvarCContext extvarC() {
			return getRuleContext(ExtvarCContext.class,0);
		}
		public VarCaracterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varCaracter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterVarCaracter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitVarCaracter(this);
		}
	}

	public final VarCaracterContext varCaracter() throws RecognitionException {
		VarCaracterContext _localctx = new VarCaracterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varCaracter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CARACTER);
			setState(108);
			match(ID);
			setState(109);
			extvarC();
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

	public static class ExtvarCContext extends ParserRuleContext {
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsiCoderParser.TK_ASIG, 0); }
		public TerminalNode TK_CARACTER() { return getToken(PsiCoderParser.TK_CARACTER, 0); }
		public ExtvarCContext extvarC() {
			return getRuleContext(ExtvarCContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsiCoderParser.TK_COMA, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public ExtvarCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extvarC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExtvarC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExtvarC(this);
		}
	}

	public final ExtvarCContext extvarC() throws RecognitionException {
		ExtvarCContext _localctx = new ExtvarCContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_extvarC);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(TK_ASIG);
				setState(113);
				match(TK_CARACTER);
				setState(114);
				extvarC();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(TK_COMA);
				setState(116);
				match(ID);
				setState(117);
				extvarC();
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

	public static class VarCadenaContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(PsiCoderParser.CADENA, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public ExtvarSContext extvarS() {
			return getRuleContext(ExtvarSContext.class,0);
		}
		public VarCadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varCadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterVarCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitVarCadena(this);
		}
	}

	public final VarCadenaContext varCadena() throws RecognitionException {
		VarCadenaContext _localctx = new VarCadenaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varCadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(CADENA);
			setState(121);
			match(ID);
			setState(122);
			extvarS();
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

	public static class ExtvarSContext extends ParserRuleContext {
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsiCoderParser.TK_ASIG, 0); }
		public TerminalNode TK_CADENA() { return getToken(PsiCoderParser.TK_CADENA, 0); }
		public ExtvarSContext extvarS() {
			return getRuleContext(ExtvarSContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsiCoderParser.TK_COMA, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public ExtvarSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extvarS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExtvarS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExtvarS(this);
		}
	}

	public final ExtvarSContext extvarS() throws RecognitionException {
		ExtvarSContext _localctx = new ExtvarSContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_extvarS);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(TK_ASIG);
				setState(126);
				match(TK_CADENA);
				setState(127);
				extvarS();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(TK_COMA);
				setState(129);
				match(ID);
				setState(130);
				extvarS();
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

	public static class OperacionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitOperacion(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			expresion();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MAS) | (1L << TK_MENOS) | (1L << TK_MULT) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) {
				{
				{
				setState(134);
				operador();
				setState(135);
				expresion();
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

	public static class ExpresionContext extends ParserRuleContext {
		public TipovarContext tipovar() {
			return getRuleContext(TipovarContext.class,0);
		}
		public TerminalNode TK_PAR_IZQ() { return getToken(PsiCoderParser.TK_PAR_IZQ, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsiCoderParser.TK_PAR_DER, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expresion);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case TK_ENTERO:
			case TK_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				tipovar();
				}
				break;
			case TK_PAR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(TK_PAR_IZQ);
				setState(144);
				operacion();
				setState(145);
				match(TK_PAR_DER);
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

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode TK_MAS() { return getToken(PsiCoderParser.TK_MAS, 0); }
		public TerminalNode TK_MENOS() { return getToken(PsiCoderParser.TK_MENOS, 0); }
		public TerminalNode TK_MULT() { return getToken(PsiCoderParser.TK_MULT, 0); }
		public TerminalNode TK_DIV() { return getToken(PsiCoderParser.TK_DIV, 0); }
		public TerminalNode TK_MOD() { return getToken(PsiCoderParser.TK_MOD, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitOperador(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MAS) | (1L << TK_MENOS) | (1L << TK_MULT) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class TipovarContext extends ParserRuleContext {
		public TerminalNode TK_ENTERO() { return getToken(PsiCoderParser.TK_ENTERO, 0); }
		public TerminalNode TK_REAL() { return getToken(PsiCoderParser.TK_REAL, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public TipovarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipovar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterTipovar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitTipovar(this);
		}
	}

	public final TipovarContext tipovar() throws RecognitionException {
		TipovarContext _localctx = new TipovarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tipovar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << TK_ENTERO) | (1L << TK_REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class LecturaContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(PsiCoderParser.LEER, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsiCoderParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(PsiCoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterLectura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitLectura(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(LEER);
			setState(154);
			match(TK_PAR_IZQ);
			setState(155);
			match(ID);
			setState(156);
			match(TK_PAR_DER);
			setState(157);
			match(TK_PYC);
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

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(PsiCoderParser.IMPRIMIR, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsiCoderParser.TK_PAR_IZQ, 0); }
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsiCoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitImprimir(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(IMPRIMIR);
			setState(160);
			match(TK_PAR_IZQ);
			setState(161);
			impresion();
			setState(162);
			match(TK_PAR_DER);
			setState(163);
			match(TK_PYC);
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

	public static class ImpresionContext extends ParserRuleContext {
		public List<VarimpresionContext> varimpresion() {
			return getRuleContexts(VarimpresionContext.class);
		}
		public VarimpresionContext varimpresion(int i) {
			return getRuleContext(VarimpresionContext.class,i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(PsiCoderParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(PsiCoderParser.TK_COMA, i);
		}
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitImpresion(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_impresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			varimpresion();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(166);
				match(TK_COMA);
				setState(167);
				varimpresion();
				}
				}
				setState(172);
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

	public static class VarimpresionContext extends ParserRuleContext {
		public TerminalNode TK_BOOLEANO() { return getToken(PsiCoderParser.TK_BOOLEANO, 0); }
		public TerminalNode TK_ENTERO() { return getToken(PsiCoderParser.TK_ENTERO, 0); }
		public TerminalNode TK_REAL() { return getToken(PsiCoderParser.TK_REAL, 0); }
		public TerminalNode TK_CARACTER() { return getToken(PsiCoderParser.TK_CARACTER, 0); }
		public TerminalNode TK_CADENA() { return getToken(PsiCoderParser.TK_CADENA, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public VarimpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varimpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterVarimpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitVarimpresion(this);
		}
	}

	public final VarimpresionContext varimpresion() throws RecognitionException {
		VarimpresionContext _localctx = new VarimpresionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varimpresion);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(TK_BOOLEANO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(TK_ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(TK_REAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(TK_CARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(TK_CADENA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				operacion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				match(ID);
				}
				break;
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00b9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\3\3"+
		"\7\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\5\5E\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7R\n\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13l\n\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\ry\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0086\n\17\3\20\3\20\3\20\3\20\7\20\u008c\n\20\f"+
		"\20\16\20\u008f\13\20\3\21\3\21\3\21\3\21\3\21\5\21\u0096\n\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\7\26\u00ab\n\26\f\26\16\26\u00ae\13\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u00b7\n\27\3\27\2\2\30\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,\2\4\3\2\17\23\3\2\27\31\2\u00bc\2.\3\2\2"+
		"\2\4\61\3\2\2\2\6=\3\2\2\2\bD\3\2\2\2\nF\3\2\2\2\fQ\3\2\2\2\16S\3\2\2"+
		"\2\20^\3\2\2\2\22`\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30x\3\2\2\2\32z\3\2"+
		"\2\2\34\u0085\3\2\2\2\36\u0087\3\2\2\2 \u0095\3\2\2\2\"\u0097\3\2\2\2"+
		"$\u0099\3\2\2\2&\u009b\3\2\2\2(\u00a1\3\2\2\2*\u00a7\3\2\2\2,\u00b6\3"+
		"\2\2\2./\5\4\3\2/\60\7\2\2\3\60\3\3\2\2\2\61\65\7\3\2\2\62\64\5\6\4\2"+
		"\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67"+
		"\65\3\2\2\289\7\4\2\29\5\3\2\2\2:>\5\b\5\2;>\5&\24\2<>\5(\25\2=:\3\2\2"+
		"\2=;\3\2\2\2=<\3\2\2\2>\7\3\2\2\2?E\5\n\6\2@E\5\16\b\2AE\5\22\n\2BE\5"+
		"\26\f\2CE\5\32\16\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2"+
		"E\t\3\2\2\2FG\7\7\2\2GH\7\27\2\2HI\5\f\7\2I\13\3\2\2\2JR\7\f\2\2KL\7\r"+
		"\2\2LM\7\26\2\2MR\5\f\7\2NO\7\16\2\2OP\7\27\2\2PR\5\f\7\2QJ\3\2\2\2QK"+
		"\3\2\2\2QN\3\2\2\2R\r\3\2\2\2ST\7\b\2\2TU\7\27\2\2UV\5\20\t\2V\17\3\2"+
		"\2\2W_\7\f\2\2XY\7\r\2\2YZ\7\30\2\2Z_\5\20\t\2[\\\7\16\2\2\\]\7\27\2\2"+
		"]_\5\20\t\2^W\3\2\2\2^X\3\2\2\2^[\3\2\2\2_\21\3\2\2\2`a\7\t\2\2ab\7\27"+
		"\2\2bc\5\24\13\2c\23\3\2\2\2dl\7\f\2\2ef\7\r\2\2fg\7\31\2\2gl\5\24\13"+
		"\2hi\7\16\2\2ij\7\27\2\2jl\5\24\13\2kd\3\2\2\2ke\3\2\2\2kh\3\2\2\2l\25"+
		"\3\2\2\2mn\7\n\2\2no\7\27\2\2op\5\30\r\2p\27\3\2\2\2qy\7\f\2\2rs\7\r\2"+
		"\2st\7\33\2\2ty\5\30\r\2uv\7\16\2\2vw\7\27\2\2wy\5\30\r\2xq\3\2\2\2xr"+
		"\3\2\2\2xu\3\2\2\2y\31\3\2\2\2z{\7\13\2\2{|\7\27\2\2|}\5\34\17\2}\33\3"+
		"\2\2\2~\u0086\7\f\2\2\177\u0080\7\r\2\2\u0080\u0081\7\32\2\2\u0081\u0086"+
		"\5\34\17\2\u0082\u0083\7\16\2\2\u0083\u0084\7\27\2\2\u0084\u0086\5\34"+
		"\17\2\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085\u0082\3\2\2\2\u0086\35\3"+
		"\2\2\2\u0087\u008d\5 \21\2\u0088\u0089\5\"\22\2\u0089\u008a\5 \21\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\37\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0096"+
		"\5$\23\2\u0091\u0092\7\24\2\2\u0092\u0093\5\36\20\2\u0093\u0094\7\25\2"+
		"\2\u0094\u0096\3\2\2\2\u0095\u0090\3\2\2\2\u0095\u0091\3\2\2\2\u0096!"+
		"\3\2\2\2\u0097\u0098\t\2\2\2\u0098#\3\2\2\2\u0099\u009a\t\3\2\2\u009a"+
		"%\3\2\2\2\u009b\u009c\7\5\2\2\u009c\u009d\7\24\2\2\u009d\u009e\7\27\2"+
		"\2\u009e\u009f\7\25\2\2\u009f\u00a0\7\f\2\2\u00a0\'\3\2\2\2\u00a1\u00a2"+
		"\7\6\2\2\u00a2\u00a3\7\24\2\2\u00a3\u00a4\5*\26\2\u00a4\u00a5\7\25\2\2"+
		"\u00a5\u00a6\7\f\2\2\u00a6)\3\2\2\2\u00a7\u00ac\5,\27\2\u00a8\u00a9\7"+
		"\16\2\2\u00a9\u00ab\5,\27\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad+\3\2\2\2\u00ae\u00ac\3\2\2\2"+
		"\u00af\u00b7\7\26\2\2\u00b0\u00b7\7\30\2\2\u00b1\u00b7\7\31\2\2\u00b2"+
		"\u00b7\7\33\2\2\u00b3\u00b7\7\32\2\2\u00b4\u00b7\5\36\20\2\u00b5\u00b7"+
		"\7\27\2\2\u00b6\u00af\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b1\3\2\2\2"+
		"\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5"+
		"\3\2\2\2\u00b7-\3\2\2\2\16\65=DQ^kx\u0085\u008d\u0095\u00ac\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}