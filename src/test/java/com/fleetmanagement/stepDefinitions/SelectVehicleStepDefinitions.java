package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.SelectVehiclePage;
import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectVehicleStepDefinitions {

    SelectVehiclePage selectVehiclePage = new SelectVehiclePage();

    @When("users navigates to {string} and {string} modules")
    public void users_navigates_to_and_modules(String tab, String module) {
        BrowserUtils.waitForPageToLoad(20);
        BrowserUtils.sleep(2);
        selectVehiclePage.navigateToModule(tab,module);
        BrowserUtils.sleep(2);
    }


    @Then("users should see all checkboxes as unchecked")
    public void users_should_see_all_checkboxes_as_unchecked() {

        for (WebElement eachCheckBoxes : selectVehiclePage.checkBoxes) {
            boolean isSelected = eachCheckBoxes.isSelected();
            Assert.assertFalse("ALL CHECK BOXES IS NOT UNCHECKED",isSelected);
        }

    }



    @And("Verify that users can check the first checkbox to select all the cars")
    public void verifyThatUsersCanCheckTheFirstCheckboxToSelectAllTheCars() {
        //selectVehiclePage.selectingAllCarsBtn.click();
        // BrowserUtils.selectCheckBox(selectVehiclePage.selectingAllCarsBtn,true);
        selectVehiclePage.waitUntilLoaderScreenDisappear();
        selectVehiclePage.selectingAllCarsBtn.click();
        BrowserUtils.sleep(2);
        for (WebElement eachCheckBoxes : selectVehiclePage.checkBoxes) {
            boolean isSelected = eachCheckBoxes.isSelected();
            Assert.assertTrue("ALL CHECK BOXES IS NOT UNCHECKED",isSelected);
            BrowserUtils.sleep(2);
        }
    }


    @Then("users can select any car")
    public void usersCanSelectAnyCar() {
        selectVehiclePage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(selectVehiclePage.selectAnyCar,20);
        selectVehiclePage.selectAnyCar.click();

        Assert.assertTrue("ONE OF THE CHECK BOXES IS NOT SELECTED",selectVehiclePage.selectAnyCar.isSelected());

    }
}
