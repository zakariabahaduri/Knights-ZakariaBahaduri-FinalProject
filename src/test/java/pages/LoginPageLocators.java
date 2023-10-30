package pages;

import org.openqa.selenium.By;

public class LoginPageLocators {
    public static final By USERNAME= By.id("username");
    public static final By PASSWORD = By.id("password");

    public static final By LOGIN_BUTTON = By.xpath("//div[1]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]");

    public static final By ERROR_MESSAGE = By.xpath("//div[1]/div/div[2]/div/div/div/div/div");

    public static final By USERNAME_FIELD_ERROR_MESSAGE = By.xpath("//div[1]/div/div[2]/div/div/div/div/form/div/div[1]/div");

    public static final By PASSWORD_FIELD_ERROR_MESSAGE = By.xpath("//div[1]/div/div[2]/div/div/div/div/form/div/div[2]/div[2]");



}
