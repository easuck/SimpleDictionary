package Utility;

import Commands.*;

import java.util.HashMap;
import java.util.Scanner;

public class CommandsManager {

    private HashMap<String, Command> commands;

    private DictionaryManager dictionaryManager;

    private String command;

    public CommandsManager(DictionaryManager dictionaryManager){
        commands = new HashMap<>();
        commands.put("find", new FindDefinitionCommand(dictionaryManager));
        commands.put("insert", new InsertCommand(dictionaryManager));
        commands.put("show", new ShowAllCommand(dictionaryManager));
        commands.put("exit", new ExitCommand());
    }

    public CommandsManager(){};

    public void doCommands(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("available commands are \"insert\", \"find\", \"show\"");
        System.out.print("enter command: ");

        while(scanner.hasNextLine()){
            command = scanner.nextLine().trim();
            if (commands.containsKey(command)){
                commands.get(command).execute();
                System.out.print("enter command: ");
            }
            else{
                System.out.println("no such command, try again");
                System.out.print("enter command: ");
            }
        }
    }
}
