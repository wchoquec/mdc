package com.everis.base.stepDefinitions;

import com.everis.base.steps.NetflixService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

/**
 * @author jovallep
 */
public class NetflixSD {

    private static final Logger logger = LoggerFactory.getLogger(NetflixSD.class);

    @Steps
    NetflixService netflixService;

    @Given("que la aplicación esta operativa")
    public void queLaAplicaciónEstaOperativa() {
        logger.info("Contexto de la Prueba");
    }

    @When("obtiene la lista: {int} de clientes suscritos")
    public void obtieneLaListaDeClientesSuscritos(int page) {
        netflixService.listUser(page);
    }

    @When("obtiene al cliente: {int} suscrito")
    public void obtieneAlClienteSuscrito(int user) {
        netflixService.getUSer(user);
    }

    @Then("valida que la respuesta es {int}")
    public void buscaAlCliente(int i) {

        restAssuredThat(netflixService.statusCode(i));
    }


    @Then("valida que el correo es {string}")
    public void validaQueElCorreoEs(String var) {
        restAssuredThat(netflixService.bodyContent(var));

    }
}
