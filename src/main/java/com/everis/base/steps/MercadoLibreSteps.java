package com.everis.base.steps;

import com.everis.base.pageobject.MercadoLibrePage;
import net.thucydides.core.annotations.Step;

/**
 * @author jovallep
 */
public class MercadoLibreSteps {

    private MercadoLibrePage page;

    @Step
    public void crearCliente() {
        selectAccountCreation();
        writeName("111");
        writeApellido("111");
        writeEmail("asd@asd.com");
        writePassword("123456");
    }

    public void open() {
        page.open();
    }

    public void selectAccountCreation() {
        page.btnCrearCuenta.click();
    }

    public void writeName(String var) {
        page.textoNombre.sendKeys(var);
    }

    public void writeApellido(String var) {
        page.textoApellido.sendKeys(var);
    }

    public void writeEmail(String var) {
        page.textoCorreo.sendKeys(var);
    }

    public void writePassword(String var) {
        page.textoClave.sendKeys(var);
    }


}
