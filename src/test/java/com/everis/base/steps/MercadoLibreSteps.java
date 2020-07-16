package com.everis.base.steps;

import com.everis.base.pageobject.MercadoLibrePage;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jovallep
 */
public class MercadoLibreSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(MercadoLibreSteps.class);

    private MercadoLibrePage page;

    @Step
    public void crearCliente() {
        LOGGER.info("Ingresa la información del cliente");
        selectAccountCreation();
        writeName("Raul");
        writeApellido("Lopez");
        writeEmail("asd@hotmail.com");
        writePassword("123456");
    }

    public void open() {
        LOGGER.info("Abre la pagina web");
        page.open();
    }

    public void selectAccountCreation() {
        LOGGER.info("Selecciona el boton Crear Cuenta");
        page.btnCrearCuenta.click();
    }

    public void writeName(String var) {
        LOGGER.info("Escribe el Nombre");
        page.textoNombre.sendKeys(var);
        LOGGER.info("termino de escribir el nombre");
    }

    public void writeApellido(String var) {
        LOGGER.info("Escribe el Apellido");
        page.textoApellido.sendKeys(var);
        LOGGER.info("termino de escribir el apellido");
    }

    public void writeEmail(String var) {
        LOGGER.info("Escribe el Correo");
        page.textoCorreo.sendKeys(var);
        LOGGER.info("termino de escribir el email");
    }

    public void writePassword(String var) {
        LOGGER.info("Escribe el Password");
        page.textoClave.sendKeys(var);
        LOGGER.info("termino de escribir la clave");
    }

}
