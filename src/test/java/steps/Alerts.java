package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.PageAlerts;

import static hooks.Hooks.driver;

public class Alerts {
    PageAlerts pageAlerts = new PageAlerts(driver);

    @Given("go to page alert {string}")
    public void go_to_page_alert(String string) {
      driver.navigate().to(string);
    }
    @When("click the first button")
    public void click_the_first_button() {
    pageAlerts.setBtnfirstalert();
    }
    @Then("the message display")
    public void the_message_display() {
        System.out.println("---- test OK --------");
    }

    @When("click the second button")
    public void click_the_second_button() {
        pageAlerts.setBtnalertsecond();

    }
    @Then("the message display after {int} second")
    public void the_message_display_after_second(Integer int1) {
        System.out.println("----- test OK --------");
    }
    @Then("click button OK")
    public void click_button_ok() {
        System.out.println("-------ok ----------");
    }

    @When("click the thirst button")
    public void click_the_thirst_button() {
       pageAlerts.setBtnthirst();
    }
    @Then("the popup display")
    public void the_popup_display() {
        System.out.println("-----test OK -------");
    }
    @Then("click button OK to confirm")
    public void click_button_ok_to_confirm() {
        System.out.println("-----test OK -------");
    }

    @When("click the fourth button")
    public void click_the_fourth_button() {
    pageAlerts.setBtnfourth();
    }
    @Then("the popup displayed")
    public void the_popup_displayed() {
        System.out.println("---test ok -----");
    }
    @Then("enter your name and click ok")
    public void enter_your_name_and_click_ok() {
        System.out.println("-- test OK--------");
    }

}
