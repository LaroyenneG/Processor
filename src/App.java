public class App {


    public static void main(String[] args) {

        Processor processor = new Processor();

        processor.setIn(System.in);
        processor.setOut(System.out);
        processor.setSystem(new Counter());


        processor.addNewCommand(new CommandQuit("quit"));

        processor.addNewCommand(new CommandMenu("menu"));

        processor.addNewCommand(new CDcr("dcr"));
        processor.addNewCommand(new CValue("value"));
        processor.addNewCommand(new CInr("inr"));

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
