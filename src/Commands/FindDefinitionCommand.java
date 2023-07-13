package Commands;

import Utility.DictionaryManager;

import java.util.HashMap;
import java.util.Scanner;

public class FindDefinitionCommand implements Command{

    private DictionaryManager dictionaryManager;

    public FindDefinitionCommand(DictionaryManager dictionaryManager){
        this.dictionaryManager = dictionaryManager;
    }

    @Override
    public void execute() {
        HashMap<String, String> dictionary;
        dictionary = dictionaryManager.getDictionary();

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a word you want to get definition for: ");
        String word = scanner.nextLine();

        if(dictionary.containsKey(word)){
            System.out.println(dictionary.get(word));
        }
        else{
            System.out.println("no such word in the dictionary");
        }
    }
}
