package ObjectData;

import java.util.HashMap;

public class AlertObject {

    private String promptAlertValue;

    public String getPromptAlertValue() {

        return promptAlertValue;
    }

    public void setPromptAlertValue(String promptAlertValue) {

        this.promptAlertValue = promptAlertValue;
    }

    public AlertObject(HashMap<String,String> testData){

        populateObject(testData);
    }

    // Facem o metoda care sa mapeze 1:1 valorile din hashmapul "properties" la variabilele din clasa asta

    private void populateObject(HashMap<String,String> testData){
        for (String Key : testData.keySet()){   // ne da toate cheile din hashmap
            switch (Key){
                case  "promptAlertValue" :
                    setPromptAlertValue(testData.get(Key));  // se populeaza cu valoarea cheii respective
                    break;

                                }
        }
    }
}
