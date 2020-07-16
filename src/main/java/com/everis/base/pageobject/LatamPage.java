package com.everis.base.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.latam.com/es_pe/")
public class LatamPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"compra-select-origin\"]")
    public WebElementFacade xpathOrigen;

    @FindBy(id = "compra-select-origin")
    public WebElementFacade txtOrigen;

    @FindBy(xpath = "//*[@id=\"onesignal-popover-cancel-button\"]")
    public WebElementFacade popup;

    @FindBy(id = "compra-select-destination")
    public WebElementFacade txtDestino;

    @FindBy(xpath = "//*[@id=\"ui-id-5\"]/a")
    public WebElementFacade elementoOrigen;

    @FindBy(xpath = "//*[@id=\"ui-id-7\"]/a")
    public WebElementFacade elementoDestino;

    @FindBy(xpath = "//*[@id=\"tab-compra\"]/div/div/div/div/div/div/form/div/div[2]/div/div[1]/div/div/div/div[1]/div/div/div/div/div/fieldset/div/div[2]/label/span")
    public WebElementFacade rbIda;

    @FindBy(xpath = "//*[@id=\"tab-compra\"]/div/div/div/div/div/div/form/div/div[2]/div/div[2]/div[3]/div/div/button")
    public WebElementFacade btnBuscarVuelo;

}
