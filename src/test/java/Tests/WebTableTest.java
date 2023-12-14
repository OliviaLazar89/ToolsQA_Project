package Tests;
import ObjectData.WebTableObject;
import ShareData.Hooks;
import Pages.Elements.ElementsPage;
import Pages.HomePage;
import Pages.Elements.WebTablePage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class WebTableTest extends Hooks {


    @Test

    public void testMethod(){

        WebTableObject webTableObject = new WebTableObject(testData);

//        WebElement elements = getDriver().findElement(By.xpath("//h5[text()='Elements']"));
//
//        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
//        jse.executeScript("window.scrollBy(0,350)");
//
//        Actions actions = new Actions(getDriver());
//        actions.moveToElement(elements);        //se muta cu focusul unde vrem pe pagina
//        elements.click();
//
//        WebElement webTables = getDriver().findElement(By.xpath("//span[text()='Web Tables']"));
//        webTables.click();

        HomePage homePage = new HomePage(getDriver());
        homePage.clickElements();

        ElementsPage elementsPage = new ElementsPage(getDriver());
        elementsPage.clickWebTables();

//        String FirstNameValue = "Lazar";
//        String LastNameValue = "Olivia";
//        String EmailValue = "olivia@gmail.com";
//        String AgeValue = "34";
//        String SalaryValue = "10000";
//        String DepartmentValue = "IT";

        WebTablePage webTablePage = new WebTablePage(getDriver());
        webTablePage.addNewEntry(webTableObject);


        //faci o lista care sa gaseasca intreg tabelul si intrarile existente in el ( randurile) si cele completate si cele libere
//        List<WebElement> actualEntries = getDriver().findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
//        Integer actualTableSize = actualEntries.size();  //luam dimensiunea listei
//
//        WebElement AddButton = getDriver().findElement(By.id("addNewRecordButton"));
//        AddButton.click();
////
//        WebElement FirstNameElement = getDriver().findElement(By.id("firstName"));
//        String FirstNameValue = "Lazar";
//        FirstNameElement.sendKeys(FirstNameValue);
//
//        WebElement LastNameElement = getDriver().findElement(By.id("lastName"));
//        String LastNameValue = "Olivia";
//        LastNameElement.sendKeys(LastNameValue);
//
//        WebElement EmailElement = getDriver().findElement(By.id("userEmail"));
//        String EmailValue = "olivia@gmail.com";
//        EmailElement.sendKeys(EmailValue);
//
//        WebElement AgeElement = getDriver().findElement(By.id("age"));
//        String AgeValue = "34";
//        AgeElement.sendKeys(AgeValue);
//
//        WebElement SalaryElement = getDriver().findElement(By.id("salary"));
//        String SalaryValue = "10000";
//        SalaryElement.sendKeys(SalaryValue);
//
//        WebElement Department = getDriver().findElement(By.id("department"));
//        String DepartmentValue = "IT";
//        Department.sendKeys(DepartmentValue);
//
//        WebElement SubmitButton = getDriver().findElement(By.id("submit"));
//        SubmitButton.click();
//
//        List<WebElement> expectedEntries = getDriver().findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
//        Integer expectedTableSize = expectedEntries.size();
//
//        // //div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']
//
//        Assert.assertTrue(actualTableSize+1==expectedTableSize);
//
//        String LastEntryTable = expectedEntries.get(actualTableSize).getText(); // da textul de pe al 4 lea rand scris de noi
//        Assert.assertTrue(LastEntryTable.contains(FirstNameValue));
//        Assert.assertTrue(LastEntryTable.contains(LastNameValue));
//        Assert.assertTrue(LastEntryTable.contains(EmailValue));
//        Assert.assertTrue(LastEntryTable.contains(AgeValue));
//        Assert.assertTrue(LastEntryTable.contains(SalaryValue));
//        Assert.assertTrue(LastEntryTable.contains(DepartmentValue));

    }


}
