package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobject.PageObject;

import java.util.List;
import java.util.Map;

import static hooks.Hooks.driver;

public class StepdefLogin {

    PageObject pageobject = new PageObject(driver);
    @Given("go to url{string}")
    public void goToUrl(String arg0) {
      driver.navigate().to(arg0);
    }

    @Then("click elements")
    public void click_elements() {
        pageobject.setElementspage();
    }
    @Then("choice tesbox")
    public void choice_tesbox() {
        pageobject.setChexbox();
    }


    @Then("input fullname {string}")
    public void input_fullname(String string) {
        pageobject.setUsername(string);
    }

    @Then("input email {string}")
    public void input_email(String string) {
       pageobject.setUserMail(string);
    }

    @Then("input currentadress {string}")
    public void input_currentadress(String string) {
       pageobject.setCurrentAddress(string);
    }

    @Then("input permanent adress {string}")
    public void input_permanent_adress(String string) {
        pageobject.setPermanentAddress(string);
    }

    @Then("click button submit")
    public void click_button_submit() {
        pageobject.setButtonsubmit();

    }

    @Then("verify the message to :")
    public void verify_the_message_to(io.cucumber.datatable.DataTable dataTable) {
        // Récupérer les données attendues depuis le Gherkin
        Map<String, String> expectedData = dataTable.asMap(String.class, String.class);
        Map<String, String> actualData = pageobject.getAllUserInfo();

        // Vérifier que les clés sont identiques
        Assert.assertEquals("Les champs affichés sont différents",
                expectedData.keySet(),
                actualData.keySet());

        // Vérification valeur par valeur
        for (String key : expectedData.keySet()) {
            Assert.assertEquals("Erreur sur le champ: " + key,
                    expectedData.get(key),
                    actualData.get(key));
        }
    }


}
