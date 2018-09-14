package website.definesteps;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import website.pages.SetupPage;

import java.io.IOException;

public class Hooks extends SetupPage {
    @Before
    public void beforeScenario(Scenario scenario) throws Exception {
        Reporter.assignAuthor("Johannes Henkie");
        //initialisation();
//        if(driver != null) {
//            driver.;
//        }else {
        setupChromeDriverLocation();
        //}
    }

    @After(order = 1)
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            try {
                takeScreenshot(screenshotName);
            } catch (IOException e) {
                System.out.println(e.getStackTrace());

            }
        }
    }
//
    @After(order = 0)
    public void AfterSteps() {
        driver.quit();
    }
}
