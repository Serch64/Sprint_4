package ru.qaScooterPraktikumServices.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    private By orderButton;
    private By faqElement;
    private By faqAnswer;

    public MainPage(WebDriver driver, By orderButton) {
        this.driver = driver;
        this.orderButton = orderButton;
    }
    public MainPage(WebDriver driver, By faqElement, By faqAnswer) {
        this.driver = driver;
        this.faqElement = faqElement;
        this.faqAnswer = faqAnswer;
    }
    public void clickOnOrderButton() {
        WebElement element = driver.findElement(orderButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(orderButton).click();
    }
    public void clickOnFaqElement() {
        WebElement element = driver.findElement(faqElement);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(faqElement).click();
    }
    public String getActualText() {
        return driver.findElement(faqAnswer).getText();
    }

}