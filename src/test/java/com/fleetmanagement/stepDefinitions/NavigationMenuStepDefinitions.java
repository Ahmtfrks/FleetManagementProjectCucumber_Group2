package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.VehicleOdometerPage;
import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefinitions {

    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();

    @When("the user navigates {string} {string}")
    public void the_user_navigates(String tab, String module) {
        vehicleOdometerPage.navigateToModule(tab, module);
    }


    @Then("the title contains {string}")
    public void theTitleContains(String title) {
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitleContains(title);
        Driver.closeDriver();
    }
}
