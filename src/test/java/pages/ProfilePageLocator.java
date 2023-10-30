package pages;

import org.openqa.selenium.By;

public class ProfilePageLocator {

public final static By PROFILE_BUTTON = By.xpath("//div[1]/div/div[1]/div/button");

public final static By PROFILE_TEXT = By.xpath("//div[3]/div[3]/div/div/header");

public final static By PROFILE_STATUS = By.xpath("//div[3]/div[3]/div/div/div/div/div/div[1]/p[1]");

public final static By  PROFILE_ACTIVE = By.xpath("//div[3]/div[3]/div/div/div/div/div/div[1]/p[2]/span/span");

public final static By PROFILE_USER_TYPE = By.xpath("//div[3]/div[3]/div/div/div/div/div/div[2]/p[1]");

public final static By PROFILE_CSR = By.xpath("//div[3]/div[3]/div/div/div/div/div/div[2]/p[2]");

public final static By PROFILE_NAME = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[3]/p[1]");

public final static By PROFILE_NAME_SUPERVISOR = By.xpath("//div[3]/div[3]/div/div/div/div/div/div[3]/p[2]");
public final static By PROFILE_USERNAME = By.xpath("//div[3]/div[3]/div/div/div/div/div/div[4]/p[1]");

public final static By PROFILE_USERNAME_SUPERVISOR = By.xpath("//div[3]/div[3]/div/div/div/div/div/div[4]/p[2]");

public final static  By PROFILE_AUTHORITIES = By.xpath("//div[3]/div[3]/div/div/div/div/div/div[5]/p");

public final static By PRIFILE_AUTHORITIES_ADMIN = By.xpath("//div[3]/div[3]/div/div/div/div/div/div[5]/ul/li");

public final static By PROFILE_LOGOUT_BUTTON = By.xpath("//div[3]/div[3]/div/div/footer/div/button[1]");

public final static By CLOSE_BUTTON = By.xpath("//div[3]/div[3]/div/div/button");

}
