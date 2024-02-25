package ru.qaScooterPraktikumServices.model.constants.locators;

import org.openqa.selenium.By;

public class RentPageLocators {
    // Датапикер "Когда привезти самокат"
    public static final By DATE_PICKER = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    // 29-е февраля в календаре
    public static final By CALENDAR_TWENTY_NINTH_FEBRUARY_VALUE = By.xpath(".//div[@aria-label='Choose четверг, 29-е февраля 2024 г.']");
    // 1-е марта в календаре
    public static final By CALENDAR_FIRST_MARCH_VALUE = By.xpath(".//div[@aria-label='Choose пятница, 1-е марта 2024 г.']");
    // Дропдаун "Срок аренды"
    public static final By RENTAL_PERIOD_DROPDOWN = By.cssSelector(".Dropdown-placeholder");
    // Значение "Сутки" в дропдауне "Срок аренды"
    public static final By DROPDOWN_DAY_VALUE = By.xpath(".//div[text()='сутки']");
    // Значение "Двое суток" в дропдауне "Срок аренды"
    public static final By DROPDOWN_TWO_DAYS_VALUE = By.xpath(".//div[text()='двое суток']");
    // Чекбокс "Чёрный жемчуг"
    public static final By BLACK_PEARL_CHECKBOX = By.xpath(".//label[@for='black']");
    // Чекбокс "Cерая безысходность"
    public static final By GRAY_HOPELESSNESS_CHECKBOX = By.xpath(".//label[@for='grey']");
    // Поле "Комментарий для курьера"
    public static final By COMMENT_FOR_COURIER_FIELD = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    // Кнопка "Заказать"
    public static final By ORDER_BUTTON = By.xpath(".//div[3]/button[text()='Заказать']");
    // Кнопка "Да" в модальном окне "Хотите оформить заказ?"
    public static final By YES_BUTTON = By.xpath(".//button[text()='Да']");
    // Модальное окно "Заказ оформлен?"
    public static final By SUCCESS_MODAL_WINDOW = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");
}
