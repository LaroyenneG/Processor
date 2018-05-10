public abstract class Command {

    private String name;

    public abstract void execute(Processor processor);

    public String getName() {
        return name;
    }

}
