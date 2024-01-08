package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.LoginPage;
import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithDifParamStepDefinitions {

    LoginPage loginPage = new LoginPage();
    @When("the user logs in using {string} and {string}")
    public void theUserLogsInUsingAnd(String arg0, String arg1) {
//        loginPage.userName.sendKeys(arg0);
//        loginPage.password.sendKeys(arg1);
//        loginPage.loginButton.click();
        loginPage.login(arg0,arg1);
    }

    @Then("the user should be able to login")
    public void theUserShouldBeAbleToLogin() {
        BrowserUtils.sleep(10);
        String expectedTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Verify title",expectedTitle,"Dashboard");
    }

    @And("the title contains {string}")
    public void theTitleContains(String arg0) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("verify title contain Dashboard",actualTitle.contains(arg0));
        Driver.closeDriver();
    }


}
