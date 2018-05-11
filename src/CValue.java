public class CValue extends CommandCounter {

    public CValue() {
        super("value");
    }

    @Override
    public void execute(Processor processor) {

        processor.out().println(counter(processor).getValue());
    }
}
