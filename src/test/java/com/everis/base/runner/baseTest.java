package com.everis.base.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * @author jovallep
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.everis.base",
        plugin = {"de.monochromata.cucumber.report.PrettyReports:target/cucumber",
                "pretty", "json:target/cucumber-reports/Cucumber.json"},
        strict = true)
public class baseTest {

    public static String ANSI_GREEN = "\u001B[32m";
    public static final String EVERIS_WELCOME =
            "-------------------------------------------------------------------------------------|\n" +
                    "-------------------------------------------------------------------------------------|\n" +
                    " ._______  __       ___ ._______  ______      __     ______       \n" +
                    " |   ____| \\  \\    /  / |  ____|  |   _  \\   |  |   /  ___|     \n" +
                    " |  |____   \\  \\  /  /  | |____   |  |_)  |  |  |  |   /          \n" +
                    " |  |____|   \\  \\/  /   |  ___|   |     /    |  |   \\  \\_         \n" +
                    " |  |____     \\ \\  /    | |____   |  |\\ \\__  |  |  __)   |       \n" +
                    " |_______|     \\__/     |_______| |__| \\___| |__| |_____/         \n" +
                    "                                                                       \n" +
                    "-------------------------------------------------------------------------------------|\n" +
                    "-------------------------------------------------------------------------------------|\n";


    @BeforeClass
    public static void messages() {
        System.out.println(ANSI_GREEN + EVERIS_WELCOME + ANSI_GREEN);
    }

    @AfterClass
    public static void message() {
        System.out.println(ANSI_GREEN + EVERIS_WELCOME + ANSI_GREEN);
    }

}
