package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pageobject.PageLoginexcel;
import pageobject.PageObject;
import utilities.Actioncursor;
import utilities.ExcelUtils;

import static hooks.Hooks.driver;

public class Registerformexcelstep {

    PageLoginexcel pageLoginexcel = new PageLoginexcel(driver);
    Actioncursor actioncursor= new Actioncursor();
    @Given("go to site demo {string}")
    public void go_to_site_demo(String string) {
       driver.navigate().to(string);
    }

    @Given("give the {string} and password {string}")
    public void give_the_and_password(String string, String string2) throws Exception {
        String dossier = System.getProperty("user.dir");
        String path = dossier +"/src/test/resources/data/Testdata.xlsx" ;
        System.out.println(" le chemin est :"+path);
        ExcelUtils.setExcelFile(path, "data");

        String username = ExcelUtils.getCellData(2,0);
        String password = ExcelUtils.getCellData(2,1);
         pageLoginexcel.setLogin(username,password);

    }
    @Given("click bouton new user")
    public void click_bouton_new_user() {
        pageLoginexcel.setBtnnewuser();
    }
    @When("the page register appear")
    public void the_page_register_appear() {
        String title = driver.getTitle();
        Assert.assertEquals("demosite", title);
    }
    @When("insert the {string} and {string} and {string} and {string}")
    public void insert_the_and_and_and(String string, String string2, String string3, String string4) {
        String username = ExcelUtils.getCellData(2,0);
        String password = ExcelUtils.getCellData(2,2);
        String firstname = ExcelUtils.getCellData(2,0);
        String lastname= ExcelUtils.getCellData(2,1);

        pageLoginexcel.setregister(firstname,lastname,username,password);

        System.out.println("------info" +username +password+firstname);
    }
    @When("click on button register")
    public void click_on_button_register() throws InterruptedException {
      pageLoginexcel.clickbtnregister();
        Thread.sleep(2000);
    }
    @When("click back login")
    public void click_back_login() throws InterruptedException {
        Thread.sleep(1000);
        actioncursor.scroll(driver);
        pageLoginexcel.setBtnbacklogin();
    }
    @Then("the page login is appear")
    public void the_page_login_is_appear() {
        System.out.println("--------------------c est super ----------------");
    }
}
