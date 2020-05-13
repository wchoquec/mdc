package com.everis.base.steps;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.equalTo;

import java.util.function.Consumer;

public class NetflixService {

    static private final String URL = "https://reqres.in/api/";

    @Step("usuarios suscritos:")
    public void listUser(int page) {
        SerenityRest.given().queryParam("page", page).get(URL + "users");
    }

    @Step("usuario suscrito:")
    public void getUSer(int user) {
        SerenityRest.given().pathParams("id", user).get(URL + "users/{id}");
    }

    public Consumer<ValidatableResponse> statusCode(int i) {
        return lastResponse -> lastResponse.statusCode(equalTo(i));
    }

    public Consumer<ValidatableResponse> bodyContent(String v) {
        return lastResponse -> lastResponse.statusCode(equalTo(v));
    }


}
