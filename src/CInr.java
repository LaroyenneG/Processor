public class CInr extends CommandCounter {

    public CInr(String name) {
        super(name);
    }

    @Override
    public void execute(Processor processor) {

        counter(processor).increment();
    }
}
