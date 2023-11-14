package pages;

import org.openqa.selenium.By;

public class PlansPageLocator {
    public final static By PLANS_LINK_LOCATOR = By.linkText("Plans");

    public final static By PLANS_TABLE_ROWS_LOCATOR = By.xpath("//table/tbody/tr");

    public final static By PLANS_DATE_CREATED_LOCATOR = By.xpath("//table/tbody/tr/td[4]");

    public final static By PLANS_DATE_EXPIRED_LOCATOR = By.xpath("//table/tbody/tr/td[5]");

}
