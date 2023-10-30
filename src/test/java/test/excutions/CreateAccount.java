package test.excutions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CreateAccountPage;
import pages.HomePageLocators;
import pages.SignUpLocator;
import utility.SeleniumUtility;

import java.util.Random;

public class CreateAccount extends SeleniumUtility {
    Random rand = new Random();

    @Given("user clicks on create primary account button")
    public void user_clicks_on_create_primary_account_button() {
       getClickOnElement(HomePageLocators.CREATE_PRIMARY_ACCOUNT_LOCATOR);
    }
    @Given("user enters email address {string}")
    public void user_enters_email_address(String email) {

        String actual_email = email;
        actual_email = "Bob"+rand.nextInt(1000)+"@gmail.com";
        sendKey(CreateAccountPage.EMAIL,actual_email);
    }
    @Given("user enters firstname {string} and lastname {string}")
    public void user_enters_firstname_and_lastname(String firstname, String lastname) {
       sendKey(CreateAccountPage.FIRST_NAME,firstname);
       sendKey(CreateAccountPage.LAST_NAME,lastname);
    }
    @Given("user selects title {string}")
    public void user_selects_title(String title) {
        sendKey(CreateAccountPage.TITLE,title);
    }
    @Given("user selects gender {string}")
    public void user_selects_gender(String gender) {
        Select selectGender = new Select(getElement(CreateAccountPage.GENDER));
        selectGender.selectByVisibleText(gender);
    }
    @Given("user eneters Employment status {string}")
    public void user_eneters_employment_status(String employment_status) {
    sendKey(CreateAccountPage.EMPLOYMENT_STATUS,employment_status);
    }
    @Given("user selects marital status {string}")
    public void user_selects_marital_status(String marital_status) {
        Select select_marital_status = new Select(getElement(CreateAccountPage.MARITAL_STATUS));
        select_marital_status.selectByVisibleText(marital_status);
    }
    @Given("user selects date of birth {string}")
    public void user_selects_date_of_birth(String date_of_birth) {
  //  Select select_date_of_birth = new Select(getElement(CreateAccountPage.DATE_OF_BIRTH));
   // select_date_of_birth.selectByVisibleText(date_of_birth);
        sendKey(CreateAccountPage.DATE_OF_BIRTH,date_of_birth);
    }
    @Given("user clicks on Create account")
    public void user_clicks_on_create_account() throws InterruptedException {
        getClickOnElement(CreateAccountPage.CREATE_ACCOUNT);
        Thread.sleep(2000);
    }
    @Then("new user should be created {string}")
    public void new_user_should_be_created(String signup) {
      String Sign_Up =  getElementText(SignUpLocator.SIGN_UP_YOUR_ACCOUNT);
        Assert.assertEquals(signup,Sign_Up);



    }

    @Given("user enters Username {string} and password {string} , and confirms password {string}")
    public void userEntersUsernameAndPasswordAndConfirmsPassword(String username, String password, String password1) {
     username ="Bob"+rand.nextInt(1000);
        sendKey(SignUpLocator.USERNAME,username);
        sendKey(SignUpLocator.PASSWORD,password);
        sendKey(SignUpLocator.CONFIRM_PASSWORD,password1);
    }

    @And("user clicks on submit button")
    public void userClicksOnSubmitButton() {
        getClickOnElement(SignUpLocator.SUBMIT_BUTTON);
    }
}
