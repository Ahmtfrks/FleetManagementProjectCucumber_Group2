package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.VehiclePage;
import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarInforStepDefinitions {
    VehiclePage vehiclePage= new VehiclePage();


//    @Then("the user should see options:")
//    public void theUserShouldSee(List<String> options) {
//        BrowserUtils.scrollToElement(vehiclePage.threeDotsFirst);
//        BrowserUtils.sleep(10);
//        vehiclePage.checkThreeDots(options);
//        for (WebElement eachIcon : vehiclePage.list_Icon) {
//            System.out.println(eachIcon);
//        }
//        System.out.println("vehiclePage.threeDots.getText() = " + vehiclePage.threeDots.getText());
//        Driver.closeDriver();
//
//    }
//

    @Then("the user should be able to see options as {string}")
    public void theUserShouldBeAbleToSeeOptionsAs(String options) {

        vehiclePage.waitUntilLoaderScreenDisappearForProgressBar();

        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(vehiclePage.threeDot).perform();

        BrowserUtils.sleep(3);

        String [] optionArray=options.split(",");
        List<String> strings= Arrays.stream(optionArray).map(k-> k.substring(0,1).toUpperCase()+k.substring(1)).collect(Collectors.toList());
        BrowserUtils.sleep(2);
        vehiclePage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForPageToLoad(20);
        BrowserUtils.sleep(5);
        vehiclePage.checkThreeDots(strings);
        BrowserUtils.sleep(2);
        Driver.closeDriver();
        BrowserUtils.sleep(2);
    }
}
