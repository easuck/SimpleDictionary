import Utility.CommandsManager;
import Utility.DictionaryManager;

public class Main {
    public static void main(String[] args) {

        DictionaryManager dictionaryManager = new DictionaryManager();
        CommandsManager commandsManager = new CommandsManager(dictionaryManager);
        commandsManager.doCommands();
    }
}