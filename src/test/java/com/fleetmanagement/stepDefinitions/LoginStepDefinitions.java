package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.LoginPage;
import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.ConfigurationReader;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginStepDefinitions {
    LoginPage loginPage= new LoginPage();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
    Driver.getDriver().get(ConfigurationReader.getProperty("envLoginURL"));
    }

    @When("the user enters Truck Driver information")
    public void theUserEntersTruckDriverInformation() {
        loginPage.login("user191","UserUser123");
        BrowserUtils.waitForInvisibilityOf(loginPage.loadingBar);


    }

    @Then("the user should see the dashboard")
    public void theUserShouldSeeTheDashboard() {
    BrowserUtils.verifyTitle(ConfigurationReader.getProperty("title"));
        Driver.closeDriver();
    }

    @When("the user enters Store Manager information")
    public void theUserEntersStoreManagerInformation() {
        loginPage.login("storemanager51","UserUser123");
        BrowserUtils.waitForInvisibilityOf(loginPage.loadingBar);
    }

    @When("the user enters Sales Manager information")
    public void theUserEntersSalesManagerInformation() {
        loginPage.login("salesmanager101","UserUser123");
        BrowserUtils.waitForInvisibilityOf(loginPage.loadingBar);
    }
}
