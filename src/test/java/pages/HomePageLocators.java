package pages;

import org.openqa.selenium.By;

public class HomePageLocators {
public final static  By PAGE_SUBJECT_LOCATOR= By.xpath("//div[1]/div/div[1]/div/h2");
public static final  By LOGIN_LOCATOR= By.xpath("//div[1]/div/div[1]/div/a[2]");
public static final By HEADER_FIRST_LOCATOR = By.xpath("//div[1]/div/div[2]/div/div/h2[1]");
public static final By HEADER_SECOND_LOCATOR = By.xpath("//div[1]/div/div[2]/div/div/h2[2]");
public static  final By CREATE_PRIMARY_ACCOUNT_LOCATOR = By.xpath("/html/body/div[1]/div/div[2]/div/div/a");
public static final By FOOTER_FIRST_LOCATOR = By.xpath("//div[1]/div/div[3]/div/div/p[1]");
public static final By FOOTER_SECOND_LOCATOR = By.xpath("/html/body/div[1]/div/div[3]/div/div/p[2]");

public static final By COLOR_MODE_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/div/button");
public static final By PAGE_BODY =  By.xpath("/html/body");
}
