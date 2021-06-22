import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;

public class Traductor extends PsiCoderBaseListener {

    public static String cadena = "";// contiene toda la traduccion que se muestra por consola ypor el archivo salida.txt
    public static int tabulaciones = 0;//espacios dependiendo de los metodos
    public static String tipovariable = "nulo";
    public String escribir(String token){
        cadena = cadena+token;
        return  cadena;
    }

    public String calculartab(int tab){
        String s = "";
        if (tab == 0){
            return "";
        }
        for (int i =0; i < tab;i++ ){
            s+="\t";
        }
        return s;
    }


    @Override public void enterF_principal(PsiCoderParser.F_principalContext ctx) {
        if(ctx.FP()!=null){
            cadena += "function funcion_principal(){\n";
            tabulaciones+=1;
            //System.out.print("function funcion_principal(){\n");
        }


    }


    @Override public void exitF_principal(PsiCoderParser.F_principalContext ctx) {
        //System.out.println("\nTraduccion realizada con exito");
        if(ctx.FFP()!=null){
            cadena += calculartab(tabulaciones) +"return null;\n" +"}";
            //System.out.print(calculartab(tabulaciones) +"return null;\n" +"}");
            tabulaciones-=1;
        }

    }



    @Override public void enterRaiz(PsiCoderParser.RaizContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitRaiz(PsiCoderParser.RaizContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override public void enterContenido(PsiCoderParser.ContenidoContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitContenido(PsiCoderParser.ContenidoContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDeclaracion(PsiCoderParser.DeclaracionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDeclaracion(PsiCoderParser.DeclaracionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVarBooleano(PsiCoderParser.VarBooleanoContext ctx) {
        if(ctx.BOOLEANO() != null){
            if (tipovariable == "nulo"){
                cadena += calculartab(tabulaciones)+"let ";
                tipovariable = "boolean";
            }
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }

    }

    @Override public void exitVarBooleano(PsiCoderParser.VarBooleanoContext ctx) {

    }

    @Override public void enterExtvarB(PsiCoderParser.ExtvarBContext ctx) {

        if (ctx.TK_ASIG()!=null){
            cadena+=" "+ctx.TK_ASIG().getText()+" ";
        }
        if (ctx.TK_BOOLEANO()!=null){
            if(ctx.TK_BOOLEANO().getText().equals("verdadero")){
                cadena+="true";
            }else  if(ctx.TK_BOOLEANO().getText().equals("falso")){
                cadena+="false";
            }

        }

        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }
    }

    @Override public void exitExtvarB(PsiCoderParser.ExtvarBContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariable = "nulo";
        }
    }

    @Override public void enterVarEntero(PsiCoderParser.VarEnteroContext ctx) {
        if(ctx.ENTERO() != null){
            if (tipovariable == "nulo"){
                cadena += calculartab(tabulaciones)+"let ";
                tipovariable = "number";
            }
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }
    }

    @Override public void exitVarEntero(PsiCoderParser.VarEnteroContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExtvarE(PsiCoderParser.ExtvarEContext ctx) {
        if (ctx.TK_ASIG()!=null){
            cadena+=" "+ctx.TK_ASIG().getText()+" ";
        }
        if (ctx.TK_ENTERO()!=null){
            cadena+=ctx.TK_ENTERO().getText();
        }

        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }


    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExtvarE(PsiCoderParser.ExtvarEContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariable = "nulo";
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVarReal(PsiCoderParser.VarRealContext ctx) {

        if(ctx.REAL() != null){
            if (tipovariable == "nulo"){
                cadena += calculartab(tabulaciones)+"let ";
                tipovariable = "number";
            }
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }

    }

    @Override public void exitVarReal(PsiCoderParser.VarRealContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExtvarR(PsiCoderParser.ExtvarRContext ctx) {

        if (ctx.TK_ASIG()!=null){
            cadena+=" "+ctx.TK_ASIG().getText()+" ";
        }
        if (ctx.TK_REAL()!=null){
            cadena+=ctx.TK_REAL().getText();
        }

        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }
    }

    @Override public void exitExtvarR(PsiCoderParser.ExtvarRContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariable = "nulo";
        }

    }

    @Override public void enterVarCaracter(PsiCoderParser.VarCaracterContext ctx) {
        if(ctx.CARACTER() != null){
            if (tipovariable == "nulo"){
                cadena += calculartab(tabulaciones)+"let ";
                tipovariable = "string";
            }
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }

    }

    @Override public void exitVarCaracter(PsiCoderParser.VarCaracterContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExtvarC(PsiCoderParser.ExtvarCContext ctx) {
        if (ctx.TK_ASIG()!=null){
            cadena+=" "+ctx.TK_ASIG().getText()+" ";
        }
        if (ctx.TK_CARACTER()!=null){
            cadena+=ctx.TK_CARACTER().getText();
        }

        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }
    }

    @Override public void exitExtvarC(PsiCoderParser.ExtvarCContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariable = "nulo";
        }
    }

    @Override public void enterVarCadena(PsiCoderParser.VarCadenaContext ctx) {
        if(ctx.CADENA() != null){
            if (tipovariable == "nulo"){
                cadena += calculartab(tabulaciones)+"let ";
                tipovariable = "string";
            }
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }
    }

    @Override public void exitVarCadena(PsiCoderParser.VarCadenaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExtvarS(PsiCoderParser.ExtvarSContext ctx) {
        if (ctx.TK_ASIG()!=null){
            cadena+=" "+ctx.TK_ASIG().getText()+" ";
        }
        if (ctx.TK_CADENA()!=null){
            cadena+=ctx.TK_CADENA().getText();
        }

        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }
    }

    @Override public void exitExtvarS(PsiCoderParser.ExtvarSContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariable = "nulo";
        }
    }

    @Override public void enterOperacion(PsiCoderParser.OperacionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitOperacion(PsiCoderParser.OperacionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpresion(PsiCoderParser.ExpresionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpresion(PsiCoderParser.ExpresionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterOperador(PsiCoderParser.OperadorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitOperador(PsiCoderParser.OperadorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTipovar(PsiCoderParser.TipovarContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTipovar(PsiCoderParser.TipovarContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLectura(PsiCoderParser.LecturaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLectura(PsiCoderParser.LecturaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterImprimir(PsiCoderParser.ImprimirContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitImprimir(PsiCoderParser.ImprimirContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterImpresion(PsiCoderParser.ImpresionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitImpresion(PsiCoderParser.ImpresionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVarimpresion(PsiCoderParser.VarimpresionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVarimpresion(PsiCoderParser.VarimpresionContext ctx) { }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitTerminal(TerminalNode node) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitErrorNode(ErrorNode node) { }

}
