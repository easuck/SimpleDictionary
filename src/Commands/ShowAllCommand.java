package Commands;

import Utility.DictionaryManager;

import java.util.HashMap;
import java.util.Map;

public class ShowAllCommand implements Command{

    private DictionaryManager dictionaryManager;

    public ShowAllCommand(DictionaryManager dictionaryManager){
        this.dictionaryManager = dictionaryManager;
    }

    @Override
    public void execute() {
        HashMap<String, String> dictionary;
        dictionary = dictionaryManager.getDictionary();
        for (Map.Entry entry : dictionary.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
