package com.fleetmanagement.pages;

import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


    @FindBy(xpath = "//input[@name='_username']")
    public WebElement userName;

    @FindBy(name = "_password")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='bar']")
    public WebElement loadingBar;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //div[@class='bar']
    public void login(String userNameInput, String passwordInput) {
        userName.sendKeys(userNameInput);
        password.sendKeys(passwordInput + Keys.ENTER);
        BrowserUtils.sleep(2);
        //loginButton.click();
    }


}
