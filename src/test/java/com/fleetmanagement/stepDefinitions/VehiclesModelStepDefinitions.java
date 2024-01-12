package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.BasePage;
import com.fleetmanagement.pages.VehiclesModelsPage;
import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.handler.codec.compression.BrotliEncoder;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VehiclesModelStepDefinitions {

    VehiclesModelsPage vehiclesModelsPage = new VehiclesModelsPage();


    @Then("User should sees options:")
    public void userShouldSeesOptions(List<String> expectedColumns) {
        BrowserUtils.sleep(3);

        List<WebElement> actualColumnElements = vehiclesModelsPage.columnNames;


        // List<WebElement> actualColumnNames= vehiclesModelsPage.columnNames;

        //List<String> actualColumnNamesList = vehiclesModelsPage.columnNames;


        // Assert.assertEquals(expectedColumns, actualColumnNamesList);
        // Assert.assertEquals(expectedColumns,actualColumnNames);
        Driver.closeDriver();
    }


    @Then("User should sees  “You do not have permission to perform this action.” message on the screen")
    public void userShouldSeesYouDoNotHavePermissionToPerformThisActionMessageOnTheScreen() {
        Assert.assertTrue(vehiclesModelsPage.message.isDisplayed());
    }


    @And("User navigates to {string} to {string}")
    public void userNavigatesToTo(String tab, String module) {
        vehiclesModelsPage.navigateToModule(tab, module);
        BrowserUtils.sleep(3);
    }
}
