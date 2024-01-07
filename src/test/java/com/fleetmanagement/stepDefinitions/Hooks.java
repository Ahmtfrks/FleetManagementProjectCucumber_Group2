package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

    @Before
    public void setUp(){
        Driver.getDriver().get("envLoginURL");
    }
        @After
    public void tearDown(Scenario scenario){
            if (scenario.isFailed()){

                final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot,"image/png","screenshot");
            }
        Driver.closeDriver();
        }
}
