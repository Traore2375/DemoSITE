package pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class PageObject {
  WebDriver driver;

    @FindBy(className = "header-text")
    private WebElement elementspage;

    @FindBy(className = "text")
    private WebElement chexbox;


    @FindBy(id="userName")
    private WebElement username;

    @FindBy(id="userEmail")
    private WebElement userMail;

    @FindBy(id="currentAddress")
    private WebElement currentAddress;

    @FindBy(id="permanentAddress")
    private WebElement permanentAddress;

    @FindBy(id="submit")
    private WebElement buttonsubmit;

    @FindBy(css = ".border col-md-12 col-sm-12")
    private WebElement resume;



  @FindBy(xpath = "//span[text()='Check Box']")
   private WebElement checkboxelement;


    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div[1]/span[2]")
    private WebElement buttonplus;


    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div[2]/span[2]")
    private WebElement buttondekstop;


    @FindBy(className = "rc-tree-checkbox")
    private WebElement buttonnote;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div/div/div[4]/span[3]")
    private WebElement buttoncommand;
   @FindBy(id="result")
   private WebElement buttonresult;


    @FindBy(xpath = "//span[contains(text(),'Radio Button')]")
    private WebElement buttonradio;

    @FindBy(id = "yesRadio")
    private WebElement buttonradioyes;


    @FindBy(className = "text-success")
    private WebElement resultbuttonradio;

    @FindBy(id = "addNewRecordButton")
    private WebElement buttonAdd;



    //ELEMENTS FORMULAIRE
     @FindBy(id = "firstName")
     private WebElement firstname;

     @FindBy(id = "lastName")
     private WebElement lastname;
     @FindBy(id = "userEmail")
     private WebElement mail;

     @FindBy(id = "age")
     private WebElement age ;

     @FindBy(id = "salary")
     private WebElement salary;
     @FindBy(id = "department")
     private WebElement department;

     @FindBy(id = "submit")
     private WebElement btnsubmit;

    //
    //WEB ELEMENT ACTION CLICK


    @FindBy(id = "doubleClickBtn")
    private WebElement btndoubleclick;

    @FindBy(id = "rightClickBtn")
    private WebElement btnrightclick;

    @FindBy(xpath = "//button[text()='Click Me']")
    private WebElement btnclick;

    @FindBy(id = "rightClickMessage")
    private WebElement messrightclick;

    @FindBy(id = "dynamicClickMessage")
    private WebElement messagedynamicclick;

    @FindBy(id = "doubleClickMessage")
    private WebElement messagedbleclick;

    //---------- ELEMENT PAGE LINKS ---------------
    @FindBy(linkText = "Home")
    private WebElement btnHome;


    //ELLEMENT DOWN AND UPLOAD

    @FindBy(id = "downloadButton")
    private WebElement btndownload;

    @FindBy(id = "uploadFile")
    private WebElement btnchoosefile;


    //constructor
    public PageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
   //Methods

    public void setElementspage() {
        elementspage.click();
    }

    public void setChexbox() {
       chexbox.click();
    }

    public void setUsername(String arg){
        username.sendKeys(arg);
    }

    public void setUserMail(String arg){
        userMail.sendKeys(arg);
    }

    public void setCurrentAddress(String arg) {

        currentAddress.sendKeys(arg);
    }

    public void setPermanentAddress(String arg){
        permanentAddress.sendKeys(arg);
    }

    public void setButtonsubmit(){
        buttonsubmit.click();
    }

    public String setResume(){
       return  resume.getText();

    }

    public Map<String, String> getAllUserInfo() {
        Map<String, String> data = new LinkedHashMap<>();
        data.put("Name", username.getText());
        data.put("Email", userMail.getText());
        data.put("Current Address", currentAddress.getText());
        data.put("Permanent Address", permanentAddress.getText());
        return data;
    }



    // Methode checkbox

    public void setCheckboxelement(){
        checkboxelement.click();
    }

    public void setButtonplus() throws InterruptedException {

        buttonplus.click();
    }

    public void setButtondekstop(){
        buttondekstop.click();
    }

    public void setButtonnote(){
        buttonnote.click();
    }

    public void setButtoncommand(){
        buttoncommand.click();
    }

    public String setButtonresult(){
        return buttonresult.getText();

    }

    public void setButtonradio(){
        buttonradio.click();
    }

    public void setButtonradioyes(){
        buttonradioyes.click();
    }

    public String setResultbuttonradio(){
      return   resultbuttonradio.getText();

    }

    public void  setButtonAdd(){
    buttonAdd.click();
    }

    public void setinsertpersontable(String name, String lastnam, String email, String ages, String salarie,String departement){
        firstname.sendKeys(name);
        lastname.sendKeys(lastnam);
        userMail.sendKeys(email);
        age.sendKeys(ages);
        salary.sendKeys(salarie);
        department.sendKeys(departement);
        btnsubmit.click();

    }

    public  void doubleclickbtn(){
        Actions actions = new Actions(driver);
        actions.doubleClick(btndoubleclick).perform();
        System.out.println("---- : "+messagedbleclick.getText().toUpperCase(Locale.ROOT));
    }

    public void setBtnrightclick(){
        Actions actions = new Actions(driver);
        actions.contextClick(btnrightclick)
                .moveToElement(btnrightclick)
                .click()
                .perform();
        System.out.println("---- : "+messrightclick.getText().toUpperCase(Locale.ROOT));
    }

    public void setBtnclick(){
        btnclick.click();
        System.out.println("---- : "+messagedynamicclick.getText().toUpperCase(Locale.ROOT));
    }

    public void clickbuttonhome(){

        String ongletInitial = driver.getWindowHandle();

// Cliquer sur le bouton/lien qui ouvre un nouvel onglet
        btnHome.click();
// Attendre qu’un nouvel onglet apparaisse
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(driver -> !driver.getWindowHandles().isEmpty());

// Parcourir les onglets et basculer vers le nouveau
        for (String onglet : driver.getWindowHandles()) {
            if (!onglet.equals(ongletInitial)) {
                driver.switchTo().window(onglet);
                break;
            }
        }
        System.out.println("Titre nouvel onglet : " + driver.getTitle());

        driver.switchTo().window(ongletInitial);
        System.out.println("Titre onglet initial : " + driver.getTitle());
    }
public void verifyTitle(){

}

public void downloadfile(){
        btndownload.click();
}
public void chooseFile(){

        btnchoosefile.sendKeys("C:\\Users\\TRAORE\\Downloads\\sampleFile (8)");
}
public void uploadfile(){

}
}


