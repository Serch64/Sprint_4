package ru.qaScooterPraktikumServices.model.constants.locators;

import org.openqa.selenium.By;

public class OrderPageLocators {
    // Поле "Имя"
    public static final By NAME_FIELD = By.xpath(".//input[@placeholder='* Имя']");
    // Поле "Фамилия"
    public static final By FAMILY_NAME_FIELD = By.xpath(".//input[@placeholder='* Фамилия']");
    // Поле "Адрес"
    public static final By ADDRESS_FIELD = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // Дропдаун "Станция метро"
    public static final By METRO_DROPDOWN = By.className("select-search__input");
    // Елемент дропдауна "Бульвар Рокоссовского"
    public static final By FIRST_DROPDOWN_ELEMENT = By.xpath(".//button[@value='1']");
    // Елемент дропдауна "Черкизовская"
    public static final By SECOND_DROPDOWN_ELEMENT = By.xpath(".//button[@value='2']");
    // Поле "Телефон: на него позвонит курьер"
    public static final By PHONE_FIELD = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка "Даллее"
    public static final By NEXT_BUTTON = By.xpath(".//button[text()='Далее']");
}
