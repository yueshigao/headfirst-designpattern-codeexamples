package F_commandpattern.invoker;

import F_commandpattern.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommandRemoteControl {

    List<Command> partyOnCommands;
    List<Command> partyOffCommands;
    int slot;
    List<Command> undoCommands = new ArrayList<>();

    public void setCommand(int slot, List<Command> onCommands, List<Command> offCommands) {
        this.partyOnCommands = onCommands;
        this.partyOffCommands = offCommands;
        this.slot = slot;
    }

    public void partyOnPressed() {
        partyOnCommands.stream().forEach(onCommand -> {
            onCommand.execute();
            undoCommands.add(onCommand);
        });
    }

    public void partyOffPressed() {
        partyOffCommands.stream().forEach(offCommand -> {
            offCommand.execute();
            undoCommands.add(offCommand);
        });
    }

    public void undoPressed() {
        undoCommands.stream().forEach(Command::undo);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n---------------Macro Remote Control---------------\n");
        stringBuffer.append("Slot [" + slot + "]: "
                + partyOnCommands.getClass().getSimpleName()
                + "  "
                + partyOffCommands.getClass().getSimpleName());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

}
