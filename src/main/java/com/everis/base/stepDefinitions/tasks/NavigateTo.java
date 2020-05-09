package com.everis.base.stepDefinitions.tasks;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jovallep
 */
@Component
public class NavigateTo {

    @Autowired
    private WebDriver webDriver;

    public void page() {
        this.webDriver.manage().window().maximize();
        this.webDriver.get("https://www.mercadolibre.com.pe/");
    }
}
