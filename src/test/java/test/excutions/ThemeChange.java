package test.excutions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePageLocators;
import utility.SeleniumUtility;

public class ThemeChange extends SeleniumUtility {
    @Given("user opens the website and clicks theme button on the right, the theme of the page should change to dark")
    public void user_opens_the_website_and_clicks_theme_button_on_the_right_the_theme_of_the_page_should_change_to_dark() throws InterruptedException {
        WebElement pagebody = getElement(HomePageLocators.PAGE_BODY);
        WebElement theme_button= getElement(HomePageLocators.COLOR_MODE_BUTTON);
        String light_mode = pagebody.getAttribute("class");
        System.out.println(light_mode);
        String actual_light_mode = "chakra-ui-light";
        Assert.assertEquals(light_mode,actual_light_mode);

        theme_button.click();
        String dark_mode = pagebody.getAttribute("class");
        System.out.println(dark_mode);
        String actual_dark_mode = "chakra-ui-dark";
        Assert.assertEquals(dark_mode,actual_dark_mode);


    }
}
