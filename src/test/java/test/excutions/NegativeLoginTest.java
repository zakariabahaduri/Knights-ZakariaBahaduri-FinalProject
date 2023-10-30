package test.excutions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePageLocators;
import pages.LoginPageLocators;
import utility.SeleniumUtility;

public class NegativeLoginTest extends SeleniumUtility {
    @Given("user enters incorrect {string} and corrcet {string}")
    public void user_enters_incorrect_and_corrcet(String username, String password) {
       sendKey(LoginPageLocators.USERNAME,username);
       sendKey(LoginPageLocators.PASSWORD,password);
    }
    @Then("user should see the {string}")
    public void user_should_see_the(String errorMessage) {
       String actual_error= getElementText(LoginPageLocators.ERROR_MESSAGE);
        actual_error = actual_error.substring(6,actual_error.length());
        System.out.println(actual_error);
        Assert.assertEquals(errorMessage,actual_error);

    }
    @And("User does not enter username and enters {string}")
    public void userDoesNotEnterUsernameAndEnters(String password) {
        sendKey(LoginPageLocators.PASSWORD,password);
        getClickOnElement(LoginPageLocators.LOGIN_BUTTON);
    }

    @Then("user should see the error message {string}")
    public void userShouldSeeTheErrorMessage(String message) {
        String actual_user_error_message = getElementText(LoginPageLocators.USERNAME_FIELD_ERROR_MESSAGE);
        Assert.assertEquals(message,actual_user_error_message);

    }

    @Given("User   enters {string} and does not enters password")
    public void user_enters_and_enters_password(String username) {
       sendKey(LoginPageLocators.USERNAME,username);
        getClickOnElement(LoginPageLocators.LOGIN_BUTTON);
    }
    @Then("user should see the error {string}")
    public void user_should_see_the_error(String message) {
        String actual_error_message = getElementText(LoginPageLocators.PASSWORD_FIELD_ERROR_MESSAGE);
        Assert.assertEquals(actual_error_message,message);
        getClickOnElement(LoginPageLocators.LOGIN_BUTTON);
    }

}
