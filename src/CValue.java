public class CValue extends CommandCounter {

    public CValue(String name) {
        super(name);
    }

    @Override
    public void execute(Processor processor) {

        processor.out().println(counter(processor));
    }
}
