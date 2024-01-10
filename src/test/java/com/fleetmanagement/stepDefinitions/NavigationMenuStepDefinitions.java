package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.VehicleOdameterPage;
import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.ConfigurationReader;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefinitions {
    @When("the user navigates {string} {string}")
    public void the_user_navigates(String tab, String module) {
        new VehicleOdameterPage().navigateToModule(tab,module);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNumber) {
        BrowserUtils.waitFor(2);
        VehicleOdameterPage vehicleOdameterPage = new VehicleOdameterPage();
        Integer actualNumber = Integer.parseInt(vehicleOdameterPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPageNumber,actualNumber);


    }

    @Then("the title contains {string}")
    public void theTitleContains(String title) {
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitleContains(title);
        Driver.closeDriver();
    }
}
