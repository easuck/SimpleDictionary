package Commands;

public class ExitCommand implements Command{

    public ExitCommand(){}

    @Override
    public void execute() {
        System.exit(0);
    }
}
