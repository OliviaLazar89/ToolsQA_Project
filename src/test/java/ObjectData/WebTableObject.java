package ObjectData;

import java.util.HashMap;

public class WebTableObject {
    private String FirstNameValue;
    private String LastNameValue;
    private String EmailValue;
    private String AgeValue;
    private String SalaryValue;
    private String DepartmentValue;


    public WebTableObject(HashMap<String, String> testData) {

        populateObject(testData);
    }

    // Facem o metoda care sa mapeze 1:1 valorile din hashmapul "properties" la variabilele din clasa asta

    private void populateObject(HashMap<String, String> testData) {
        for (String Key : testData.keySet()) {   // ne da toate cheile din hashmap
            switch (Key) {
                case "FirstNameValue":
                    setFirstNameValue(testData.get(Key));  // se populeaza cu valoarea cheii respective
                    break;
                case "LastNameValue":
                    setLastNameValue(testData.get(Key));
                    break;
                case "EmailValue":
                    setEmailValue(testData.get(Key));
                    break;
                case "AgeValue":
                    setAgeValue(testData.get(Key));
                    break;
                case "SalaryValue":
                    setSalaryValue(testData.get(Key));
                    break;
                case "DepartmentValue":
                    setDepartmentValue(testData.get(Key));
                    break;

            }
        }
    }

    public String getFirstNameValue() {
        return FirstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        FirstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return LastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        LastNameValue = lastNameValue;
    }

    public String getEmailValue() {
        return EmailValue;
    }

    public void setEmailValue(String emailValue) {
        EmailValue = emailValue;
    }

    public String getAgeValue() {
        return AgeValue;
    }

    public void setAgeValue(String ageValue) {
        AgeValue = ageValue;
    }

    public String getSalaryValue() {
        return SalaryValue;
    }

    public void setSalaryValue(String salaryValue) {
        SalaryValue = salaryValue;
    }

    public String getDepartmentValue() {
        return DepartmentValue;
    }

    public void setDepartmentValue(String departmentValue) {
        DepartmentValue = departmentValue;
    }
}
