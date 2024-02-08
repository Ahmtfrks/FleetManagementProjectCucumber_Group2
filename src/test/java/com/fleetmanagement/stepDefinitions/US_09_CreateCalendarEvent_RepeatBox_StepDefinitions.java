package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.CreateCalenderEventPage;
import com.fleetmanagement.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.fleetmanagement.utilities.BrowserUtils.sleep;

public class US_09_CreateCalendarEvent_RepeatBox_StepDefinitions {

    CreateCalenderEventPage calenderEventsPage = new CreateCalenderEventPage();


    //@StoreManager @SalesManager1

    @And("the user navigates to to Activities to Calendar Events")
    public void theUserNavigatesToToActivitiesToCalendarEvents() {




         BrowserUtils.sleep(2);
        (calenderEventsPage.Activities_Button2).click();

         BrowserUtils.sleep(2);

         (calenderEventsPage.Calendar_Events_Button2).click();

        BrowserUtils.sleep(5);
    }

    //@StoreManager @SalesManager2
    @When("the user clicks create calendar event")
    public void the_user_clicks_create_calendar_event() {
        calenderEventsPage.waitUntilLoaderScreenDisappear();
        (calenderEventsPage.link_create_calender_event1).click();

    }


    //@StoreManager @SalesManager3
    @When("the user checks Repeat checkbox")
    public void the_user_checks_repeat_checkbox() {
         //calenderEventsPage.waitUntilLoaderScreenDisappear();
        (calenderEventsPage.checkbox_repeat).click();
        // (calenderEventsPage.checkbox_repeat1).click();
        // (calenderEventsPage.checkbox_repeat2).click();

    }


    // @TruckDriver1

    @And("the TDriver navigates to to Activities to Calendar Events")
    public void theDriverNavigatesToToActivitiesToCalendarEvents() {


        BrowserUtils.sleep(2);

        (calenderEventsPage.Activities_Button).click();
        BrowserUtils.sleep(2);
        (calenderEventsPage.Calendar_Events_Button).click();


        BrowserUtils.sleep(5);
    }

    // @TruckDriver2
    @And("the TDriver clicks create calendar event")
    public void theTruckDriverClicksCreateCalendarEvent() {
        calenderEventsPage.waitUntilLoaderScreenDisappear();
        (calenderEventsPage.link_create_calender_event).click();
    }

    // @TruckDriver3
    @And("the TDriver checks Repeat checkbox")
    public void theTruckDriverChecksRepeatCheckbox() {

        // calenderEventsPage.waitUntilLoaderScreenDisappear();
        (calenderEventsPage.checkbox_repeat).click();
        // BrowserUtils.sleep(5);
    }


    @Then("the user should be able to see the number {int} by default in the Repeat Every input option")
    public void the_user_should_be_able_to_see_the_number_by_default_in_the_repeat_every_input_option(Integer expectedValue) {
        String actualValue = BrowserUtils.getElementAttribute("value", calenderEventsPage.textBox_repeat_every_day);
        Assert.assertEquals(expectedValue + "", actualValue);
    }


    @When("the user delete the default value Calendar event Repeat Every field")
    public void the_user_delete_the_default_value_calendar_event_repeat_every_field() {
        calenderEventsPage.textBox_repeat_every_day.clear();
        calenderEventsPage.textBox_repeat_every_day.click();
    }


    @When("the user enter the value {int} Calendar event Repeat Every field")
    public void the_user_enter_the__value_calendar_event_repeat_every_field(int value) {
        sleep(2);
        calenderEventsPage.textBox_repeat_every_day.clear();
        calenderEventsPage.textBox_repeat_every_day.sendKeys(value + "");
    }


    @Then("the user should be able to see the error message as {string}")
    public void the_user_should_be_able_to_see_the_error_message_as(String expectedMessage) {

        String actualMessage = calenderEventsPage.msg_error_repeat_every_day.getText();
        Assert.assertEquals(expectedMessage, actualMessage);


    }






}












