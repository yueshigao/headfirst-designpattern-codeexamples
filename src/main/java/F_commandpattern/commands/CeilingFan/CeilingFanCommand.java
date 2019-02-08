package F_commandpattern.commands.CeilingFan;

import F_commandpattern.commands.Command;
import F_commandpattern.receivers.CeilingFan;

public abstract class CeilingFanCommand implements Command {

    protected CeilingFan ceilingFan;
    protected int speed;

    /**
     * the speed must be recorded in execute(), before the action.
     * cannot work if recorded in constructor
     * because constructor will be instantiate in the very beginning
     * when the ceiling fan is still empty
     * the speed of ceiling fan will change only after the buttonMedium is pressed
     **/
    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public final void undo() {
        if (speed == 3) ceilingFan.high();
        if (speed == 2) ceilingFan.medium();
        if (speed == 0) ceilingFan.off();
    }
}
