package com.everis.base.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.amazon.com/")
public class AmazonPage extends PageObject {

    @FindBy(xpath = "//input[@name='field-keywords']")
    public WebElement txtBusqueda;

    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    public WebElementFacade btnLupa;

    @FindBy(xpath = "//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]")
    public WebElementFacade resultados2;

    @FindBy(xpath = "//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]")
    public WebElementFacade resultados;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[1]/div/div/span/a/div/img")
    public WebElementFacade pirmerElemento;

    @FindBy(id = "productTitle")
    public WebElementFacade tituloProducto;

    @FindBy(xpath = "//*[@id=\"p_89/AOC\"]/span/a/div/label/i")
    public WebElementFacade checkAOC;

    @FindBy(xpath = "//*[@id=\"p_89/AOC\"]/span/a/span")
    public WebElementFacade lblAOC;

    @FindBy(xpath = "//*[@id=\"p_89/HP\"]/span/a/div/label/i")
    public WebElementFacade checkHP;

}
