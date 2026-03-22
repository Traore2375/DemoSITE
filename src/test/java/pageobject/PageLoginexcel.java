package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLoginexcel {
    WebDriver driver;
    public PageLoginexcel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "userName")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "newUser")
    private  WebElement btnnewuser;


    @FindBy(id = "firstname")
    private WebElement firstname;

    @FindBy(id = "lastname")
    private WebElement lastname;

    @FindBy(id = "userName")
    private WebElement usernamenew;

    @FindBy(id = "password")
    private WebElement passwordnew;

    @FindBy(id = "register")
    private WebElement btnregister;

    @FindBy(id = "gotologin")
    private WebElement btnbacklogin;

    public void setLogin(String usernam, String pass){
             username.sendKeys(usernam);
             password.sendKeys(pass);
    }

   public void setBtnnewuser(){
        btnnewuser.click();
   }

 public void setregister(String first, String last, String username, String password){
        firstname.sendKeys(first);
        lastname.sendKeys(last);
        usernamenew.sendKeys(username);
        passwordnew.sendKeys(password);
 }

 public void clickbtnregister(){
        btnregister.click();
 }

 public void setBtnbacklogin(){
        btnbacklogin.click();
 }
}