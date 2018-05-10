import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Processor {

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
        return null;
    }

    public Command decode(String string) {
        return null;
    }

    public void execute(Processor processor) {

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
}
