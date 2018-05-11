public class CommandMenu extends Command {


    public CommandMenu() {
        super("menu");
    }

    @Override
    public void execute(Processor processor) {

        processor.out().println("Menu\n\t1) Quiter : quit\n\t2) Increment : icr\n\t3) Decrement : drc\n\t4) Show value : value\n\t4) Script : script");

    }
}
