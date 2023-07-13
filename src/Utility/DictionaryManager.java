package Utility;

import java.util.HashMap;
import java.util.Map;

public class DictionaryManager {

    private HashMap<String, String> dictionary;

    public DictionaryManager(){
        dictionary = new HashMap<>();
    }

    public HashMap<String, String> getDictionary() {
        return dictionary;
    }

    public void insertElementByKey(String key, String value){
        dictionary.put(key, value);
    }
}
