package com.fleetmanagement.pages;

import com.fleetmanagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderEvent {

    public CalenderEvent() {
        PageFactory.initElements(Driver.getDriver(), this);
    }






    @FindBy(xpath = "//div[@data-page-component-name='calendar-event-recurrence']//div[@class='control-group control-group-checkbox']//div[@class='controls']/input")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public WebElement checkBoxDefaultValue;


    @FindBy(xpath = "//span[@style='top: 463px; left: 182px;']/span")
    public WebElement errorMessage;

    @FindBy(xpath = "//a[@href='#']//span[contains(text(),'Activities')]")
    public WebElement activitiesButton;

@FindBy(xpath = "//span[normalize-space()='Calendar Events']")
    public WebElement createCalendarEventsButton;

@FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createACalenderEventButton;

@FindBy(xpath= "//input[@name='oro_calendar_event_form[title]']")
    public WebElement titleField;
@FindBy(xpath = "//iframe[@frameborder='0']")
    public WebElement descriptionBox_Iframe;

@FindBy(id ="tinymce")
public WebElement descriptionBox;

@FindBy(xpath = "//select[@class = 'recurrence-repeats__select']/option[1]")
public  WebElement dailySelectOption;

@FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement saveAndcloseButton;





}
