package ShareData;
import Logger.LoggerUtility;
import PropertyUtility.PropertyUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

public class Hooks extends ShareData{
    public HashMap<String,String> testData;
    public String testName;

    @BeforeMethod
    public void prepareEnvironment(){
        Setup();
        testName = this.getClass().getSimpleName();
        PropertyUtility propertyUtility = new PropertyUtility(testName);
        testData = propertyUtility.getAllData();
        LoggerUtility.startTestCase(testName);
    }

    @AfterMethod
    public void clearEnvironment(){
        Clear();
        LoggerUtility.endTestCase(testName);
    }
    @AfterSuite
    public void finnishArtifacts(){
        LoggerUtility.mergeLogsIntoOne();
    }

}
