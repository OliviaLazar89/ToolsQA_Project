package Pages.AlertFrameWindow;

import Logger.LoggerUtility;
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
        LoggerUtility.info("The user clicks on alertOk button");
        alertMethods.acceptAlert();
        LoggerUtility.info("The user clicks on Ok button");
//        Alert alertOk = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
//        alertOk.accept();
    }

    public void  interractAlertDelay(){
        alertDelayButton.click();
        LoggerUtility.info("The user clicks on alertDelay button");
        alertMethods.acceptAlert();
        LoggerUtility.info("The user waits 5 seconds to appear window then clicks on Ok button");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //obiect care face un wait explicit
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alertDelay = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
//        alertDelay.accept();
    }
    public void interractAlertDismiss(){
        elementMethods.clickElement(alertOKCancelButton);
       // alertOKCancelButton.click();
        LoggerUtility.info("The user clicks on alertOkCancel button");

        alertMethods.cancelAlert();
        LoggerUtility.info("The user clicks on Cancel button");
//        Alert alertOKCancel = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
//        alertOKCancel.dismiss();
    }
    public void interractAlertValue(AlertObject alertObject){
        elementMethods.clickElement(alertValueButtoon);
       // alertValueButtoon.click();
        LoggerUtility.info("The user clicks on alertValue button");

        alertMethods.fillAlert(alertObject.getPromptAlertValue());
        LoggerUtility.info("The user writes a message and clicks Ok button");
//        Alert alertValue = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
//        alertValue.sendKeys(value);
//        alertValue.accept();
    }
}
