package com.everis.base.stepDefinitions.tasks;

import com.everis.base.models.Usuario;
import com.everis.base.pageobject.RegisterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jovallep
 */
@Component
public class UsuarioRegistro {

    @Autowired
    private RegisterServices register;

    public void selecionaCrearCuenta() {
        register.clickCrearCuenta();
    }

    public void with(Usuario user) {

        register.ingresarNombre(user.getFirstName());
        register.ingresarApellido(user.getLastName());
        register.ingresarEmail(user.getEmail());
        register.ingresarClave(user.getClave());
    }


}
