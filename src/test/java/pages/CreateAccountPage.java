package pages;

import org.openqa.selenium.By;

public class CreateAccountPage {
    public final static By EMAIL = By.id("email");
    public final static By FIRST_NAME = By.id("firstName");
    public final static By LAST_NAME = By.id("lastName");

    public final static By GENDER = By.id("gender");
    public final static By TITLE = By.id("title");

    public final static By MARITAL_STATUS = By.id("maritalStatus");
    public final static By DATE_OF_BIRTH = By.id("dateOfBirth");
    public final static By EMPLOYMENT_STATUS = By.id("employmentStatus");
    public final static By CREATE_ACCOUNT = By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[2]/button[1]");

}
