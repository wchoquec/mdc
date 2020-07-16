package com.everis.base.steps;

import com.everis.base.pageobject.LatamPage;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LatamSteps {

    private static final Logger logger = LoggerFactory.getLogger(LinioSteps.class);

    LatamPage latamPage;

    @Step
    public void open(){
        latamPage.open();
        latamPage.popup.click();
    }
    @Step
    public void ingresoCiudadOrigen(String var){
        latamPage.txtOrigen.click();
        latamPage.txtOrigen.type(var);
        latamPage.elementoOrigen.click();
    }
    @Step
    public void ingresoCiudadDestino(String var){
        latamPage.txtDestino.click();
        latamPage.txtDestino.type(var);
        latamPage.elementoDestino.click();
    }
    @Step
    public void seleccionoIda(){
        latamPage.rbIda.click();
    }
    @Step
    public void presionoBotonBuscar(){
        latamPage.btnBuscarVuelo.click();
    }
    @Step
    public void verificoResultados(){
        logger.info("la busqueda fue exitosa");
    }

}
