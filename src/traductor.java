import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Locale;

public class traductor extends PsiCoderBaseListener {
    @Override
    public void enterInicio(PsiCoderParser.InicioContext ctx) {
        System.out.println(ctx.getText().toLowerCase(Locale.ROOT));
        System.out.println("esto funciona");
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        System.out.print("saliendo del test");
    }
}
