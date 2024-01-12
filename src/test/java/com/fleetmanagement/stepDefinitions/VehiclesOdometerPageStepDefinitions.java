package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.VehicleOdometerPage;
import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VehiclesOdometerPageStepDefinitions {
    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNumber) {
        BrowserUtils.waitFor(2);

        Integer actualNumber = Integer.parseInt(vehicleOdometerPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPageNumber, actualNumber);
    }

    @Then("default view per page number should be {int}")
    public void default_view_per_page_number_should_be(Integer expectedPageNumber) {
        BrowserUtils.waitFor(2);

        Integer actualNumber = Integer.parseInt(vehicleOdometerPage.pagePerViewNumber.getText());

        Assert.assertEquals(expectedPageNumber, actualNumber);


    }


    @Then("the user should be able to see below columns error message {string}")
    public void theUserShouldBeAbleToSeeBelowColumnsErrorMessage(String expectedErrorMessages) {


        BrowserUtils.sleep(2);


        BrowserUtils.verifyElementsDisplayed(vehicleOdometerPage.errorMessages);

        BrowserUtils.sleep(2);
        List<String> elementsText = vehicleOdometerPage.getElementsText(vehicleOdometerPage.errorMessages);

        for (String errorMessage : elementsText) {
            if (errorMessage.contains(expectedErrorMessages)) {
                Assert.assertEquals("ERROR MESSAGES NOT MATCHES AS EXPECTED", expectedErrorMessages, errorMessage);
                break;
            }
        }


    }
}

