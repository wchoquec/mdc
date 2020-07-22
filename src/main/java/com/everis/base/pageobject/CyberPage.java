package com.everis.base.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.walmart.com/")
public class CyberPage extends PageObject {

    @FindBy(id = "global-search-input")
    public WebElementFacade txtBusqueda;

    @FindBy(xpath = "//*[@id=\"global-search-submit\"]/span")
    public WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"SearchContainer\"]/div/div[2]/div/div[1]/div")
    public WebElementFacade lblResultados;

    @FindBy(xpath = "//*[@id=\"Intel-Core-i5-0-processor_type\"]")
    public WebElementFacade checkI5;

    @FindBy(xpath = "//*[@id=\"ProcessorType\"]/div/div/div/label[1]/div/span")
    public WebElementFacade lblI5;

    @FindBy(xpath = "//*[@id=\"searchProductResult\"]/ul/li[2]/div/div[2]/div[5]/div/a/span")
    public WebElementFacade elemento;

    @FindBy(xpath = "//*[@id=\"Intel-Core-i7-1-processor_type\"]")
    public WebElementFacade checkI7;

    @FindBy(xpath = "//*[@id=\"ProcessorType\"]/div/div/div/label[2]/div/span")
    public WebElementFacade lblI7;

    @FindBy(xpath = "//*[@id=\"product-overview\"]/div/div[3]/div/h1")
    public WebElementFacade resultadoFinal;

    @FindBy(xpath = "//*[@id=\"add-on-atc-container\"]/div[2]/section/div[1]/div[3]/button/span/span")
    public WebElementFacade agregarCarrito;

    @FindBy(xpath = "//*[@id=\"header-cart-tooltip\"]")
    public WebElementFacade nroCarrito;

}
