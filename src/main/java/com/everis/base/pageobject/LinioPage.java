package com.everis.base.pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.linio.com.pe/")
public class LinioPage extends PageObject {

    @FindBy(xpath = "/html/body/header/nav/div[2]/div[2]/div[3]/form/div/div/input")
    public WebElementFacade txtBuscador;

    @FindBy(xpath = "//*[@id=\"navbar\"]/div[2]/div[2]/div[3]/form/div/div/div/button")
    public WebElementFacade botonBuscar;

    @FindBy(xpath = "//*[@id=\"catalogue-product-container\"]/div[1]/a/div[1]/figure/picture/img")
    public WebElementFacade primerElemento;

    @FindBy(xpath = "//*[@id=\"buy-now\"]")
    public WebElementFacade botonCarrito;

    @FindBy(id = "buy-now")
    public WebElementFacade botonID;

}
