package com.everis.base.config.driver;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author jovallep
 */
@Configuration
@ComponentScan(basePackages = "com.everis.base")
@PropertySource("classpath:/application.properties")
public class DriverConfig {

    @Value("${driver.type}")
    private Browser driverType;

    @Bean(destroyMethod = "quit")
    public WebDriver webDriver() {
        return DriverFactory.get(driverType);
    }


}
