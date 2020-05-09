package com.everis.base.config.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author jovallep
 */
public class DriverFactory {

    public static WebDriver get(Browser browser) {
        if (browser.equals(Browser.chrome)) {
            String path = System.getProperty("user.dir");
            if (System.getProperty("os.name").equals("Mac OS X")) {
                System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/drivers/mac/chromedriver");
            } else {
                System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/drivers/windows/chromedriver.exe");
            }
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            return new ChromeDriver(options);
        }
        throw new IllegalArgumentException("Driver not fount" + browser);
    }
}