import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Locale;

public class traductor extends PsiCoderBaseListener {

    @Override
    public void enterRaiz(PsiCoderParser.RaizContext ctx) {
        if(ctx.f_principal().equals(null)){
            System.out.println();
        }
    }


}
