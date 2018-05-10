public class CommandCounter extends Command {


    public CommandCounter(String name) {
        super(name);
    }

    public Counter counter(Processor processor) {
        return (Counter) processor.getSystem();
    }

    @Override
    public void execute(Processor processor) {

    }
}
