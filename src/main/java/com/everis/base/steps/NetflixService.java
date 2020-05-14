package com.everis.base.steps;

import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.hamcrest.Matchers.equalTo;

import java.util.function.Consumer;

public class NetflixService {

    private static final Logger logger = LoggerFactory.getLogger(NetflixService.class);

    static private final String URL = "https://reqres.in/api/";

    @Step("usuarios suscritos:")
    public void listUser(int page) {
        given().
                queryParam("page", page)
                .get(URL + "users");
    }

    @Step("usuario suscrito:")
    public void getUSer(int user) {
        given()
                .pathParams("id", user)
                .get(URL + "users/{id}");
    }

    public Consumer<ValidatableResponse> statusCode(int i) {
        return lastResponse -> lastResponse.statusCode(equalTo(i));
    }

    public Consumer<ValidatableResponse> bodyContent(String var) {
        logger.info("el correo obtenido es : " +
                lastResponse().body().path("data.email"));
        return lastResponse -> lastResponse.body("data.email", equalTo(var));
    }


}
