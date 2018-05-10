public class CommandMenu extends Command {


    public CommandMenu(String name) {
        super(name);
    }

    @Override
    public void execute(Processor processor) {

        processor.out().println("Menu\n\t1) Quiter : quit\n\t2) Increment : icr\n\t3) Decrement : drc\n\t4) Show value : value");

    }
}
