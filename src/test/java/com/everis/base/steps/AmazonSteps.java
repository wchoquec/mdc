package com.everis.base.steps;

import com.everis.base.pageobject.AmazonPage;
import net.thucydides.core.annotations.Managed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmazonSteps {

    @Managed(driver = "iexplorer")


    private static final Logger LOGGER = LoggerFactory.getLogger(AmazonSteps.class);
    private AmazonPage amazonPage;

    public static boolean isNumeric(String str) {
        try {
            @SuppressWarnings("unused")
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public void frameIntro(String sValor) {
        if (isNumeric(sValor)) {
            amazonPage.getDriver().switchTo().defaultContent();
            amazonPage.getDriver().switchTo().frame(0);
            int valor = Integer.parseInt(sValor);
            amazonPage.getDriver().switchTo().frame(valor);
        } else {
            amazonPage.getDriver().switchTo().frame(sValor);
        }
    }

    public void open(){
        amazonPage.open();
        LOGGER.info("abre la pagina de amazon");
    }
    public void clickEnCampoBusqueda(){
        LOGGER.info("doy click en campo busqueda");
        amazonPage.txtBusqueda.click();
    }
    public void escriboDato(String var){
        LOGGER.info("escribo dato de busqueda");
        amazonPage.txtBusqueda.sendKeys(var);
    }
    public void presionoBotonBusqueda(){
        LOGGER.info("presiono boton busqueda");
        amazonPage.btnLupa.click();
    }
    public void verificoResultado(){
        LOGGER.info("verifico resultado");
        amazonPage.resultados.waitUntilVisible();
        LOGGER.info(amazonPage.resultados.getText());
    }
    public void seleccionoPrimerElemento(){
        LOGGER.info("selecciono primer elemento");
        amazonPage.pirmerElemento.waitUntilVisible();
        amazonPage.pirmerElemento.click();
    }
    public void verificoNombre(){
        amazonPage.tituloProducto.waitUntilVisible();
        LOGGER.info("verifico nombre "+ amazonPage.tituloProducto.getText());
    }
    public void seleccionoMarca(String var){
        LOGGER.info("SELECCIONAMOS CHECK");
        if (var.equalsIgnoreCase(amazonPage.lblAOC.getText())){
            amazonPage.checkAOC.click();
        }else {
            amazonPage.checkHP.click();
        }
    }
}


