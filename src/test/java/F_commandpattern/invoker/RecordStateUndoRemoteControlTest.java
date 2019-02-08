package F_commandpattern.invoker;


import F_commandpattern.commands.*;
import F_commandpattern.receivers.CeilingFan;
import org.junit.Test;

public class RecordStateUndoRemoteControlTest {

    @Test
    public void should_undo_remote_control_with_recorded_high_speed(){
        /**Receiver**/
        CeilingFan ceilingFan = new CeilingFan();
        
        /**Command: encapsulate receiver**/
        Command ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        Command commandCeilingFanOff = new CeilingFanOffCommand(ceilingFan);

        /**Invoker: set command**/
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,ceilingFanMediumCommand,commandCeilingFanOff);
        remoteControl.setCommand(1,ceilingFanHighCommand,commandCeilingFanOff);

        /**Invoker: execute() or undo()**/
        remoteControl.buttonOnPressed(0);
        remoteControl.buttonOffPressed(0);
        System.out.println(remoteControl);
        /**should back to medium speed after undo**/
        remoteControl.buttonUndoPressed();

        remoteControl.buttonOnPressed(1);
        System.out.println(remoteControl);
        /**should back to high speed after undo**/
        remoteControl.buttonUndoPressed();
    }

}