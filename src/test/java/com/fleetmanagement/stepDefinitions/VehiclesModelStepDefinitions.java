package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.VehiclesModelsPage;
import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VehiclesModelStepDefinitions {

    VehiclesModelsPage vehiclesModelsPage = new VehiclesModelsPage();


    @Then("User should sees options:")
    public void userShouldSeesOptions(List<String> expectedColumns) {
        BrowserUtils.sleep(3);

        boolean found = false;

        try {
            for (WebElement eachElement : vehiclesModelsPage.columnElements) {
                String actualEachModule = eachElement.getText();
                if (expectedColumns.contains(actualEachModule)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                throw new AssertionError("MODULE NAME NOT MATCHING AS EXPECTED");
            }
        } catch (Exception e) {
            // Hata yakalandığında buraya gelecek
            e.printStackTrace(); // Hatanın detaylarını yazdırabilirsiniz
        } finally {
            BrowserUtils.sleep(2);
            Driver.closeDriver();
        }
    }



    // List<WebElement> actualColumnElements = BrowserUtils.verifyElementDisplayed(vehiclesModelsPage.columnNames);


    // List<WebElement> actualColumnNames= vehiclesModelsPage.columnNames;

    //List<String> actualColumnNamesList = vehiclesModelsPage.columnNames;


    // Assert.assertEquals(expectedColumns, actualColumnNamesList);
    // Assert.assertEquals(expectedColumns,actualColumnNames);


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
