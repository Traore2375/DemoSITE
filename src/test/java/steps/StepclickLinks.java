package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.PageObject;

import static hooks.Hooks.driver;

public class StepclickLinks {
  PageObject pageObject = new PageObject(driver);
    @Given("I launches page {string}")
    public void i_launches_page(String string) {
        driver.navigate().to(string);
    }
    @When("i click links home")
    public void i_click_links_home() {
       pageObject.clickbuttonhome();
    }
    @Then("the new page is show")
    public void the_new_page_is_show() {
        System.out.println("---------------------------");
    }
    @Then("verify the title page that is {string}")
    public void verify_the_title_page_that_is(String string) {
        System.out.println("------------------------");
    }
}
