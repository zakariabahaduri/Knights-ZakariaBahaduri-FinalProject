package test.excutions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.AccountsPageLocators;
import pages.HomePageLocators;
import utility.SeleniumUtility;

public class Accounts extends SeleniumUtility {

    @Given("user clicks on the accounts page")
    public void clicks_on_the_accounts_page() {
        getClickOnElement(AccountsPageLocators.ACCOUNTS_LINK);
    }

    @And("user should see {string} rows in the page")
    public void user_should_see_rows_in_the_page(String expected) {

        Select dropDown = new Select(getElement(AccountsPageLocators.SHOW_ROW));
        String actual = dropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, expected);

    }


    @And("number of rows should be {int}")
    public void numberOfRowsShouldBe(int expected) {
        int actual = getNumberOfRows(AccountsPageLocators.TABLE_ROWS);
        Assert.assertEquals(actual, expected);

    }


    @And("user clicks on the {string} user should see {int}")
    public void userClicksOnTheUserShouldSeeNumber_of_rows(String row_number , int number_Of_Rows) {
        Select select = new Select(getElement(AccountsPageLocators.SHOW_ROW));
        select.selectByValue(row_number);
      int actual =  getNumberOfRows(AccountsPageLocators.TABLE_ROWS);
      Assert.assertEquals(actual,number_Of_Rows);
    }
}