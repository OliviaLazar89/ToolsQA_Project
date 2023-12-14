package Pages.AlertFrameWindow;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowsPage extends BasePage {

    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    private WebElement newTabButton;

    @FindBy(id = "windowButton")
    private WebElement newWindowButton;


    public void interractTab() {

        newTabButton.click();

        windowMethods.switchToSpecificWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchToSpecificWindow(0);

//        System.out.println("Url: " + driver.getCurrentUrl());
//        List<String> tabs = new ArrayList<>(driver.getWindowHandles());  //ne da lista de tab-uri
//        driver.switchTo().window(tabs.get(1)); // ne da al doilea tab
//        System.out.println("Url: " + driver.getCurrentUrl());
//        driver.close();  //inchide tab-ul pe care te afli ; pe cand quit inchide tot ce ai
//        driver.switchTo().window(tabs.get(0));  // merge pe tabul initial
//    }

    }

    public void interractWindow() {

        newWindowButton.click();

        windowMethods.switchToSpecificWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchToSpecificWindow(0);

//        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
//        newWindowButton.click();
//        System.out.println("Url: " + driver.getCurrentUrl());
//        List<String> windows = new ArrayList<>(driver.getWindowHandles());  //ne da lista de tab-uri
//        driver.switchTo().window(windows.get(1)); // ne da al doilea tab
//        System.out.println("Url: " +driver.getCurrentUrl());  //verifica ca e alt url fata de pagina initiala
//        driver.close();  //inchide tab-ul pe care te afli ; pe cand quit inchide tot ce ai
//        driver.switchTo().window(windows.get(0));  // merge pe tabul initial
    }
}
