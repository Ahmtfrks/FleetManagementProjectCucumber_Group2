package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.LoginPage;
import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.ConfigurationReader;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("envLoginURL"));
        BrowserUtils.waitForInvisibilityOf(loginPage.loadingBar);


    }

    @When("the user enters Truck Driver information")
    public void theUserEntersTruckDriverInformation() {
        loginPage.login("user191", "UserUser123");


    }

    @Then("the user should see the dashboard")
    public void theUserShouldSeeTheDashboard() {
        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(ConfigurationReader.getProperty("title"));
        Driver.closeDriver();
    }

    @When("the user enters Store Manager information")
    public void theUserEntersStoreManagerInformation() {
        loginPage.login("storemanager51", "UserUser123");

    }


    @When("the user enters Sales Manager information")
    public void theUserEntersSalesManagerInformation() {
        loginPage.login("salesmanager101", "UserUser123");

    }


//    TODO: fix the message as: "the user logins as {string}"
    @And("the user enters {string} information")
    public void theUserEntersInformation(String userType) {
        String username;
        String password;

//        tip: when you compare to objects, as best practice, always write constants object first.
        if ("Truck Driver".equals(userType)) {
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        } else if ("Sales Manager".equals(userType)) {
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        } else if ("Store Manager".equals(userType)) {
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        } else {
            throw new RuntimeException("Invalid User TYPE: " + userType); //todo ahmet
        }
        loginPage.login(username, password);

    }
}
