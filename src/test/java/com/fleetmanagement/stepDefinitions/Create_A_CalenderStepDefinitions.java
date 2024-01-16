package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.CalenderEvent;
import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Create_A_CalenderStepDefinitions {

    @Then("user clicks on the activities dropdown button")
    public void user_clicks_on_the_activities_dropdown_button() {
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle("Dashboard");
        CalenderEvent calenderEvent = new CalenderEvent();
        Actions actions = new Actions(Driver.getDriver());
        //2. Hover over menu button
        BrowserUtils.sleep(3);
        actions.moveToElement(calenderEvent.activitiesButton).perform();
    }

    @Then("user  selects the Calendar events option")
    public void user_selects_the_calendar_events_option() {
        CalenderEvent calenderEvent = new CalenderEvent();
        BrowserUtils.waitFor(3);
        calenderEvent.createCalendarEventsButton.click();

    }

    @Then("user clicks on Create an Event Button")
    public void user_clicks_on_create_an_event_button() {
        CalenderEvent calenderEvent = new CalenderEvent();
        BrowserUtils.waitFor(3);
        calenderEvent.createACalenderEventButton.click();
    }

    @Then("user would like to type a message into the Description field.")
    public void user_would_like_to_type_a_message_into_the_description_field() {
        CalenderEvent calenderEvent= new CalenderEvent();
        BrowserUtils.waitFor(3);
        calenderEvent.titleField.sendKeys("Truck Driver");
        Driver.getDriver().switchTo().frame(calenderEvent.descriptionBox_Iframe);
        BrowserUtils.waitForInvisibilityOf(calenderEvent.descriptionBox_Iframe);
        BrowserUtils.waitFor(3);
        calenderEvent.descriptionBox.sendKeys("Daily Scrum Call");
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("user Driver would like to create a calendar event that's on repeat.")
    public void user_driver_would_like_to_create_a_calendar_event_that_s_on_repeat() {
        CalenderEvent calenderEvent = new CalenderEvent();
        BrowserUtils.waitFor(3);
        calenderEvent.repeatCheckBox.click();
        calenderEvent.dailySelectOption.isSelected();
        calenderEvent.saveAndcloseButton.click();
        BrowserUtils.waitFor(3);
        WebElement paragraphElement = Driver.getDriver().findElement(By.tagName("p"));
        String actualText = paragraphElement.getText();
        String expectedText = "Daily Scrum Call";
        Assert.assertEquals(actualText,expectedText);
        System.out.println("actualText = " + actualText);
    }

}
