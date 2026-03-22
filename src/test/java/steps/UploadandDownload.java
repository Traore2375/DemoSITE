package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.PageObject;
import utilities.Actioncursor;

import static hooks.Hooks.driver;

public class UploadandDownload {
    PageObject pob = new PageObject(driver);

    @Given("i connect on url {string}")
    public void i_connect_on_url(String string) {
      driver.navigate().to(string);
    }
    @When("click button download")
    public void click_button_download() {
        pob.downloadfile();

    }
    @When("click button choose file")
    public void click_button_choose_file() {
     pob.chooseFile();

    }
    @When("chose on your pc")
    public void chose_on_your_pc() {
        System.out.println("---------------fichier importer--------------");
    }
    @Then("import into system")
    public void import_into_system() {
        System.out.println("fichier importer avec succes");
    }


}
