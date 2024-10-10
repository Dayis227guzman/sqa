package co.com.sqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ComprasUserInterface {

    public static Target IMG_PRODUCTO = Target.the("Imagen Producto Uno").locatedBy("//h2[contains(.,'{0}') ]");

    public static Target TXT_CANTIDAD = Target.the("Cantidad de productos").locatedBy("//input[contains(@id,'quantity')]");

    public static Target BTN_CARRITO = Target.the("Boton Añadir producto").locatedBy("//button[contains(.,'Añadir al carrito')]");

    public static Target LBL_FINAL = Target.the("Texto finalizar COmpra").locatedBy("//h1[contains(.,'Finalizar compra')]");



}
