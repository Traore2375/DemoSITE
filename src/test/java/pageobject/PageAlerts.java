package pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageAlerts {
    WebDriver driver;



    public PageAlerts(WebDriver driver){this.driver = driver;
        PageFactory.initElements(driver, this);}


@FindBy(id = "alertButton")
private WebElement btnfirstalert;

@FindBy(id = "timerAlertButton")
private WebElement btnalertsecond;

@FindBy(id = "confirmButton")
private WebElement btnthirst;

@FindBy(id = "promtButton")
private WebElement btnfourth;

public void setBtnfirstalert(){
        btnfirstalert.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        // Attendre que l'alerte apparaisse
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

    }

    public void setBtnalertsecond(){
       btnalertsecond.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Attendre que l'alerte apparaisse
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
public void setBtnthirst(){
    btnthirst.click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // Attendre que l'alerte apparaisse
    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
    alert.accept();
}

public void setBtnfourth(){
    btnfourth.click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // Attendre que l'alerte apparaisse
    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
    alert.sendKeys("TRAORE");
    alert.accept();


}

}
