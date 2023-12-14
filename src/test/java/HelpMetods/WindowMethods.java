package HelpMetods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {

    private WebDriver driver;  // scopul clasei e sa ne ofere doar metodele, nu si driverul, de
                                // aceea putem face driverul privat
    public WindowMethods(WebDriver driver) {

        this.driver = driver;
    }

    public void switchToSpecificWindow(Integer size){  // metoda asta se muta pe orice pagina vrei,
        // tu ii dai paramentrul, numarul paginii pe care vrei in parametrul size
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());  //ne da lista de tab-uri
        driver.switchTo().window(tabs.get(size)); // ne da al doilea tab
        System.out.println("Url: " + driver.getCurrentUrl());
    }

    public void closeCurrentWindow(){
        driver.close();  //inchide tab-ul pe care te afli ; pe cand quit inchide tot ce ai

    }

}
