public class CPlus extends CommandCounter {

    public CPlus() {
        super("plus");
    }

    @Override
    public void execute(Processor processor) {

        int i = processor.scanner().nextInt();
        counter(processor).setValue(counter(processor).getValue() + i);
    }
}
