package co.com.sqa.tasks;

import co.com.sqa.userinterfaces.ComprasUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class SeleccionarProducto implements Task {
    private final String cantidad;
    private final String producto;

    public SeleccionarProducto(String cantidad, String producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ComprasUserInterface.IMG_PRODUCTO.of(producto)),
                Scroll.to(ComprasUserInterface.TXT_CANTIDAD),
                Enter.theValue(cantidad).into(ComprasUserInterface.TXT_CANTIDAD),
                Click.on(ComprasUserInterface.BTN_CARRITO)
                );


    }

    public static SeleccionarProducto withInformation(String cantidad,String producto){
        return Tasks.instrumented(SeleccionarProducto.class, cantidad, producto );
    }


}
