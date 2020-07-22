package com.everis.base.steps;

import com.everis.base.pageobject.CyberPage;
import com.google.inject.internal.cglib.core.$Customizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CyberSteps {

    CyberPage cyberPage;

    private static final Logger logger = LoggerFactory.getLogger(CyberSteps.class);

    public void open(){
        cyberPage.open();
    }
    public void ingresoNombre(String var){
        cyberPage.txtBusqueda.click();
        cyberPage.txtBusqueda.type(var);
    }
    public void presionoBuscar(){
        cyberPage.btnBuscar.click();
    }
    public void validoResultado(){
        cyberPage.lblResultados.waitUntilVisible();
        logger.info(cyberPage.lblResultados.getText());
    }
    public void seleccionoMarca(String var){
        if(cyberPage.lblI5.getText().contains(var)){
            cyberPage.checkI5.click();
            logger.info(cyberPage.lblI5.getText());
        }else if(cyberPage.lblI7.getText().contains(var)){
            cyberPage.checkI7.click();
            logger.info(cyberPage.lblI7.getText());
        }else{
            logger.info("no existe procesador");
        }
    }
    public void seleccionoElemento(){
        cyberPage.elemento.waitUntilVisible();
        cyberPage.elemento.click();
    }
    public void validoIngreso(){
        logger.info("valido busqueda");
        cyberPage.resultadoFinal.waitUntilVisible();
        logger.info(cyberPage.resultadoFinal.getText());
    }
    public void addCart(){
        cyberPage.agregarCarrito.waitUntilVisible();
        cyberPage.agregarCarrito.click();
    }
    public void validateCart(){
        cyberPage.nroCarrito.waitUntilVisible();
        logger.info(cyberPage.nroCarrito.getText());
    }
}
