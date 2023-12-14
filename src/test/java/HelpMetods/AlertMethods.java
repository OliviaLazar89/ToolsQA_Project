package HelpMetods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertMethods {
    private WebDriver driver;  // scopul clasei e sa ne ofere doar metodele, nu si driverul, de
                                  // aceea putem face driverul privat
    public AlertMethods(WebDriver driver) {

        this.driver = driver;
    }

    private void waitForAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //obiect care face un wait explicit
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void acceptAlert(){
        waitForAlert();
        Alert alertOk = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
        alertOk.accept();
    }

    public void cancelAlert(){
        waitForAlert();
        Alert alertOKCancel = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
        alertOKCancel.dismiss();
    }

    public void fillAlert(String value){
        waitForAlert();
        Alert alertValue = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
        alertValue.sendKeys(value);
        alertValue.accept();
    }
}
