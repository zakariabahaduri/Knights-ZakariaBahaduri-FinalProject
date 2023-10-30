package framework.bdd.basesetup;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {
    private static WebDriver driver;


    public void openBrowser() {
String configPathFile= System.getProperty("user.dir")+"/src/test/resources/configs/config.properties";
        Properties properties = new Properties();

        try {
            FileInputStream configfile= new FileInputStream(configPathFile);
            try {
                properties.load(configfile);
            } catch (IOException e) {
                e.getStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }

        String baseURL = properties.getProperty("url");
       String browserType= properties.getProperty("browser");
      //String  chromeOptions = Properties.getProperty("browser.option.headless");

        if (browserType.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            driver = new ChromeDriver(options);

        }
        else if (browserType.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        }
        else if (browserType.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();

        }

        else {
throw new RuntimeException("Wrong broswer type");
        }
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
driver.get(baseURL);

    }
    public  void closeBrwoser() {
        if (driver != null) {
            driver.quit();
        }

    }
    public  WebDriver getDriver() {
        return driver;}
}
