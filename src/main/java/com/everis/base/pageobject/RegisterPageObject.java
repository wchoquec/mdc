package com.everis.base.pageobject;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jovallep
 */
@Component
@Getter
public class RegisterPageObject extends PageBase {

    @Autowired
    public RegisterPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/header/div/div[1]/nav[2]/a[1]")
    private WebElement crearCuenta;

    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/form/div[1]/div[1]/label")
    private WebElement nombreUsuario;

    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/form/div[1]/div[2]/label")
    private WebElement apellidoUsuario;

    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/form/div[1]/div[3]/div[1]/div/label")
    private WebElement emailUsuario;

    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/form/div[1]/div[3]/div[2]/label")
    private WebElement claveUsuario;

    @FindBy(xpath = "//*[@id=\"recaptcha-anchor\"]")
    private WebElement validarCaptcha;

    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/form/div[2]/button")
    private WebElement botonCrear;


}
