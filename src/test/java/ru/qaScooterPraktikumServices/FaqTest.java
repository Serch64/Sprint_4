package ru.qaScooterPraktikumServices;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import ru.qaScooterPraktikumServices.model.MainPage;

import static ru.qaScooterPraktikumServices.ChoosingBrowserClass.*;
import static ru.qaScooterPraktikumServices.model.constants.locators.MainPageLocators.*;
import static ru.qaScooterPraktikumServices.model.constants.expectedData.FaqExpectedData.*;


@RunWith(Parameterized.class)
public class FaqTest {
    private static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private static final String assertDescription = "Текст ответа в FAQ отличается от ожидаемого";
    private final By faqElement;
    private final By faqAnswer;
    private final String expectedText;

    public FaqTest(By faqElement, By faqAnswer, String expectedText) {
        this.faqElement = faqElement;
        this.faqAnswer = faqAnswer;
        this.expectedText = expectedText;
    }
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {FIRST_FAQ_ELEMENT, FIRST_FAQ_ANSWER, FIRST_FAQ_EXPECTED_TEXT},
                {SECOND_FAQ_ELEMENT, SECOND_FAQ_ANSWER, SECOND_FAQ_EXPECTED_TEXT},
                {THIRD_FAQ_ELEMENT, THIRD_FAQ_ANSWER, THIRD_FAQ_EXPECTED_TEXT},
                {FOURTH_FAQ_ELEMENT, FOURTH_FAQ_ANSWER, FOURTH_FAQ_EXPECTED_TEXT},
                {FIFTH_FAQ_ELEMENT, FIFTH_FAQ_ANSWER, FIFTH_FAQ_EXPECTED_TEXT},
                {SIXTH_FAQ_ELEMENT, SIXTH_FAQ_ANSWER, SIXTH_FAQ_EXPECTED_TEXT},
                {SEVENTH_FAQ_ELEMENT, SEVENTH_FAQ_ANSWER, SEVENTH_FAQ_EXPECTED_TEXT},
                {EIGHTH_FAQ_ELEMENT, EIGHTH_FAQ_ANSWER, EIGHTH_FAQ_EXPECTED_TEXT}
        };
    }
    @Before
    public void initDriverAndUrl() {
        createDriver(CHROME);
        driver.get(URL);
    }
    @Test
    public void checkFaq() {
        MainPage mainPage = new MainPage(driver, faqElement, faqAnswer);
        mainPage.clickOnFaqElement();
        Assert.assertEquals(assertDescription, mainPage.getActualText(), expectedText);
    }
    @After
    public void shotDown() {
        driver.quit();
    }
}
