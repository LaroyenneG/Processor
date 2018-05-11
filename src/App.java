public class App {


    public static void main(String[] args) {

        Processor processor = new Processor();

        processor.addNewCommand(new CommandQuit());
        processor.addNewCommand(new CommandMenu());
        processor.addNewCommand(new CDcr());
        processor.addNewCommand(new CValue());
        processor.addNewCommand(new CInr());
        processor.addNewCommand(new CommandScript());

        processor.setIn(System.in);
        processor.setOut(System.out);
        processor.setSystem(new Counter());


        while (!processor.isTerminated()) {

            try {
                processor.printPrompt();
                processor.execute(processor.decode(processor.fetch()));
            } catch (ProcessorException e) {
                e.printStackTrace();
            }
        }
    }
}
