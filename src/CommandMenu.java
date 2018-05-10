public class CommandMenu extends Command {


    public CommandMenu(String name) {
        super(name);
    }

    @Override
    public void execute(Processor processor) {

        processor.out().println("Menu\n\t1) Quiter : quit");

    }
}
