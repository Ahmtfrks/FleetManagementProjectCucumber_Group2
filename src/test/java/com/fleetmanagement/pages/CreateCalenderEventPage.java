package com.fleetmanagement.pages;

import com.fleetmanagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalenderEventPage extends LoginPage{

    public CreateCalenderEventPage() {


            PageFactory.initElements(Driver.getDriver(), this);
        }




    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/a/span")
    public WebElement Activities_Button;

    @FindBy(xpath = " //*[@id=\"main-menu\"]/ul/li[5]/a/span")
    public WebElement Activities_Button2;



    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span")
     public WebElement Calendar_Events_Button;
    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[5]/div/div/ul/li[4]/a/span")
    public WebElement Calendar_Events_Button2;

    @FindBy(xpath = "//div[@id='container']//a[contains(.,'Create Calendar event')]")
    public WebElement link_create_calender_event;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a")
    public WebElement link_create_calender_event1;


    @FindBy(xpath = "//input[starts-with(@id,'recurrence-repeat')]")
    public WebElement checkbox_repeat;


    @FindBy(xpath = "(//div[@class='recurrence-subview-control__item'])[1]/label/input[3]")
    public WebElement textBox_repeat_every_day;

    @FindBy(xpath = "(//div[@class='recurrence-subview-control__item'])[1]/label/input[3]/../../span")
    public WebElement msg_error_repeat_every_day;




    }
