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
        onCommands = new ArrayList<>();
        offCommands = new ArrayList<>();

        /**new NoCommand(): an empty class**/
        final Command noCommand = new NoCommand();

        /**you cannot use forEach of a list to initiate this List**/
        for (int i = 0; i < 7; i++) {
            onCommands.add(noCommand);
            offCommands.add(noCommand);
        }
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands.set(slot,onCommand);
        offCommands.set(slot,offCommand);
    }

    public void buttonsOnPressed(int slot) {
        onCommands.get(slot).execute();
    }

    public void buttonsOffPressed(int slot) {
        offCommands.get(slot).execute();
    }

   /* @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("\n----------- Remote Control --------\n");

        return stringBuffer.toString();
    }*/

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + onCommands +
                ", offCommands=" + offCommands +
                '}';
    }
}
