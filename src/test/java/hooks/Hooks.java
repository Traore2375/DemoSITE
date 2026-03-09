package hooks;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import pageobject.PageForms;
import pageobject.PageObject;
import utilities.ExtentManager;

import java.io.File;
import java.lang.module.Configuration;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Hooks {
   PageObject pageobject;
   PageForms pageForms;
    public static WebDriver  driver;
    ExtentReports extent = ExtentManager.getInstance();
    ExtentTest scenarioTest;


    @Before
    public void setup(Scenario scenario){

        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> prefs = new HashMap<>();

        prefs.put("profile.default_content_setting_values.notifications", 2); // bloque notifications
        prefs.put("profile.default_content_setting_values.popups", 2); // bloque popups

        options.setExperimentalOption("prefs", prefs);



        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver(options);
        driver.get("https://demoqa.com/");

        pageobject =new PageObject(driver);
        pageForms =new PageForms(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        scenarioTest = extent.createTest(scenario.getName());

        scenarioTest.fail("FAILED");
        scenarioTest.pass("PASS");
        extent.flush();

    }



    @After
    public void teardown(Scenario scenario) {

        // Si le scénario échoue, prendre une capture d’écran
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot-failed");

        }



        // Fermer le driver
        if (driver != null) {
            driver.quit();
        }
    }


}
