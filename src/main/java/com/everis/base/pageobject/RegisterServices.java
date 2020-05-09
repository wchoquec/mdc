package com.everis.base.pageobject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jovallep
 */
@Component
public class RegisterServices {

    @Autowired
    private RegisterPageObject registerPageObject;

    public void clickCrearCuenta() {
        this.registerPageObject.getCrearCuenta().click();
    }

    public void ingresarNombre(String ingresar) {
        this.registerPageObject.getNombreUsuario().sendKeys(ingresar);
    }

    public void ingresarApellido(String ingresar) {
        this.registerPageObject.getApellidoUsuario().sendKeys(ingresar);
    }

    public void ingresarEmail(String ingresar) {
        this.registerPageObject.getEmailUsuario().sendKeys(ingresar);
    }

    public void ingresarClave(String ingresar) {
        this.registerPageObject.getClaveUsuario().sendKeys(ingresar);
    }

    public void ingresarRegistroCompleto() {
        this.registerPageObject.getNombreUsuario().sendKeys("ingresar");
        this.registerPageObject.getApellidoUsuario().sendKeys("ingresar");
        this.registerPageObject.getEmailUsuario().sendKeys("ingresar");
        this.registerPageObject.getClaveUsuario().sendKeys("ingresar");
    }

}
