package ShareData;
import PropertyUtility.PropertyUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

public class Hooks extends ShareData{
    public HashMap<String,String> testData;

    @BeforeMethod

    public void prepareEnvironment(){
        Setup();
        String testName = this.getClass().getSimpleName();
        PropertyUtility propertyUtility = new PropertyUtility(testName);
        testData = propertyUtility.getAllData();
    }

    @AfterMethod

    public void clearEnvironment(){
        Clear();
    }

}
