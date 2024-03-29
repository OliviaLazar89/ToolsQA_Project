package ShareData;

import Logger.LoggerUtility;
import ShareData.Browser.BrowserFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ShareData {
    //o clasa de baza in care poti sa salvezi informaii ce vor fi vizibile in tot proiectul
    private WebDriver driver;

    public void Setup(){
//        driver = new ChromeDriver();
//        driver.get("https://demoqa.com/");
//        driver.manage().window().maximize();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // asteapta pana se incarca  max 10 secunde
//        LoggerUtility.info("The browser was opened with success");

        driver = new BrowserFactory().getBrowserDriver(); //Se fac toate configurarile de mai sus

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,450)");
    }


    public void clear(){
        driver.quit();
        LoggerUtility.info("The browser was closed with success");
    }

    public WebDriver getDriver() {
        return driver;
    }
}
