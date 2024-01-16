package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.ActivitiesPage;
import com.fleetmanagement.pages.CalenderEvent;
import com.fleetmanagement.pages.LoginPage;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class US_08_CalenderEventStepDefination {

    LoginPage loginPage = new LoginPage();

    @When("user is on Fleet Management home page")
    public void user_is_on_fleet_management_home_page() {
        Driver.getDriver().get("https://qa.xfleetsolutions.com/calendar/event/create");
        loginPage.login("user1","UserUser123");


    }
    @Then("user clicks on Activities and chooses Calender Events")
    public void user_clicks_on_activities_and_chooses_calender_events() {


    }
    @Then("user clicks on Creat Calender Event")
    public void user_clicks_on_creat_calender_event() {



    }
    //ActivitiesPage activitiesPage= new ActivitiesPage();
    CalenderEvent calenderEvent =new CalenderEvent();


    @Then("user marks the Repeat")
    public void user_marks_the_repeat() {

       // Select select = new Select(activitiesPage.repeatCheckBox);
        //select.selectByVisibleText("Repeat");
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(calenderEvent.repeatCheckBox).perform();

        calenderEvent.repeatCheckBox.click();



    }
    @Then("Verify that the Default value for REPEAT_EVERY is {int}")
    public void verify_that_the_default_value_for_repeat_every_is(Integer int1) {

        String actualDefaultValue = calenderEvent.checkBoxDefaultValue.getAttribute("value");

       // System.out.println("actualDefaultValue = " + actualDefaultValue);

        String num = "1";

        Assert.assertEquals(actualDefaultValue,num);

        System.out.println("Passed");
    }


    //---------------------------------------------------------------------------------------------------------




    @When("user the trying to Creat Calender Event")
    public void user_the_trying_to_creat_calender_event() {



    }
    @When("user marks the Repeat option")
    public void user_marks_the_repeat_option() {
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(calenderEvent.repeatCheckBox).perform();

        calenderEvent.repeatCheckBox.click();


    }
    @Then("verify that REPEAT_Every Value can not be Blank or Zero")
    public void verify_that_repeat_every_value_can_not_be_blank_or_zero() {

        String actualDefaultValue = calenderEvent.checkBoxDefaultValue.getAttribute("value");

        if (actualDefaultValue.equals(0)){
            Assert.assertTrue(calenderEvent.errorMessage.isDisplayed());
        }

    }



}
