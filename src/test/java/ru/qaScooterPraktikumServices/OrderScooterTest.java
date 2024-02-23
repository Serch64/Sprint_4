package ru.qaScooterPraktikumServices;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.qaScooterPraktikumServices.model.MainPage;
import ru.qaScooterPraktikumServices.model.OrderPage;
import ru.qaScooterPraktikumServices.model.RentPage;

import static org.hamcrest.CoreMatchers.containsString;
import static ru.qaScooterPraktikumServices.model.constants.locators.MainPageLocators.*;
import static ru.qaScooterPraktikumServices.model.constants.locators.OrderPageLocators.*;
import static ru.qaScooterPraktikumServices.model.constants.locators.RentPageLocators.*;
import static ru.qaScooterPraktikumServices.model.constants.testData.OrderTestData.*;

@RunWith(Parameterized.class)
public class OrderScooterTest {
    private static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private static final String assertDescription = "Модальное окно с сообщением об успешном создании заказа не отобразилось";
    private static final org.hamcrest.Matcher<String> expectedText = containsString("Заказ оформлен");
    private WebDriver driver;
    private final By orderButton;
    private final String name;
    private final String familyName;
    private final String address;
    private final By dropdownElement;
    private final String phone;
    private final By calendarDay;
    private final By rentalPeriod;
    private final By checkbox;
    private final String comment;

    public OrderScooterTest(By orderButton, String name, String familyName, String address, By dropdownElement,
                            String phone, By calendarDay, By rentalPeriod, By checkbox, String comment) {
        this.orderButton = orderButton;
        this.name = name;
        this.familyName = familyName;
        this.address = address;
        this.dropdownElement = dropdownElement;
        this.phone = phone;
        this.calendarDay = calendarDay;
        this.rentalPeriod = rentalPeriod;
        this.checkbox = checkbox;
        this.comment = comment;
    }
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {TOP_ORDER_BUTTON, NAME_1, FAMILY_NAME_1, ADDRESS_1, FIRST_DROPDOWN_ELEMENT, PHONE_1,
                        CALENDAR_TWENTY_NINTH_FEBRUARY_VALUE, DROPDOWN_DAY_VALUE, BLACK_PEARL_CHECKBOX, COMMENT_1 },
                {BOTTOM_ORDER_BUTTON, NAME_2, FAMILY_NAME_2, ADDRESS_2, SECOND_DROPDOWN_ELEMENT, PHONE_2,
                        CALENDAR_FIRST_MARCH_VALUE, DROPDOWN_TWO_DAYS_VALUE, GRAY_HOPELESSNESS_CHECKBOX, COMMENT_2 }

        };
    }
    @Before
    public void initDriverAndUrl() {
        driver = new ChromeDriver();
        driver.get(URL);
    }
    @Test
    public void orderScooter() {
        MainPage mainPage = new MainPage(driver, orderButton);
        mainPage.clickOnOrderButton();
        OrderPage orderPage = new OrderPage(driver, name, familyName, address, dropdownElement, phone);
        orderPage.waitForOrderPage();
        orderPage.setFieldsOnOrderPage();
        orderPage.clickOnNextButton();
        RentPage rentPage = new RentPage(driver, calendarDay, rentalPeriod, checkbox, comment);
        rentPage.waitForRentPage();
        rentPage.setFieldsOnRentPage();
        rentPage.clickOnOrderButton();
        rentPage.clickOnYesButton();
        Assert.assertThat(assertDescription, rentPage.getActualTextFromSuccessModalWindow(), expectedText);
    }
    @After
    public void shotDown() {
        driver.quit();
    }
}
