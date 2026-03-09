package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobject.PageObject;

import static hooks.Hooks.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class stepCheckBox {
    PageObject pageobject = new PageObject(driver);


    @Given("go to checkbox section and click {string}")
    public void go_to_checkbox_section_and_click(String string) {
       driver.navigate().to(string);
       pageobject.setCheckboxelement();
    }
    @Given("select button plus")
    public void select_button_plus() throws InterruptedException {
        pageobject.setButtonplus();
    }
    @Given("click button desktop")
    public void click_button_desktop() {
      pageobject.setButtondekstop();
    }
    @Given("choise notes")
    public void choise_notes() {
        pageobject.setButtonnote();
    }
    @Given("choise commands")
    public void choise_commands() {
       pageobject.setButtoncommand();
    }
    @Then("verify that the message {string}")
    public void verify_that_the_message(String string) {
        assertEquals(pageobject.setButtonresult(),string);
    }
}
