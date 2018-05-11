public class CInr extends CommandCounter {

    public CInr() {
        super("inr");
    }

    @Override
    public void execute(Processor processor) {

        counter(processor).increment();
    }
}
