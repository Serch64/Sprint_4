package ru.qaScooterPraktikumServices.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static ru.qaScooterPraktikumServices.model.constants.locators.RentPageLocators.*;

public class RentPage {
    private WebDriver driver;
    private By calendarDay;
    private By rentalPeriod;
    private By checkbox;
    private String comment;

    public RentPage(WebDriver driver, By calendarDay, By rentalPeriod, By checkbox, String comment) {
        this.driver = driver;
        this.calendarDay = calendarDay;
        this.rentalPeriod = rentalPeriod;
        this.checkbox = checkbox;
        this.comment = comment;
    }
    public void setFieldsOnRentPage() {
        driver.findElement(DATE_PICKER).click();
        driver.findElement(calendarDay).click();
        driver.findElement(RENTAL_PERIOD_DROPDOWN).click();
        driver.findElement(rentalPeriod).click();
        driver.findElement(checkbox).click();
        driver.findElement(COMMENT_FOR_COURIER_FIELD).sendKeys(comment);
    }
    public void clickOnOrderButton() {
        driver.findElement(ORDER_BUTTON).click();
    }
    public void clickOnYesButton() {
        driver.findElement(YES_BUTTON).click();
    }
    public void waitForRentPage() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(DATE_PICKER));
    }
    public String getActualTextFromSuccessModalWindow() {
        return driver.findElement(SUCCESS_MODAL_WINDOW).getText();
    }
}

