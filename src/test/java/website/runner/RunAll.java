package website.runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import website.pages.SetupPage;
import website.utils.ConfigFileReader;

import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/website",
        glue = "classpath:website.definesteps",
        tags = "@RegisterTest",
        // execute scenarios which are tagged either ATest and BTest
        //tags = {"@HelpTest,@ContactUsTest,@LocateUsTest"},
        // execute scenario which have both tags ATest and BTest
        //tags = {"@ATest","@BTest"},
        // ~to ignore tag
        //tags = {"~@ATest,@BTest"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class RunAll extends SetupPage {



    @AfterClass
    public static void writeExtentReport() throws IOException {
        Reporter.loadXMLConfig(new File(ConfigFileReader.getReportConfigPath()));
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", 	"MacBook Pro (13-inch, 2017, Two Thunderbolt 3 ports)");
        Reporter.setSystemInfo("Appium", "6.1.0");
        Reporter.setSystemInfo("Java Version", "10");
    }
}
