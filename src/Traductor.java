import java.io.*;

public class Traductor extends PsiCoderBaseListener {

    public static String cadena = "";
    public static int tabulaciones = 0;
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
            System.out.print("function funcion_principal(){\n");
        }
        if(ctx.FFP()!=null){
            cadena += calculartab(tabulaciones) +"return null;\n" +"}";
            System.out.print(calculartab(tabulaciones) +"return null;\n" +"}");
            tabulaciones-=1;
        }
        if(ctx.contenido()!=null){
            System.out.println("No hay contenido en la funcion principal");
        }

    }


    @Override public void exitF_principal(PsiCoderParser.F_principalContext ctx) { }

}
