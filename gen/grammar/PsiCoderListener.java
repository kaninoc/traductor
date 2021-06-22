// Generated from C:/Users/Albert/Documents/lenguajes/traductor/grammar\PsiCoder.g4 by ANTLR 4.9.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PsiCoderParser}.
 */
public interface PsiCoderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#raiz}.
	 * @param ctx the parse tree
	 */
	void enterRaiz(PsiCoderParser.RaizContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#raiz}.
	 * @param ctx the parse tree
	 */
	void exitRaiz(PsiCoderParser.RaizContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#f_principal}.
	 * @param ctx the parse tree
	 */
	void enterF_principal(PsiCoderParser.F_principalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#f_principal}.
	 * @param ctx the parse tree
	 */
	void exitF_principal(PsiCoderParser.F_principalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#contenido}.
	 * @param ctx the parse tree
	 */
	void enterContenido(PsiCoderParser.ContenidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#contenido}.
	 * @param ctx the parse tree
	 */
	void exitContenido(PsiCoderParser.ContenidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(PsiCoderParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(PsiCoderParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#varBooleano}.
	 * @param ctx the parse tree
	 */
	void enterVarBooleano(PsiCoderParser.VarBooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#varBooleano}.
	 * @param ctx the parse tree
	 */
	void exitVarBooleano(PsiCoderParser.VarBooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#extvarB}.
	 * @param ctx the parse tree
	 */
	void enterExtvarB(PsiCoderParser.ExtvarBContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#extvarB}.
	 * @param ctx the parse tree
	 */
	void exitExtvarB(PsiCoderParser.ExtvarBContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#varEntero}.
	 * @param ctx the parse tree
	 */
	void enterVarEntero(PsiCoderParser.VarEnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#varEntero}.
	 * @param ctx the parse tree
	 */
	void exitVarEntero(PsiCoderParser.VarEnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#extvarE}.
	 * @param ctx the parse tree
	 */
	void enterExtvarE(PsiCoderParser.ExtvarEContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#extvarE}.
	 * @param ctx the parse tree
	 */
	void exitExtvarE(PsiCoderParser.ExtvarEContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#varReal}.
	 * @param ctx the parse tree
	 */
	void enterVarReal(PsiCoderParser.VarRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#varReal}.
	 * @param ctx the parse tree
	 */
	void exitVarReal(PsiCoderParser.VarRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#extvarR}.
	 * @param ctx the parse tree
	 */
	void enterExtvarR(PsiCoderParser.ExtvarRContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#extvarR}.
	 * @param ctx the parse tree
	 */
	void exitExtvarR(PsiCoderParser.ExtvarRContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#varCaracter}.
	 * @param ctx the parse tree
	 */
	void enterVarCaracter(PsiCoderParser.VarCaracterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#varCaracter}.
	 * @param ctx the parse tree
	 */
	void exitVarCaracter(PsiCoderParser.VarCaracterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#extvarC}.
	 * @param ctx the parse tree
	 */
	void enterExtvarC(PsiCoderParser.ExtvarCContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#extvarC}.
	 * @param ctx the parse tree
	 */
	void exitExtvarC(PsiCoderParser.ExtvarCContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#varCadena}.
	 * @param ctx the parse tree
	 */
	void enterVarCadena(PsiCoderParser.VarCadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#varCadena}.
	 * @param ctx the parse tree
	 */
	void exitVarCadena(PsiCoderParser.VarCadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#extvarS}.
	 * @param ctx the parse tree
	 */
	void enterExtvarS(PsiCoderParser.ExtvarSContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#extvarS}.
	 * @param ctx the parse tree
	 */
	void exitExtvarS(PsiCoderParser.ExtvarSContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#varEstructura}.
	 * @param ctx the parse tree
	 */
	void enterVarEstructura(PsiCoderParser.VarEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#varEstructura}.
	 * @param ctx the parse tree
	 */
	void exitVarEstructura(PsiCoderParser.VarEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#extvarEstructura}.
	 * @param ctx the parse tree
	 */
	void enterExtvarEstructura(PsiCoderParser.ExtvarEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#extvarEstructura}.
	 * @param ctx the parse tree
	 */
	void exitExtvarEstructura(PsiCoderParser.ExtvarEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#varAsigEstructura}.
	 * @param ctx the parse tree
	 */
	void enterVarAsigEstructura(PsiCoderParser.VarAsigEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#varAsigEstructura}.
	 * @param ctx the parse tree
	 */
	void exitVarAsigEstructura(PsiCoderParser.VarAsigEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#varDeclarada}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarada(PsiCoderParser.VarDeclaradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#varDeclarada}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarada(PsiCoderParser.VarDeclaradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#asigfuncion}.
	 * @param ctx the parse tree
	 */
	void enterAsigfuncion(PsiCoderParser.AsigfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#asigfuncion}.
	 * @param ctx the parse tree
	 */
	void exitAsigfuncion(PsiCoderParser.AsigfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#repeticion}.
	 * @param ctx the parse tree
	 */
	void enterRepeticion(PsiCoderParser.RepeticionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#repeticion}.
	 * @param ctx the parse tree
	 */
	void exitRepeticion(PsiCoderParser.RepeticionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(PsiCoderParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(PsiCoderParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(PsiCoderParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(PsiCoderParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(PsiCoderParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(PsiCoderParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#tipovar}.
	 * @param ctx the parse tree
	 */
	void enterTipovar(PsiCoderParser.TipovarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#tipovar}.
	 * @param ctx the parse tree
	 */
	void exitTipovar(PsiCoderParser.TipovarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#lectura}.
	 * @param ctx the parse tree
	 */
	void enterLectura(PsiCoderParser.LecturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#lectura}.
	 * @param ctx the parse tree
	 */
	void exitLectura(PsiCoderParser.LecturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(PsiCoderParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(PsiCoderParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(PsiCoderParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(PsiCoderParser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#repeticionimpresion}.
	 * @param ctx the parse tree
	 */
	void enterRepeticionimpresion(PsiCoderParser.RepeticionimpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#repeticionimpresion}.
	 * @param ctx the parse tree
	 */
	void exitRepeticionimpresion(PsiCoderParser.RepeticionimpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#varimpresion}.
	 * @param ctx the parse tree
	 */
	void enterVarimpresion(PsiCoderParser.VarimpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#varimpresion}.
	 * @param ctx the parse tree
	 */
	void exitVarimpresion(PsiCoderParser.VarimpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(PsiCoderParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(PsiCoderParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#operacionlogica}.
	 * @param ctx the parse tree
	 */
	void enterOperacionlogica(PsiCoderParser.OperacionlogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#operacionlogica}.
	 * @param ctx the parse tree
	 */
	void exitOperacionlogica(PsiCoderParser.OperacionlogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#operadorlogico}.
	 * @param ctx the parse tree
	 */
	void enterOperadorlogico(PsiCoderParser.OperadorlogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#operadorlogico}.
	 * @param ctx the parse tree
	 */
	void exitOperadorlogico(PsiCoderParser.OperadorlogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#comparador}.
	 * @param ctx the parse tree
	 */
	void enterComparador(PsiCoderParser.ComparadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#comparador}.
	 * @param ctx the parse tree
	 */
	void exitComparador(PsiCoderParser.ComparadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#ciclomientras}.
	 * @param ctx the parse tree
	 */
	void enterCiclomientras(PsiCoderParser.CiclomientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#ciclomientras}.
	 * @param ctx the parse tree
	 */
	void exitCiclomientras(PsiCoderParser.CiclomientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#ciclohacer}.
	 * @param ctx the parse tree
	 */
	void enterCiclohacer(PsiCoderParser.CiclohacerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#ciclohacer}.
	 * @param ctx the parse tree
	 */
	void exitCiclohacer(PsiCoderParser.CiclohacerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#ciclopara}.
	 * @param ctx the parse tree
	 */
	void enterCiclopara(PsiCoderParser.CicloparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#ciclopara}.
	 * @param ctx the parse tree
	 */
	void exitCiclopara(PsiCoderParser.CicloparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#elementospara}.
	 * @param ctx the parse tree
	 */
	void enterElementospara(PsiCoderParser.ElementosparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#elementospara}.
	 * @param ctx the parse tree
	 */
	void exitElementospara(PsiCoderParser.ElementosparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#elementosparados}.
	 * @param ctx the parse tree
	 */
	void enterElementosparados(PsiCoderParser.ElementosparadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#elementosparados}.
	 * @param ctx the parse tree
	 */
	void exitElementosparados(PsiCoderParser.ElementosparadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#comparadorpara}.
	 * @param ctx the parse tree
	 */
	void enterComparadorpara(PsiCoderParser.ComparadorparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#comparadorpara}.
	 * @param ctx the parse tree
	 */
	void exitComparadorpara(PsiCoderParser.ComparadorparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#varcomparable}.
	 * @param ctx the parse tree
	 */
	void enterVarcomparable(PsiCoderParser.VarcomparableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#varcomparable}.
	 * @param ctx the parse tree
	 */
	void exitVarcomparable(PsiCoderParser.VarcomparableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#credec}.
	 * @param ctx the parse tree
	 */
	void enterCredec(PsiCoderParser.CredecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#credec}.
	 * @param ctx the parse tree
	 */
	void exitCredec(PsiCoderParser.CredecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#multiple}.
	 * @param ctx the parse tree
	 */
	void enterMultiple(PsiCoderParser.MultipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#multiple}.
	 * @param ctx the parse tree
	 */
	void exitMultiple(PsiCoderParser.MultipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasos(PsiCoderParser.CasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasos(PsiCoderParser.CasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#estructuras}.
	 * @param ctx the parse tree
	 */
	void enterEstructuras(PsiCoderParser.EstructurasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#estructuras}.
	 * @param ctx the parse tree
	 */
	void exitEstructuras(PsiCoderParser.EstructurasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#decfuncion}.
	 * @param ctx the parse tree
	 */
	void enterDecfuncion(PsiCoderParser.DecfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#decfuncion}.
	 * @param ctx the parse tree
	 */
	void exitDecfuncion(PsiCoderParser.DecfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(PsiCoderParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(PsiCoderParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#tipofuncion}.
	 * @param ctx the parse tree
	 */
	void enterTipofuncion(PsiCoderParser.TipofuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#tipofuncion}.
	 * @param ctx the parse tree
	 */
	void exitTipofuncion(PsiCoderParser.TipofuncionContext ctx);
}