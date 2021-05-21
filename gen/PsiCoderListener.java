// Generated from D:/Biblioteca/Documents/Lenguajes/traductor/grammar\PsiCoder.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by {@link PsiCoderParser#varimpresion}.
	 * @param ctx the parse tree
	 */
	void enterVarimpresion(PsiCoderParser.VarimpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#varimpresion}.
	 * @param ctx the parse tree
	 */
	void exitVarimpresion(PsiCoderParser.VarimpresionContext ctx);
}