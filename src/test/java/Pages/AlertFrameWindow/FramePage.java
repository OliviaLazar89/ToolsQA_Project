package Pages.AlertFrameWindow;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver) {
        super(driver);
    }



    @FindBy(id = "sampleHeading")
    private WebElement frameText;



    public void interractFirstIFrame() {
        driver.switchTo().frame("frame1"); //se muta cu focusul pe acest iframe
        LoggerUtility.info("The user switches on specific frame");

        System.out.println(frameText.getText());
        LoggerUtility.info("The user prints the frame text value");

        driver.switchTo().defaultContent();  // te intoarce cu focusul pe pagina mare
        LoggerUtility.info("The user switches back on primary frame");
    }

    public void interractSecondIFrame(){

        driver.switchTo().frame("frame2");
        LoggerUtility.info("The user switches on the second frame");

        System.out.println(frameText.getText());
        LoggerUtility.info("The user prints the frame text value");

    }
}
