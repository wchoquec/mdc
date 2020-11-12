package com.everis.base.pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.linio.com.pe/")
public class LinioPage extends PageObject{

    @FindBy(xpath = "//*[@id=\"navbar\"]/div/div[2]/div[3]/form/div/div/input")
    public WebElementFacade txtBuscador;

    @FindBy(xpath = "//*[@id=\"navbar\"]/div/div[2]/div[3]/form/div/div/div")
    public WebElementFacade btnBuscar;

    @FindBy(id = "catalogue-list-container")
    public WebElementFacade lblResultados;

    @FindBy(xpath = "//*[@id=\"catalogue-product-container\"]/div[1]/a/div[1]/figure/picture/img")
    public WebElementFacade primerElemento;

    @FindBy(id = "buy-now")
    public WebElementFacade btnAñadirCarrito;

    @FindBy(xpath = "//*[@id=\"alert-add-to-cart\"]/div/div/div[1]/div/h2[1]")
    public WebElementFacade lblMensaje;


}
