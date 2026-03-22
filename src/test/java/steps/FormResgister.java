package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.PageForms;

import static hooks.Hooks.driver;

public class FormResgister {
    PageForms pageForms = new PageForms(driver);

    @Given("go site demo {string}")
    public void go_site_demo(String string) {
       driver.navigate().to(string);
    }
    @When("input the details {string} {string} {string} {string} {string}")
    public void input_the_details(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        pageForms.registerForm(string,string2,string3,string4,string5);
    }
    @Then("verify that some all information is correct")
    public void verify_that_some_all_information_is_correct() {
        System.out.println("---------test is correct----------");
    }
}
