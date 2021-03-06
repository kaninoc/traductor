import grammar.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class Traductor extends PsiCoderBaseListener {

    public static String cadena = "";// contiene toda la traduccion que se muestra por consola ypor el archivo salida.txt
    public static int tabulaciones = 0;//espacios dependiendo de los metodos
    public static String tipovariable = "nulo";
    public static String tipovariablefuncion = "nulo";
    public static String parametros = "nulo";
    public static boolean impresion =false;
    public static String iterador = "nulo";
    public static boolean flagcase =true;
    public static boolean estructura =false;
    public static Queue<String> elementosestructura = new LinkedList<String>();//elementos de interfaz traduccion typescript
    public static Queue<String> idsestructura = new LinkedList<String>();//ids de interfaz traduccion typescript
    public static Queue<String> valores = new LinkedList<String>();//valores de interfaz traduccion typescript

    public String escribir(String token){//captura toda la traduccion en una cadena
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
        }


    }


    @Override public void exitF_principal(PsiCoderParser.F_principalContext ctx) {

        if(ctx.FFP()!=null){
            cadena += calculartab(tabulaciones) +"return null;\n" +"}\n";
            cadena+="funcion_principal();\n";
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
            if(!estructura) {
                if (tipovariable.equals("nulo")) {
                    cadena += calculartab(tabulaciones) + "let ";
                    tipovariable = "boolean";
                }
            }else{
                elementosestructura.add("boolean");
            }
        }
        if(ctx.ID() != null){
            if(!estructura) {
                cadena += ctx.ID().getText() + " : " + tipovariable;
            }else{
                idsestructura.add(ctx.ID().getText());
            }
        }

    }

    @Override public void exitVarBooleano(PsiCoderParser.VarBooleanoContext ctx) {

    }

    @Override public void enterExtvarB(PsiCoderParser.ExtvarBContext ctx) {

        if (ctx.TK_ASIG()!=null){
            if(!estructura) {
                cadena += " " + ctx.TK_ASIG().getText() + " ";
            }
        }
        if (ctx.TK_BOOLEANO()!=null){
            if(!estructura) {
                if (ctx.TK_BOOLEANO().getText().equals("verdadero")) {
                    cadena += "true";
                } else if (ctx.TK_BOOLEANO().getText().equals("falso")) {
                    cadena += "false";
                }
            }else{
                if (ctx.TK_BOOLEANO().getText().equals("verdadero")) {
                    valores.add("true");
                } else if (ctx.TK_BOOLEANO().getText().equals("falso")) {
                    valores.add("false");
                }
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
            if(!estructura) {
                cadena += ctx.TK_PYC().getText() + "\n";
                tipovariable = "nulo";
            }
        }
    }

    @Override public void enterVarEntero(PsiCoderParser.VarEnteroContext ctx) {

        if(ctx.ENTERO() != null){
            if(!estructura) {
                if (tipovariable.equals("nulo")) {
                    cadena += calculartab(tabulaciones) + "let ";
                    tipovariable = "number";
                }
            }else{
                elementosestructura.add("number");
            }
        }

        if(ctx.ID() != null){
            if(!estructura) {
                cadena += ctx.ID().getText() + " : " + tipovariable;
            }else{
                idsestructura.add(ctx.ID().getText());
            }
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
            if(!estructura) {
                cadena += " " + ctx.TK_ASIG().getText() + " ";
            }
        }
        if (ctx.TK_ENTERO() != null) {
            if(!estructura) {
                cadena += ctx.TK_ENTERO().getText();
            }else {
                valores.add(ctx.TK_ENTERO().getText());
            }
        }
        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }


    }

    @Override public void exitExtvarE(PsiCoderParser.ExtvarEContext ctx) {
        if (ctx.TK_PYC()!=null){
            if(!estructura) {
                cadena += ctx.TK_PYC().getText() + "\n";
                tipovariable = "nulo";
            }
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVarReal(PsiCoderParser.VarRealContext ctx) {

        if(ctx.REAL() != null){
            if(!estructura) {
                if (tipovariable.equals("nulo")) {
                    cadena += calculartab(tabulaciones) + "let ";
                    tipovariable = "number";
                }
            }else{
                elementosestructura.add("number");
            }
        }

        if(ctx.ID() != null){
            if(!estructura) {
                cadena += ctx.ID().getText() + " : " + tipovariable;
            }else{
                idsestructura.add(ctx.ID().getText());
            }
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
            if(!estructura) {
                cadena += " " + ctx.TK_ASIG().getText() + " ";
            }
        }
        if (ctx.TK_REAL()!=null){
            if(!estructura) {
                cadena += ctx.TK_REAL().getText();
            }else{
                valores.add(ctx.TK_REAL().getText());
            }
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
            if(!estructura) {
                cadena += ctx.TK_PYC().getText() + "\n";
                tipovariable = "nulo";
            }
        }

    }

    @Override public void enterVarCaracter(PsiCoderParser.VarCaracterContext ctx) {

        if(ctx.CARACTER() != null){
            if(!estructura) {
                if (tipovariable.equals("nulo")) {
                    cadena += calculartab(tabulaciones) + "let ";
                    tipovariable = "string";
                }
            }else{
                elementosestructura.add("string");
            }
        }

        if(ctx.ID() != null){
            if(!estructura) {
                cadena += ctx.ID().getText() + " : " + tipovariable;
            }else{
                idsestructura.add(ctx.ID().getText());
            }
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
            if(!estructura) {
                cadena += " " + ctx.TK_ASIG().getText() + " ";
            }
        }
        if (ctx.TK_CARACTER()!=null){
            if(!estructura) {
                cadena += ctx.TK_CARACTER().getText();
            }else{
                valores.add(ctx.TK_CARACTER().getText());
            }
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
            if(!estructura) {
                cadena += ctx.TK_PYC().getText() + "\n";
                tipovariable = "nulo";
            }
        }
    }

    @Override public void enterVarCadena(PsiCoderParser.VarCadenaContext ctx) {

        if(ctx.CADENA() != null){
            if(!estructura) {
                if (tipovariable.equals("nulo")) {
                    cadena += calculartab(tabulaciones) + "let ";
                    tipovariable = "string";
                }
            }else{
                elementosestructura.add("string");
            }
        }
        if(ctx.ID() != null){
            if(!estructura) {
                cadena += ctx.ID().getText() + " : " + tipovariable;
            }else{
                idsestructura.add(ctx.ID().getText());
            }
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
            if(!estructura) {
                cadena += " " + ctx.TK_ASIG().getText() + " ";
            }
        }
        if (ctx.TK_CADENA()!=null){
            if(!estructura) {
                cadena += ctx.TK_CADENA().getText();
            }else{
                valores.add(ctx.TK_CADENA().getText());
            }
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
            if(!estructura) {
                cadena += ctx.TK_PYC().getText() + "\n";
                tipovariable = "nulo";
            }
        }
    }

    @Override public void enterVarEstructura(PsiCoderParser.VarEstructuraContext ctx) {

        if(ctx.ID() != null){
            if(!estructura) {
                if (tipovariable.equals("nulo")) {
                    cadena += calculartab(tabulaciones)+"let "+ctx.ID(1).getText()+" = "+ctx.ID(0).getText();
                }
            }else{
                elementosestructura.add(ctx.ID(0).getText());
                idsestructura.add(ctx.ID(1).getText());
            }
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
            if(!estructura) {
                cadena += ctx.TK_PYC().getText() + "\n";
                tipovariable = "nulo";
            }
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
            if (impresion==false){
                cadena+=calculartab(tabulaciones)+ ctx.ID().getText();
            }else{
                cadena+=ctx.ID().getText();
            }

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


    @Override public void enterLectura(PsiCoderParser.LecturaContext ctx) {
        if(ctx.TK_PAR_IZQ()!=null&&ctx.TK_PAR_DER()!=null) {
            if (ctx.ID() != null) {
                cadena += calculartab(tabulaciones) + "let " + ctx.ID().getText() + " = prompt()";
            }
        }
    }

    @Override public void exitLectura(PsiCoderParser.LecturaContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariable = "nulo";
        }
    }

    @Override public void enterImprimir(PsiCoderParser.ImprimirContext ctx) {
        if(ctx.TK_PAR_IZQ()!=null&&ctx.TK_PAR_DER()!=null) {
            if (ctx.IMPRIMIR() != null) {
                impresion=true;
                cadena += calculartab(tabulaciones) + "console.log(";
            }
        }

    }

    @Override public void exitImprimir(PsiCoderParser.ImprimirContext ctx) {
        if (ctx.TK_PAR_DER()!=null){
            cadena+=ctx.TK_PAR_DER().getText();
        }
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            impresion=false;
            tipovariable = "nulo";
        }

    }

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
    @Override public void enterRepeticionimpresion(PsiCoderParser.RepeticionimpresionContext ctx) {
        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
    }

    @Override public void exitRepeticionimpresion(PsiCoderParser.RepeticionimpresionContext ctx) {

    }
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
    @Override public void enterCondicional(PsiCoderParser.CondicionalContext ctx) {
        if (ctx.SI()!=null){
            cadena += calculartab(tabulaciones) + "if";
            tabulaciones+=1;
        }

    }

    @Override public void exitCondicional(PsiCoderParser.CondicionalContext ctx) {

    }
    @Override public void enterCuerpoif(PsiCoderParser.CuerpoifContext ctx) {
        if (ctx.ENTONCES()!=null){
            cadena+="{\n";
        }
    }

    @Override public void exitCuerpoif(PsiCoderParser.CuerpoifContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSino(PsiCoderParser.SinoContext ctx) {
        if (ctx.SI_NO()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones)+"}else{"+"\n";
            tabulaciones+=1;
        }

    }

    @Override public void exitSino(PsiCoderParser.SinoContext ctx) {
        if (ctx.FIN_SI()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones)+"}\n";
        }
    }


    @Override public void enterOperacionlogica(PsiCoderParser.OperacionlogicaContext ctx) {
        if (ctx.TK_PAR_IZQ()!=null){
            cadena += ctx.TK_PAR_IZQ().getText();
        }


    }

    @Override public void exitOperacionlogica(PsiCoderParser.OperacionlogicaContext ctx) {
        if (ctx.TK_PAR_DER()!=null){
            cadena += ctx.TK_PAR_DER().getText();
        }
    }

    @Override public void enterOperadorlogico(PsiCoderParser.OperadorlogicoContext ctx) {
        if (ctx.TK_O()!=null){
            cadena+=" "+ctx.TK_O().getText()+" ";
        }
        if (ctx.TK_Y()!=null){
            cadena+=" "+ctx.TK_Y().getText()+" ";
        }
    }

    @Override public void exitOperadorlogico(PsiCoderParser.OperadorlogicoContext ctx) {

    }

    @Override public void enterComparador(PsiCoderParser.ComparadorContext ctx) {
        if (ctx.TK_MENOR_IGUAL()!=null){
            cadena+=ctx.TK_MENOR_IGUAL().getText();
        }
        if (ctx.TK_MAYOR_IGUAL()!=null){
            cadena+=ctx.TK_MAYOR_IGUAL().getText();
        }
        if (ctx.TK_MENOR()!=null){
            cadena+=ctx.TK_MENOR().getText();
        }
        if (ctx.TK_MAYOR()!=null){
            cadena+=ctx.TK_MAYOR().getText();
        }
        if (ctx.TK_IGUAL()!=null){
            cadena+=ctx.TK_IGUAL().getText();
        }
        if (ctx.TK_DIF()!=null){
            cadena+=ctx.TK_DIF().getText();
        }
    }

    @Override public void exitComparador(PsiCoderParser.ComparadorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCiclomientras(PsiCoderParser.CiclomientrasContext ctx) {
        if (ctx.MIENTRAS()!=null){
            cadena+=calculartab(tabulaciones)+"while";
            tabulaciones+=1;
        }
    }

    @Override public void exitCiclomientras(PsiCoderParser.CiclomientrasContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCuerpociclomientras(PsiCoderParser.CuerpociclomientrasContext ctx) {
        if (ctx.HACER()!=null){
            cadena+="{\n";
        }
    }

    @Override public void exitCuerpociclomientras(PsiCoderParser.CuerpociclomientrasContext ctx) {
        if (ctx.FIN_MIENTRAS()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones)+"}\n";

        }
    }

    @Override public void enterCiclohacer(PsiCoderParser.CiclohacerContext ctx) {
        if (ctx.HACER()!=null){
            cadena+=calculartab(tabulaciones)+"do{\n";
            tabulaciones+=1;
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCiclohacer(PsiCoderParser.CiclohacerContext ctx) { }

    @Override public void enterCuerpociclohacer(PsiCoderParser.CuerpociclohacerContext ctx) {
        if (ctx.MIENTRAS()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones)+"}while";
        }
    }

    @Override public void exitCuerpociclohacer(PsiCoderParser.CuerpociclohacerContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCiclopara(PsiCoderParser.CicloparaContext ctx) {
        if (ctx.PARA()!=null){
            cadena += calculartab(tabulaciones) + "for";
            tabulaciones+=1;
        }

    }

    @Override public void exitCiclopara(PsiCoderParser.CicloparaContext ctx) {

    }
    @Override public void enterContenidopara(PsiCoderParser.ContenidoparaContext ctx) {
        if (ctx.HACER()!=null){
            cadena+="{\n";
        }
    }
    @Override public void exitContenidopara(PsiCoderParser.ContenidoparaContext ctx) {
        if (ctx.FIN_PARA()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones)+"}\n";

        }
    }
    @Override public void enterContparaopt(PsiCoderParser.ContparaoptContext ctx) {
        if (ctx.PARA()!=null){
            cadena += calculartab(tabulaciones) + "for";
            tabulaciones+=1;
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitContparaopt(PsiCoderParser.ContparaoptContext ctx) {

    }
    @Override public void enterContparaoptfinal(PsiCoderParser.ContparaoptfinalContext ctx) {
        if (ctx.HACER()!=null){
            cadena += "{\n";
        }
    }
    @Override public void exitContparaoptfinal(PsiCoderParser.ContparaoptfinalContext ctx) {
        if (ctx.FIN_PARA()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones)+"}\n";

        }
    }

    @Override public void enterElementospara(PsiCoderParser.ElementosparaContext ctx) {

        if (ctx.TK_PAR_IZQ()!=null){
            cadena += ctx.TK_PAR_IZQ().getText();
        }
        if (ctx.ENTERO()!=null){
            cadena += "let ";
        }
        if (ctx.ID()!=null){
            cadena += ctx.ID().getText();
            iterador =  ctx.ID().getText();
        }
        if (ctx.TK_ASIG()!=null){
            cadena +=" "+ctx.TK_ASIG().getText()+" ";
        }
        if (ctx.TK_ENTERO()!=null){
            cadena += ctx.TK_ENTERO().getText();
        }
        if (ctx.TK_PYC()!=null){
            cadena += ctx.TK_PYC().getText();
        }

    }

    @Override public void exitElementospara(PsiCoderParser.ElementosparaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterComplementopara(PsiCoderParser.ComplementoparaContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena += ctx.TK_PYC().getText();
        }
    }

    @Override public void exitComplementopara(PsiCoderParser.ComplementoparaContext ctx) {
        if (ctx.TK_PAR_DER()!=null){
            cadena += ctx.TK_PAR_DER().getText();
        }
    }

    @Override public void enterElementosparados(PsiCoderParser.ElementosparadosContext ctx) {
        if (ctx.TK_PAR_IZQ()!=null){
            cadena += ctx.TK_PAR_IZQ().getText();
        }
        if (ctx.ID()!=null){
            cadena += ctx.ID().getText();
            iterador =  ctx.ID().getText();
        }
        if (ctx.TK_ASIG()!=null){
            cadena +=" "+ctx.TK_ASIG().getText()+" ";
        }
        if (ctx.TK_ENTERO()!=null){
            cadena += ctx.TK_ENTERO().getText();
        }
        if (ctx.TK_PYC()!=null){
            cadena += ctx.TK_PYC().getText();
        }
    }

    @Override public void exitElementosparados(PsiCoderParser.ElementosparadosContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterComparadorpara(PsiCoderParser.ComparadorparaContext ctx) {
        if (ctx.ID()!=null){
            cadena += ctx.ID().getText();
        }
    }

    @Override public void exitComparadorpara(PsiCoderParser.ComparadorparaContext ctx) { }

    @Override public void enterSegundocomparador(PsiCoderParser.SegundocomparadorContext ctx) { }

    @Override public void exitSegundocomparador(PsiCoderParser.SegundocomparadorContext ctx) {

    }


    @Override public void enterSegcomfinal(PsiCoderParser.SegcomfinalContext ctx) {
        if (ctx.ID()!=null){
            cadena += ctx.ID().getText();
        }
    }

    @Override public void exitSegcomfinal(PsiCoderParser.SegcomfinalContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVarcomparable(PsiCoderParser.VarcomparableContext ctx) {
        if (ctx.TK_ENTERO()!=null){
            if (ctx.TK_ENTERO().getText().equals("1")) {
                cadena += iterador + "++";
            }else{
                cadena +=" += "+ctx.TK_ENTERO().getText();
            }
        }
        if (ctx.ID()!=null){
            cadena += ctx.ID().getText();
        }
    }

    @Override public void exitVarcomparable(PsiCoderParser.VarcomparableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCredec(PsiCoderParser.CredecContext ctx) {

        if (ctx.TK_MENOR_IGUAL()!=null){
            cadena+=" "+ctx.TK_MENOR_IGUAL().getText()+" ";
        }
        if (ctx.TK_MAYOR_IGUAL()!=null){
            cadena+=" "+ctx.TK_MAYOR_IGUAL().getText()+" ";
        }
        if (ctx.TK_MENOR()!=null){
            cadena+=" "+ctx.TK_MENOR().getText()+" ";
        }
        if (ctx.TK_MAYOR()!=null){
            cadena+=" "+ctx.TK_MAYOR().getText()+" ";
        }

    }
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
    @Override public void enterMultiple(PsiCoderParser.MultipleContext ctx) {
        if (ctx.SELECCIONAR()!=null){
            cadena+=calculartab(tabulaciones)+"switch";
            tabulaciones+=1;
        }
        if (ctx.TK_PAR_IZQ()!=null){
            cadena+=ctx.TK_PAR_IZQ().getText();
        }
        if (ctx.ID()!=null){
            cadena+=ctx.ID().getText();
        }
        if (ctx.TK_PAR_DER()!=null){
            cadena+=ctx.TK_PAR_DER().getText();
        }
        if (ctx.ENTRE()!=null){
            cadena+="{\n";
        }

    }

    @Override public void exitMultiple(PsiCoderParser.MultipleContext ctx) {
        if (ctx.FIN_SELECCIONAR()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones)+"}\n";
        }
    }

    @Override public void enterCasos(PsiCoderParser.CasosContext ctx) { }

    @Override public void exitCasos(PsiCoderParser.CasosContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMultiplescasos(PsiCoderParser.MultiplescasosContext ctx) {
        if (ctx.CASO()!=null){
            if (flagcase==true){
                cadena+=calculartab(tabulaciones)+"case";
                tabulaciones+=1;
                flagcase = false;
            }else{
                tabulaciones-=1;
                cadena+=calculartab(tabulaciones)+"case";
                tabulaciones+=1;
            }

        }
        if (ctx.TK_ENTERO()!=null){
            cadena+=" "+ctx.TK_ENTERO().getText()+" ";
        }
        if (ctx.TK_DOSP()!=null){
            cadena+=ctx.TK_DOSP().getText()+"\n";
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMultiplescasos(PsiCoderParser.MultiplescasosContext ctx) {
        if (ctx.ROMPER()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones) + "break";
            flagcase = true;
        }
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";

        }
    }

    @Override public void enterDefecto(PsiCoderParser.DefectoContext ctx) {

        if (ctx.DEFECTO()!=null){
            cadena+=calculartab(tabulaciones)+"default";
        }
        if (ctx.TK_DOSP()!=null){
            cadena+=ctx.TK_DOSP().getText()+"\n";
            tabulaciones+=1;
        }
    }

    @Override public void exitDefecto(PsiCoderParser.DefectoContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEstructuras(PsiCoderParser.EstructurasContext ctx) {
        if(ctx.ESTRUCTURA()!=null){
            cadena += "let ";
            tabulaciones+=1;
            estructura = true;
        }
        if(ctx.ID()!=null){
            cadena += ctx.ID().getText() + " :{\n";
        }

    }

    @Override public void exitEstructuras(PsiCoderParser.EstructurasContext ctx) {
        if (ctx.FIN_ESTRUCTURA()!=null){
            Queue<String> aux = new LinkedList<String>();
            aux.addAll(idsestructura);

            while(!elementosestructura.isEmpty()){
                cadena+=calculartab(tabulaciones)+idsestructura.remove()+" : "+elementosestructura.remove()+"\n";
            }

            tabulaciones-=1;
            cadena+="} = {\n";
            tabulaciones+=1;

            while(!valores.isEmpty()){
                cadena+=calculartab(tabulaciones)+aux.remove()+" : "+valores.remove()+",\n";
            }
            tabulaciones-=1;
            cadena+="}\n";
            estructura = false;
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDecfuncion(PsiCoderParser.DecfuncionContext ctx) {
        if (ctx.FUNCION()!=null){
            cadena+=calculartab(tabulaciones)+"function ";
            tabulaciones+=1;
        }
        if (ctx.ID()!=null){
            cadena+=ctx.ID().getText();
        }
        if (ctx.TK_PAR_IZQ() != null) {
            cadena+=ctx.TK_PAR_IZQ().getText();
        }

    }
    @Override public void enterCierredecfuncion(PsiCoderParser.CierredecfuncionContext ctx) {
        if(ctx.TK_PAR_DER()!=null){
            cadena+=ctx.TK_PAR_DER().getText();
        }
    }

    @Override public void exitCierredecfuncion(PsiCoderParser.CierredecfuncionContext ctx) { }


    @Override public void exitDecfuncion(PsiCoderParser.DecfuncionContext ctx) {

    }
    @Override public void enterCuerpodecfuncion(PsiCoderParser.CuerpodecfuncionContext ctx) {
        if (ctx.HACER()!=null){
            cadena+=" : "+tipovariablefuncion+" {\n";
        }

    }
    @Override public void exitCuerpodecfuncion(PsiCoderParser.CuerpodecfuncionContext ctx) {

    }
    @Override public void enterRetornar(PsiCoderParser.RetornarContext ctx) {
        if (ctx.RETORNAR()!=null){
            cadena+=calculartab(tabulaciones)+ "return ";
        }
    }

    @Override public void exitRetornar(PsiCoderParser.RetornarContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariablefuncion = "nulo";
        }
        if (ctx.FIN_FUNCION()!=null){
            cadena+="}\n";
            tabulaciones-=1;
            tipovariablefuncion = "nulo";
            parametros = "nulo";
        }

    }


    @Override public void enterParametros(PsiCoderParser.ParametrosContext ctx) {

    }

    @Override public void exitParametros(PsiCoderParser.ParametrosContext ctx) {

    }
    @Override public void enterComplementoparametros(PsiCoderParser.ComplementoparametrosContext ctx) {
        if (ctx.ID()!=null){
            cadena+=ctx.ID().getText()+" : "+parametros;
        }
    }

    @Override public void exitComplementoparametros(PsiCoderParser.ComplementoparametrosContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override public void enterMasparametros(PsiCoderParser.MasparametrosContext ctx) {
        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }

    }

    @Override public void exitMasparametros(PsiCoderParser.MasparametrosContext ctx) { }

    @Override public void enterNextid(PsiCoderParser.NextidContext ctx) {
        if (ctx.ID()!=null){
            cadena+=ctx.ID().getText()+" : "+parametros;
        }
    }

    @Override public void exitNextid(PsiCoderParser.NextidContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override public void enterTipofuncion(PsiCoderParser.TipofuncionContext ctx) {

    if (tipovariablefuncion.equals("nulo")){

        if (ctx.BOOLEANO()!=null){
            tipovariablefuncion = "boolean";
        }
        if (ctx.ENTERO()!=null){
            tipovariablefuncion = "number";
        }
        if (ctx.REAL()!=null){
            tipovariablefuncion = "number";
        }
        if (ctx.CARACTER()!=null){
            tipovariablefuncion = "string";
        }
        if (ctx.CADENA()!=null){
            tipovariablefuncion = "string";
        }
    }else{

        if (ctx.BOOLEANO()!=null){
            parametros="boolean";
        }
        if (ctx.ENTERO()!=null){
            parametros = "number";
        }
        if (ctx.REAL()!=null){
            parametros = "number";
        }
        if (ctx.CARACTER()!=null){
            parametros = "string";
        }
        if (ctx.CADENA()!=null){
            parametros = "string";
        }
    }

    }

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