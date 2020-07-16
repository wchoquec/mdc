package com.everis.base.stepDefinitions;

import com.everis.base.steps.LatamSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LatamSD {

    @Steps
    LatamSteps latamSteps;


    @Given("que estoy en la pagina de LATAM")
    public void queEstoyEnLaPaginaDeLATAM() {
        latamSteps.open();
    }


    @When("ingreso la ciudad de origen {string}")
    public void ingresoLaCiudadDeOrigen(String var) {
        latamSteps.ingresoCiudadOrigen(var);
    }

    @And("ingreso la ciudad de destino {string}")
    public void ingresoLaCiudadDeDestino(String var) {
        latamSteps.ingresoCiudadDestino(var);
    }

    @And("selecciono la opcion ida")
    public void seleccionoLaOpcionIda() {
        latamSteps.seleccionoIda();
    }

    @And("presiono boton Buscar Vuelo")
    public void presionoBotonBuscarVuelo() {
        latamSteps.presionoBotonBuscar();
    }

    @Then("verifico que muestre resultados")
    public void verificoQueMuestreResultados() {
        latamSteps.verificoResultados();
    }

}
