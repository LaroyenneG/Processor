import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Processor {

    private static final String DEFAULT_PROMPT = "$";

    /* Flux */
    private PrintStream out;
    private InputStream in;
    private Scanner scanner;

    private Object system;

    private List<Command> proc;

    private boolean terminated;

    public Processor() {
        out = null;
        in = null;
        scanner = null;

        system = null;

        terminated = false;

        proc = new ArrayList<>();
    }

    public String fetch() {

        return scanner.nextLine();
    }

    public Command decode(String name) throws ProcessorException {

        Command command = null;

        for (Command c : proc) {
            if (c.getName().equals(name)) {
                command = c;
                break;
            }
        }

        if (command == null) {
            throw new ProcessorException("Bad command");
        }

        return command;
    }

    public void printPrompt() {
        out.print(DEFAULT_PROMPT);
    }

    public void addNewCommand(Command command) {

        proc.add(command);
    }

    public void execute(Command command) {

        command.execute(this);
    }

    public boolean isTerminated() {
        return terminated;
    }

    public void terminated() {
        terminated = true;
    }

    public PrintStream out() {
        return out;
    }

    public InputStream in() {
        return in;
    }

    public void setIn(InputStream inputStream) {
        in = inputStream;
        scanner = new Scanner(in);
    }

    public void setOut(PrintStream printStream) {
        out = printStream;
    }

    public Scanner scanner() {
        return scanner;
    }

    public Object getSystem() {
        return system;
    }

    public void setSystem(Object system) {
        this.system = system;
    }
}
