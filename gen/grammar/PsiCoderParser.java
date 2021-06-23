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
		RULE_comparador = 34, RULE_ciclomientras = 35, RULE_cuerpociclomientras = 36, 
		RULE_ciclohacer = 37, RULE_ciclopara = 38, RULE_contenidopara = 39, RULE_contparaopt = 40, 
		RULE_contparaoptfinal = 41, RULE_elementospara = 42, RULE_complementopara = 43, 
		RULE_elementosparados = 44, RULE_comparadorpara = 45, RULE_segundocomparador = 46, 
		RULE_segcomfinal = 47, RULE_varcomparable = 48, RULE_credec = 49, RULE_multiple = 50, 
		RULE_casos = 51, RULE_estructuras = 52, RULE_decfuncion = 53, RULE_parametros = 54, 
		RULE_tipofuncion = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz", "f_principal", "contenido", "declaracion", "varBooleano", "extvarB", 
			"varEntero", "extvarE", "varReal", "extvarR", "varCaracter", "extvarC", 
			"varCadena", "extvarS", "varEstructura", "extvarEstructura", "varAsigEstructura", 
			"varDeclarada", "asigfuncion", "repeticion", "operacion", "expresion", 
			"operador", "tipovar", "lectura", "imprimir", "impresion", "repeticionimpresion", 
			"varimpresion", "condicional", "cuerpoif", "sino", "operacionlogica", 
			"operadorlogico", "comparador", "ciclomientras", "cuerpociclomientras", 
			"ciclohacer", "ciclopara", "contenidopara", "contparaopt", "contparaoptfinal", 
			"elementospara", "complementopara", "elementosparados", "comparadorpara", 
			"segundocomparador", "segcomfinal", "varcomparable", "credec", "multiple", 
			"casos", "estructuras", "decfuncion", "parametros", "tipofuncion"
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
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTRUCTURA || _la==FUNCION) {
				{
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESTRUCTURA:
					{
					setState(112);
					estructuras();
					}
					break;
				case FUNCION:
					{
					setState(113);
					decfuncion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(119);
			f_principal();
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTRUCTURA || _la==FUNCION) {
				{
				setState(122);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESTRUCTURA:
					{
					setState(120);
					estructuras();
					}
					break;
				case FUNCION:
					{
					setState(121);
					decfuncion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
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
			setState(129);
			match(FP);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				contenido();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(135);
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				lectura();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				imprimir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				condicional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				ciclomientras();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				ciclohacer();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				ciclopara();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				multiple();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				varBooleano();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				varEntero();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				varReal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				varCaracter();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				varCadena();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				varEstructura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(154);
				varAsigEstructura();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(155);
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
			setState(158);
			match(BOOLEANO);
			setState(159);
			match(ID);
			setState(160);
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
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(TK_ASIG);
				setState(164);
				match(TK_BOOLEANO);
				setState(165);
				extvarB();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(TK_COMA);
				setState(167);
				match(ID);
				setState(168);
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
			setState(171);
			match(ENTERO);
			setState(172);
			match(ID);
			setState(173);
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
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(TK_ASIG);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_MENOS) {
					{
					setState(177);
					match(TK_MENOS);
					}
				}

				setState(180);
				match(TK_ENTERO);
				setState(181);
				extvarE();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(TK_COMA);
				setState(183);
				match(ID);
				setState(184);
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
			setState(187);
			match(REAL);
			setState(188);
			match(ID);
			setState(189);
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
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(TK_ASIG);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_MENOS) {
					{
					setState(193);
					match(TK_MENOS);
					}
				}

				setState(196);
				match(TK_REAL);
				setState(197);
				extvarR();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(TK_COMA);
				setState(199);
				match(ID);
				setState(200);
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
			setState(203);
			match(CARACTER);
			setState(204);
			match(ID);
			setState(205);
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
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(TK_ASIG);
				setState(209);
				match(TK_CARACTER);
				setState(210);
				extvarC();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(TK_COMA);
				setState(212);
				match(ID);
				setState(213);
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
			setState(216);
			match(CADENA);
			setState(217);
			match(ID);
			setState(218);
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
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(TK_ASIG);
				setState(222);
				match(TK_CADENA);
				setState(223);
				extvarS();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(TK_COMA);
				setState(225);
				match(ID);
				setState(226);
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
			setState(229);
			match(ID);
			setState(230);
			match(ID);
			setState(231);
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
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(TK_PYC);
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(TK_COMA);
				setState(235);
				match(ID);
				setState(236);
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
			setState(239);
			match(ID);
			setState(240);
			match(TK_PUNTO);
			setState(241);
			match(ID);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PUNTO) {
				{
				{
				setState(242);
				match(TK_PUNTO);
				setState(243);
				match(ID);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(TK_ASIG);
			setState(250);
			varimpresion();
			setState(251);
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
			setState(253);
			match(ID);
			setState(254);
			match(TK_ASIG);
			setState(255);
			varimpresion();
			setState(256);
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
			setState(258);
			match(ID);
			setState(259);
			match(TK_PAR_IZQ);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOS) | (1L << TK_PAR_IZQ) | (1L << TK_BOOLEANO) | (1L << ID) | (1L << TK_ENTERO) | (1L << TK_REAL) | (1L << TK_CADENA) | (1L << TK_CARACTER))) != 0)) {
				{
				setState(260);
				varimpresion();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(261);
					repeticion();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(269);
			match(TK_PAR_DER);
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(270);
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
			setState(273);
			match(TK_COMA);
			setState(274);
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
			setState(276);
			expresion();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MAS) | (1L << TK_MENOS) | (1L << TK_MULT) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) {
				{
				{
				setState(277);
				operador();
				setState(278);
				expresion();
				}
				}
				setState(284);
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
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_MENOS:
			case ID:
			case TK_ENTERO:
			case TK_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				tipovar();
				}
				break;
			case TK_PAR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(TK_PAR_IZQ);
				setState(287);
				operacion();
				setState(288);
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
			setState(292);
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
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_MENOS) {
				{
				setState(294);
				match(TK_MENOS);
				}
			}

			setState(297);
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
			setState(299);
			match(LEER);
			setState(300);
			match(TK_PAR_IZQ);
			setState(301);
			match(ID);
			setState(302);
			match(TK_PAR_DER);
			setState(303);
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
			setState(305);
			match(IMPRIMIR);
			setState(306);
			match(TK_PAR_IZQ);
			setState(307);
			impresion();
			setState(308);
			match(TK_PAR_DER);
			setState(309);
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
			setState(311);
			varimpresion();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(312);
				repeticionimpresion();
				}
				}
				setState(317);
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
			setState(318);
			match(TK_COMA);
			setState(319);
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
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(TK_BOOLEANO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(TK_ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(TK_REAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				match(TK_CARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				match(TK_CADENA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(326);
				operacion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(327);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(328);
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
			setState(331);
			match(SI);
			setState(332);
			operacionlogica();
			setState(333);
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
			setState(335);
			match(ENTONCES);
			setState(337); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(336);
				contenido();
				}
				}
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(341);
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
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SI_NO) {
				{
				setState(343);
				match(SI_NO);
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(344);
					contenido();
					}
					}
					setState(347); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
				}
			}

			setState(351);
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
			setState(353);
			match(TK_PAR_IZQ);
			setState(354);
			varimpresion();
			setState(355);
			comparador();
			setState(356);
			varimpresion();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_Y || _la==TK_O) {
				{
				setState(357);
				operadorlogico();
				setState(358);
				varimpresion();
				setState(359);
				comparador();
				setState(360);
				varimpresion();
				}
			}

			setState(364);
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
			setState(366);
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
			setState(368);
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
		public CuerpociclomientrasContext cuerpociclomientras() {
			return getRuleContext(CuerpociclomientrasContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(MIENTRAS);
			setState(371);
			operacionlogica();
			setState(372);
			cuerpociclomientras();
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

	public static class CuerpociclomientrasContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(PsiCoderParser.HACER, 0); }
		public TerminalNode FIN_MIENTRAS() { return getToken(PsiCoderParser.FIN_MIENTRAS, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public CuerpociclomientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpociclomientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCuerpociclomientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCuerpociclomientras(this);
		}
	}

	public final CuerpociclomientrasContext cuerpociclomientras() throws RecognitionException {
		CuerpociclomientrasContext _localctx = new CuerpociclomientrasContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cuerpociclomientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(HACER);
			setState(376); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(375);
				contenido();
				}
				}
				setState(378); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(380);
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
		enterRule(_localctx, 74, RULE_ciclohacer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(HACER);
			setState(384); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(383);
					contenido();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(386); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(388);
			match(MIENTRAS);
			setState(389);
			operacionlogica();
			setState(390);
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
		enterRule(_localctx, 76, RULE_ciclopara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(PARA);
			setState(393);
			elementospara();
			setState(394);
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
		enterRule(_localctx, 78, RULE_contenidopara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(HACER);
			setState(398); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(397);
				contenido();
				}
				}
				setState(400); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(402);
			match(FIN_PARA);
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(403);
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
		enterRule(_localctx, 80, RULE_contparaopt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(PARA);
			setState(407);
			elementosparados();
			setState(408);
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
		enterRule(_localctx, 82, RULE_contparaoptfinal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(HACER);
			setState(412); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(411);
				contenido();
				}
				}
				setState(414); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(416);
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
		enterRule(_localctx, 84, RULE_elementospara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(TK_PAR_IZQ);
			setState(419);
			match(ENTERO);
			setState(420);
			match(ID);
			setState(421);
			match(TK_ASIG);
			setState(422);
			match(TK_ENTERO);
			setState(423);
			match(TK_PYC);
			setState(424);
			comparadorpara();
			setState(425);
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
		enterRule(_localctx, 86, RULE_complementopara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(TK_PYC);
			setState(428);
			varcomparable();
			setState(429);
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
		enterRule(_localctx, 88, RULE_elementosparados);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(TK_PAR_IZQ);
			setState(432);
			match(ID);
			setState(433);
			match(TK_ASIG);
			setState(434);
			match(TK_ENTERO);
			setState(435);
			match(TK_PYC);
			setState(436);
			comparadorpara();
			setState(437);
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
		enterRule(_localctx, 90, RULE_comparadorpara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(ID);
			setState(440);
			credec();
			setState(441);
			varcomparable();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_Y || _la==TK_O) {
				{
				setState(442);
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
		enterRule(_localctx, 92, RULE_segundocomparador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			operadorlogico();
			setState(446);
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
		enterRule(_localctx, 94, RULE_segcomfinal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(ID);
			setState(449);
			credec();
			setState(450);
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
		enterRule(_localctx, 96, RULE_varcomparable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
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
		enterRule(_localctx, 98, RULE_credec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
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
		enterRule(_localctx, 100, RULE_multiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(SELECCIONAR);
			setState(457);
			match(TK_PAR_IZQ);
			setState(458);
			match(ID);
			setState(459);
			match(TK_PAR_DER);
			setState(460);
			match(ENTRE);
			setState(461);
			casos();
			setState(462);
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
		enterRule(_localctx, 102, RULE_casos);
		int _la;
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(464);
					match(CASO);
					setState(465);
					match(TK_ENTERO);
					setState(466);
					match(TK_DOSP);
					setState(468); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(467);
						contenido();
						}
						}
						setState(470); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ROMPER) {
						{
						setState(472);
						match(ROMPER);
						setState(473);
						match(TK_PYC);
						}
					}

					}
					}
					setState(478); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASO );
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFECTO) {
					{
					setState(480);
					match(DEFECTO);
					setState(481);
					match(TK_DOSP);
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0)) {
						{
						{
						setState(482);
						contenido();
						}
						}
						setState(487);
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
				setState(490);
				match(DEFECTO);
				setState(491);
				match(TK_DOSP);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0)) {
					{
					{
					setState(492);
					contenido();
					}
					}
					setState(497);
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
		enterRule(_localctx, 104, RULE_estructuras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(ESTRUCTURA);
			setState(501);
			match(ID);
			setState(503); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(502);
				declaracion();
				}
				}
				setState(505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(507);
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
		enterRule(_localctx, 106, RULE_decfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(FUNCION);
			setState(510);
			tipofuncion();
			setState(511);
			match(ID);
			setState(512);
			match(TK_PAR_IZQ);
			setState(513);
			parametros();
			setState(514);
			match(TK_PAR_DER);
			setState(515);
			match(HACER);
			setState(517); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(516);
				contenido();
				}
				}
				setState(519); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(521);
			match(RETORNAR);
			setState(522);
			varimpresion();
			setState(523);
			match(TK_PYC);
			setState(524);
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
		enterRule(_localctx, 108, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA))) != 0)) {
				{
				setState(526);
				tipofuncion();
				setState(527);
				match(ID);
				}
			}

			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(531);
				match(TK_COMA);
				setState(532);
				tipofuncion();
				setState(533);
				match(ID);
				}
				}
				setState(539);
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
		enterRule(_localctx, 110, RULE_tipofuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0221\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\7\2u\n\2\f\2\16"+
		"\2x\13\2\3\2\3\2\3\2\7\2}\n\2\f\2\16\2\u0080\13\2\3\2\3\2\3\3\3\3\6\3"+
		"\u0086\n\3\r\3\16\3\u0087\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\u0095\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009f\n\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ac\n\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\5\t\u00b5\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bc\n\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\5\13\u00c5\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00cc\n"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d9\n\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e6\n\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00f0\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u00f7\n\22\f\22\16\22\u00fa\13\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0109\n\24\f\24\16\24\u010c\13"+
		"\24\5\24\u010e\n\24\3\24\3\24\5\24\u0112\n\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\7\26\u011b\n\26\f\26\16\26\u011e\13\26\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0125\n\27\3\30\3\30\3\31\5\31\u012a\n\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u013c"+
		"\n\34\f\34\16\34\u013f\13\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u014c\n\36\3\37\3\37\3\37\3\37\3 \3 \6 \u0154\n \r"+
		" \16 \u0155\3 \3 \3!\3!\6!\u015c\n!\r!\16!\u015d\5!\u0160\n!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u016d\n\"\3\"\3\"\3#\3#\3$\3$\3%"+
		"\3%\3%\3%\3&\3&\6&\u017b\n&\r&\16&\u017c\3&\3&\3\'\3\'\6\'\u0183\n\'\r"+
		"\'\16\'\u0184\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\6)\u0191\n)\r)\16)\u0192"+
		"\3)\3)\5)\u0197\n)\3*\3*\3*\3*\3+\3+\6+\u019f\n+\r+\16+\u01a0\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\5/\u01be\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\6\65\u01d7"+
		"\n\65\r\65\16\65\u01d8\3\65\3\65\5\65\u01dd\n\65\6\65\u01df\n\65\r\65"+
		"\16\65\u01e0\3\65\3\65\3\65\7\65\u01e6\n\65\f\65\16\65\u01e9\13\65\5\65"+
		"\u01eb\n\65\3\65\3\65\3\65\7\65\u01f0\n\65\f\65\16\65\u01f3\13\65\5\65"+
		"\u01f5\n\65\3\66\3\66\3\66\6\66\u01fa\n\66\r\66\16\66\u01fb\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\6\67\u0208\n\67\r\67\16\67\u0209"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\58\u0214\n8\38\38\38\38\78\u021a\n"+
		"8\f8\168\u021d\138\39\39\39\2\2:\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\t\3\2%)\3\2\65\67"+
		"\3\2,-\3\2.\63\3\2\65\66\3\2.\61\3\2\33\37\2\u022d\2v\3\2\2\2\4\u0083"+
		"\3\2\2\2\6\u0094\3\2\2\2\b\u009e\3\2\2\2\n\u00a0\3\2\2\2\f\u00ab\3\2\2"+
		"\2\16\u00ad\3\2\2\2\20\u00bb\3\2\2\2\22\u00bd\3\2\2\2\24\u00cb\3\2\2\2"+
		"\26\u00cd\3\2\2\2\30\u00d8\3\2\2\2\32\u00da\3\2\2\2\34\u00e5\3\2\2\2\36"+
		"\u00e7\3\2\2\2 \u00ef\3\2\2\2\"\u00f1\3\2\2\2$\u00ff\3\2\2\2&\u0104\3"+
		"\2\2\2(\u0113\3\2\2\2*\u0116\3\2\2\2,\u0124\3\2\2\2.\u0126\3\2\2\2\60"+
		"\u0129\3\2\2\2\62\u012d\3\2\2\2\64\u0133\3\2\2\2\66\u0139\3\2\2\28\u0140"+
		"\3\2\2\2:\u014b\3\2\2\2<\u014d\3\2\2\2>\u0151\3\2\2\2@\u015f\3\2\2\2B"+
		"\u0163\3\2\2\2D\u0170\3\2\2\2F\u0172\3\2\2\2H\u0174\3\2\2\2J\u0178\3\2"+
		"\2\2L\u0180\3\2\2\2N\u018a\3\2\2\2P\u018e\3\2\2\2R\u0198\3\2\2\2T\u019c"+
		"\3\2\2\2V\u01a4\3\2\2\2X\u01ad\3\2\2\2Z\u01b1\3\2\2\2\\\u01b9\3\2\2\2"+
		"^\u01bf\3\2\2\2`\u01c2\3\2\2\2b\u01c6\3\2\2\2d\u01c8\3\2\2\2f\u01ca\3"+
		"\2\2\2h\u01f4\3\2\2\2j\u01f6\3\2\2\2l\u01ff\3\2\2\2n\u0213\3\2\2\2p\u021e"+
		"\3\2\2\2ru\5j\66\2su\5l\67\2tr\3\2\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2v"+
		"w\3\2\2\2wy\3\2\2\2xv\3\2\2\2y~\5\4\3\2z}\5j\66\2{}\5l\67\2|z\3\2\2\2"+
		"|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u0082\7\2\2\3\u0082\3\3\2\2\2\u0083\u0085\7\3\2\2\u0084"+
		"\u0086\5\6\4\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\4\2\2\u008a"+
		"\5\3\2\2\2\u008b\u0095\5\b\5\2\u008c\u0095\5\62\32\2\u008d\u0095\5\64"+
		"\33\2\u008e\u0095\5<\37\2\u008f\u0095\5H%\2\u0090\u0095\5L\'\2\u0091\u0095"+
		"\5N(\2\u0092\u0095\5f\64\2\u0093\u0095\5&\24\2\u0094\u008b\3\2\2\2\u0094"+
		"\u008c\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u008f\3\2"+
		"\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\7\3\2\2\2\u0096\u009f\5\n\6\2\u0097\u009f\5\16\b"+
		"\2\u0098\u009f\5\22\n\2\u0099\u009f\5\26\f\2\u009a\u009f\5\32\16\2\u009b"+
		"\u009f\5\36\20\2\u009c\u009f\5\"\22\2\u009d\u009f\5$\23\2\u009e\u0096"+
		"\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u0099\3\2\2\2\u009e"+
		"\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\t\3\2\2\2\u00a0\u00a1\7\33\2\2\u00a1\u00a2\7\65\2\2\u00a2\u00a3"+
		"\5\f\7\2\u00a3\13\3\2\2\2\u00a4\u00ac\7 \2\2\u00a5\u00a6\7\"\2\2\u00a6"+
		"\u00a7\7\64\2\2\u00a7\u00ac\5\f\7\2\u00a8\u00a9\7#\2\2\u00a9\u00aa\7\65"+
		"\2\2\u00aa\u00ac\5\f\7\2\u00ab\u00a4\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab"+
		"\u00a8\3\2\2\2\u00ac\r\3\2\2\2\u00ad\u00ae\7\34\2\2\u00ae\u00af\7\65\2"+
		"\2\u00af\u00b0\5\20\t\2\u00b0\17\3\2\2\2\u00b1\u00bc\7 \2\2\u00b2\u00b4"+
		"\7\"\2\2\u00b3\u00b5\7&\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\7\66\2\2\u00b7\u00bc\5\20\t\2\u00b8\u00b9\7"+
		"#\2\2\u00b9\u00ba\7\65\2\2\u00ba\u00bc\5\20\t\2\u00bb\u00b1\3\2\2\2\u00bb"+
		"\u00b2\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\21\3\2\2\2\u00bd\u00be\7\35\2"+
		"\2\u00be\u00bf\7\65\2\2\u00bf\u00c0\5\24\13\2\u00c0\23\3\2\2\2\u00c1\u00cc"+
		"\7 \2\2\u00c2\u00c4\7\"\2\2\u00c3\u00c5\7&\2\2\u00c4\u00c3\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\67\2\2\u00c7\u00cc\5"+
		"\24\13\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\7\65\2\2\u00ca\u00cc\5\24\13\2"+
		"\u00cb\u00c1\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\25"+
		"\3\2\2\2\u00cd\u00ce\7\36\2\2\u00ce\u00cf\7\65\2\2\u00cf\u00d0\5\30\r"+
		"\2\u00d0\27\3\2\2\2\u00d1\u00d9\7 \2\2\u00d2\u00d3\7\"\2\2\u00d3\u00d4"+
		"\79\2\2\u00d4\u00d9\5\30\r\2\u00d5\u00d6\7#\2\2\u00d6\u00d7\7\65\2\2\u00d7"+
		"\u00d9\5\30\r\2\u00d8\u00d1\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8\u00d5\3"+
		"\2\2\2\u00d9\31\3\2\2\2\u00da\u00db\7\37\2\2\u00db\u00dc\7\65\2\2\u00dc"+
		"\u00dd\5\34\17\2\u00dd\33\3\2\2\2\u00de\u00e6\7 \2\2\u00df\u00e0\7\"\2"+
		"\2\u00e0\u00e1\78\2\2\u00e1\u00e6\5\34\17\2\u00e2\u00e3\7#\2\2\u00e3\u00e4"+
		"\7\65\2\2\u00e4\u00e6\5\34\17\2\u00e5\u00de\3\2\2\2\u00e5\u00df\3\2\2"+
		"\2\u00e5\u00e2\3\2\2\2\u00e6\35\3\2\2\2\u00e7\u00e8\7\65\2\2\u00e8\u00e9"+
		"\7\65\2\2\u00e9\u00ea\5 \21\2\u00ea\37\3\2\2\2\u00eb\u00f0\7 \2\2\u00ec"+
		"\u00ed\7#\2\2\u00ed\u00ee\7\65\2\2\u00ee\u00f0\5 \21\2\u00ef\u00eb\3\2"+
		"\2\2\u00ef\u00ec\3\2\2\2\u00f0!\3\2\2\2\u00f1\u00f2\7\65\2\2\u00f2\u00f3"+
		"\7$\2\2\u00f3\u00f8\7\65\2\2\u00f4\u00f5\7$\2\2\u00f5\u00f7\7\65\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\"\2\2\u00fc"+
		"\u00fd\5:\36\2\u00fd\u00fe\7 \2\2\u00fe#\3\2\2\2\u00ff\u0100\7\65\2\2"+
		"\u0100\u0101\7\"\2\2\u0101\u0102\5:\36\2\u0102\u0103\7 \2\2\u0103%\3\2"+
		"\2\2\u0104\u0105\7\65\2\2\u0105\u010d\7*\2\2\u0106\u010a\5:\36\2\u0107"+
		"\u0109\5(\25\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u0106\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\7+"+
		"\2\2\u0110\u0112\7 \2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\'\3\2\2\2\u0113\u0114\7#\2\2\u0114\u0115\5:\36\2\u0115)\3\2\2\2\u0116"+
		"\u011c\5,\27\2\u0117\u0118\5.\30\2\u0118\u0119\5,\27\2\u0119\u011b\3\2"+
		"\2\2\u011a\u0117\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d+\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0125\5\60\31"+
		"\2\u0120\u0121\7*\2\2\u0121\u0122\5*\26\2\u0122\u0123\7+\2\2\u0123\u0125"+
		"\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0125-\3\2\2\2\u0126"+
		"\u0127\t\2\2\2\u0127/\3\2\2\2\u0128\u012a\7&\2\2\u0129\u0128\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\t\3\2\2\u012c\61\3\2\2"+
		"\2\u012d\u012e\7\5\2\2\u012e\u012f\7*\2\2\u012f\u0130\7\65\2\2\u0130\u0131"+
		"\7+\2\2\u0131\u0132\7 \2\2\u0132\63\3\2\2\2\u0133\u0134\7\6\2\2\u0134"+
		"\u0135\7*\2\2\u0135\u0136\5\66\34\2\u0136\u0137\7+\2\2\u0137\u0138\7 "+
		"\2\2\u0138\65\3\2\2\2\u0139\u013d\5:\36\2\u013a\u013c\58\35\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\67\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7#\2\2\u0141\u0142\5:\36\2"+
		"\u01429\3\2\2\2\u0143\u014c\7\64\2\2\u0144\u014c\7\66\2\2\u0145\u014c"+
		"\7\67\2\2\u0146\u014c\79\2\2\u0147\u014c\78\2\2\u0148\u014c\5*\26\2\u0149"+
		"\u014c\7\65\2\2\u014a\u014c\5&\24\2\u014b\u0143\3\2\2\2\u014b\u0144\3"+
		"\2\2\2\u014b\u0145\3\2\2\2\u014b\u0146\3\2\2\2\u014b\u0147\3\2\2\2\u014b"+
		"\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c;\3\2\2\2"+
		"\u014d\u014e\7\7\2\2\u014e\u014f\5B\"\2\u014f\u0150\5> \2\u0150=\3\2\2"+
		"\2\u0151\u0153\7\b\2\2\u0152\u0154\5\6\4\2\u0153\u0152\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\5@!\2\u0158?\3\2\2\2\u0159\u015b\7\n\2\2\u015a\u015c\5\6\4\2\u015b"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u0160\3\2\2\2\u015f\u0159\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\7\t\2\2\u0162A\3\2\2\2\u0163\u0164\7*\2\2\u0164"+
		"\u0165\5:\36\2\u0165\u0166\5F$\2\u0166\u016c\5:\36\2\u0167\u0168\5D#\2"+
		"\u0168\u0169\5:\36\2\u0169\u016a\5F$\2\u016a\u016b\5:\36\2\u016b\u016d"+
		"\3\2\2\2\u016c\u0167\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016f\7+\2\2\u016fC\3\2\2\2\u0170\u0171\t\4\2\2\u0171E\3\2\2\2\u0172"+
		"\u0173\t\5\2\2\u0173G\3\2\2\2\u0174\u0175\7\13\2\2\u0175\u0176\5B\"\2"+
		"\u0176\u0177\5J&\2\u0177I\3\2\2\2\u0178\u017a\7\f\2\2\u0179\u017b\5\6"+
		"\4\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\7\r\2\2\u017fK\3\2\2\2"+
		"\u0180\u0182\7\f\2\2\u0181\u0183\5\6\4\2\u0182\u0181\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\7\13\2\2\u0187\u0188\5B\"\2\u0188\u0189\7 \2\2\u0189M\3\2\2\2\u018a"+
		"\u018b\7\16\2\2\u018b\u018c\5V,\2\u018c\u018d\5P)\2\u018dO\3\2\2\2\u018e"+
		"\u0190\7\f\2\2\u018f\u0191\5\6\4\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\7\17\2\2\u0195\u0197\5R*\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197Q\3\2\2\2\u0198\u0199\7\16\2\2\u0199\u019a\5Z.\2\u019a\u019b"+
		"\5T+\2\u019bS\3\2\2\2\u019c\u019e\7\f\2\2\u019d\u019f\5\6\4\2\u019e\u019d"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\7\17\2\2\u01a3U\3\2\2\2\u01a4\u01a5\7*\2\2"+
		"\u01a5\u01a6\7\34\2\2\u01a6\u01a7\7\65\2\2\u01a7\u01a8\7\"\2\2\u01a8\u01a9"+
		"\7\66\2\2\u01a9\u01aa\7 \2\2\u01aa\u01ab\5\\/\2\u01ab\u01ac\5X-\2\u01ac"+
		"W\3\2\2\2\u01ad\u01ae\7 \2\2\u01ae\u01af\5b\62\2\u01af\u01b0\7+\2\2\u01b0"+
		"Y\3\2\2\2\u01b1\u01b2\7*\2\2\u01b2\u01b3\7\65\2\2\u01b3\u01b4\7\"\2\2"+
		"\u01b4\u01b5\7\66\2\2\u01b5\u01b6\7 \2\2\u01b6\u01b7\5\\/\2\u01b7\u01b8"+
		"\5X-\2\u01b8[\3\2\2\2\u01b9\u01ba\7\65\2\2\u01ba\u01bb\5d\63\2\u01bb\u01bd"+
		"\5b\62\2\u01bc\u01be\5^\60\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"]\3\2\2\2\u01bf\u01c0\5D#\2\u01c0\u01c1\5`\61\2\u01c1_\3\2\2\2\u01c2\u01c3"+
		"\7\65\2\2\u01c3\u01c4\5d\63\2\u01c4\u01c5\5b\62\2\u01c5a\3\2\2\2\u01c6"+
		"\u01c7\t\6\2\2\u01c7c\3\2\2\2\u01c8\u01c9\t\7\2\2\u01c9e\3\2\2\2\u01ca"+
		"\u01cb\7\20\2\2\u01cb\u01cc\7*\2\2\u01cc\u01cd\7\65\2\2\u01cd\u01ce\7"+
		"+\2\2\u01ce\u01cf\7\21\2\2\u01cf\u01d0\5h\65\2\u01d0\u01d1\7\25\2\2\u01d1"+
		"g\3\2\2\2\u01d2\u01d3\7\22\2\2\u01d3\u01d4\7\66\2\2\u01d4\u01d6\7!\2\2"+
		"\u01d5\u01d7\5\6\4\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d6"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01db\7\23\2\2"+
		"\u01db\u01dd\7 \2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df"+
		"\3\2\2\2\u01de\u01d2\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01ea\3\2\2\2\u01e2\u01e3\7\24\2\2\u01e3\u01e7\7"+
		"!\2\2\u01e4\u01e6\5\6\4\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2"+
		"\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01f5\3\2\2\2\u01ec"+
		"\u01ed\7\24\2\2\u01ed\u01f1\7!\2\2\u01ee\u01f0\5\6\4\2\u01ef\u01ee\3\2"+
		"\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01de\3\2\2\2\u01f4\u01ec\3\2"+
		"\2\2\u01f5i\3\2\2\2\u01f6\u01f7\7\26\2\2\u01f7\u01f9\7\65\2\2\u01f8\u01fa"+
		"\5\b\5\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\7\27\2\2\u01fek\3\2\2\2"+
		"\u01ff\u0200\7\30\2\2\u0200\u0201\5p9\2\u0201\u0202\7\65\2\2\u0202\u0203"+
		"\7*\2\2\u0203\u0204\5n8\2\u0204\u0205\7+\2\2\u0205\u0207\7\f\2\2\u0206"+
		"\u0208\5\6\4\2\u0207\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\7\31\2\2\u020c"+
		"\u020d\5:\36\2\u020d\u020e\7 \2\2\u020e\u020f\7\32\2\2\u020fm\3\2\2\2"+
		"\u0210\u0211\5p9\2\u0211\u0212\7\65\2\2\u0212\u0214\3\2\2\2\u0213\u0210"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u021b\3\2\2\2\u0215\u0216\7#\2\2\u0216"+
		"\u0217\5p9\2\u0217\u0218\7\65\2\2\u0218\u021a\3\2\2\2\u0219\u0215\3\2"+
		"\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"o\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\t\b\2\2\u021fq\3\2\2\2/tv|~"+
		"\u0087\u0094\u009e\u00ab\u00b4\u00bb\u00c4\u00cb\u00d8\u00e5\u00ef\u00f8"+
		"\u010a\u010d\u0111\u011c\u0124\u0129\u013d\u014b\u0155\u015d\u015f\u016c"+
		"\u017c\u0184\u0192\u0196\u01a0\u01bd\u01d8\u01dc\u01e0\u01e7\u01ea\u01f1"+
		"\u01f4\u01fb\u0209\u0213\u021b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}