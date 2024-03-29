package Pages;

import HelpMetods.AlertMethods;
import HelpMetods.ElementMethods;
import HelpMetods.FrameMethods;
import HelpMetods.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;

    protected WindowMethods windowMethods;
    protected AlertMethods alertMethods;
    protected FrameMethods frameMethods;
    protected ElementMethods elementMethods;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

        windowMethods = new WindowMethods(driver);
        alertMethods = new AlertMethods(driver);
        frameMethods = new FrameMethods(driver);
        elementMethods = new ElementMethods(driver);

    }

}
