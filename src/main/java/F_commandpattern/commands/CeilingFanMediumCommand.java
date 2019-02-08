package F_commandpattern.commands;

import F_commandpattern.receivers.CeilingFan;

public class CeilingFanMediumCommand extends CeilingFanCommand {

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        speed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

}
