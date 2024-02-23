package ru.qaScooterPraktikumServices.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static ru.qaScooterPraktikumServices.model.constants.locators.OrderPageLocators.*;

public class OrderPage {
    private WebDriver driver;
    private String name;
    private String familyName;
    private String address;
    private By dropdownElement;
    private String phone;
    public OrderPage(WebDriver driver, String name, String familyName , String address, By dropdownElement, String phone) {
        this.driver = driver;
        this.name = name;
        this.familyName = familyName;
        this.address = address;
        this.dropdownElement = dropdownElement;
        this.phone = phone;
    }
    public void setFieldsOnOrderPage() {
        driver.findElement(NAME_FIELD).sendKeys(name);
        driver.findElement(FAMILY_NAME_FIELD).sendKeys(familyName);
        driver.findElement(ADDRESS_FIELD).sendKeys(address);
        driver.findElement(METRO_DROPDOWN).click();
        driver.findElement(dropdownElement).click();
        driver.findElement(PHONE_FIELD).sendKeys(phone);
    }
    public void clickOnNextButton() {
        driver.findElement(NEXT_BUTTON).click();
    }
    public void waitForOrderPage() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(NAME_FIELD));
    }
}
