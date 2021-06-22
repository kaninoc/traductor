import grammar.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Traductor extends PsiCoderBaseListener {

    public static String cadena = "";// contiene toda la traduccion que se muestra por consola ypor el archivo salida.txt
    public static int tabulaciones = 0;//espacios dependiendo de los metodos
    public static String tipovariable = "nulo";
    public String escribir(String token){
        cadena = cadena+token;
        return  cadena;
    }

    public String calculartab(int tab){
        if (tab == 0){
            return "";
        }
        return "\t".repeat(Math.max(0, tab));
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
            if (tipovariable.equals("nulo")){
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
            if (tipovariable.equals("nulo")){
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
            if (tipovariable.equals("nulo")){
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
            if (tipovariable.equals("nulo")){
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
            if (tipovariable.equals("nulo")){
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

    @Override public void enterVarEstructura(PsiCoderParser.VarEstructuraContext ctx) {

        if (ctx.ID()!=null){
            cadena += calculartab(tabulaciones)+"let "+ctx.ID(1).getText()+" = "+ctx.ID(0).getText();
        }

    }

    @Override public void exitVarEstructura(PsiCoderParser.VarEstructuraContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExtvarEstructura(PsiCoderParser.ExtvarEstructuraContext ctx) {

        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
        if(ctx.ID()!=null){
            cadena +=ctx.ID().getText()+" ";
        }

    }

    @Override public void exitExtvarEstructura(PsiCoderParser.ExtvarEstructuraContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariable = "nulo";
        }

    }

    @Override public void enterVarAsigEstructura(PsiCoderParser.VarAsigEstructuraContext ctx) {

        for (int i =0; i< ctx.children.size();i++) {

            if( i==0){
                cadena+=calculartab(tabulaciones)+ctx.children.get(i);
            }
            else if(ctx.children.get(i).getText().equals("=")){
                cadena+=" "+ctx.children.get(i)+" ";
                break;
            }else{
                cadena+=ctx.children.get(i);
            }

        }


    }

    @Override public void exitVarAsigEstructura(PsiCoderParser.VarAsigEstructuraContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariable = "nulo";
        }
    }

    @Override public void enterVarDeclarada(PsiCoderParser.VarDeclaradaContext ctx) {

        if (ctx.ID()!=null){
            cadena+=calculartab(tabulaciones)+ ctx.ID().getText();
        }
        if (ctx.TK_ASIG()!=null){
            cadena+=" "+ctx.TK_ASIG().getText()+" ";
        }

    }

    @Override public void exitVarDeclarada(PsiCoderParser.VarDeclaradaContext ctx) {

        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariable = "nulo";
        }
    }

    @Override public void enterAsigfuncion(PsiCoderParser.AsigfuncionContext ctx) {

        if (ctx.ID()!=null){
            cadena+=calculartab(tabulaciones)+ ctx.ID().getText();
        }
        if (ctx.TK_PAR_IZQ()!=null){
            cadena+=ctx.TK_PAR_IZQ().getText();
        }

    }

    @Override public void exitAsigfuncion(PsiCoderParser.AsigfuncionContext ctx) {
        //System.out.println(ctx.TK_COMA().size());

        if (ctx.TK_PAR_DER()!=null){
            cadena+=ctx.TK_PAR_DER().getText();
        }
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariable = "nulo";
        }

    }
    @Override public void enterRepeticion(PsiCoderParser.RepeticionContext ctx) {
        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText();
        }
    }

    @Override public void exitRepeticion(PsiCoderParser.RepeticionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

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
    @Override public void enterExpresion(PsiCoderParser.ExpresionContext ctx) {
        if (ctx.TK_PAR_IZQ()!=null){
            cadena+=ctx.TK_PAR_IZQ().getText()+" ";
        }

    }

    @Override public void exitExpresion(PsiCoderParser.ExpresionContext ctx) {
        if (ctx.TK_PAR_DER()!=null){
            cadena+=" "+ctx.TK_PAR_DER().getText();
        }
    }

    @Override public void enterOperador(PsiCoderParser.OperadorContext ctx) {

        if (ctx.TK_MAS()!=null){
            cadena+=" "+ctx.TK_MAS().getText()+" ";
        }
        if (ctx.TK_MENOS()!=null){
            cadena+=" "+ctx.TK_MENOS().getText()+" ";
        }
        if (ctx.TK_MULT()!=null){
            cadena+=" "+ctx.TK_MULT().getText()+" ";
        }
        if (ctx.TK_DIV()!=null){
            cadena+=" "+ctx.TK_DIV().getText()+" ";
        }
        if (ctx.TK_MOD()!=null){
            cadena+=" "+ctx.TK_MOD().getText()+" ";
        }
    }

    @Override public void exitOperador(PsiCoderParser.OperadorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTipovar(PsiCoderParser.TipovarContext ctx) {

        if (ctx.TK_MENOS()!=null){
            cadena+=ctx.TK_MENOS().getText();
        }

        if (ctx.TK_ENTERO()!=null){
            cadena+=ctx.TK_ENTERO().getText();
        }

        if (ctx.TK_REAL()!=null){
            cadena+=ctx.TK_REAL().getText();
        }

        if (ctx.ID()!=null){
            cadena+=ctx.ID().getText();
        }


    }

    @Override public void exitTipovar(PsiCoderParser.TipovarContext ctx) { }


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
    @Override public void enterVarimpresion(PsiCoderParser.VarimpresionContext ctx) {

        if (ctx.TK_BOOLEANO()!=null){
            if(ctx.TK_BOOLEANO().getText().equals("verdadero")){
                cadena+="true";
            }else  if(ctx.TK_BOOLEANO().getText().equals("falso")){
                cadena+="false";
            }

        }
        if (ctx.TK_ENTERO()!=null){
            cadena+=ctx.TK_ENTERO().getText();
        }

        if (ctx.TK_REAL()!=null){
            cadena+=ctx.TK_REAL().getText();
        }

        if (ctx.TK_CARACTER()!=null){
            cadena+=ctx.TK_CARACTER().getText();
        }

        if (ctx.TK_CADENA()!=null){
            cadena+=ctx.TK_CADENA().getText();
        }
        if (ctx.ID()!=null){
            cadena+=ctx.ID().getText();
        }

    }

    @Override public void exitVarimpresion(PsiCoderParser.VarimpresionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCondicional(PsiCoderParser.CondicionalContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCondicional(PsiCoderParser.CondicionalContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterOperacionlogica(PsiCoderParser.OperacionlogicaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitOperacionlogica(PsiCoderParser.OperacionlogicaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterOperadorlogico(PsiCoderParser.OperadorlogicoContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitOperadorlogico(PsiCoderParser.OperadorlogicoContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterComparador(PsiCoderParser.ComparadorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitComparador(PsiCoderParser.ComparadorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCiclomientras(PsiCoderParser.CiclomientrasContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCiclomientras(PsiCoderParser.CiclomientrasContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCiclohacer(PsiCoderParser.CiclohacerContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCiclohacer(PsiCoderParser.CiclohacerContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCiclopara(PsiCoderParser.CicloparaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCiclopara(PsiCoderParser.CicloparaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterElementospara(PsiCoderParser.ElementosparaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitElementospara(PsiCoderParser.ElementosparaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterElementosparados(PsiCoderParser.ElementosparadosContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitElementosparados(PsiCoderParser.ElementosparadosContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterComparadorpara(PsiCoderParser.ComparadorparaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitComparadorpara(PsiCoderParser.ComparadorparaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVarcomparable(PsiCoderParser.VarcomparableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVarcomparable(PsiCoderParser.VarcomparableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCredec(PsiCoderParser.CredecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCredec(PsiCoderParser.CredecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMultiple(PsiCoderParser.MultipleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMultiple(PsiCoderParser.MultipleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCasos(PsiCoderParser.CasosContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCasos(PsiCoderParser.CasosContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEstructuras(PsiCoderParser.EstructurasContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEstructuras(PsiCoderParser.EstructurasContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDecfuncion(PsiCoderParser.DecfuncionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDecfuncion(PsiCoderParser.DecfuncionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterParametros(PsiCoderParser.ParametrosContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitParametros(PsiCoderParser.ParametrosContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTipofuncion(PsiCoderParser.TipofuncionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTipofuncion(PsiCoderParser.TipofuncionContext ctx) { }

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