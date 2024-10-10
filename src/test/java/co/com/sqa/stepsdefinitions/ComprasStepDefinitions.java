package co.com.sqa.stepsdefinitions;

import co.com.sqa.questions.FinalizarCompra;
import co.com.sqa.tasks.SeleccionarProducto;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.TheValue;
import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class ComprasStepDefinitions {


    @When("realiza la compra de {string} con {string}")
    public void realizaLaCompraDeProductos(String producto, String cantidad) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProducto.withInformation(cantidad,producto));
    }
    @Then("valida valor a pagar")
    public void validaValorAPagar() {
    OnStage.theActorInTheSpotlight().should(seeThat(TheValue.of(OnStage.theActorInTheSpotlight().asksFor(FinalizarCompra.con("Finalizar compra"))).asBoolean(),equalTo(true)));
    }
}
