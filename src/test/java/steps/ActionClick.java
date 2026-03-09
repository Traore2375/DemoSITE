package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.PageObject;

import static hooks.Hooks.driver;

public class ActionClick {
 PageObject page = new PageObject(driver);
    @Given("connect to system {string}")
    public void connect_to_system(String string) {
        driver.navigate().to(string);

    }
    @When("you show the page double clic button")
    public void you_show_the_page_double_clic_button() {
        page.doubleclickbtn();
    }
    @Then("verify that message is {string}")
    public void verify_that_message_is(String string) {
        System.out.println("-------------");
    }

    @When("you show the page click Right")
    public void you_show_the_page_click_right() {
        connect_to_system("https://demoqa.com/buttons");
      page.setBtnrightclick();
    }

    @When("you show the page click me")
    public void you_show_the_page_click_me() {
        connect_to_system("https://demoqa.com/buttons");
       page.setBtnclick();

    }

}
