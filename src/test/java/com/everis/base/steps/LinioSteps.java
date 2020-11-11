package com.everis.base.steps;

import com.everis.base.pageobject.LinioPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class LinioSteps {

    LinioPage page;
    private static final Logger logger = LoggerFactory.getLogger(LinioSteps.class);

    public void abrirPaginaLinio(){
        logger.info("abrimos Linio");
        page.open();
    }

    public void ingresarDato(String dato){
        page.txtBuscador.type(dato);
    }

    public void presionarBotonBuscar(){
        page.botonBuscar.click();
    }
    public void seleccionarPrimerElemento(){
        page.primerElemento.waitUntilVisible();
        page.primerElemento.click();
    }
    public void presionarBotonCarrito(){
        page.botonID.waitUntilVisible();
        page.botonID.click();
        page.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("success");
    }

}
