package F_commandpattern.invoker;

import F_commandpattern.commands.Command;
import F_commandpattern.commands.NoCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker object setCommand() and execute() when time arriving
 **/
public class RemoteControl {

    List<Command> onCommands;
    List<Command> offCommands;

    /**
     * Null object Pattern:
     * instantiate each field to an empty instance to avoid null exception
     **/
    public RemoteControl() {
        onCommands = new ArrayList<Command>();
        offCommands = new ArrayList<Command>();

        /**new NoCommand(): an empty class**/
        final Command noCommand = new NoCommand();

        /**stream foreach to replace traditional foreach**/
        onCommands.stream().map(onCommand -> noCommand)
                .forEach(onCommand -> onCommands.add(onCommand));
        offCommands.stream().map(offCommand -> noCommand)
                .forEach(offCommand -> offCommands.add(noCommand));
    }

    public void setCommands(Command onCommands) {

    }

    public void buttonsOnPressed(int slot) {
        onCommands.get(slot).execute();
    }

    public void buttonsOffPressed(int slot) {
        offCommands.get(slot).execute();
    }
}
