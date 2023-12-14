package Tests;

import Pages.AlertFrameWindow.AlertFrameWindowPage;
import Pages.AlertFrameWindow.FramePage;
import Pages.HomePage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class FrameTest extends ShareData {

       @Test
    public void testMethod() {


//        WebElement alertsFrameWindow = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        alertsFrameWindow.click();

           HomePage homePage = new HomePage(getDriver());
           homePage.clickAlertFrameWindow();

//        WebElement frames = driver.findElement(By.xpath("//span[text()='Frames']"));
//        frames.click();

           AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
           alertFrameWindowPage.clickFrames();

           FramePage framePage = new FramePage(getDriver());
           framePage.interractFirstIFrame();
           framePage.interractSecondIFrame();

//        driver.switchTo().frame("frame1"); //se muta cu focusul pe acest iframe
//
//        WebElement frameText = driver.findElement(By.id("sampleHeading"));
//        System.out.println(frameText.getText());
//
//        driver.switchTo().defaultContent();  // te intoarce cu focusul pe pagina mare

//        driver.switchTo().frame("frame2");
//
//        WebElement frame2Text = driver.findElement(By.id("sampleHeading"));
//        System.out.println(frame2Text.getText());

    }
}
