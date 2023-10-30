package test.excutions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePageLocators;
import pages.LoginPageLocators;
import pages.MainPageLocator;
import utility.SeleniumUtility;

public class Login_Successfully extends SeleniumUtility {
    @Given("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
       getClickOnElement(HomePageLocators.LOGIN_LOCATOR);
    }
    @Given("user enters correct  username {string} and correct password {string}")
    public void user_enters_correct_username_and_correct_password(String username, String password) {
        sendKey(LoginPageLocators.USERNAME,username);
        sendKey(LoginPageLocators.PASSWORD,password);

    }
    @Given("user clicks on login")
    public void user_clicks_on_login() throws InterruptedException {
        getClickOnElement(LoginPageLocators.LOGIN_BUTTON);
        Thread.sleep(2000);
    }
    @Then("user should be taken to the main page and see page header {string}")
    public void user_should_be_taken_to_the_main_page_and_see_page_header(String expected) {
       String actual= getElementText(MainPageLocator.PAGE_HEADER);
        Assert.assertEquals(actual,expected);

    }

}
