package com.everis.base.steps;

import com.everis.base.pageobject.InterbankPage;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IbkSteps {

    InterbankPage interbankPage;
    private static final Logger logger = LoggerFactory.getLogger(LinioSteps.class);

    @Step
    public void abrirPagina(){
        interbankPage.open();
    }

    @Step
    public void seleccionoAbreTuCuenta(){
        interbankPage.btnAperturaCuenta.click();
    }

    @Step
    public void verificarTextoAperturaCuenta(){
        interbankPage.lblAperturaCuenta.waitUntilVisible();
    }

    @Step
    public void ingresoDni(String var){
        interbankPage.nroDni.type(var);
    }
    @Step
    public void ingresoCorreo(String var){
        interbankPage.txtCorreo.type(var);

    }
    @Step
    public void seleccionamosOperador(String var){
        interbankPage.cboOperador.click();

        if (var.equalsIgnoreCase("CLARO")){
            interbankPage.operadorClaro.click();
        }else if(var.equalsIgnoreCase("ENTEL")){
            interbankPage.operadorEntel.click();
        }else if(var.equalsIgnoreCase("MOVISTAR")){
            interbankPage.operadorMovistar.click();
        }else if(var.equalsIgnoreCase("BITEL")){
            interbankPage.operadorBitel.click();
        }else{
            logger.info("no existe operador");
        }

    }
    @Step
    public void ingresoCelular(String var){
           interbankPage.txtNumero.type(var);
    }
    @Step
    public void presionoBotonSiguiente(){
        interbankPage.btnSiguiente.click();
    }
    @Step
    public void verificoResultado(){
        logger.info("resultado exitoso");
    }

    @Step
    public void verificarValidacion(){
        interbankPage.validacionCorreo.waitUntilVisible();
        if(interbankPage.validacionCorreo.getText().length()>0){
            logger.info(interbankPage.validacionCorreo.getText());
        }
        interbankPage.validacionNumero.waitUntilVisible();
        if(interbankPage.validacionNumero.getText().length()>0){
            logger.info(interbankPage.validacionNumero.getText());
        }
    }

    @Step
    public void ingresarTexto(String v){
        interbankPage.txtBuscador.click();
        interbankPage.txtBuscador.type(v);
    }
    @Step
    public void botonBuscar(){
        interbankPage.botonBuscar.click();
    }

}
