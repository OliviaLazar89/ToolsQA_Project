package Pages.AlertFrameWindow;

import ObjectData.AlertObject;
import Pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertPage extends BasePage {
    public AlertPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "alertButton")
   private WebElement alertOkButton;

    @FindBy (id = "timerAlertButton")
    private WebElement alertDelayButton;

    @FindBy(id = "confirmButton")
    private WebElement alertOKCancelButton;

    @FindBy(id = "promtButton")
    private  WebElement alertValueButtoon;


    public void interractAlertOK(){
        alertOkButton.click();
        alertMethods.acceptAlert();
//        Alert alertOk = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
//        alertOk.accept();
    }

    public void  interractAlertDelay(){
        alertDelayButton.click();
        alertMethods.acceptAlert();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //obiect care face un wait explicit
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alertDelay = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
//        alertDelay.accept();
    }
    public void interractAlertDismiss(){
        alertOKCancelButton.click();
        alertMethods.cancelAlert();
//        Alert alertOKCancel = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
//        alertOKCancel.dismiss();
    }
    public void interractAlertValue(AlertObject alertObject){
        alertValueButtoon.click();
        alertMethods.fillAlert(alertObject.getPromptAlertValue());
//        Alert alertValue = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
//        alertValue.sendKeys(value);
//        alertValue.accept();
    }
}
