import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        PsiCoderLexer lexer;

        if(args.length>0){
            lexer = new PsiCoderLexer(CharStreams.fromFileName(args[0]));
        }else{
            lexer = new PsiCoderLexer(CharStreams.fromStream(System.in));
        }

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        PsiCoderParser parser = new PsiCoderParser(tokens);

        ParseTree tree = parser.raiz();

        //objeto Walker

        ParseTreeWalker walker = new ParseTreeWalker();

        Traductor traductor = new Traductor();

        walker.walk(traductor, tree);
        String  s = traductor.escribir("");
        escribir(s);
    }

    public static void escribir(String tokens){
        File salida;
        FileWriter write;
        //BufferedReader breader;
        BufferedWriter bwriter;
        PrintWriter pwriter;

        try {
            salida = new File("output/salida.txt");
            write = new FileWriter(salida);
            bwriter = new BufferedWriter(write);
            pwriter =new PrintWriter(bwriter);

            pwriter.write(tokens);
            pwriter.close();
            bwriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
