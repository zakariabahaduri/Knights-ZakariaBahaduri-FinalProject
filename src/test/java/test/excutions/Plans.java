package test.excutions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PlansPageLocator;
import utility.SeleniumUtility;

import java.text.ParseException;

public class Plans extends SeleniumUtility {

    @Given("user clicks on plans link")
    public void user_clicks_on_plans_link() {
        getClickOnElement(PlansPageLocator.PLANS_LINK_LOCATOR);
    }
    @Given("user should see {int} rows of data")
    public void user_should_see_rows_of_data(int rowNumbers) {
     int actualRowNumber = getNumberOfRows(PlansPageLocator.PLANS_TABLE_ROWS_LOCATOR);
        Assert.assertEquals(actualRowNumber,rowNumbers);
    }

    @Then("user should see today`s date as date created")
    public void user_should_see_today_s_date_as_date_created_and_tomorrow_s_date_is_date_expired() throws ParseException {

        dateValidation(PlansPageLocator.PLANS_DATE_CREATED_LOCATOR);

    }

    @And("user should see tomorrow`s date as date expired")
    public void userShouldSeeTomorrowSDateAsDateExpired() throws ParseException {
        dateValidation(PlansPageLocator.PLANS_DATE_EXPIRED_LOCATOR,1);
    }
}
