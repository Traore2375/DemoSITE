package testrun;

import io.cucumber.testng.CucumberOptions;
import org.testng.Assert;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


@CucumberOptions( features = "src/test/resources/Feature",
        glue = {"steps", "hooks"},                // packages Java de tes step definitions
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"},
        tags = "@Alert" )

public class TestRun extends AbstractTestNGCucumberTests {
}
