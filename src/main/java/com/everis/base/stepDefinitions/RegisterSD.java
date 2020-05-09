package com.everis.base.stepDefinitions;

import com.everis.base.pageobject.RegisterServices;
import com.everis.base.stepDefinitions.tasks.NavigateTo;
import com.everis.base.config.driver.DriverConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author jovallep
 */
@ContextConfiguration(classes = DriverConfig.class)
public class RegisterSD {

    private static final Logger logger = LoggerFactory.getLogger(RegisterSD.class);

    @Autowired
    private NavigateTo navigate;

    /* @Autowired
     private UsuarioRegistro registro;
    */
    @Autowired
    private RegisterServices service;

    @Given("^que Cesar acceda a la web de Mercadolibre$")
    public void que_Cesar_acceda_a_la_web_de_Mercadolibre() {
        navigate.page();
    }

    @When("^selecciona crear cuenta$")
    public void selecciona_crear_cuenta() {
        /* registro.with(
                UsuarioBuilder
                        .unUsuario()
                        .conDefaulData()
                        .build());
        */
        //registro.selecionaCrearCuenta();ç
        service.clickCrearCuenta();
    }

    @And("^escribe nombre de usuario \"([^\"]*)\"$")
    public void escribe_nombre_de_usuario(String var) {
        logger.info("user name is : " + var);
        service.ingresarNombre(var);
    }

    @And("^escribe apellido de usuario \"([^\"]*)\"$")
    public void escribe_apellido_de_usuario(String var) {
        service.ingresarApellido(var);
    }

    @And("^escribe email de usuario \"([^\"]*)\"$")
    public void escribe_email_de_usuario(String var) {
        service.ingresarEmail(var);
    }

    @Then("^escribe clave de usuario \"([^\"]*)\"$")
    public void escribe_clave_de_usuario(String var) {
        service.ingresarClave(var);
        //assertThat(true).isEqualTo(true);
    }


}
