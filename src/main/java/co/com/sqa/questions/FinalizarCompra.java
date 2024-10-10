package co.com.sqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TheValue;

import static co.com.sqa.userinterfaces.ComprasUserInterface.LBL_FINAL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class FinalizarCompra implements Question<Boolean>{

    private final String resultado;

    public FinalizarCompra(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(seeThat(
                TheValue.of(Text.of(LBL_FINAL).answeredBy(actor)).asString(),equalTo(resultado)
        ));
        return true;
    }

    public static FinalizarCompra con(String resultado){
        return new FinalizarCompra(resultado);
    }
}
