package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.LoginPage;
import com.fleetmanagement.pages.VehicleContractsPage;
import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.ConfigurationReader;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class VehicleContractsPageStepDefinitions {
    LoginPage loginPage = new LoginPage();


    @When("the user logged in as {string}")
    public void theUserLoggedInAs(String userType) {
        String username = null;
        String password = null;
        switch (userType) {
            case "Truck Driver":
                username = ConfigurationReader.getProperty("driver_username");
                password = ConfigurationReader.getProperty("driver_password");
                break;
            case "Sales Manager":
                username = ConfigurationReader.getProperty("sales_manager_username");
                password = ConfigurationReader.getProperty("sales_manager_password");
                break;
            case "Store Manager":
                username = ConfigurationReader.getProperty("store_manager_username");
                password = ConfigurationReader.getProperty("store_manager_password");
                break;
        }

        loginPage.login(username, password);
        BrowserUtils.sleep(3);
        BrowserUtils.waitForPageToLoad(10);

    }


    @And("the user navigates to {string} to {string}")
    public void theUserNavigatesToTo(String tab, String module) {
        loginPage.navigateToModule(tab, module);
        BrowserUtils.sleep(3);
        BrowserUtils.waitForPageToLoad(3);

    }

    @Then("the user should be able to see the expected url as {string}")
    public void theUserShouldBeAbleToSeeTheExpectedUrlAs(String Url) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = Url;
        Assert.assertEquals("VERIFY URL IS NOT MATCHING AS EXPECTED", expectedUrl, actualUrl);

    }

    @And("the user should be able to see expected title as {string}")
    public void theUserShouldBeAbleToSeeExpectedTitleAs(String title) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = title;
        Assert.assertEquals("VERIFY TITLE IS NOT MATCHING AS EXPECTED", expectedTitle, actualTitle);
    }

    @Then("the user should be able to see message as {string}")
    public void theUserShouldBeAbleToSeeMessageAs(String errorMessage) {
        VehicleContractsPage vehicleContractsPage=new VehicleContractsPage();
        boolean displayed = vehicleContractsPage.errorMessage.isDisplayed();
        Assert.assertTrue(displayed);
    }
}

 
