package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.VehiclePage;
import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NavigationMenuStepDefinitions {
    VehiclePage vehiclePage = new VehiclePage();

    @And("the user navigates {string} {string}")
    public void theUserNavigates(String tab, String module) {
    vehiclePage.navigateToModule(tab,module);
    }

    @Then("the title contains {string}")
    public void theTitleContains(String title) {
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitleContains(title);
        Driver.closeDriver();

    }
}
