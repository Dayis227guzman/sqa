package co.com.sqa.stepsdefinitions;

import co.com.sqa.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {

    @Before
    public void inicializarActor(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Actor");
    }

    @Given("que el usuario se encuentra en la web")
    public void queElUsuarioSeEncuentraEnLaWeb() {
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(Driver.web().inToUrl("https://sanangel.com.co")));
    }

    @After
    public void closeProcess(){
        Driver.closeProcess();
    }
}
