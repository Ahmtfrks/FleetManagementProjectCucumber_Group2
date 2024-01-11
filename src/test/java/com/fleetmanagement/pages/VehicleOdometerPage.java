package com.fleetmanagement.pages;

import com.fleetmanagement.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class VehicleOdometerPage extends BasePage {

    public VehicleOdometerPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".input-widget")
    public WebElement pageNumber;

    @FindBy(xpath = "//div[@class='btn-group']//button[contains(.,'25')]")
    public WebElement pagePerViewNumber;

    @FindBy(xpath = "(//div[@class='message'])[1]")
    public WebElement errorMessage1;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement errorMessage2;

    @FindBys({
            @FindBy(xpath = "(//div[@class='message'])[1]"),
            @FindBy(xpath = "(//div[@class='message'])[2]")
    })
    public List<WebElement> errorMessages;


    public WebElement getContactEmail(String email) {
        String xpath = "//*[contains(text(), '" + email + "') and @data-column-label='Email']";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }
    public List<String> getElementsText(By locator) {

        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();

        for (WebElement el : elems) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }



// ...

    public List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }
}
