package test.excutions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.SeleniumUtility;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends SeleniumUtility {
@Before
public void setupTests(){
    openBrowser();}
    @AfterStep
    public void takeScreenshotAfterEachStep(Scenario scenario) {
      byte[] screenshot = takeScreenshot();
       scenario.attach(screenshot, "image/png", "screenshot");
   }


@After
public void cleanUpTests(Scenario scenario) {
    if(scenario.isFailed()){

byte[] picture = takeScreenshot();
scenario.attach(picture,"image/png","failedScreenShot");
    }
    closeBrwoser();
}


}
