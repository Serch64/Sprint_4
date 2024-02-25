package ru.qaScooterPraktikumServices.model.constants.locators;

import org.openqa.selenium.By;

public class MainPageLocators {
    // Первый элемент в блоке "Вопросы о важном"
    public static final By FIRST_FAQ_ELEMENT = By.id("accordion__heading-0");
    // Второй элемент в блоке "Вопросы о важном"
    public static final By SECOND_FAQ_ELEMENT = By.id("accordion__heading-1");
    // Третий элемент в блоке "Вопросы о важном"
    public static final By THIRD_FAQ_ELEMENT = By.id("accordion__heading-2");
    // Четвертый элемент в блоке "Вопросы о важном"
    public static final By FOURTH_FAQ_ELEMENT = By.id("accordion__heading-3");
    // Пятый элемент в блоке "Вопросы о важном"
    public static final By FIFTH_FAQ_ELEMENT = By.id("accordion__heading-4");
    // Шестой элемент в блоке "Вопросы о важном"
    public static final By SIXTH_FAQ_ELEMENT = By.id("accordion__heading-5");
    // Седьмой элемент в блоке "Вопросы о важном"
    public static final By SEVENTH_FAQ_ELEMENT = By.id("accordion__heading-6");
    // Восьмой элемент в блоке "Вопросы о важном"
    public static final By EIGHTH_FAQ_ELEMENT = By.id("accordion__heading-7");
    // Первый ответ в блоке "Вопросы о важном"
    public static final By FIRST_FAQ_ANSWER = By.xpath(".//div[@aria-labelledby='accordion__heading-0']/p");
    // Второй ответ в блоке "Вопросы о важном"
    public static final By SECOND_FAQ_ANSWER = By.xpath(".//div[@aria-labelledby='accordion__heading-1']/p");
    // Третий ответ в блоке "Вопросы о важном"
    public static final By THIRD_FAQ_ANSWER = By.xpath(".//div[@aria-labelledby='accordion__heading-2']/p");
    // Четвертый ответ в блоке "Вопросы о важном"
    public static final By FOURTH_FAQ_ANSWER = By.xpath(".//div[@aria-labelledby='accordion__heading-3']/p");
    // Пятый ответ в блоке "Вопросы о важном"
    public static final By FIFTH_FAQ_ANSWER = By.xpath(".//div[@aria-labelledby='accordion__heading-4']/p");
    // Шестой ответ в блоке "Вопросы о важном"
    public static final By SIXTH_FAQ_ANSWER = By.xpath(".//div[@aria-labelledby='accordion__heading-5']/p");
    // Седьмой ответ в блоке "Вопросы о важном"
    public static final By SEVENTH_FAQ_ANSWER = By.xpath(".//div[@aria-labelledby='accordion__heading-6']/p");
    // Восьмой ответ в блоке "Вопросы о важном"
    public static final By EIGHTH_FAQ_ANSWER = By.xpath(".//div[@aria-labelledby='accordion__heading-7']/p");
    // Кнопка "Заказать" наверху страницы
    public static final By TOP_ORDER_BUTTON = By.xpath(".//div[1]/div[2]/button[1]");
    // Кнопка "Заказать" внизу страницы
    public static final By BOTTOM_ORDER_BUTTON = By.xpath(".//div[4]/div[2]/div[5]/button");
}
