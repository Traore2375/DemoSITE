package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.PageObject;

import static hooks.Hooks.driver;
import static org.junit.Assert.assertEquals;

public class StepRadiobutton {
    PageObject pageobject = new PageObject(driver);


    @Given("search button radio {string}")
    public void search_button_radio(String string) {
        driver.navigate().to(string);
        pageobject.setCheckboxelement();
    }
    @When("I see button radio click")
    public void i_see_button_radio_click() {
     pageobject.setButtonradio();
    }
    @When("choice the button yes")
    public void choice_the_button_yes() {
      pageobject.setButtonradioyes();
    }
    @Then("verify that message {string} is correct")
    public void verify_that_message_is_correct(String string) {
      assertEquals(pageobject.setResultbuttonradio(),string);
    }

}
