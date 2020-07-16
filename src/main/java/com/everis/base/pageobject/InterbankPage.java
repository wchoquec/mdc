package com.everis.base.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.google.com")
public class InterbankPage extends PageObject {

    @FindBy(xpath = "//input[@name=\"q\"]")
    public WebElementFacade txtBuscador;

    @FindBy(xpath = "//input[@href=\"btnK\"]")
    public WebElementFacade botonBuscar;

    @FindBy(xpath = "/html/body/header/div/div[3]/a")
    public WebElementFacade btnAperturaCuenta;

    @FindBy(xpath = "//*[@id=\"p_p_id_halconcuentasimple_WAR_halconcuentaportlet_\"]/div/div/div[1]/div/div/div[1]/div[1]/div/div/div/h1")
    public WebElementFacade lblAperturaCuenta;

    @FindBy(id = "ff_dniNumber")
    public WebElementFacade nroDni;

    @FindBy(id = "ff_emailAddress")
    public WebElementFacade txtCorreo;

    @FindBy(xpath = "//*[@id=\"ftr_selectTelephoneOperator_chosen\"]/div/a")
    public WebElementFacade cboOperador;

    @FindBy(xpath = "//*[@id=\"ftr_selectTelephoneOperator_chosen\"]/div/ul/li[2]")
    public WebElementFacade operadorClaro;

    @FindBy(xpath = "//*[@id=\"ftr_selectTelephoneOperator_chosen\"]/div/ul/li[3]")
    public WebElementFacade operadorEntel;

    @FindBy(xpath = "//*[@id=\"ftr_selectTelephoneOperator_chosen\"]/div/ul/li[4]")
    public WebElementFacade operadorMovistar;

    @FindBy(xpath = "//*[@id=\"ftr_selectTelephoneOperator_chosen\"]/div/ul/li[5]")
    public WebElementFacade operadorBitel;

    @FindBy(id = "ftr_cellphoneNumber")
    public WebElementFacade txtNumero;

    @FindBy(xpath = "//*[@id=\"frmCuentaPaso1\"]/div[1]/div[6]/div/button")
    public WebElementFacade btnSiguiente;

    @FindBy(xpath = "//*[@id=\"frmCuentaPaso1\"]/div[1]/div[2]/div/span")
    public WebElementFacade validacionCorreo;

    @FindBy(xpath = "//*[@id=\"frmCuentaPaso1\"]/div[1]/div[3]/div[2]/span")
    public WebElementFacade validacionNumero;


}
