package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.VehiclesModelsPage;
import com.fleetmanagement.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.*;

public class VehiclesModelStepDefinitions {

    VehiclesModelsPage vehiclesModelsPage = new VehiclesModelsPage();


    @Then("User should sees options:")
    public void userShouldSeesOptions(List<String> expectedColumnNames) {
        vehiclesModelsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(vehiclesModelsPage.pageSubTitle,30);
        BrowserUtils.waitForClickablility(vehiclesModelsPage.btnCreateVehiclesModel,30);
        List<String> actualColumnNames = BrowserUtils.getElementsText(vehiclesModelsPage.tableColumnNames);
        actualColumnNames.removeIf(k->k.isBlank());
        Set<String> set=new LinkedHashSet<>(actualColumnNames);

        Assert.assertEquals(expectedColumnNames,new LinkedList<>(set));

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
