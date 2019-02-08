package F_commandpattern.commands;

import java.util.List;

public class MacroCommand implements Command {

    /**
     * Command encapsulate receiver
     * MarcoCommand encapsulate commands
     **/
    List<Command> commands;

    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.stream().forEach(Command::execute);
    }

    /**since in each command, the undo commend is already recorded
     * so here, it is not need to be re-recorded**/
    @Override
    public void undo() {
        commands.stream().forEach(Command::undo);
    }
}
