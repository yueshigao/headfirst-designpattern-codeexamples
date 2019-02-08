package F_commandpattern.commands.CeilingFan;

import F_commandpattern.receivers.CeilingFan;

public class CeilingFanOffCommand extends CeilingFanCommand {

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        speed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

}
