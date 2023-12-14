package Tests;

import ObjectData.AlertObject;
import Pages.AlertFrameWindow.AlertFrameWindowPage;
import Pages.AlertFrameWindow.AlertPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.testng.annotations.Test;
import ShareData.Hooks;

public class AlertTest extends Hooks {

       @Test
    public void testMethod() {

              AlertObject alertObject = new AlertObject(testData);

           HomePage homePage = new HomePage(getDriver());
           homePage.clickAlertFrameWindow();

           AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
           alertFrameWindowPage.clickAlerts();

//        WebElement alerts = driver.findElement(By.xpath("//span[text()='Alerts']"));
//        alerts.click();
//        liniile 22-23 inlocuiesc aceste 2 linii comentate de mai sus;
//        am folosit refactor, adica am redus liniile de cod

           AlertPage alertPage = new AlertPage(getDriver());
           alertPage.interractAlertOK();

//         WebElement alertOkButton = driver.findElement(By.id("alertButton"));
//        alertOkButton.click();
//        Alert alertOk = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
//        alertOk.accept();  // asta inseamna OK

           alertPage.interractAlertDelay();

//           WebElement alertDelayButton = driver.findElement(By.id("timerAlertButton"));
//           alertDelayButton.click();
//           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //obiect care face un wait explicit
//           wait.until(ExpectedConditions.alertIsPresent());
//           Alert alertDelay = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
//           alertDelay.accept();

           alertPage.interractAlertDismiss();

//           WebElement alertOKCancelButton = driver.findElement(By.id("confirmButton"));
//           alertOKCancelButton.click();
//           Alert alertOKCancel = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
//           alertOKCancel.dismiss();

           alertPage.interractAlertValue(alertObject);

//           WebElement alertValueButtoon = driver.findElement(By.id("promtButton"));
//           alertValueButtoon.click();
//           Alert alertValue = driver.switchTo().alert();  // metoda care se muta cu focusul pe mesajul de alerta care apare
//           alertValue.sendKeys("Text");
//           alertValue.accept();
       }
}
