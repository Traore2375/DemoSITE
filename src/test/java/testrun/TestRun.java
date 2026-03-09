package testrun;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/Feature"},glue ={"hooks" ,"steps"},monochrome = true, dryRun = false,
        plugin = { "pretty", "html:target/cucumber-report.html","json:target/cucumber.json" } )

public class TestRun {
}
