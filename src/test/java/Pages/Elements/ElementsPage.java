package Pages.Elements;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage extends BasePage {

    public ElementsPage(WebDriver driver) {
        super(driver);
    }
//am comentat ce e mai jos pt ca folosim mai sus mostenire cu BasePage, unde avem driverul

//    public WebDriver driver;
//    public ElementsPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver,this); //initializeaza elementele de mai jos
//    }
    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webTables;



    public void clickWebTables(){
        webTables.click();
    }
}
