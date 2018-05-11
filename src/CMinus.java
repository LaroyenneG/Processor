public class CMinus extends CommandCounter {

    public CMinus() {
        super("minus");
    }

    @Override
    public void execute(Processor processor) {
        int i = processor.scanner().nextInt();
        counter(processor).setValue(counter(processor).getValue() - i);
    }
}
