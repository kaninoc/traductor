// Generated from C:/Users/Albert/Documents/lenguajes/traductor/grammar\PsiCoder.g4 by ANTLR 4.9.1
package grammar;
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
	public static final int
		RULE_raiz = 0, RULE_f_principal = 1, RULE_contenido = 2, RULE_declaracion = 3, 
		RULE_varBooleano = 4, RULE_extvarB = 5, RULE_varEntero = 6, RULE_extvarE = 7, 
		RULE_varReal = 8, RULE_extvarR = 9, RULE_varCaracter = 10, RULE_extvarC = 11, 
		RULE_varCadena = 12, RULE_extvarS = 13, RULE_varEstructura = 14, RULE_extvarEstructura = 15, 
		RULE_varAsigEstructura = 16, RULE_varDeclarada = 17, RULE_asigfuncion = 18, 
		RULE_repeticion = 19, RULE_operacion = 20, RULE_expresion = 21, RULE_operador = 22, 
		RULE_tipovar = 23, RULE_lectura = 24, RULE_imprimir = 25, RULE_impresion = 26, 
		RULE_repeticionimpresion = 27, RULE_varimpresion = 28, RULE_condicional = 29, 
		RULE_cuerpoif = 30, RULE_sino = 31, RULE_operacionlogica = 32, RULE_operadorlogico = 33, 
		RULE_comparador = 34, RULE_ciclomientras = 35, RULE_ciclohacer = 36, RULE_ciclopara = 37, 
		RULE_contenidopara = 38, RULE_contparaopt = 39, RULE_contparaoptfinal = 40, 
		RULE_elementospara = 41, RULE_complementopara = 42, RULE_elementosparados = 43, 
		RULE_comparadorpara = 44, RULE_segundocomparador = 45, RULE_segcomfinal = 46, 
		RULE_varcomparable = 47, RULE_credec = 48, RULE_multiple = 49, RULE_casos = 50, 
		RULE_estructuras = 51, RULE_decfuncion = 52, RULE_parametros = 53, RULE_tipofuncion = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz", "f_principal", "contenido", "declaracion", "varBooleano", "extvarB", 
			"varEntero", "extvarE", "varReal", "extvarR", "varCaracter", "extvarC", 
			"varCadena", "extvarS", "varEstructura", "extvarEstructura", "varAsigEstructura", 
			"varDeclarada", "asigfuncion", "repeticion", "operacion", "expresion", 
			"operador", "tipovar", "lectura", "imprimir", "impresion", "repeticionimpresion", 
			"varimpresion", "condicional", "cuerpoif", "sino", "operacionlogica", 
			"operadorlogico", "comparador", "ciclomientras", "ciclohacer", "ciclopara", 
			"contenidopara", "contparaopt", "contparaoptfinal", "elementospara", 
			"complementopara", "elementosparados", "comparadorpara", "segundocomparador", 
			"segcomfinal", "varcomparable", "credec", "multiple", "casos", "estructuras", 
			"decfuncion", "parametros", "tipofuncion"
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
		public List<EstructurasContext> estructuras() {
			return getRuleContexts(EstructurasContext.class);
		}
		public EstructurasContext estructuras(int i) {
			return getRuleContext(EstructurasContext.class,i);
		}
		public List<DecfuncionContext> decfuncion() {
			return getRuleContexts(DecfuncionContext.class);
		}
		public DecfuncionContext decfuncion(int i) {
			return getRuleContext(DecfuncionContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTRUCTURA || _la==FUNCION) {
				{
				setState(112);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESTRUCTURA:
					{
					setState(110);
					estructuras();
					}
					break;
				case FUNCION:
					{
					setState(111);
					decfuncion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(117);
			f_principal();
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTRUCTURA || _la==FUNCION) {
				{
				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESTRUCTURA:
					{
					setState(118);
					estructuras();
					}
					break;
				case FUNCION:
					{
					setState(119);
					decfuncion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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
			setState(127);
			match(FP);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				contenido();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(133);
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
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CiclomientrasContext ciclomientras() {
			return getRuleContext(CiclomientrasContext.class,0);
		}
		public CiclohacerContext ciclohacer() {
			return getRuleContext(CiclohacerContext.class,0);
		}
		public CicloparaContext ciclopara() {
			return getRuleContext(CicloparaContext.class,0);
		}
		public MultipleContext multiple() {
			return getRuleContext(MultipleContext.class,0);
		}
		public AsigfuncionContext asigfuncion() {
			return getRuleContext(AsigfuncionContext.class,0);
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				lectura();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				imprimir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				condicional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				ciclomientras();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				ciclohacer();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				ciclopara();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				multiple();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(143);
				asigfuncion();
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
		public VarEstructuraContext varEstructura() {
			return getRuleContext(VarEstructuraContext.class,0);
		}
		public VarAsigEstructuraContext varAsigEstructura() {
			return getRuleContext(VarAsigEstructuraContext.class,0);
		}
		public VarDeclaradaContext varDeclarada() {
			return getRuleContext(VarDeclaradaContext.class,0);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				varBooleano();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				varEntero();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				varReal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				varCaracter();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				varCadena();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				varEstructura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				varAsigEstructura();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(153);
				varDeclarada();
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
			setState(156);
			match(BOOLEANO);
			setState(157);
			match(ID);
			setState(158);
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
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(TK_ASIG);
				setState(162);
				match(TK_BOOLEANO);
				setState(163);
				extvarB();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(TK_COMA);
				setState(165);
				match(ID);
				setState(166);
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
			setState(169);
			match(ENTERO);
			setState(170);
			match(ID);
			setState(171);
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
		public TerminalNode TK_MENOS() { return getToken(PsiCoderParser.TK_MENOS, 0); }
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
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(TK_ASIG);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_MENOS) {
					{
					setState(175);
					match(TK_MENOS);
					}
				}

				setState(178);
				match(TK_ENTERO);
				setState(179);
				extvarE();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(TK_COMA);
				setState(181);
				match(ID);
				setState(182);
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
			setState(185);
			match(REAL);
			setState(186);
			match(ID);
			setState(187);
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
		public TerminalNode TK_MENOS() { return getToken(PsiCoderParser.TK_MENOS, 0); }
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
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(TK_ASIG);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_MENOS) {
					{
					setState(191);
					match(TK_MENOS);
					}
				}

				setState(194);
				match(TK_REAL);
				setState(195);
				extvarR();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(TK_COMA);
				setState(197);
				match(ID);
				setState(198);
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
			setState(201);
			match(CARACTER);
			setState(202);
			match(ID);
			setState(203);
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
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(TK_ASIG);
				setState(207);
				match(TK_CARACTER);
				setState(208);
				extvarC();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(TK_COMA);
				setState(210);
				match(ID);
				setState(211);
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
			setState(214);
			match(CADENA);
			setState(215);
			match(ID);
			setState(216);
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
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(TK_ASIG);
				setState(220);
				match(TK_CADENA);
				setState(221);
				extvarS();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(TK_COMA);
				setState(223);
				match(ID);
				setState(224);
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

	public static class VarEstructuraContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PsiCoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsiCoderParser.ID, i);
		}
		public ExtvarEstructuraContext extvarEstructura() {
			return getRuleContext(ExtvarEstructuraContext.class,0);
		}
		public VarEstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varEstructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterVarEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitVarEstructura(this);
		}
	}

	public final VarEstructuraContext varEstructura() throws RecognitionException {
		VarEstructuraContext _localctx = new VarEstructuraContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varEstructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ID);
			setState(228);
			match(ID);
			setState(229);
			extvarEstructura();
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

	public static class ExtvarEstructuraContext extends ParserRuleContext {
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public TerminalNode TK_COMA() { return getToken(PsiCoderParser.TK_COMA, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public ExtvarEstructuraContext extvarEstructura() {
			return getRuleContext(ExtvarEstructuraContext.class,0);
		}
		public ExtvarEstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extvarEstructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExtvarEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExtvarEstructura(this);
		}
	}

	public final ExtvarEstructuraContext extvarEstructura() throws RecognitionException {
		ExtvarEstructuraContext _localctx = new ExtvarEstructuraContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_extvarEstructura);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(TK_PYC);
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(TK_COMA);
				setState(233);
				match(ID);
				setState(234);
				extvarEstructura();
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

	public static class VarAsigEstructuraContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PsiCoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsiCoderParser.ID, i);
		}
		public List<TerminalNode> TK_PUNTO() { return getTokens(PsiCoderParser.TK_PUNTO); }
		public TerminalNode TK_PUNTO(int i) {
			return getToken(PsiCoderParser.TK_PUNTO, i);
		}
		public TerminalNode TK_ASIG() { return getToken(PsiCoderParser.TK_ASIG, 0); }
		public VarimpresionContext varimpresion() {
			return getRuleContext(VarimpresionContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public VarAsigEstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAsigEstructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterVarAsigEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitVarAsigEstructura(this);
		}
	}

	public final VarAsigEstructuraContext varAsigEstructura() throws RecognitionException {
		VarAsigEstructuraContext _localctx = new VarAsigEstructuraContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varAsigEstructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(ID);
			setState(238);
			match(TK_PUNTO);
			setState(239);
			match(ID);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PUNTO) {
				{
				{
				setState(240);
				match(TK_PUNTO);
				setState(241);
				match(ID);
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(TK_ASIG);
			setState(248);
			varimpresion();
			setState(249);
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

	public static class VarDeclaradaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsiCoderParser.TK_ASIG, 0); }
		public VarimpresionContext varimpresion() {
			return getRuleContext(VarimpresionContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public VarDeclaradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterVarDeclarada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitVarDeclarada(this);
		}
	}

	public final VarDeclaradaContext varDeclarada() throws RecognitionException {
		VarDeclaradaContext _localctx = new VarDeclaradaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_varDeclarada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ID);
			setState(252);
			match(TK_ASIG);
			setState(253);
			varimpresion();
			setState(254);
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

	public static class AsigfuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsiCoderParser.TK_PAR_IZQ, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(PsiCoderParser.TK_PAR_DER, 0); }
		public VarimpresionContext varimpresion() {
			return getRuleContext(VarimpresionContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public List<RepeticionContext> repeticion() {
			return getRuleContexts(RepeticionContext.class);
		}
		public RepeticionContext repeticion(int i) {
			return getRuleContext(RepeticionContext.class,i);
		}
		public AsigfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asigfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterAsigfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitAsigfuncion(this);
		}
	}

	public final AsigfuncionContext asigfuncion() throws RecognitionException {
		AsigfuncionContext _localctx = new AsigfuncionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_asigfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ID);
			setState(257);
			match(TK_PAR_IZQ);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOS) | (1L << TK_PAR_IZQ) | (1L << TK_BOOLEANO) | (1L << ID) | (1L << TK_ENTERO) | (1L << TK_REAL) | (1L << TK_CADENA) | (1L << TK_CARACTER))) != 0)) {
				{
				setState(258);
				varimpresion();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(259);
					repeticion();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(267);
			match(TK_PAR_DER);
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(268);
				match(TK_PYC);
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

	public static class RepeticionContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(PsiCoderParser.TK_COMA, 0); }
		public VarimpresionContext varimpresion() {
			return getRuleContext(VarimpresionContext.class,0);
		}
		public RepeticionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterRepeticion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitRepeticion(this);
		}
	}

	public final RepeticionContext repeticion() throws RecognitionException {
		RepeticionContext _localctx = new RepeticionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_repeticion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(TK_COMA);
			setState(272);
			varimpresion();
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
		enterRule(_localctx, 40, RULE_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			expresion();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MAS) | (1L << TK_MENOS) | (1L << TK_MULT) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) {
				{
				{
				setState(275);
				operador();
				setState(276);
				expresion();
				}
				}
				setState(282);
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
		enterRule(_localctx, 42, RULE_expresion);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_MENOS:
			case ID:
			case TK_ENTERO:
			case TK_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				tipovar();
				}
				break;
			case TK_PAR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(TK_PAR_IZQ);
				setState(285);
				operacion();
				setState(286);
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
		enterRule(_localctx, 44, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
		public TerminalNode TK_MENOS() { return getToken(PsiCoderParser.TK_MENOS, 0); }
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
		enterRule(_localctx, 46, RULE_tipovar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_MENOS) {
				{
				setState(292);
				match(TK_MENOS);
				}
			}

			setState(295);
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
		enterRule(_localctx, 48, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(LEER);
			setState(298);
			match(TK_PAR_IZQ);
			setState(299);
			match(ID);
			setState(300);
			match(TK_PAR_DER);
			setState(301);
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
		enterRule(_localctx, 50, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IMPRIMIR);
			setState(304);
			match(TK_PAR_IZQ);
			setState(305);
			impresion();
			setState(306);
			match(TK_PAR_DER);
			setState(307);
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
		public VarimpresionContext varimpresion() {
			return getRuleContext(VarimpresionContext.class,0);
		}
		public List<RepeticionimpresionContext> repeticionimpresion() {
			return getRuleContexts(RepeticionimpresionContext.class);
		}
		public RepeticionimpresionContext repeticionimpresion(int i) {
			return getRuleContext(RepeticionimpresionContext.class,i);
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
		enterRule(_localctx, 52, RULE_impresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			varimpresion();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(310);
				repeticionimpresion();
				}
				}
				setState(315);
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

	public static class RepeticionimpresionContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(PsiCoderParser.TK_COMA, 0); }
		public VarimpresionContext varimpresion() {
			return getRuleContext(VarimpresionContext.class,0);
		}
		public RepeticionimpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticionimpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterRepeticionimpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitRepeticionimpresion(this);
		}
	}

	public final RepeticionimpresionContext repeticionimpresion() throws RecognitionException {
		RepeticionimpresionContext _localctx = new RepeticionimpresionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_repeticionimpresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(TK_COMA);
			setState(317);
			varimpresion();
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
		public AsigfuncionContext asigfuncion() {
			return getRuleContext(AsigfuncionContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_varimpresion);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(TK_BOOLEANO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(TK_ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(TK_REAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				match(TK_CARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				match(TK_CADENA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
				operacion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(325);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(326);
				asigfuncion();
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(PsiCoderParser.SI, 0); }
		public OperacionlogicaContext operacionlogica() {
			return getRuleContext(OperacionlogicaContext.class,0);
		}
		public CuerpoifContext cuerpoif() {
			return getRuleContext(CuerpoifContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(SI);
			setState(330);
			operacionlogica();
			setState(331);
			cuerpoif();
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

	public static class CuerpoifContext extends ParserRuleContext {
		public TerminalNode ENTONCES() { return getToken(PsiCoderParser.ENTONCES, 0); }
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public CuerpoifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCuerpoif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCuerpoif(this);
		}
	}

	public final CuerpoifContext cuerpoif() throws RecognitionException {
		CuerpoifContext _localctx = new CuerpoifContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cuerpoif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ENTONCES);
			setState(335); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(334);
				contenido();
				}
				}
				setState(337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(339);
			sino();
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

	public static class SinoContext extends ParserRuleContext {
		public TerminalNode FIN_SI() { return getToken(PsiCoderParser.FIN_SI, 0); }
		public TerminalNode SI_NO() { return getToken(PsiCoderParser.SI_NO, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitSino(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SI_NO) {
				{
				setState(341);
				match(SI_NO);
				setState(343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(342);
					contenido();
					}
					}
					setState(345); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
				}
			}

			setState(349);
			match(FIN_SI);
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

	public static class OperacionlogicaContext extends ParserRuleContext {
		public TerminalNode TK_PAR_IZQ() { return getToken(PsiCoderParser.TK_PAR_IZQ, 0); }
		public List<VarimpresionContext> varimpresion() {
			return getRuleContexts(VarimpresionContext.class);
		}
		public VarimpresionContext varimpresion(int i) {
			return getRuleContext(VarimpresionContext.class,i);
		}
		public List<ComparadorContext> comparador() {
			return getRuleContexts(ComparadorContext.class);
		}
		public ComparadorContext comparador(int i) {
			return getRuleContext(ComparadorContext.class,i);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsiCoderParser.TK_PAR_DER, 0); }
		public OperadorlogicoContext operadorlogico() {
			return getRuleContext(OperadorlogicoContext.class,0);
		}
		public OperacionlogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionlogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterOperacionlogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitOperacionlogica(this);
		}
	}

	public final OperacionlogicaContext operacionlogica() throws RecognitionException {
		OperacionlogicaContext _localctx = new OperacionlogicaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operacionlogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(TK_PAR_IZQ);
			setState(352);
			varimpresion();
			setState(353);
			comparador();
			setState(354);
			varimpresion();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_Y || _la==TK_O) {
				{
				setState(355);
				operadorlogico();
				setState(356);
				varimpresion();
				setState(357);
				comparador();
				setState(358);
				varimpresion();
				}
			}

			setState(362);
			match(TK_PAR_DER);
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

	public static class OperadorlogicoContext extends ParserRuleContext {
		public TerminalNode TK_Y() { return getToken(PsiCoderParser.TK_Y, 0); }
		public TerminalNode TK_O() { return getToken(PsiCoderParser.TK_O, 0); }
		public OperadorlogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorlogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterOperadorlogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitOperadorlogico(this);
		}
	}

	public final OperadorlogicoContext operadorlogico() throws RecognitionException {
		OperadorlogicoContext _localctx = new OperadorlogicoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operadorlogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !(_la==TK_Y || _la==TK_O) ) {
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

	public static class ComparadorContext extends ParserRuleContext {
		public TerminalNode TK_MENOR() { return getToken(PsiCoderParser.TK_MENOR, 0); }
		public TerminalNode TK_MAYOR() { return getToken(PsiCoderParser.TK_MAYOR, 0); }
		public TerminalNode TK_MENOR_IGUAL() { return getToken(PsiCoderParser.TK_MENOR_IGUAL, 0); }
		public TerminalNode TK_MAYOR_IGUAL() { return getToken(PsiCoderParser.TK_MAYOR_IGUAL, 0); }
		public TerminalNode TK_IGUAL() { return getToken(PsiCoderParser.TK_IGUAL, 0); }
		public TerminalNode TK_DIF() { return getToken(PsiCoderParser.TK_DIF, 0); }
		public ComparadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterComparador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitComparador(this);
		}
	}

	public final ComparadorContext comparador() throws RecognitionException {
		ComparadorContext _localctx = new ComparadorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_comparador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MAYOR) | (1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL) | (1L << TK_IGUAL) | (1L << TK_DIF))) != 0)) ) {
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

	public static class CiclomientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(PsiCoderParser.MIENTRAS, 0); }
		public OperacionlogicaContext operacionlogica() {
			return getRuleContext(OperacionlogicaContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PsiCoderParser.HACER, 0); }
		public TerminalNode FIN_MIENTRAS() { return getToken(PsiCoderParser.FIN_MIENTRAS, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public CiclomientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclomientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCiclomientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCiclomientras(this);
		}
	}

	public final CiclomientrasContext ciclomientras() throws RecognitionException {
		CiclomientrasContext _localctx = new CiclomientrasContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ciclomientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(MIENTRAS);
			setState(369);
			operacionlogica();
			setState(370);
			match(HACER);
			setState(372); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(371);
				contenido();
				}
				}
				setState(374); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(376);
			match(FIN_MIENTRAS);
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

	public static class CiclohacerContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(PsiCoderParser.HACER, 0); }
		public TerminalNode MIENTRAS() { return getToken(PsiCoderParser.MIENTRAS, 0); }
		public OperacionlogicaContext operacionlogica() {
			return getRuleContext(OperacionlogicaContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public CiclohacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclohacer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCiclohacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCiclohacer(this);
		}
	}

	public final CiclohacerContext ciclohacer() throws RecognitionException {
		CiclohacerContext _localctx = new CiclohacerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ciclohacer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(HACER);
			setState(380); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(379);
					contenido();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(382); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(384);
			match(MIENTRAS);
			setState(385);
			operacionlogica();
			setState(386);
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

	public static class CicloparaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(PsiCoderParser.PARA, 0); }
		public ElementosparaContext elementospara() {
			return getRuleContext(ElementosparaContext.class,0);
		}
		public ContenidoparaContext contenidopara() {
			return getRuleContext(ContenidoparaContext.class,0);
		}
		public CicloparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclopara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCiclopara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCiclopara(this);
		}
	}

	public final CicloparaContext ciclopara() throws RecognitionException {
		CicloparaContext _localctx = new CicloparaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ciclopara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(PARA);
			setState(389);
			elementospara();
			setState(390);
			contenidopara();
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

	public static class ContenidoparaContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(PsiCoderParser.HACER, 0); }
		public TerminalNode FIN_PARA() { return getToken(PsiCoderParser.FIN_PARA, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public ContparaoptContext contparaopt() {
			return getRuleContext(ContparaoptContext.class,0);
		}
		public ContenidoparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenidopara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterContenidopara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitContenidopara(this);
		}
	}

	public final ContenidoparaContext contenidopara() throws RecognitionException {
		ContenidoparaContext _localctx = new ContenidoparaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_contenidopara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(HACER);
			setState(394); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(393);
				contenido();
				}
				}
				setState(396); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(398);
			match(FIN_PARA);
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(399);
				contparaopt();
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

	public static class ContparaoptContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(PsiCoderParser.PARA, 0); }
		public ElementosparadosContext elementosparados() {
			return getRuleContext(ElementosparadosContext.class,0);
		}
		public ContparaoptfinalContext contparaoptfinal() {
			return getRuleContext(ContparaoptfinalContext.class,0);
		}
		public ContparaoptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contparaopt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterContparaopt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitContparaopt(this);
		}
	}

	public final ContparaoptContext contparaopt() throws RecognitionException {
		ContparaoptContext _localctx = new ContparaoptContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_contparaopt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(PARA);
			setState(403);
			elementosparados();
			setState(404);
			contparaoptfinal();
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

	public static class ContparaoptfinalContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(PsiCoderParser.HACER, 0); }
		public TerminalNode FIN_PARA() { return getToken(PsiCoderParser.FIN_PARA, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public ContparaoptfinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contparaoptfinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterContparaoptfinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitContparaoptfinal(this);
		}
	}

	public final ContparaoptfinalContext contparaoptfinal() throws RecognitionException {
		ContparaoptfinalContext _localctx = new ContparaoptfinalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_contparaoptfinal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(HACER);
			setState(408); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(407);
				contenido();
				}
				}
				setState(410); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(412);
			match(FIN_PARA);
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

	public static class ElementosparaContext extends ParserRuleContext {
		public TerminalNode TK_PAR_IZQ() { return getToken(PsiCoderParser.TK_PAR_IZQ, 0); }
		public TerminalNode ENTERO() { return getToken(PsiCoderParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsiCoderParser.TK_ASIG, 0); }
		public TerminalNode TK_ENTERO() { return getToken(PsiCoderParser.TK_ENTERO, 0); }
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public ComparadorparaContext comparadorpara() {
			return getRuleContext(ComparadorparaContext.class,0);
		}
		public ComplementoparaContext complementopara() {
			return getRuleContext(ComplementoparaContext.class,0);
		}
		public ElementosparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementospara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterElementospara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitElementospara(this);
		}
	}

	public final ElementosparaContext elementospara() throws RecognitionException {
		ElementosparaContext _localctx = new ElementosparaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_elementospara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(TK_PAR_IZQ);
			setState(415);
			match(ENTERO);
			setState(416);
			match(ID);
			setState(417);
			match(TK_ASIG);
			setState(418);
			match(TK_ENTERO);
			setState(419);
			match(TK_PYC);
			setState(420);
			comparadorpara();
			setState(421);
			complementopara();
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

	public static class ComplementoparaContext extends ParserRuleContext {
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public VarcomparableContext varcomparable() {
			return getRuleContext(VarcomparableContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsiCoderParser.TK_PAR_DER, 0); }
		public ComplementoparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complementopara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterComplementopara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitComplementopara(this);
		}
	}

	public final ComplementoparaContext complementopara() throws RecognitionException {
		ComplementoparaContext _localctx = new ComplementoparaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_complementopara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(TK_PYC);
			setState(424);
			varcomparable();
			setState(425);
			match(TK_PAR_DER);
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

	public static class ElementosparadosContext extends ParserRuleContext {
		public TerminalNode TK_PAR_IZQ() { return getToken(PsiCoderParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsiCoderParser.TK_ASIG, 0); }
		public TerminalNode TK_ENTERO() { return getToken(PsiCoderParser.TK_ENTERO, 0); }
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public ComparadorparaContext comparadorpara() {
			return getRuleContext(ComparadorparaContext.class,0);
		}
		public ComplementoparaContext complementopara() {
			return getRuleContext(ComplementoparaContext.class,0);
		}
		public ElementosparadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementosparados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterElementosparados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitElementosparados(this);
		}
	}

	public final ElementosparadosContext elementosparados() throws RecognitionException {
		ElementosparadosContext _localctx = new ElementosparadosContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_elementosparados);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(TK_PAR_IZQ);
			setState(428);
			match(ID);
			setState(429);
			match(TK_ASIG);
			setState(430);
			match(TK_ENTERO);
			setState(431);
			match(TK_PYC);
			setState(432);
			comparadorpara();
			setState(433);
			complementopara();
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

	public static class ComparadorparaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public CredecContext credec() {
			return getRuleContext(CredecContext.class,0);
		}
		public VarcomparableContext varcomparable() {
			return getRuleContext(VarcomparableContext.class,0);
		}
		public SegundocomparadorContext segundocomparador() {
			return getRuleContext(SegundocomparadorContext.class,0);
		}
		public ComparadorparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparadorpara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterComparadorpara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitComparadorpara(this);
		}
	}

	public final ComparadorparaContext comparadorpara() throws RecognitionException {
		ComparadorparaContext _localctx = new ComparadorparaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_comparadorpara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(ID);
			setState(436);
			credec();
			setState(437);
			varcomparable();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_Y || _la==TK_O) {
				{
				setState(438);
				segundocomparador();
				}
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

	public static class SegundocomparadorContext extends ParserRuleContext {
		public OperadorlogicoContext operadorlogico() {
			return getRuleContext(OperadorlogicoContext.class,0);
		}
		public SegcomfinalContext segcomfinal() {
			return getRuleContext(SegcomfinalContext.class,0);
		}
		public SegundocomparadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segundocomparador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterSegundocomparador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitSegundocomparador(this);
		}
	}

	public final SegundocomparadorContext segundocomparador() throws RecognitionException {
		SegundocomparadorContext _localctx = new SegundocomparadorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_segundocomparador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			operadorlogico();
			setState(442);
			segcomfinal();
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

	public static class SegcomfinalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public CredecContext credec() {
			return getRuleContext(CredecContext.class,0);
		}
		public VarcomparableContext varcomparable() {
			return getRuleContext(VarcomparableContext.class,0);
		}
		public SegcomfinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segcomfinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterSegcomfinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitSegcomfinal(this);
		}
	}

	public final SegcomfinalContext segcomfinal() throws RecognitionException {
		SegcomfinalContext _localctx = new SegcomfinalContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_segcomfinal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(ID);
			setState(445);
			credec();
			setState(446);
			varcomparable();
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

	public static class VarcomparableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public TerminalNode TK_ENTERO() { return getToken(PsiCoderParser.TK_ENTERO, 0); }
		public VarcomparableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varcomparable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterVarcomparable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitVarcomparable(this);
		}
	}

	public final VarcomparableContext varcomparable() throws RecognitionException {
		VarcomparableContext _localctx = new VarcomparableContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_varcomparable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TK_ENTERO) ) {
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

	public static class CredecContext extends ParserRuleContext {
		public TerminalNode TK_MENOR() { return getToken(PsiCoderParser.TK_MENOR, 0); }
		public TerminalNode TK_MAYOR() { return getToken(PsiCoderParser.TK_MAYOR, 0); }
		public TerminalNode TK_MENOR_IGUAL() { return getToken(PsiCoderParser.TK_MENOR_IGUAL, 0); }
		public TerminalNode TK_MAYOR_IGUAL() { return getToken(PsiCoderParser.TK_MAYOR_IGUAL, 0); }
		public CredecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_credec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCredec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCredec(this);
		}
	}

	public final CredecContext credec() throws RecognitionException {
		CredecContext _localctx = new CredecContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_credec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MAYOR) | (1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL))) != 0)) ) {
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

	public static class MultipleContext extends ParserRuleContext {
		public TerminalNode SELECCIONAR() { return getToken(PsiCoderParser.SELECCIONAR, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsiCoderParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(PsiCoderParser.TK_PAR_DER, 0); }
		public TerminalNode ENTRE() { return getToken(PsiCoderParser.ENTRE, 0); }
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode FIN_SELECCIONAR() { return getToken(PsiCoderParser.FIN_SELECCIONAR, 0); }
		public MultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitMultiple(this);
		}
	}

	public final MultipleContext multiple() throws RecognitionException {
		MultipleContext _localctx = new MultipleContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_multiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(SELECCIONAR);
			setState(453);
			match(TK_PAR_IZQ);
			setState(454);
			match(ID);
			setState(455);
			match(TK_PAR_DER);
			setState(456);
			match(ENTRE);
			setState(457);
			casos();
			setState(458);
			match(FIN_SELECCIONAR);
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

	public static class CasosContext extends ParserRuleContext {
		public List<TerminalNode> CASO() { return getTokens(PsiCoderParser.CASO); }
		public TerminalNode CASO(int i) {
			return getToken(PsiCoderParser.CASO, i);
		}
		public List<TerminalNode> TK_ENTERO() { return getTokens(PsiCoderParser.TK_ENTERO); }
		public TerminalNode TK_ENTERO(int i) {
			return getToken(PsiCoderParser.TK_ENTERO, i);
		}
		public List<TerminalNode> TK_DOSP() { return getTokens(PsiCoderParser.TK_DOSP); }
		public TerminalNode TK_DOSP(int i) {
			return getToken(PsiCoderParser.TK_DOSP, i);
		}
		public TerminalNode DEFECTO() { return getToken(PsiCoderParser.DEFECTO, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public List<TerminalNode> ROMPER() { return getTokens(PsiCoderParser.ROMPER); }
		public TerminalNode ROMPER(int i) {
			return getToken(PsiCoderParser.ROMPER, i);
		}
		public List<TerminalNode> TK_PYC() { return getTokens(PsiCoderParser.TK_PYC); }
		public TerminalNode TK_PYC(int i) {
			return getToken(PsiCoderParser.TK_PYC, i);
		}
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCasos(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_casos);
		int _la;
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(460);
					match(CASO);
					setState(461);
					match(TK_ENTERO);
					setState(462);
					match(TK_DOSP);
					setState(464); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(463);
						contenido();
						}
						}
						setState(466); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ROMPER) {
						{
						setState(468);
						match(ROMPER);
						setState(469);
						match(TK_PYC);
						}
					}

					}
					}
					setState(474); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASO );
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFECTO) {
					{
					setState(476);
					match(DEFECTO);
					setState(477);
					match(TK_DOSP);
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0)) {
						{
						{
						setState(478);
						contenido();
						}
						}
						setState(483);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case DEFECTO:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(486);
				match(DEFECTO);
				setState(487);
				match(TK_DOSP);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0)) {
					{
					{
					setState(488);
					contenido();
					}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class EstructurasContext extends ParserRuleContext {
		public TerminalNode ESTRUCTURA() { return getToken(PsiCoderParser.ESTRUCTURA, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public TerminalNode FIN_ESTRUCTURA() { return getToken(PsiCoderParser.FIN_ESTRUCTURA, 0); }
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public EstructurasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterEstructuras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitEstructuras(this);
		}
	}

	public final EstructurasContext estructuras() throws RecognitionException {
		EstructurasContext _localctx = new EstructurasContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_estructuras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(ESTRUCTURA);
			setState(497);
			match(ID);
			setState(499); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(498);
				declaracion();
				}
				}
				setState(501); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(503);
			match(FIN_ESTRUCTURA);
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

	public static class DecfuncionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(PsiCoderParser.FUNCION, 0); }
		public TipofuncionContext tipofuncion() {
			return getRuleContext(TipofuncionContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsiCoderParser.TK_PAR_IZQ, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsiCoderParser.TK_PAR_DER, 0); }
		public TerminalNode HACER() { return getToken(PsiCoderParser.HACER, 0); }
		public TerminalNode RETORNAR() { return getToken(PsiCoderParser.RETORNAR, 0); }
		public VarimpresionContext varimpresion() {
			return getRuleContext(VarimpresionContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public TerminalNode FIN_FUNCION() { return getToken(PsiCoderParser.FIN_FUNCION, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public DecfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterDecfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitDecfuncion(this);
		}
	}

	public final DecfuncionContext decfuncion() throws RecognitionException {
		DecfuncionContext _localctx = new DecfuncionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_decfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(FUNCION);
			setState(506);
			tipofuncion();
			setState(507);
			match(ID);
			setState(508);
			match(TK_PAR_IZQ);
			setState(509);
			parametros();
			setState(510);
			match(TK_PAR_DER);
			setState(511);
			match(HACER);
			setState(513); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(512);
				contenido();
				}
				}
				setState(515); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(517);
			match(RETORNAR);
			setState(518);
			varimpresion();
			setState(519);
			match(TK_PYC);
			setState(520);
			match(FIN_FUNCION);
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<TipofuncionContext> tipofuncion() {
			return getRuleContexts(TipofuncionContext.class);
		}
		public TipofuncionContext tipofuncion(int i) {
			return getRuleContext(TipofuncionContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PsiCoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsiCoderParser.ID, i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(PsiCoderParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(PsiCoderParser.TK_COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA))) != 0)) {
				{
				setState(522);
				tipofuncion();
				setState(523);
				match(ID);
				}
			}

			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(527);
				match(TK_COMA);
				setState(528);
				tipofuncion();
				setState(529);
				match(ID);
				}
				}
				setState(535);
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

	public static class TipofuncionContext extends ParserRuleContext {
		public TerminalNode BOOLEANO() { return getToken(PsiCoderParser.BOOLEANO, 0); }
		public TerminalNode ENTERO() { return getToken(PsiCoderParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(PsiCoderParser.REAL, 0); }
		public TerminalNode CARACTER() { return getToken(PsiCoderParser.CARACTER, 0); }
		public TerminalNode CADENA() { return getToken(PsiCoderParser.CADENA, 0); }
		public TipofuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipofuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterTipofuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitTipofuncion(this);
		}
	}

	public final TipofuncionContext tipofuncion() throws RecognitionException {
		TipofuncionContext _localctx = new TipofuncionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_tipofuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u021d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\7\2s\n\2\f\2\16\2v\13"+
		"\2\3\2\3\2\3\2\7\2{\n\2\f\2\16\2~\13\2\3\2\3\2\3\3\3\3\6\3\u0084\n\3\r"+
		"\3\16\3\u0085\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0093\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009d\n\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u00aa\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u00b3"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ba\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\5\13\u00c3\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ca\n\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d7\n\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e4\n\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\5\21\u00ee\n\21\3\22\3\22\3\22\3\22\3\22\7\22\u00f5\n"+
		"\22\f\22\16\22\u00f8\13\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\7\24\u0107\n\24\f\24\16\24\u010a\13\24\5\24\u010c"+
		"\n\24\3\24\3\24\5\24\u0110\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26"+
		"\u0119\n\26\f\26\16\26\u011c\13\26\3\27\3\27\3\27\3\27\3\27\5\27\u0123"+
		"\n\27\3\30\3\30\3\31\5\31\u0128\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u013a\n\34\f\34\16"+
		"\34\u013d\13\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u014a\n\36\3\37\3\37\3\37\3\37\3 \3 \6 \u0152\n \r \16 \u0153\3"+
		" \3 \3!\3!\6!\u015a\n!\r!\16!\u015b\5!\u015e\n!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u016b\n\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\6%"+
		"\u0177\n%\r%\16%\u0178\3%\3%\3&\3&\6&\u017f\n&\r&\16&\u0180\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3(\3(\6(\u018d\n(\r(\16(\u018e\3(\3(\5(\u0193\n(\3)"+
		"\3)\3)\3)\3*\3*\6*\u019b\n*\r*\16*\u019c\3*\3*\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\5.\u01ba\n.\3/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\6\64\u01d3\n\64\r\64\16\64\u01d4\3"+
		"\64\3\64\5\64\u01d9\n\64\6\64\u01db\n\64\r\64\16\64\u01dc\3\64\3\64\3"+
		"\64\7\64\u01e2\n\64\f\64\16\64\u01e5\13\64\5\64\u01e7\n\64\3\64\3\64\3"+
		"\64\7\64\u01ec\n\64\f\64\16\64\u01ef\13\64\5\64\u01f1\n\64\3\65\3\65\3"+
		"\65\6\65\u01f6\n\65\r\65\16\65\u01f7\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\6\66\u0204\n\66\r\66\16\66\u0205\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\5\67\u0210\n\67\3\67\3\67\3\67\3\67\7\67\u0216\n\67"+
		"\f\67\16\67\u0219\13\67\38\38\38\2\29\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\t\3\2%)\3\2"+
		"\65\67\3\2,-\3\2.\63\3\2\65\66\3\2.\61\3\2\33\37\2\u022a\2t\3\2\2\2\4"+
		"\u0081\3\2\2\2\6\u0092\3\2\2\2\b\u009c\3\2\2\2\n\u009e\3\2\2\2\f\u00a9"+
		"\3\2\2\2\16\u00ab\3\2\2\2\20\u00b9\3\2\2\2\22\u00bb\3\2\2\2\24\u00c9\3"+
		"\2\2\2\26\u00cb\3\2\2\2\30\u00d6\3\2\2\2\32\u00d8\3\2\2\2\34\u00e3\3\2"+
		"\2\2\36\u00e5\3\2\2\2 \u00ed\3\2\2\2\"\u00ef\3\2\2\2$\u00fd\3\2\2\2&\u0102"+
		"\3\2\2\2(\u0111\3\2\2\2*\u0114\3\2\2\2,\u0122\3\2\2\2.\u0124\3\2\2\2\60"+
		"\u0127\3\2\2\2\62\u012b\3\2\2\2\64\u0131\3\2\2\2\66\u0137\3\2\2\28\u013e"+
		"\3\2\2\2:\u0149\3\2\2\2<\u014b\3\2\2\2>\u014f\3\2\2\2@\u015d\3\2\2\2B"+
		"\u0161\3\2\2\2D\u016e\3\2\2\2F\u0170\3\2\2\2H\u0172\3\2\2\2J\u017c\3\2"+
		"\2\2L\u0186\3\2\2\2N\u018a\3\2\2\2P\u0194\3\2\2\2R\u0198\3\2\2\2T\u01a0"+
		"\3\2\2\2V\u01a9\3\2\2\2X\u01ad\3\2\2\2Z\u01b5\3\2\2\2\\\u01bb\3\2\2\2"+
		"^\u01be\3\2\2\2`\u01c2\3\2\2\2b\u01c4\3\2\2\2d\u01c6\3\2\2\2f\u01f0\3"+
		"\2\2\2h\u01f2\3\2\2\2j\u01fb\3\2\2\2l\u020f\3\2\2\2n\u021a\3\2\2\2ps\5"+
		"h\65\2qs\5j\66\2rp\3\2\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3"+
		"\2\2\2vt\3\2\2\2w|\5\4\3\2x{\5h\65\2y{\5j\66\2zx\3\2\2\2zy\3\2\2\2{~\3"+
		"\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\2\2\3\u0080"+
		"\3\3\2\2\2\u0081\u0083\7\3\2\2\u0082\u0084\5\6\4\2\u0083\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\7\4\2\2\u0088\5\3\2\2\2\u0089\u0093\5\b\5\2\u008a"+
		"\u0093\5\62\32\2\u008b\u0093\5\64\33\2\u008c\u0093\5<\37\2\u008d\u0093"+
		"\5H%\2\u008e\u0093\5J&\2\u008f\u0093\5L\'\2\u0090\u0093\5d\63\2\u0091"+
		"\u0093\5&\24\2\u0092\u0089\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008b\3\2"+
		"\2\2\u0092\u008c\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0092"+
		"\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\7\3\2\2\2"+
		"\u0094\u009d\5\n\6\2\u0095\u009d\5\16\b\2\u0096\u009d\5\22\n\2\u0097\u009d"+
		"\5\26\f\2\u0098\u009d\5\32\16\2\u0099\u009d\5\36\20\2\u009a\u009d\5\""+
		"\22\2\u009b\u009d\5$\23\2\u009c\u0094\3\2\2\2\u009c\u0095\3\2\2\2\u009c"+
		"\u0096\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\t\3\2\2\2\u009e\u009f"+
		"\7\33\2\2\u009f\u00a0\7\65\2\2\u00a0\u00a1\5\f\7\2\u00a1\13\3\2\2\2\u00a2"+
		"\u00aa\7 \2\2\u00a3\u00a4\7\"\2\2\u00a4\u00a5\7\64\2\2\u00a5\u00aa\5\f"+
		"\7\2\u00a6\u00a7\7#\2\2\u00a7\u00a8\7\65\2\2\u00a8\u00aa\5\f\7\2\u00a9"+
		"\u00a2\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\r\3\2\2\2"+
		"\u00ab\u00ac\7\34\2\2\u00ac\u00ad\7\65\2\2\u00ad\u00ae\5\20\t\2\u00ae"+
		"\17\3\2\2\2\u00af\u00ba\7 \2\2\u00b0\u00b2\7\"\2\2\u00b1\u00b3\7&\2\2"+
		"\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\7\66\2\2\u00b5\u00ba\5\20\t\2\u00b6\u00b7\7#\2\2\u00b7\u00b8\7\65\2\2"+
		"\u00b8\u00ba\5\20\t\2\u00b9\u00af\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b6"+
		"\3\2\2\2\u00ba\21\3\2\2\2\u00bb\u00bc\7\35\2\2\u00bc\u00bd\7\65\2\2\u00bd"+
		"\u00be\5\24\13\2\u00be\23\3\2\2\2\u00bf\u00ca\7 \2\2\u00c0\u00c2\7\"\2"+
		"\2\u00c1\u00c3\7&\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c5\7\67\2\2\u00c5\u00ca\5\24\13\2\u00c6\u00c7\7#\2\2"+
		"\u00c7\u00c8\7\65\2\2\u00c8\u00ca\5\24\13\2\u00c9\u00bf\3\2\2\2\u00c9"+
		"\u00c0\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\25\3\2\2\2\u00cb\u00cc\7\36\2"+
		"\2\u00cc\u00cd\7\65\2\2\u00cd\u00ce\5\30\r\2\u00ce\27\3\2\2\2\u00cf\u00d7"+
		"\7 \2\2\u00d0\u00d1\7\"\2\2\u00d1\u00d2\79\2\2\u00d2\u00d7\5\30\r\2\u00d3"+
		"\u00d4\7#\2\2\u00d4\u00d5\7\65\2\2\u00d5\u00d7\5\30\r\2\u00d6\u00cf\3"+
		"\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\31\3\2\2\2\u00d8"+
		"\u00d9\7\37\2\2\u00d9\u00da\7\65\2\2\u00da\u00db\5\34\17\2\u00db\33\3"+
		"\2\2\2\u00dc\u00e4\7 \2\2\u00dd\u00de\7\"\2\2\u00de\u00df\78\2\2\u00df"+
		"\u00e4\5\34\17\2\u00e0\u00e1\7#\2\2\u00e1\u00e2\7\65\2\2\u00e2\u00e4\5"+
		"\34\17\2\u00e3\u00dc\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4"+
		"\35\3\2\2\2\u00e5\u00e6\7\65\2\2\u00e6\u00e7\7\65\2\2\u00e7\u00e8\5 \21"+
		"\2\u00e8\37\3\2\2\2\u00e9\u00ee\7 \2\2\u00ea\u00eb\7#\2\2\u00eb\u00ec"+
		"\7\65\2\2\u00ec\u00ee\5 \21\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2"+
		"\u00ee!\3\2\2\2\u00ef\u00f0\7\65\2\2\u00f0\u00f1\7$\2\2\u00f1\u00f6\7"+
		"\65\2\2\u00f2\u00f3\7$\2\2\u00f3\u00f5\7\65\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb\5:\36\2\u00fb"+
		"\u00fc\7 \2\2\u00fc#\3\2\2\2\u00fd\u00fe\7\65\2\2\u00fe\u00ff\7\"\2\2"+
		"\u00ff\u0100\5:\36\2\u0100\u0101\7 \2\2\u0101%\3\2\2\2\u0102\u0103\7\65"+
		"\2\2\u0103\u010b\7*\2\2\u0104\u0108\5:\36\2\u0105\u0107\5(\25\2\u0106"+
		"\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u0104\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\7+\2\2\u010e\u0110\7 \2"+
		"\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\'\3\2\2\2\u0111\u0112"+
		"\7#\2\2\u0112\u0113\5:\36\2\u0113)\3\2\2\2\u0114\u011a\5,\27\2\u0115\u0116"+
		"\5.\30\2\u0116\u0117\5,\27\2\u0117\u0119\3\2\2\2\u0118\u0115\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b+\3\2\2\2"+
		"\u011c\u011a\3\2\2\2\u011d\u0123\5\60\31\2\u011e\u011f\7*\2\2\u011f\u0120"+
		"\5*\26\2\u0120\u0121\7+\2\2\u0121\u0123\3\2\2\2\u0122\u011d\3\2\2\2\u0122"+
		"\u011e\3\2\2\2\u0123-\3\2\2\2\u0124\u0125\t\2\2\2\u0125/\3\2\2\2\u0126"+
		"\u0128\7&\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012a\t\3\2\2\u012a\61\3\2\2\2\u012b\u012c\7\5\2\2\u012c\u012d"+
		"\7*\2\2\u012d\u012e\7\65\2\2\u012e\u012f\7+\2\2\u012f\u0130\7 \2\2\u0130"+
		"\63\3\2\2\2\u0131\u0132\7\6\2\2\u0132\u0133\7*\2\2\u0133\u0134\5\66\34"+
		"\2\u0134\u0135\7+\2\2\u0135\u0136\7 \2\2\u0136\65\3\2\2\2\u0137\u013b"+
		"\5:\36\2\u0138\u013a\58\35\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\67\3\2\2\2\u013d\u013b\3\2\2"+
		"\2\u013e\u013f\7#\2\2\u013f\u0140\5:\36\2\u01409\3\2\2\2\u0141\u014a\7"+
		"\64\2\2\u0142\u014a\7\66\2\2\u0143\u014a\7\67\2\2\u0144\u014a\79\2\2\u0145"+
		"\u014a\78\2\2\u0146\u014a\5*\26\2\u0147\u014a\7\65\2\2\u0148\u014a\5&"+
		"\24\2\u0149\u0141\3\2\2\2\u0149\u0142\3\2\2\2\u0149\u0143\3\2\2\2\u0149"+
		"\u0144\3\2\2\2\u0149\u0145\3\2\2\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u0148\3\2\2\2\u014a;\3\2\2\2\u014b\u014c\7\7\2\2\u014c\u014d"+
		"\5B\"\2\u014d\u014e\5> \2\u014e=\3\2\2\2\u014f\u0151\7\b\2\2\u0150\u0152"+
		"\5\6\4\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\5@!\2\u0156?\3\2\2\2\u0157"+
		"\u0159\7\n\2\2\u0158\u015a\5\6\4\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u0157\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7\t"+
		"\2\2\u0160A\3\2\2\2\u0161\u0162\7*\2\2\u0162\u0163\5:\36\2\u0163\u0164"+
		"\5F$\2\u0164\u016a\5:\36\2\u0165\u0166\5D#\2\u0166\u0167\5:\36\2\u0167"+
		"\u0168\5F$\2\u0168\u0169\5:\36\2\u0169\u016b\3\2\2\2\u016a\u0165\3\2\2"+
		"\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7+\2\2\u016dC\3"+
		"\2\2\2\u016e\u016f\t\4\2\2\u016fE\3\2\2\2\u0170\u0171\t\5\2\2\u0171G\3"+
		"\2\2\2\u0172\u0173\7\13\2\2\u0173\u0174\5B\"\2\u0174\u0176\7\f\2\2\u0175"+
		"\u0177\5\6\4\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\7\r\2\2\u017b"+
		"I\3\2\2\2\u017c\u017e\7\f\2\2\u017d\u017f\5\6\4\2\u017e\u017d\3\2\2\2"+
		"\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0183\7\13\2\2\u0183\u0184\5B\"\2\u0184\u0185\7 \2\2\u0185"+
		"K\3\2\2\2\u0186\u0187\7\16\2\2\u0187\u0188\5T+\2\u0188\u0189\5N(\2\u0189"+
		"M\3\2\2\2\u018a\u018c\7\f\2\2\u018b\u018d\5\6\4\2\u018c\u018b\3\2\2\2"+
		"\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0192\7\17\2\2\u0191\u0193\5P)\2\u0192\u0191\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193O\3\2\2\2\u0194\u0195\7\16\2\2\u0195\u0196\5X-\2\u0196"+
		"\u0197\5R*\2\u0197Q\3\2\2\2\u0198\u019a\7\f\2\2\u0199\u019b\5\6\4\2\u019a"+
		"\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u019f\7\17\2\2\u019fS\3\2\2\2\u01a0\u01a1"+
		"\7*\2\2\u01a1\u01a2\7\34\2\2\u01a2\u01a3\7\65\2\2\u01a3\u01a4\7\"\2\2"+
		"\u01a4\u01a5\7\66\2\2\u01a5\u01a6\7 \2\2\u01a6\u01a7\5Z.\2\u01a7\u01a8"+
		"\5V,\2\u01a8U\3\2\2\2\u01a9\u01aa\7 \2\2\u01aa\u01ab\5`\61\2\u01ab\u01ac"+
		"\7+\2\2\u01acW\3\2\2\2\u01ad\u01ae\7*\2\2\u01ae\u01af\7\65\2\2\u01af\u01b0"+
		"\7\"\2\2\u01b0\u01b1\7\66\2\2\u01b1\u01b2\7 \2\2\u01b2\u01b3\5Z.\2\u01b3"+
		"\u01b4\5V,\2\u01b4Y\3\2\2\2\u01b5\u01b6\7\65\2\2\u01b6\u01b7\5b\62\2\u01b7"+
		"\u01b9\5`\61\2\u01b8\u01ba\5\\/\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba[\3\2\2\2\u01bb\u01bc\5D#\2\u01bc\u01bd\5^\60\2\u01bd]\3\2\2"+
		"\2\u01be\u01bf\7\65\2\2\u01bf\u01c0\5b\62\2\u01c0\u01c1\5`\61\2\u01c1"+
		"_\3\2\2\2\u01c2\u01c3\t\6\2\2\u01c3a\3\2\2\2\u01c4\u01c5\t\7\2\2\u01c5"+
		"c\3\2\2\2\u01c6\u01c7\7\20\2\2\u01c7\u01c8\7*\2\2\u01c8\u01c9\7\65\2\2"+
		"\u01c9\u01ca\7+\2\2\u01ca\u01cb\7\21\2\2\u01cb\u01cc\5f\64\2\u01cc\u01cd"+
		"\7\25\2\2\u01cde\3\2\2\2\u01ce\u01cf\7\22\2\2\u01cf\u01d0\7\66\2\2\u01d0"+
		"\u01d2\7!\2\2\u01d1\u01d3\5\6\4\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6"+
		"\u01d7\7\23\2\2\u01d7\u01d9\7 \2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01db\3\2\2\2\u01da\u01ce\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e6\3\2\2\2\u01de\u01df\7\24"+
		"\2\2\u01df\u01e3\7!\2\2\u01e0\u01e2\5\6\4\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e7\3\2"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01de\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01f1\3\2\2\2\u01e8\u01e9\7\24\2\2\u01e9\u01ed\7!\2\2\u01ea\u01ec\5\6"+
		"\4\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01da\3\2"+
		"\2\2\u01f0\u01e8\3\2\2\2\u01f1g\3\2\2\2\u01f2\u01f3\7\26\2\2\u01f3\u01f5"+
		"\7\65\2\2\u01f4\u01f6\5\b\5\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2"+
		"\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa"+
		"\7\27\2\2\u01fai\3\2\2\2\u01fb\u01fc\7\30\2\2\u01fc\u01fd\5n8\2\u01fd"+
		"\u01fe\7\65\2\2\u01fe\u01ff\7*\2\2\u01ff\u0200\5l\67\2\u0200\u0201\7+"+
		"\2\2\u0201\u0203\7\f\2\2\u0202\u0204\5\6\4\2\u0203\u0202\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u0208\7\31\2\2\u0208\u0209\5:\36\2\u0209\u020a\7 \2\2\u020a"+
		"\u020b\7\32\2\2\u020bk\3\2\2\2\u020c\u020d\5n8\2\u020d\u020e\7\65\2\2"+
		"\u020e\u0210\3\2\2\2\u020f\u020c\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0217"+
		"\3\2\2\2\u0211\u0212\7#\2\2\u0212\u0213\5n8\2\u0213\u0214\7\65\2\2\u0214"+
		"\u0216\3\2\2\2\u0215\u0211\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218m\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021b"+
		"\t\b\2\2\u021bo\3\2\2\2/rtz|\u0085\u0092\u009c\u00a9\u00b2\u00b9\u00c2"+
		"\u00c9\u00d6\u00e3\u00ed\u00f6\u0108\u010b\u010f\u011a\u0122\u0127\u013b"+
		"\u0149\u0153\u015b\u015d\u016a\u0178\u0180\u018e\u0192\u019c\u01b9\u01d4"+
		"\u01d8\u01dc\u01e3\u01e6\u01ed\u01f0\u01f7\u0205\u020f\u0217";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}