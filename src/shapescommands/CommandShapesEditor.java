package shapescommands;

import engine.Command;
import engine.Processor;

public abstract class CommandShapesEditor extends Command {

    public CommandShapesEditor(String name) {
        super(name);
    }

    public Object model(Processor processor) {
        return processor.getSystem();
    }

    @Override
    public abstract void execute(Processor processor);
}
