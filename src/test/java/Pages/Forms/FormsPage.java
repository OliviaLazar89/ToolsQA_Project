package Pages.Forms;
import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Base64;

public class FormsPage extends BasePage {
    public FormsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement practiceForms;



    public void clickPracticeForm (){

        practiceForms.click();
        LoggerUtility.info("The user clicks on practiceForms button");
    }
}
