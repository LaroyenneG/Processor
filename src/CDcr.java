public class CDcr extends CommandCounter {

    public CDcr() {
        super("dcr");
    }

    @Override
    public void execute(Processor processor) {

        counter(processor).decrement();
    }
}
