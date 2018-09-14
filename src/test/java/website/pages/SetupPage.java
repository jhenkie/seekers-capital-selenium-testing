package website.pages;

import com.cucumber.listener.Reporter;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

import static java.util.concurrent.TimeUnit.SECONDS;

public class SetupPage {
    public static WebDriver driver;

    @Before
    public void setupChromeDriverLocation() {
        String wrkdir = System.getProperty("user.dir");
        String chromeDriverLocation = wrkdir + "/libs/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
        ChromeOptions chromeOptions = new ChromeOptions();

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().setSize(new Dimension(1250, 768));
        driver.manage().timeouts().implicitlyWait(30, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, SECONDS);
    }

    public void takeScreenshot (String aa) throws IOException {
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + aa + ".png");
        FileUtils.copyFile(source, destinationPath);

        Reporter.addScreenCaptureFromPath(destinationPath.toString());
    }

    public void verifyElement(String text, WebElement element) {
        Assert.assertEquals(text,element.getText());
    }
}
