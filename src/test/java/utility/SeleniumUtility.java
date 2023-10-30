package utility;

import framework.bdd.basesetup.BaseSetup;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class SeleniumUtility extends BaseSetup {

private WebDriverWait getWait () {
return  new WebDriverWait(getDriver(), Duration.ofMinutes(1));
}

private WebElement waitUntilVilisablityOfElement(By element) {
    return getWait().until(ExpectedConditions.visibilityOfElementLocated(element));
}
    private WebElement waitUntilElementIsClickable(By element) {
    return getWait().until(ExpectedConditions.elementToBeClickable(element));
    }
    public String getElementText(By element) {

    return waitUntilVilisablityOfElement(element).getText();

}
public WebElement isElementpresent(By element) {
    return getWait().until(ExpectedConditions.visibilityOfElementLocated(element));
}
public WebElement getElement (By element) {
    return  getWait().until(ExpectedConditions.visibilityOfElementLocated(element));
}
public void getClickOnElement(By element) {
    getWait().until(ExpectedConditions.elementToBeClickable(element)).click();
}
public void sendKey(By element , String text) {
    getWait().until(ExpectedConditions.visibilityOfElementLocated(element)).sendKeys(text);
}
private List<WebElement> getListOfWebElements(By locator) {
return    getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

}
public int getNumberOfRows(By locator) {
    return getListOfWebElements(locator).size();
}

public void getListOfWebElementStringsDateComparison (By locator) throws ParseException {
    List <WebElement> webElementsTexts = getListOfWebElements(locator) ;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    LocalDate localDate = LocalDate.now();
    SimpleDateFormat formater = new SimpleDateFormat("MMMM d,yyyy", Locale.ENGLISH);

    ZoneId defaultZoneId = ZoneId.systemDefault();
Date localDate1= Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
   Date actualDate;


    for (int i=0; i<webElementsTexts.size(); i++)  {
        System.out.println(webElementsTexts.get(i).getText());
        actualDate=formater.parse(webElementsTexts.get(i).getText());
        Assert.assertEquals(actualDate,localDate1);

    }
}
    public void getTommorowsDateAsDateCreated (By locator) throws ParseException {
        List <WebElement> webElementsTexts = getListOfWebElements(locator) ;
        LocalDate localDate = LocalDate.now().plusDays(1);
        SimpleDateFormat formater = new SimpleDateFormat("MMMM d,yyyy", Locale.ENGLISH);
        ZoneId defaultZoneId = ZoneId.systemDefault();

        Date localDate1= Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        Date actualDate;


        for (int i=0; i<webElementsTexts.size(); i++)  {
            System.out.println(webElementsTexts.get(i).getText());
            actualDate=formater.parse(webElementsTexts.get(i).getText());
            Assert.assertEquals(actualDate,localDate1);

        }

    }
    public byte[] takeScreenshot() {
        //Somehow attached screenshot of the failure
        //Step 1) Take Screenshot with Selenium
        TakesScreenshot screenshot = (TakesScreenshot) getDriver();
        //for cucumber reports Output Type should Byte[]
        return screenshot.getScreenshotAs(OutputType.BYTES);
    }

}
