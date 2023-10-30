package test.excutions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePageLocators;
import pages.ProfilePageLocator;
import utility.SeleniumUtility;

public class Profile extends SeleniumUtility {

    @Given("user click on profile button")
    public void user_click_on_prifle_button() {
        getClickOnElement(ProfilePageLocator.PROFILE_BUTTON);
    }
    @Then("user should see the {string} text")
    public void user_should_see_the_text(String profileText) {
    String text=   getElementText(ProfilePageLocator.PROFILE_TEXT);
        Assert.assertEquals(text,profileText);
    }
    @Then("user should see status {string} and {string}")
    public void user_should_see_status_and(String statusText, String activeText) {
        String status = getElementText(ProfilePageLocator.PROFILE_STATUS);
        String active = getElementText(ProfilePageLocator.PROFILE_ACTIVE);
        Assert.assertEquals(status,statusText);
        Assert.assertEquals(active,activeText);
    }
    @Then("user should see user type {string}")
    public void user_should_see_user_type(String userTypeText) {
       String userType = getElementText(ProfilePageLocator.PROFILE_USER_TYPE);
       Assert.assertEquals(userType,userTypeText);
    }
    @Then("user should see name {string} and {string}")
    public void user_should_see_name_and(String nameText, String supervisorText) {
     String actualName = getElementText(ProfilePageLocator.PROFILE_NAME);
     String actualSupervisor = getElementText(ProfilePageLocator.PROFILE_NAME_SUPERVISOR);
     Assert.assertEquals(nameText,actualName);
     Assert.assertEquals(supervisorText,actualSupervisor);
    }
    @Then("user should see username {string} {string}")
    public void user_should_see_username(String usernameText, String supervisorText) {
      String actualUsername = getElementText(ProfilePageLocator.PROFILE_USERNAME);
      String actualSupervisor = getElementText(ProfilePageLocator.PROFILE_USERNAME_SUPERVISOR);
      Assert.assertEquals(actualSupervisor,supervisorText);
      Assert.assertEquals(actualUsername,usernameText);
    }
    @Then("user should see Authorities {string} and {string}")
    public void user_should_see_authorities_and(String authoritiesText, String adminText) {
     String actualAuthorities = getElementText(ProfilePageLocator.PROFILE_AUTHORITIES);
     String actualAdminText = getElementText(ProfilePageLocator.PRIFILE_AUTHORITIES_ADMIN);
     Assert.assertEquals(actualAuthorities,authoritiesText);
     Assert.assertEquals(actualAdminText,adminText);
    }
    @Then("user should see logout button {string}")
    public void user_should_see_logout_button(String logoutText) {
      String actualLogout = getElementText(ProfilePageLocator.PROFILE_LOGOUT_BUTTON);
      Assert.assertEquals(actualLogout,logoutText);
    }

    @Then("user clicks on the close button")
    public void user_clicks_on_the_close_button() {
        getClickOnElement(ProfilePageLocator.CLOSE_BUTTON);
    }

    @Then("user clicks on logout button")
    public void user_clicks_on_logout_button() {
        getClickOnElement(ProfilePageLocator.PROFILE_LOGOUT_BUTTON);
    }

    @Then("user should be logged out")
    public void user_should_be_logged_out() {
       String homePageHeader =getElementText(HomePageLocators.HEADER_FIRST_LOCATOR);
        Assert.assertEquals(homePageHeader,"Lets get you started");
    }


}
