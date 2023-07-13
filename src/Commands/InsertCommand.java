package Commands;

import Utility.DictionaryManager;

import java.util.Scanner;

public class InsertCommand implements Command{

    private DictionaryManager dictionaryManager;

    public InsertCommand(DictionaryManager dictionaryManager){
        this.dictionaryManager = dictionaryManager;
    };

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String word;
        String definition;

        System.out.print("enter a word: ");
        word = scanner.nextLine();
        System.out.print("enter a definition: ");
        definition = scanner.nextLine();

        dictionaryManager.insertElementByKey(word, definition);
    }
}
