package com.everis.base.stepDefinitions;

import com.everis.base.steps.LinioSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LinioSD {

    @Steps
    LinioSteps steps;

    @Given("abro la pagina de Linio")
    public void abroLaPaginaDeLinio() {
        steps.abrirPaginaLinio();
    }

    @When("ingreso el producto {string} a buscar")
    public void ingresoElDatoParaLaBusqueda(String var) {
        steps.ingresarDato(var);
    }

    @And("presiono boton buscar")
    public void presionoBotonBuscar() {
        steps.presionarBotonBuscar();
    }
    @Then("valido que exista resultados")
    public void validarResultados(){
        steps.validarResultados();
    }
    @When("selecciono el primer producto")
    public void seleccionoPrimerElemento(){
        steps.seleccionarPrimerElemento();
    }
    @And("selecciono el boton añadir al carrito")
    public void seleccionoBotonAñadirCarrito(){
        steps.seleccionarBotonAñadir();
    }
    @And("valido que se agregue")
    public void validarMensaje(){
        steps.validarMensaje();
    }

}
