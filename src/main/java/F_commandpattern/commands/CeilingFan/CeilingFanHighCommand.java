package F_commandpattern.commands.CeilingFan;

import F_commandpattern.receivers.CeilingFan;

public class CeilingFanHighCommand extends CeilingFanCommand {

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        speed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

}
