package Tests;

import ObjectData.FormTableObject;
import Pages.Forms.FormsPage;
import Pages.HomePage;
import Pages.Forms.PracticeFormPage;
import org.testng.annotations.Test;
import java.util.List;
import ShareData.Hooks;

public class FormTableTest extends Hooks {


    @Test
    public void testMethod() {

        FormTableObject formTableObject = new FormTableObject(testData);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickForms();

        FormsPage formsPage = new FormsPage(getDriver());
        formsPage.clickPracticeForm();

//        String firstNameValue = "Olivia";
//        String lastNameValue = "Lazar";
//        String emailAddressValue = "olivia@gmail.com";
//        String mobileValue = "0721556980";
//        String subjectsValue = "English";
//        String addressValue = "Timisoara, nr 52";
//        String stateValue = "NCR";
//        String cityValue = "Delhi";
//        String expectedMessage = "Thanks for submitting the form";

        PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
        practiceFormPage.fillPracticeForm(formTableObject);

        List<String> FormValues = practiceFormPage.getValuesForm();
        practiceFormPage.fillSubmit();
//
//        practiceFormPage.validatePracticeForm(expectedMessage, firstNameValue, lastNameValue, emailAddressValue,
//                FormValues.get(0), mobileValue, subjectsValue, FormValues.get(1), addressValue, stateValue,
//                cityValue,  new File("src/test/resources/New Rich Text Document.RTF"));

        practiceFormPage.clickClose();


//        WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
//        gender.click();
//        String genderValue = gender.getText();

//

//        WebElement subjects = driver.findElement(By.id("subjectsInput"));
//        String subjectsValue= "English";
//        subjects.sendKeys(subjectsValue);
//        subjects.sendKeys(Keys.ENTER);

//        WebElement reading = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
//        reading.click();
//        String readingValue = reading.getText();

//        WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
//        File file = new File("src/test/resources/New Rich Text Document.RTF");
//        uploadPicture.sendKeys(file.getAbsolutePath());

//        WebElement address = driver.findElement(By.id("currentAddress"));
//        String addressValue = "Timisoara, nr 52";
//        address.sendKeys(addressValue);


//        WebElement state = driver.findElement(By.id("state"));
//        state.click();
//
//        WebElement selectState = driver.findElement(By.id("react-select-3-input"));
//        String stateValue = "NCR";
//        selectState.sendKeys(stateValue);
//        selectState.sendKeys(Keys.ENTER);


//        WebElement city = driver.findElement(By.id("city"));
//        city.click();
//
//        WebElement selectCity = driver.findElement(By.id("react-select-4-input"));
//        String cityValue = "Delhi";
//        selectCity.sendKeys(cityValue);
//        selectCity.sendKeys(Keys.ENTER);


//        WebElement submitButton = driver.findElement(By.id("submit"));
        // jse.executeScript("arguments[0].click();", submitButton);

//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM,yyyy");
//        LocalDateTime now = LocalDateTime.now();
//        String dateOfBirthValue = dtf.format(now);


//        WebElement thanksMessage = driver.findElement(By.id("example-modal-sizes-title-lg"));
//        String actualMessage = thanksMessage.getText();
//        String expectedMessage = "Thanks for submitting the form";
//        Assert.assertEquals(actualMessage,expectedMessage);
//
//        List<WebElement> validationTable = driver.findElements(By.cssSelector(".table-dark>tbody>tr"));
//        Assert.assertTrue(validationTable.get(0).getText().contains("Student Name"));
//        Assert.assertTrue(validationTable.get(0).getText().contains(firstNameValue + " " + lastNameValue));
//
//        Assert.assertTrue(validationTable.get(1).getText().contains("Student Email"));
//        Assert.assertTrue(validationTable.get(1).getText().contains(emailAddressValue));
//
//        Assert.assertTrue(validationTable.get(2).getText().contains("Gender"));
//        Assert.assertTrue(validationTable.get(2).getText().contains(genderValue));
//
//        Assert.assertTrue(validationTable.get(3).getText().contains("Mobile"));
//        Assert.assertTrue(validationTable.get(3).getText().contains(mobileValue));
//
//        Assert.assertTrue(validationTable.get(4).getText().contains("Date of Birth"));
//        Assert.assertTrue(validationTable.get(4).getText().contains(dateOfBirthValue));
//
//        Assert.assertTrue(validationTable.get(5).getText().contains("Subjects"));
//        Assert.assertTrue(validationTable.get(5).getText().contains(subjectsValue));
//
//        Assert.assertTrue(validationTable.get(6).getText().contains("Hobbies"));
//        Assert.assertTrue(validationTable.get(6).getText().contains(readingValue));
//
//        Assert.assertTrue(validationTable.get(7).getText().contains("Picture"));
//        Assert.assertTrue(validationTable.get(7).getText().contains(file.getName()));
//
//        Assert.assertTrue(validationTable.get(8).getText().contains("Address"));
//        Assert.assertTrue(validationTable.get(8).getText().contains(addressValue));
//
//        Assert.assertTrue(validationTable.get(9).getText().contains("State and City"));
//        Assert.assertTrue(validationTable.get(9).getText().contains(stateValue + " " + cityValue));
//
//        WebElement closeButton = driver.findElement(By.id("closeLargeModal"));
//        closeButton.sendKeys(Keys.ENTER);


    }
}
