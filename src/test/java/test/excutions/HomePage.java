package test.excutions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePageLocators;
import utility.SeleniumUtility;

public class HomePage extends SeleniumUtility {
    @Given("user opens the website user should see {string} on the left side of the page")
    public void user_opens_the_website_user_should_see_on_the_left_side_of_the_page(String pagesubject) {
      String actual = getElementText(HomePageLocators.PAGE_SUBJECT_LOCATOR);
        Assert.assertEquals(actual,pagesubject);
    }
    @And("user should see the {string} button on the right side of the page")
    public void user_should_see_the_button_on_the_right_side_of_the_page(String loginText) {
       String actual = getElementText(HomePageLocators.LOGIN_LOCATOR);
       Assert.assertEquals(actual, loginText);
    }
    @Given("user should see the color mode button on the right side of the page")
    public void user_should_see_the_color_mode_button_on_the_right_side_of_the_page() {
      WebElement Color_Change_Element = isElementpresent(HomePageLocators.COLOR_MODE_BUTTON);
      Assert.assertTrue(Color_Change_Element.isDisplayed());
    }
    @Given("user should see {string} and {string} in the middle")
    public void user_should_see_and_in_the_middle(String lets_get_you_started, String donot_have_an_account) {
       String header_first = getElementText(HomePageLocators.HEADER_FIRST_LOCATOR);
       String header_second = getElementText(HomePageLocators.HEADER_SECOND_LOCATOR);
       Assert.assertEquals(header_first,lets_get_you_started);
       Assert.assertEquals(header_second,donot_have_an_account);
    }
    @Given("user should see {string} in the middle of the screen")
    public void user_should_see_in_the_middle_of_the_screen(String create_primary_account) {
       String actual = getElementText(HomePageLocators.CREATE_PRIMARY_ACCOUNT_LOCATOR);
       Assert.assertEquals(actual,create_primary_account);
    }
    @Given("user should see {string} in the bottom")
    public void user_should_see_in_the_bottom(String footer1) {
        String actual = getElementText(HomePageLocators.FOOTER_FIRST_LOCATOR);
        Assert.assertEquals(actual,footer1);
    }
    @Given("user should see {string}")
    public void user_should_see(String footer2) {
        String actual = getElementText(HomePageLocators.FOOTER_SECOND_LOCATOR);
        Assert.assertEquals(actual,footer2);
    }


    @And("User should see the page title as {string}")
    public void userShouldSeeThePageTitleAs(String title) {
        String actual_title = getDriver().getTitle();
        Assert.assertEquals(actual_title,title);
    }

}
