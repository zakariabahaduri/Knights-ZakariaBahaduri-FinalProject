package pages;

import org.openqa.selenium.By;

public class SignUpLocator {
    public static final By SIGN_UP_YOUR_ACCOUNT = By.xpath("//div[1]/div/div[2]/div/div/div/h2[1]");

    public static final By USERNAME = By.id("username");
    public static final By PASSWORD = By.id("password");
    public static final By CONFIRM_PASSWORD = By.id("confirm");
    public static final By SUBMIT_BUTTON = By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[4]/button[1]");
}
