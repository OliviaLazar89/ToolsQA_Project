package Pages.Elements;

import Logger.LoggerUtility;
import ObjectData.WebTableObject;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class WebTablePage extends BasePage {

    public WebTablePage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']")
    private List<WebElement> actualEntries;

    @FindBy(id = "addNewRecordButton")
    private WebElement AddButton;

    @FindBy(id = "firstName")
    private WebElement FirstNameElement;

    @FindBy(id = "lastName")
    private WebElement LastNameElement;

    @FindBy(id = "userEmail")
    private WebElement EmailElement;

    @FindBy(id = "age")
    private WebElement AgeElement;

    @FindBy(id = "salary")
    private WebElement SalaryElement;

    @FindBy(id = "department")
    private WebElement Department;

    @FindBy(id = "submit")
    private WebElement SubmitButton;



    public void addNewEntry(WebTableObject webTableObject) {

        Integer actualTableSize = actualEntries.size(); //luam dimensiunea listei

        elementMethods.clickJSElement(AddButton);
        LoggerUtility.info("The user clicks on the add button");
        // AddButton.click();
        elementMethods.fillElement(FirstNameElement, webTableObject.getFirstNameValue());
        LoggerUtility.info("The user fills firstname field");
     //   FirstNameElement.sendKeys(FirstNameValue);
        elementMethods.fillElement(LastNameElement, webTableObject.getLastNameValue());
        LoggerUtility.info("The user fills lastname field");
    //    LastNameElement.sendKeys(LastNameValue);
        elementMethods.fillElement(EmailElement, webTableObject.getEmailValue());
        LoggerUtility.info("The user fills email field");
    //    EmailElement.sendKeys(EmailValue);
        elementMethods.fillElement(AgeElement,webTableObject.getAgeValue());
        LoggerUtility.info("The user fills age field");
     //   AgeElement.sendKeys(AgeValue);
        elementMethods.fillElement(SalaryElement, webTableObject.getSalaryValue());
        LoggerUtility.info("The user fills salary field");
     //   SalaryElement.sendKeys(SalaryValue);
        elementMethods.fillElement(Department, webTableObject.getDepartmentValue());
        LoggerUtility.info("The user fills department field");
     //   Department.sendKeys(DepartmentValue);
        elementMethods.clickElement(SubmitButton);
        LoggerUtility.info("The user clicks on submit button");
     //   SubmitButton.click();

  // Metoda care adauga entry-uri noi, apoi vine metoda de mai jos care valideaza ca 3+1=4.

        validateNewEntry(actualTableSize, webTableObject);
    }

    private void validateNewEntry(Integer actualTableSize, WebTableObject webTableObject) {

        Integer expectedTableSize = actualEntries.size();

        Assert.assertTrue(actualTableSize + 1 == expectedTableSize);

        String LastEntryTable = actualEntries.get(actualTableSize).getText(); // da textul de pe al 4 lea rand scris de noi

        Assert.assertTrue(LastEntryTable.contains(webTableObject.getFirstNameValue()));
        Assert.assertTrue(LastEntryTable.contains(webTableObject.getLastNameValue()));
        Assert.assertTrue(LastEntryTable.contains(webTableObject.getEmailValue()));
        Assert.assertTrue(LastEntryTable.contains(webTableObject.getAgeValue()));
        Assert.assertTrue(LastEntryTable.contains(webTableObject.getSalaryValue()));
        Assert.assertTrue(LastEntryTable.contains(webTableObject.getDepartmentValue()));
    }
}
