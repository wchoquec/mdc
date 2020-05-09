package com.everis.base.util.reporting;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

/**
 * @author jovallep
 */
public class CapturaHook {

    @Autowired
    private WebDriver webDriver;

    @After
    public void screenShot(Scenario scenario) {
        try {
            if (!scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png", UUID.randomUUID().toString());
            }
        } catch (WebDriverException ex) {
            System.out.println("Screenshot ERROR " + ex.getMessage());
        }
    }
}
