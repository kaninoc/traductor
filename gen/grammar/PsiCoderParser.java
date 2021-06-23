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
		RULE_ciclohacer = 37, RULE_cuerpociclohacer = 38, RULE_ciclopara = 39, 
		RULE_contenidopara = 40, RULE_contparaopt = 41, RULE_contparaoptfinal = 42, 
		RULE_elementospara = 43, RULE_complementopara = 44, RULE_elementosparados = 45, 
		RULE_comparadorpara = 46, RULE_segundocomparador = 47, RULE_segcomfinal = 48, 
		RULE_varcomparable = 49, RULE_credec = 50, RULE_multiple = 51, RULE_casos = 52, 
		RULE_multiplescasos = 53, RULE_defecto = 54, RULE_estructuras = 55, RULE_decfuncion = 56, 
		RULE_parametros = 57, RULE_tipofuncion = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz", "f_principal", "contenido", "declaracion", "varBooleano", "extvarB", 
			"varEntero", "extvarE", "varReal", "extvarR", "varCaracter", "extvarC", 
			"varCadena", "extvarS", "varEstructura", "extvarEstructura", "varAsigEstructura", 
			"varDeclarada", "asigfuncion", "repeticion", "operacion", "expresion", 
			"operador", "tipovar", "lectura", "imprimir", "impresion", "repeticionimpresion", 
			"varimpresion", "condicional", "cuerpoif", "sino", "operacionlogica", 
			"operadorlogico", "comparador", "ciclomientras", "cuerpociclomientras", 
			"ciclohacer", "cuerpociclohacer", "ciclopara", "contenidopara", "contparaopt", 
			"contparaoptfinal", "elementospara", "complementopara", "elementosparados", 
			"comparadorpara", "segundocomparador", "segcomfinal", "varcomparable", 
			"credec", "multiple", "casos", "multiplescasos", "defecto", "estructuras", 
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
			{
			setState(125);
			f_principal();
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTRUCTURA || _la==FUNCION) {
				{
				setState(128);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESTRUCTURA:
					{
					setState(126);
					estructuras();
					}
					break;
				case FUNCION:
					{
					setState(127);
					decfuncion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
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
			setState(135);
			match(FP);
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				contenido();
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(141);
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				lectura();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				imprimir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				condicional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				ciclomientras();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				ciclohacer();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				ciclopara();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				multiple();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				varBooleano();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				varEntero();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				varReal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				varCaracter();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				varCadena();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				varEstructura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				varAsigEstructura();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
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
			setState(164);
			match(BOOLEANO);
			setState(165);
			match(ID);
			setState(166);
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
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(TK_ASIG);
				setState(170);
				match(TK_BOOLEANO);
				setState(171);
				extvarB();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(TK_COMA);
				setState(173);
				match(ID);
				setState(174);
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
			setState(177);
			match(ENTERO);
			setState(178);
			match(ID);
			setState(179);
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
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(TK_ASIG);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_MENOS) {
					{
					setState(183);
					match(TK_MENOS);
					}
				}

				setState(186);
				match(TK_ENTERO);
				setState(187);
				extvarE();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(TK_COMA);
				setState(189);
				match(ID);
				setState(190);
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
			setState(193);
			match(REAL);
			setState(194);
			match(ID);
			setState(195);
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
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(TK_ASIG);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_MENOS) {
					{
					setState(199);
					match(TK_MENOS);
					}
				}

				setState(202);
				match(TK_REAL);
				setState(203);
				extvarR();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(TK_COMA);
				setState(205);
				match(ID);
				setState(206);
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
			setState(209);
			match(CARACTER);
			setState(210);
			match(ID);
			setState(211);
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
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(TK_ASIG);
				setState(215);
				match(TK_CARACTER);
				setState(216);
				extvarC();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(TK_COMA);
				setState(218);
				match(ID);
				setState(219);
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
			setState(222);
			match(CADENA);
			setState(223);
			match(ID);
			setState(224);
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
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(TK_ASIG);
				setState(228);
				match(TK_CADENA);
				setState(229);
				extvarS();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(TK_COMA);
				setState(231);
				match(ID);
				setState(232);
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
			setState(235);
			match(ID);
			setState(236);
			match(ID);
			setState(237);
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
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(TK_PYC);
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(TK_COMA);
				setState(241);
				match(ID);
				setState(242);
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
			setState(245);
			match(ID);
			setState(246);
			match(TK_PUNTO);
			setState(247);
			match(ID);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PUNTO) {
				{
				{
				setState(248);
				match(TK_PUNTO);
				setState(249);
				match(ID);
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(TK_ASIG);
			setState(256);
			varimpresion();
			setState(257);
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
			setState(259);
			match(ID);
			setState(260);
			match(TK_ASIG);
			setState(261);
			varimpresion();
			setState(262);
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
			setState(264);
			match(ID);
			setState(265);
			match(TK_PAR_IZQ);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOS) | (1L << TK_PAR_IZQ) | (1L << TK_BOOLEANO) | (1L << ID) | (1L << TK_ENTERO) | (1L << TK_REAL) | (1L << TK_CADENA) | (1L << TK_CARACTER))) != 0)) {
				{
				setState(266);
				varimpresion();
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(267);
					repeticion();
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(275);
			match(TK_PAR_DER);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(276);
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
			setState(279);
			match(TK_COMA);
			setState(280);
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
			setState(282);
			expresion();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MAS) | (1L << TK_MENOS) | (1L << TK_MULT) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) {
				{
				{
				setState(283);
				operador();
				setState(284);
				expresion();
				}
				}
				setState(290);
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
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_MENOS:
			case ID:
			case TK_ENTERO:
			case TK_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				tipovar();
				}
				break;
			case TK_PAR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(TK_PAR_IZQ);
				setState(293);
				operacion();
				setState(294);
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
			setState(298);
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
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_MENOS) {
				{
				setState(300);
				match(TK_MENOS);
				}
			}

			setState(303);
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
			setState(305);
			match(LEER);
			setState(306);
			match(TK_PAR_IZQ);
			setState(307);
			match(ID);
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
			setState(311);
			match(IMPRIMIR);
			setState(312);
			match(TK_PAR_IZQ);
			setState(313);
			impresion();
			setState(314);
			match(TK_PAR_DER);
			setState(315);
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
			setState(317);
			varimpresion();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(318);
				repeticionimpresion();
				}
				}
				setState(323);
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
			setState(324);
			match(TK_COMA);
			setState(325);
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
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(TK_BOOLEANO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(TK_ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(TK_REAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(TK_CARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				match(TK_CADENA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				operacion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(333);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(334);
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
			setState(337);
			match(SI);
			setState(338);
			operacionlogica();
			setState(339);
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
			setState(341);
			match(ENTONCES);
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
			setState(347);
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
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SI_NO) {
				{
				setState(349);
				match(SI_NO);
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(350);
					contenido();
					}
					}
					setState(353); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
				}
			}

			setState(357);
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
			setState(359);
			match(TK_PAR_IZQ);
			setState(360);
			varimpresion();
			setState(361);
			comparador();
			setState(362);
			varimpresion();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_Y || _la==TK_O) {
				{
				setState(363);
				operadorlogico();
				setState(364);
				varimpresion();
				setState(365);
				comparador();
				setState(366);
				varimpresion();
				}
			}

			setState(370);
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
			setState(372);
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
			setState(374);
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
			setState(376);
			match(MIENTRAS);
			setState(377);
			operacionlogica();
			setState(378);
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
			setState(380);
			match(HACER);
			setState(382); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(381);
				contenido();
				}
				}
				setState(384); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(386);
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
		public CuerpociclohacerContext cuerpociclohacer() {
			return getRuleContext(CuerpociclohacerContext.class,0);
		}
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
			setState(388);
			match(HACER);
			setState(390); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(389);
					contenido();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(392); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(394);
			cuerpociclohacer();
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

	public static class CuerpociclohacerContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(PsiCoderParser.MIENTRAS, 0); }
		public OperacionlogicaContext operacionlogica() {
			return getRuleContext(OperacionlogicaContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public CuerpociclohacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpociclohacer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCuerpociclohacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCuerpociclohacer(this);
		}
	}

	public final CuerpociclohacerContext cuerpociclohacer() throws RecognitionException {
		CuerpociclohacerContext _localctx = new CuerpociclohacerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cuerpociclohacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(MIENTRAS);
			setState(397);
			operacionlogica();
			setState(398);
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
		enterRule(_localctx, 78, RULE_ciclopara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(PARA);
			setState(401);
			elementospara();
			setState(402);
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
		enterRule(_localctx, 80, RULE_contenidopara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(HACER);
			setState(406); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(405);
				contenido();
				}
				}
				setState(408); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(410);
			match(FIN_PARA);
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(411);
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
		enterRule(_localctx, 82, RULE_contparaopt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(PARA);
			setState(415);
			elementosparados();
			setState(416);
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
		enterRule(_localctx, 84, RULE_contparaoptfinal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(HACER);
			setState(420); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(419);
				contenido();
				}
				}
				setState(422); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(424);
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
		enterRule(_localctx, 86, RULE_elementospara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(TK_PAR_IZQ);
			setState(427);
			match(ENTERO);
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
		enterRule(_localctx, 88, RULE_complementopara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(TK_PYC);
			setState(436);
			varcomparable();
			setState(437);
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
		enterRule(_localctx, 90, RULE_elementosparados);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(TK_PAR_IZQ);
			setState(440);
			match(ID);
			setState(441);
			match(TK_ASIG);
			setState(442);
			match(TK_ENTERO);
			setState(443);
			match(TK_PYC);
			setState(444);
			comparadorpara();
			setState(445);
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
		enterRule(_localctx, 92, RULE_comparadorpara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(ID);
			setState(448);
			credec();
			setState(449);
			varcomparable();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_Y || _la==TK_O) {
				{
				setState(450);
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
		enterRule(_localctx, 94, RULE_segundocomparador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			operadorlogico();
			setState(454);
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
		enterRule(_localctx, 96, RULE_segcomfinal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(ID);
			setState(457);
			credec();
			setState(458);
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
		enterRule(_localctx, 98, RULE_varcomparable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
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
		enterRule(_localctx, 100, RULE_credec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
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
		enterRule(_localctx, 102, RULE_multiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(SELECCIONAR);
			setState(465);
			match(TK_PAR_IZQ);
			setState(466);
			match(ID);
			setState(467);
			match(TK_PAR_DER);
			setState(468);
			match(ENTRE);
			setState(469);
			casos();
			setState(470);
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
		public List<MultiplescasosContext> multiplescasos() {
			return getRuleContexts(MultiplescasosContext.class);
		}
		public MultiplescasosContext multiplescasos(int i) {
			return getRuleContext(MultiplescasosContext.class,i);
		}
		public DefectoContext defecto() {
			return getRuleContext(DefectoContext.class,0);
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
		enterRule(_localctx, 104, RULE_casos);
		int _la;
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(473); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(472);
					multiplescasos();
					}
					}
					setState(475); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASO );
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFECTO) {
					{
					setState(477);
					defecto();
					}
				}

				}
				break;
			case DEFECTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				defecto();
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

	public static class MultiplescasosContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(PsiCoderParser.CASO, 0); }
		public TerminalNode TK_ENTERO() { return getToken(PsiCoderParser.TK_ENTERO, 0); }
		public TerminalNode TK_DOSP() { return getToken(PsiCoderParser.TK_DOSP, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public TerminalNode ROMPER() { return getToken(PsiCoderParser.ROMPER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public MultiplescasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplescasos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterMultiplescasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitMultiplescasos(this);
		}
	}

	public final MultiplescasosContext multiplescasos() throws RecognitionException {
		MultiplescasosContext _localctx = new MultiplescasosContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_multiplescasos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(483);
			match(CASO);
			setState(484);
			match(TK_ENTERO);
			setState(485);
			match(TK_DOSP);
			setState(487); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(486);
				contenido();
				}
				}
				setState(489); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROMPER) {
				{
				setState(491);
				match(ROMPER);
				setState(492);
				match(TK_PYC);
				}
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

	public static class DefectoContext extends ParserRuleContext {
		public TerminalNode DEFECTO() { return getToken(PsiCoderParser.DEFECTO, 0); }
		public TerminalNode TK_DOSP() { return getToken(PsiCoderParser.TK_DOSP, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public DefectoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defecto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterDefecto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitDefecto(this);
		}
	}

	public final DefectoContext defecto() throws RecognitionException {
		DefectoContext _localctx = new DefectoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_defecto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(DEFECTO);
			setState(496);
			match(TK_DOSP);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0)) {
				{
				{
				setState(497);
				contenido();
				}
				}
				setState(502);
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
		enterRule(_localctx, 110, RULE_estructuras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(ESTRUCTURA);
			setState(504);
			match(ID);
			setState(506); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(505);
				declaracion();
				}
				}
				setState(508); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(510);
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
		enterRule(_localctx, 112, RULE_decfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(FUNCION);
			setState(513);
			tipofuncion();
			setState(514);
			match(ID);
			setState(515);
			match(TK_PAR_IZQ);
			setState(516);
			parametros();
			setState(517);
			match(TK_PAR_DER);
			setState(518);
			match(HACER);
			setState(520); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(519);
				contenido();
				}
				}
				setState(522); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(524);
			match(RETORNAR);
			setState(525);
			varimpresion();
			setState(526);
			match(TK_PYC);
			setState(527);
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
		enterRule(_localctx, 114, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA))) != 0)) {
				{
				setState(529);
				tipofuncion();
				setState(530);
				match(ID);
				}
			}

			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(534);
				match(TK_COMA);
				setState(535);
				tipofuncion();
				setState(536);
				match(ID);
				}
				}
				setState(542);
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
		enterRule(_localctx, 116, RULE_tipofuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0224\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\7\2{\n\2\f\2\16\2~\13\2\3\2\3\2\3\2\7\2\u0083\n\2\f\2\16\2\u0086\13"+
		"\2\3\2\3\2\3\3\3\3\6\3\u008c\n\3\r\3\16\3\u008d\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4\u009b\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u00a5\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b2\n\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u00bb\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c2"+
		"\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u00cb\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00d2\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00df\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00ec\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00f6\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u00fd\n\22\f\22\16\22\u0100\13\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u010f"+
		"\n\24\f\24\16\24\u0112\13\24\5\24\u0114\n\24\3\24\3\24\5\24\u0118\n\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0121\n\26\f\26\16\26\u0124\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\5\27\u012b\n\27\3\30\3\30\3\31\5\31\u0130"+
		"\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\7\34\u0142\n\34\f\34\16\34\u0145\13\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0152\n\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \6 \u015a\n \r \16 \u015b\3 \3 \3!\3!\6!\u0162\n!\r!\16!\u0163"+
		"\5!\u0166\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0173\n\"\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\6&\u0181\n&\r&\16&\u0182\3&\3&\3"+
		"\'\3\'\6\'\u0189\n\'\r\'\16\'\u018a\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		"*\3*\6*\u0199\n*\r*\16*\u019a\3*\3*\5*\u019f\n*\3+\3+\3+\3+\3,\3,\6,\u01a7"+
		"\n,\r,\16,\u01a8\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\5\60\u01c6\n\60\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\6\66\u01dc\n\66\r\66\16\66\u01dd\3\66\5\66\u01e1\n\66\3"+
		"\66\5\66\u01e4\n\66\3\67\3\67\3\67\3\67\6\67\u01ea\n\67\r\67\16\67\u01eb"+
		"\3\67\3\67\5\67\u01f0\n\67\38\38\38\78\u01f5\n8\f8\168\u01f8\138\39\3"+
		"9\39\69\u01fd\n9\r9\169\u01fe\39\39\3:\3:\3:\3:\3:\3:\3:\3:\6:\u020b\n"+
		":\r:\16:\u020c\3:\3:\3:\3:\3:\3;\3;\3;\5;\u0217\n;\3;\3;\3;\3;\7;\u021d"+
		"\n;\f;\16;\u0220\13;\3<\3<\3<\2\2=\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2\t\3\2%)\3"+
		"\2\65\67\3\2,-\3\2.\63\3\2\65\66\3\2.\61\3\2\33\37\2\u022c\2|\3\2\2\2"+
		"\4\u0089\3\2\2\2\6\u009a\3\2\2\2\b\u00a4\3\2\2\2\n\u00a6\3\2\2\2\f\u00b1"+
		"\3\2\2\2\16\u00b3\3\2\2\2\20\u00c1\3\2\2\2\22\u00c3\3\2\2\2\24\u00d1\3"+
		"\2\2\2\26\u00d3\3\2\2\2\30\u00de\3\2\2\2\32\u00e0\3\2\2\2\34\u00eb\3\2"+
		"\2\2\36\u00ed\3\2\2\2 \u00f5\3\2\2\2\"\u00f7\3\2\2\2$\u0105\3\2\2\2&\u010a"+
		"\3\2\2\2(\u0119\3\2\2\2*\u011c\3\2\2\2,\u012a\3\2\2\2.\u012c\3\2\2\2\60"+
		"\u012f\3\2\2\2\62\u0133\3\2\2\2\64\u0139\3\2\2\2\66\u013f\3\2\2\28\u0146"+
		"\3\2\2\2:\u0151\3\2\2\2<\u0153\3\2\2\2>\u0157\3\2\2\2@\u0165\3\2\2\2B"+
		"\u0169\3\2\2\2D\u0176\3\2\2\2F\u0178\3\2\2\2H\u017a\3\2\2\2J\u017e\3\2"+
		"\2\2L\u0186\3\2\2\2N\u018e\3\2\2\2P\u0192\3\2\2\2R\u0196\3\2\2\2T\u01a0"+
		"\3\2\2\2V\u01a4\3\2\2\2X\u01ac\3\2\2\2Z\u01b5\3\2\2\2\\\u01b9\3\2\2\2"+
		"^\u01c1\3\2\2\2`\u01c7\3\2\2\2b\u01ca\3\2\2\2d\u01ce\3\2\2\2f\u01d0\3"+
		"\2\2\2h\u01d2\3\2\2\2j\u01e3\3\2\2\2l\u01e5\3\2\2\2n\u01f1\3\2\2\2p\u01f9"+
		"\3\2\2\2r\u0202\3\2\2\2t\u0216\3\2\2\2v\u0221\3\2\2\2x{\5p9\2y{\5r:\2"+
		"zx\3\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2"+
		"\2\2\177\u0084\5\4\3\2\u0080\u0083\5p9\2\u0081\u0083\5r:\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\2"+
		"\2\3\u0088\3\3\2\2\2\u0089\u008b\7\3\2\2\u008a\u008c\5\6\4\2\u008b\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\7\4\2\2\u0090\5\3\2\2\2\u0091\u009b\5\b\5\2"+
		"\u0092\u009b\5\62\32\2\u0093\u009b\5\64\33\2\u0094\u009b\5<\37\2\u0095"+
		"\u009b\5H%\2\u0096\u009b\5L\'\2\u0097\u009b\5P)\2\u0098\u009b\5h\65\2"+
		"\u0099\u009b\5&\24\2\u009a\u0091\3\2\2\2\u009a\u0092\3\2\2\2\u009a\u0093"+
		"\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a"+
		"\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\7\3\2\2\2"+
		"\u009c\u00a5\5\n\6\2\u009d\u00a5\5\16\b\2\u009e\u00a5\5\22\n\2\u009f\u00a5"+
		"\5\26\f\2\u00a0\u00a5\5\32\16\2\u00a1\u00a5\5\36\20\2\u00a2\u00a5\5\""+
		"\22\2\u00a3\u00a5\5$\23\2\u00a4\u009c\3\2\2\2\u00a4\u009d\3\2\2\2\u00a4"+
		"\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\t\3\2\2\2\u00a6\u00a7"+
		"\7\33\2\2\u00a7\u00a8\7\65\2\2\u00a8\u00a9\5\f\7\2\u00a9\13\3\2\2\2\u00aa"+
		"\u00b2\7 \2\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad\7\64\2\2\u00ad\u00b2\5\f"+
		"\7\2\u00ae\u00af\7#\2\2\u00af\u00b0\7\65\2\2\u00b0\u00b2\5\f\7\2\u00b1"+
		"\u00aa\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\r\3\2\2\2"+
		"\u00b3\u00b4\7\34\2\2\u00b4\u00b5\7\65\2\2\u00b5\u00b6\5\20\t\2\u00b6"+
		"\17\3\2\2\2\u00b7\u00c2\7 \2\2\u00b8\u00ba\7\"\2\2\u00b9\u00bb\7&\2\2"+
		"\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\7\66\2\2\u00bd\u00c2\5\20\t\2\u00be\u00bf\7#\2\2\u00bf\u00c0\7\65\2\2"+
		"\u00c0\u00c2\5\20\t\2\u00c1\u00b7\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00be"+
		"\3\2\2\2\u00c2\21\3\2\2\2\u00c3\u00c4\7\35\2\2\u00c4\u00c5\7\65\2\2\u00c5"+
		"\u00c6\5\24\13\2\u00c6\23\3\2\2\2\u00c7\u00d2\7 \2\2\u00c8\u00ca\7\"\2"+
		"\2\u00c9\u00cb\7&\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00cd\7\67\2\2\u00cd\u00d2\5\24\13\2\u00ce\u00cf\7#\2\2"+
		"\u00cf\u00d0\7\65\2\2\u00d0\u00d2\5\24\13\2\u00d1\u00c7\3\2\2\2\u00d1"+
		"\u00c8\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\25\3\2\2\2\u00d3\u00d4\7\36\2"+
		"\2\u00d4\u00d5\7\65\2\2\u00d5\u00d6\5\30\r\2\u00d6\27\3\2\2\2\u00d7\u00df"+
		"\7 \2\2\u00d8\u00d9\7\"\2\2\u00d9\u00da\79\2\2\u00da\u00df\5\30\r\2\u00db"+
		"\u00dc\7#\2\2\u00dc\u00dd\7\65\2\2\u00dd\u00df\5\30\r\2\u00de\u00d7\3"+
		"\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00db\3\2\2\2\u00df\31\3\2\2\2\u00e0"+
		"\u00e1\7\37\2\2\u00e1\u00e2\7\65\2\2\u00e2\u00e3\5\34\17\2\u00e3\33\3"+
		"\2\2\2\u00e4\u00ec\7 \2\2\u00e5\u00e6\7\"\2\2\u00e6\u00e7\78\2\2\u00e7"+
		"\u00ec\5\34\17\2\u00e8\u00e9\7#\2\2\u00e9\u00ea\7\65\2\2\u00ea\u00ec\5"+
		"\34\17\2\u00eb\u00e4\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec"+
		"\35\3\2\2\2\u00ed\u00ee\7\65\2\2\u00ee\u00ef\7\65\2\2\u00ef\u00f0\5 \21"+
		"\2\u00f0\37\3\2\2\2\u00f1\u00f6\7 \2\2\u00f2\u00f3\7#\2\2\u00f3\u00f4"+
		"\7\65\2\2\u00f4\u00f6\5 \21\2\u00f5\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2"+
		"\u00f6!\3\2\2\2\u00f7\u00f8\7\65\2\2\u00f8\u00f9\7$\2\2\u00f9\u00fe\7"+
		"\65\2\2\u00fa\u00fb\7$\2\2\u00fb\u00fd\7\65\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\"\2\2\u0102\u0103\5:\36\2\u0103"+
		"\u0104\7 \2\2\u0104#\3\2\2\2\u0105\u0106\7\65\2\2\u0106\u0107\7\"\2\2"+
		"\u0107\u0108\5:\36\2\u0108\u0109\7 \2\2\u0109%\3\2\2\2\u010a\u010b\7\65"+
		"\2\2\u010b\u0113\7*\2\2\u010c\u0110\5:\36\2\u010d\u010f\5(\25\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u010c\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\7+\2\2\u0116\u0118\7 \2"+
		"\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\'\3\2\2\2\u0119\u011a"+
		"\7#\2\2\u011a\u011b\5:\36\2\u011b)\3\2\2\2\u011c\u0122\5,\27\2\u011d\u011e"+
		"\5.\30\2\u011e\u011f\5,\27\2\u011f\u0121\3\2\2\2\u0120\u011d\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123+\3\2\2\2"+
		"\u0124\u0122\3\2\2\2\u0125\u012b\5\60\31\2\u0126\u0127\7*\2\2\u0127\u0128"+
		"\5*\26\2\u0128\u0129\7+\2\2\u0129\u012b\3\2\2\2\u012a\u0125\3\2\2\2\u012a"+
		"\u0126\3\2\2\2\u012b-\3\2\2\2\u012c\u012d\t\2\2\2\u012d/\3\2\2\2\u012e"+
		"\u0130\7&\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0132\t\3\2\2\u0132\61\3\2\2\2\u0133\u0134\7\5\2\2\u0134\u0135"+
		"\7*\2\2\u0135\u0136\7\65\2\2\u0136\u0137\7+\2\2\u0137\u0138\7 \2\2\u0138"+
		"\63\3\2\2\2\u0139\u013a\7\6\2\2\u013a\u013b\7*\2\2\u013b\u013c\5\66\34"+
		"\2\u013c\u013d\7+\2\2\u013d\u013e\7 \2\2\u013e\65\3\2\2\2\u013f\u0143"+
		"\5:\36\2\u0140\u0142\58\35\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\67\3\2\2\2\u0145\u0143\3\2\2"+
		"\2\u0146\u0147\7#\2\2\u0147\u0148\5:\36\2\u01489\3\2\2\2\u0149\u0152\7"+
		"\64\2\2\u014a\u0152\7\66\2\2\u014b\u0152\7\67\2\2\u014c\u0152\79\2\2\u014d"+
		"\u0152\78\2\2\u014e\u0152\5*\26\2\u014f\u0152\7\65\2\2\u0150\u0152\5&"+
		"\24\2\u0151\u0149\3\2\2\2\u0151\u014a\3\2\2\2\u0151\u014b\3\2\2\2\u0151"+
		"\u014c\3\2\2\2\u0151\u014d\3\2\2\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0150\3\2\2\2\u0152;\3\2\2\2\u0153\u0154\7\7\2\2\u0154\u0155"+
		"\5B\"\2\u0155\u0156\5> \2\u0156=\3\2\2\2\u0157\u0159\7\b\2\2\u0158\u015a"+
		"\5\6\4\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\5@!\2\u015e?\3\2\2\2\u015f"+
		"\u0161\7\n\2\2\u0160\u0162\5\6\4\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u015f\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\7\t"+
		"\2\2\u0168A\3\2\2\2\u0169\u016a\7*\2\2\u016a\u016b\5:\36\2\u016b\u016c"+
		"\5F$\2\u016c\u0172\5:\36\2\u016d\u016e\5D#\2\u016e\u016f\5:\36\2\u016f"+
		"\u0170\5F$\2\u0170\u0171\5:\36\2\u0171\u0173\3\2\2\2\u0172\u016d\3\2\2"+
		"\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7+\2\2\u0175C\3"+
		"\2\2\2\u0176\u0177\t\4\2\2\u0177E\3\2\2\2\u0178\u0179\t\5\2\2\u0179G\3"+
		"\2\2\2\u017a\u017b\7\13\2\2\u017b\u017c\5B\"\2\u017c\u017d\5J&\2\u017d"+
		"I\3\2\2\2\u017e\u0180\7\f\2\2\u017f\u0181\5\6\4\2\u0180\u017f\3\2\2\2"+
		"\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0185\7\r\2\2\u0185K\3\2\2\2\u0186\u0188\7\f\2\2\u0187"+
		"\u0189\5\6\4\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2"+
		"\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\5N(\2\u018dM"+
		"\3\2\2\2\u018e\u018f\7\13\2\2\u018f\u0190\5B\"\2\u0190\u0191\7 \2\2\u0191"+
		"O\3\2\2\2\u0192\u0193\7\16\2\2\u0193\u0194\5X-\2\u0194\u0195\5R*\2\u0195"+
		"Q\3\2\2\2\u0196\u0198\7\f\2\2\u0197\u0199\5\6\4\2\u0198\u0197\3\2\2\2"+
		"\u0199\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\u019e\7\17\2\2\u019d\u019f\5T+\2\u019e\u019d\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019fS\3\2\2\2\u01a0\u01a1\7\16\2\2\u01a1\u01a2\5\\/\2"+
		"\u01a2\u01a3\5V,\2\u01a3U\3\2\2\2\u01a4\u01a6\7\f\2\2\u01a5\u01a7\5\6"+
		"\4\2\u01a6\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\7\17\2\2\u01abW\3\2\2\2"+
		"\u01ac\u01ad\7*\2\2\u01ad\u01ae\7\34\2\2\u01ae\u01af\7\65\2\2\u01af\u01b0"+
		"\7\"\2\2\u01b0\u01b1\7\66\2\2\u01b1\u01b2\7 \2\2\u01b2\u01b3\5^\60\2\u01b3"+
		"\u01b4\5Z.\2\u01b4Y\3\2\2\2\u01b5\u01b6\7 \2\2\u01b6\u01b7\5d\63\2\u01b7"+
		"\u01b8\7+\2\2\u01b8[\3\2\2\2\u01b9\u01ba\7*\2\2\u01ba\u01bb\7\65\2\2\u01bb"+
		"\u01bc\7\"\2\2\u01bc\u01bd\7\66\2\2\u01bd\u01be\7 \2\2\u01be\u01bf\5^"+
		"\60\2\u01bf\u01c0\5Z.\2\u01c0]\3\2\2\2\u01c1\u01c2\7\65\2\2\u01c2\u01c3"+
		"\5f\64\2\u01c3\u01c5\5d\63\2\u01c4\u01c6\5`\61\2\u01c5\u01c4\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6_\3\2\2\2\u01c7\u01c8\5D#\2\u01c8\u01c9\5b\62\2\u01c9"+
		"a\3\2\2\2\u01ca\u01cb\7\65\2\2\u01cb\u01cc\5f\64\2\u01cc\u01cd\5d\63\2"+
		"\u01cdc\3\2\2\2\u01ce\u01cf\t\6\2\2\u01cfe\3\2\2\2\u01d0\u01d1\t\7\2\2"+
		"\u01d1g\3\2\2\2\u01d2\u01d3\7\20\2\2\u01d3\u01d4\7*\2\2\u01d4\u01d5\7"+
		"\65\2\2\u01d5\u01d6\7+\2\2\u01d6\u01d7\7\21\2\2\u01d7\u01d8\5j\66\2\u01d8"+
		"\u01d9\7\25\2\2\u01d9i\3\2\2\2\u01da\u01dc\5l\67\2\u01db\u01da\3\2\2\2"+
		"\u01dc\u01dd\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0"+
		"\3\2\2\2\u01df\u01e1\5n8\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e4\3\2\2\2\u01e2\u01e4\5n8\2\u01e3\u01db\3\2\2\2\u01e3\u01e2\3\2\2"+
		"\2\u01e4k\3\2\2\2\u01e5\u01e6\7\22\2\2\u01e6\u01e7\7\66\2\2\u01e7\u01e9"+
		"\7!\2\2\u01e8\u01ea\5\6\4\2\u01e9\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01ee\7\23"+
		"\2\2\u01ee\u01f0\7 \2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"m\3\2\2\2\u01f1\u01f2\7\24\2\2\u01f2\u01f6\7!\2\2\u01f3\u01f5\5\6\4\2"+
		"\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7o\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\7\26\2\2\u01fa"+
		"\u01fc\7\65\2\2\u01fb\u01fd\5\b\5\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe\3"+
		"\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0201\7\27\2\2\u0201q\3\2\2\2\u0202\u0203\7\30\2\2\u0203\u0204\5v<\2"+
		"\u0204\u0205\7\65\2\2\u0205\u0206\7*\2\2\u0206\u0207\5t;\2\u0207\u0208"+
		"\7+\2\2\u0208\u020a\7\f\2\2\u0209\u020b\5\6\4\2\u020a\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u020f\7\31\2\2\u020f\u0210\5:\36\2\u0210\u0211\7 \2\2\u0211"+
		"\u0212\7\32\2\2\u0212s\3\2\2\2\u0213\u0214\5v<\2\u0214\u0215\7\65\2\2"+
		"\u0215\u0217\3\2\2\2\u0216\u0213\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u021e"+
		"\3\2\2\2\u0218\u0219\7#\2\2\u0219\u021a\5v<\2\u021a\u021b\7\65\2\2\u021b"+
		"\u021d\3\2\2\2\u021c\u0218\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2"+
		"\2\2\u021e\u021f\3\2\2\2\u021fu\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222"+
		"\t\b\2\2\u0222w\3\2\2\2.z|\u0082\u0084\u008d\u009a\u00a4\u00b1\u00ba\u00c1"+
		"\u00ca\u00d1\u00de\u00eb\u00f5\u00fe\u0110\u0113\u0117\u0122\u012a\u012f"+
		"\u0143\u0151\u015b\u0163\u0165\u0172\u0182\u018a\u019a\u019e\u01a8\u01c5"+
		"\u01dd\u01e0\u01e3\u01eb\u01ef\u01f6\u01fe\u020c\u0216\u021e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}