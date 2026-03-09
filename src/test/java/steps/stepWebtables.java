package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.PageObject;

import java.util.List;
import java.util.Map;

import static hooks.Hooks.driver;

public class stepWebtables {
  PageObject pob = new PageObject(driver);
    @Given("go to webtable {string}")
    public void go_to_webtable(String string) {
        driver.navigate().to(string);
    }
    @When("we see table click button add")
    public void we_see_table_click_button_add() {
        pob.setButtonAdd();
    }

    @When("I enter {string} {string} {string} {string} {string} {string}")
    public void i_enter(String string, String string2, String string3, String string4, String string5, String string6) {

        pob.setButtonAdd();
        pob.setinsertpersontable(string,string2,string3,string4,string5,string6);
    }
    @When("click submit button")
    public void click_submit_button() {
        System.out.println("------------------form is sending correctly------------------------------");
    }
    @Then("verify the details of table")
    public void verify_the_details_of_table() {
        System.out.println("------------------");
    }

}
