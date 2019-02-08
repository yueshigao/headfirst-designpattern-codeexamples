package F_commandpattern.commands.Light;

import F_commandpattern.commands.Command;
import F_commandpattern.receivers.Light;

import java.util.List;

/**Command object encapsulate receiver and its actions**/
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
