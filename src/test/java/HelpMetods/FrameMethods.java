package HelpMetods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class FrameMethods {

    private WebDriver driver;

    public FrameMethods(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void switchToFrame(String value){
        driver.switchTo().frame(value); //se muta cu focusul pe acest iframe
    }

    public void switchMainFrame(){
        driver.switchTo().defaultContent();
    }
}
