package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.DashboardPage;
import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.ConfigurationReader;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US_02_OroincDocumentationPageStepDefinition {
    DashboardPage dashboardPage = new DashboardPage();


    @Given("the user is on the Dashboard page")
    public void the_user_is_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("US02_DashboardUrl"));
    }

    @Then("the user should see the dashboard page and Fleet Management bar")
    public void the_user_should_see_the_dashboard_page_and_fleet_management_bar() {
        BrowserUtils.verifyTitle(ConfigurationReader.getProperty("title"));
    }

    @Then("the user click the GetHelp button on the Fleet Management bar")
    public void the_user_click_the_get_help_button_on_the_fleet_management_bar() {
        BrowserUtils.sleep(4);
        //BrowserUtils.waitForPageToLoad(10);
        dashboardPage.getHelpButton.click();
    }

    @Then("the new browser tab is open")
    public void the_new_browser_tab_is_open() {
        for (String each : Driver.getDriver().getWindowHandles()) {

            Driver.getDriver().switchTo().window(each);
        }
    }

    @Then("the user should see the Oroinc Documentation page")
    public void the_user_should_see_the_oroinc_documentation_page() {
        BrowserUtils.verifyTitle(ConfigurationReader.getProperty("title_US02"));
        Driver.closeDriver();
    }


}
