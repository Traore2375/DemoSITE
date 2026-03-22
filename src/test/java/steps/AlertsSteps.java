package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.PageAlerts;

import static hooks.Hooks.driver;

public class AlertsSteps {
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
        System.out.println("----- FIRST TEST----------");
    }


    @When("click the second button")
    public void click_the_second_button() {
        pageAlerts.setBtnalertsecond();
    }
    @Then("the message display after {int} second")
    public void the_message_display_after_second(Integer int1) {
        System.out.println("--- TEST OK ----");
    }
    @Then("click button OK")
    public void click_button_ok() {
        System.out.println("--- TEST2 OK ----");
    }
    @When("click the thirst button")
    public void click_the_thirst_button() {
     pageAlerts.setBtnthirst();
    }
    @Then("the popup display")
    public void the_popup_display() {
        System.out.println("--- TEST3 OK ----");
    }
    @Then("click button OK to confirm and verfiy {string}")
    public void click_button_ok_to_confirm_and_verfiy(String string) {
       pageAlerts.setBtnconfirmmessage(string);
    }
    @When("click the fourth button")
    public void click_the_fourth_button() {
       pageAlerts.setBtnfourth();
    }
    @Then("the popup displayed")
    public void the_popup_displayed() {
        System.out.println("--- TEST 4 OK ----");
    }
    @Then("enter your name {string} and click ok")
    public void enter_your_name_and_click_ok(String string) {

        pageAlerts.setBtnpromptmessage(string);
    }
}
