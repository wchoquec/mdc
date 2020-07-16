package com.everis.base.stepDefinitions;

import com.everis.base.steps.IbkSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class IbkSD {

    @Steps
    IbkSteps ibkSteps;

    @Given("que estoy en la web de ibk")
    public void queEstoyEnLaWebDeIbk() {
        ibkSteps.abrirPagina();
    }


    @When("selecciono opcion Abre tu cuenta")
    public void seleccionoOpcionAbreTuCuenta() {
        ibkSteps.seleccionoAbreTuCuenta();
    }

    @And("se muestra apertura de cuenta")
    public void seMuestraAperturaDeCuenta() {
        ibkSteps.verificarTextoAperturaCuenta();
    }

    @And("ingreso el dni {string}")
    public void ingresoElDni(String var) {
        ibkSteps.ingresoDni(var);
    }

    @And("ingreso el correo {string}")
    public void ingresoElCorreo(String var) {
        ibkSteps.ingresoCorreo(var);
    }

    @And("seleccionamos el operador {string}")
    public void seleccionamosElOperador(String var) {
        ibkSteps.seleccionamosOperador(var);
    }

    @And("ingreso el celular {string}")
    public void ingresoElCelular(String var) {
        ibkSteps.ingresoCelular(var);
    }

    @And("presiono boton siguiente")
    public void presionoBotonSiguiente() {
        ibkSteps.presionoBotonSiguiente();
    }

    @Then("valido resultado exitoso")
    public void validoResultadoExitoso() {
        ibkSteps.verificoResultado();
    }

    @Then("valido mensaje validacion")
    public void validoMensajeValidacion() {
        ibkSteps.verificarValidacion();
    }

    @When("ingreso texto {string}")
    public void ingresoTexto(String v) {
        ibkSteps.ingresarTexto(v);
    }
    @And("presiono boton Buscar")
    public void botonBuscar(){
        ibkSteps.botonBuscar();
    }
}
