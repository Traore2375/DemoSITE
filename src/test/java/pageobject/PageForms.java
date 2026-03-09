package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageForms {

  //ELEMENT WEB PAGE
    String targetDay = "02";
    String targetMonth = "March";
    String targetYear = "2026";

    int maxAttempts = 24;
    int count = 0;
    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement btnmenuforms;

    @FindBy(id = "firstName")
    private WebElement btnfirstname;

    @FindBy(id = "lastName")
    private WebElement btnlastname;

    @FindBy(id = "userEmail")
    private WebElement btnuserEmail;

    @FindBy(id = "gender-radio-1")
    private WebElement btngenremasculin;

    @FindBy(id = "userNumber")
    private WebElement btnnumero;

    @FindBy(id = "dateOfBirthInput")
    private WebElement btncalendar;


    @FindBy(id = "subjectsInput")
    private WebElement btnsubjects;

    @FindBy(id = "hobbies-checkbox-1")
    private WebElement btnsport;


    @FindBy(id = "uploadPicture")
    private WebElement btnchoosefileform;

    @FindBy(id = "currentAddress")
    private WebElement btncurrentAddress;

    @FindBy(xpath= "//*[local-name()='path' and contains(@d,'4.516 7.548')]")
    private WebElement btnselectcountry;

    @FindBy(id= "submit")
    private WebElement btnformsubmit;

    @FindBy(className = "react-datepicker__month-select")
    private WebElement btnmonth;

    @FindBy(className = "react-datepicker__year-select")
    private WebElement btnyear;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and text()='2']")
    private WebElement btnday;

    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/button[2]")
    private WebElement btnnextmonth;

    WebDriver driver;
    public PageForms(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    //methode

    public void registerForm(String name,String lastnam,String mail,String tel,String adress) throws InterruptedException {
               btnmenuforms.click();
               btnfirstname.sendKeys(name);
               btnlastname.sendKeys(lastnam);
               btnuserEmail.sendKeys(mail);
               btngenremasculin.click();
               btnnumero.sendKeys(tel);


// Ouvrir calendrier
        btncalendar.click();


           Select selectmonth= new Select(btnmonth);
           selectmonth.selectByVisibleText("March");

           Select selectyear = new Select(btnyear);
           selectyear.selectByVisibleText("2026");


        btnsubjects.sendKeys("remplissage formulaire");
        btnsport.click();
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0, 8000);");
        btncurrentAddress.sendKeys(adress);
     Thread.sleep(200);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        btnformsubmit.click();

            Thread.sleep(200);
    }



}
