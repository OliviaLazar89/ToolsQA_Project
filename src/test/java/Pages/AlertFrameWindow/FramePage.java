package Pages.AlertFrameWindow;

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
        System.out.println(frameText.getText());
        driver.switchTo().defaultContent();  // te intoarce cu focusul pe pagina mare
    }

    public void interractSecondIFrame(){

        driver.switchTo().frame("frame2");
        System.out.println(frameText.getText());

    }
}
