public class CommandQuit extends Command {


    public CommandQuit(String name) {
        super(name);
    }

    @Override
    public void execute(Processor processor) {

        processor.terminated();
    }
}
