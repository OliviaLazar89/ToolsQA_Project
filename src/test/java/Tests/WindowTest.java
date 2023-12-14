package Tests;

import Pages.AlertFrameWindow.AlertFrameWindowPage;
import Pages.HomePage;
import Pages.AlertFrameWindow.WindowsPage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class WindowTest extends ShareData {

    @Test

    public void testMethod() {

//        WebElement alertsFrameWindow = getDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        alertsFrameWindow.click();
//

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertFrameWindow();

//        WebElement browserWindow = getDriver().findElement(By.xpath("//span[text()='Browser Windows']"));
//        browserWindow.click();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickWindows();

        WindowsPage windowsPage = new WindowsPage(getDriver());
        windowsPage.interractTab();
        windowsPage.interractWindow();

//        WebElement newTabButton = getDriver().findElement(By.id("tabButton"));
//        newTabButton.click();
//
//        System.out.println("Url: " + getDriver().getCurrentUrl());
//
//        List<String> tabs = new ArrayList<>(getDriver().getWindowHandles());  //ne da lista de tab-uri
//        getDriver().switchTo().window(tabs.get(1)); // ne da al doilea tab
//
//        System.out.println("Url: " + getDriver().getCurrentUrl());
//
//        getDriver().close();  //inchide tab-ul pe care te afli ; pe cand quit inchide tot ce ai
//        getDriver().switchTo().window(tabs.get(0));  // merge pe tabul initial

//        WebElement newWindowButton = getDriver().findElement(By.id("windowButton"));
//        newWindowButton.click();
//
//        System.out.println("Url: " + getDriver().getCurrentUrl());
//
//        List<String> windows = new ArrayList<>(getDriver().getWindowHandles());  //ne da lista de tab-uri
//        getDriver().switchTo().window(windows.get(1)); // ne da al doilea tab
//
//        System.out.println("Url: " + getDriver().getCurrentUrl());  //verifica ca e alt url fata de pagina initiala
//
//        getDriver().close();  //inchide tab-ul pe care te afli ; pe cand quit inchide tot ce ai
//
//        getDriver().switchTo().window(windows.get(0));  // merge pe tabul initial


    }
}
