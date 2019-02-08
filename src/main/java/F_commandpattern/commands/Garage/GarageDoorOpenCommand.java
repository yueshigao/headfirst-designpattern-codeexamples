package F_commandpattern.commands.Garage;

import F_commandpattern.commands.Command;
import F_commandpattern.receivers.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.open();
    }

    @Override
    public void undo() {
        garageDoor.close();
    }
}
