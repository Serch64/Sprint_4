package ru.qaScooterPraktikumServices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChoosingBrowserClass {
    static WebDriver driver;
    public static final String CHROME = "chrome";
    public static final String FIREFOX = "firefox";
    private static final String incorrectBrowserText1 = "Неподдерживаемый браузер: ";
    private static final String incorrectBrowserText2 = ". В методе createDriver() в качестве аргумента нужно выбрать константу CHROME или FIREFOX";

    public static WebDriver createDriver(String browser) {
        if (browser.equalsIgnoreCase(CHROME)) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase(FIREFOX)) {
            driver = new FirefoxDriver();
        } else {
            System.out.println(incorrectBrowserText1 + browser + incorrectBrowserText2);
        } return driver;
    }
}
