package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.ConfigurationReader;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.masterthought.cucumber.ReportBuilder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

/*
In this class we will be able to create "pre" and "post" condition
for ALL the SCENARIOS and even STEPS.
 */
public class Hooks {

    //import the @Before coming from io.cucumber.java
    @Before(order = 1)//TODO learn this
    public void setupMethod() {
        System.out.println("-----> @Before scenario");

        //Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //Driver.getDriver().get(ConfigurationReader.getProperty("envLoginURL"));
    }


    //@Before (value = "@login", order = 2 )
    public void login_scenario_before() {
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
    }

    /*
    @After will be executed automatically after EVERY scenario in the project.
     */
    @After
    public void teardownMethod(Scenario scenario) {
        System.out.println("-----> @After scenario");

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
            System.out.println("Failed screen is saved in target/" + ReportBuilder.BASE_DIRECTORY + "/embeddings/");
        }

        BrowserUtils.sleep(3);
        Driver.closeDriver();

    }

    //@BeforeStep
    public void setupStep() {
        System.out.println("-----> @BeforeSTEP : Running before each step!");
    }

    //@AfterStep
    public void teardownStep() {
        System.out.println("-----> @AfterSTEP : Running after each step!");
    }

}