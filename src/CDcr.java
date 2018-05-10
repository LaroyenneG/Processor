public class CDcr extends CommandCounter {

    public CDcr(String name) {
        super(name);
    }

    @Override
    public void execute(Processor processor) {

        counter(processor).decrement();
    }
}
