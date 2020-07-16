package com.everis.base.stepDefinitions;

import com.everis.base.steps.AmazonSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AmazonSD {

    @Steps
    AmazonSteps amazonSteps;

    @Given("se encuentra en la pagina de amazon")
    public void seEncuentraEnLaPaginaDeAmazon() {
        amazonSteps.open();
    }

    @When("doy click en el campo de busqueda")
    public void doyClickEnElCampoDeBusqueda() {
        amazonSteps.clickEnCampoBusqueda();
    }

    @And("escribo el dato {string}")
    public void escriboElDato(String var) {
        amazonSteps.escriboDato(var);
    }

    @And("presiono boton de busqueda")
    public void presionoBotonDeBusqueda() {
        amazonSteps.presionoBotonBusqueda();
    }

    @Then("verifico resultado")
    public void verificoResultado() {
        amazonSteps.verificoResultado();
    }
    @And("selecciono primer elemento")
    public void seleccionoPrimerElemento(){
        amazonSteps.seleccionoPrimerElemento();
    }
    @Then("verifico nombre")
    public void verificoNombre(){
        amazonSteps.verificoNombre();
    }
    @And("selecciono una marca {string}")
    public void seleccionoMarca(String var){
        amazonSteps.seleccionoMarca(var);
    }
}
