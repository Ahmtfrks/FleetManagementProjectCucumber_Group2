package com.fleetmanagement.pages;

import com.fleetmanagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderEvent {

    public CalenderEvent() {
        PageFactory.initElements(Driver.getDriver(), this);
    }






    @FindBy(xpath = "//input[@id='recurrence-repeat-view248']")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public WebElement checkBoxDefaultValue;



}
