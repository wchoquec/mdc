package com.everis.base.stepDefinitions;

import com.everis.base.steps.CyberSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CyberSD {

    @Steps
    CyberSteps cyberSteps;

    @Given("que estoy en la pagina de cyberWow")
    public void queEstoyEnLaPaginaDeCyberWow() {
        cyberSteps.open();
    }
    @When("ingreso un producto {string}")
    public void ingresoProducto(String var) {
        cyberSteps.ingresoNombre(var);
    }
    @And("presiono Buscar")
    public void presionoBuscar() {
        cyberSteps.presionoBuscar();
    }
    @Then("valido resultados")
    public void validoResultados() {
        cyberSteps.validoResultado();
    }
    @And("selecciono marca {string}")
    public void seleccionoMarca(String var) {
        cyberSteps.seleccionoMarca(var);
    }
    @And("selecciono segundo elemento")
    public void seleccionoElemento() {
        cyberSteps.seleccionoElemento();
    }
    @Then("valido busqueda")
    public void validoIngreso() {
        cyberSteps.validoIngreso();
    }
    @And("agregar al carrito")
    public void agregarAlCarrito() {
        cyberSteps.addCart();
    }
    @Then("validar la cantidad")
    public void validarCantidad() {
        cyberSteps.validateCart();
    }
}
