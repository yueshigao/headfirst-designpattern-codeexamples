package F_commandpattern.invoker;


import F_commandpattern.commands.*;
import F_commandpattern.commands.Light.LightOffCommand;
import F_commandpattern.commands.Light.LightOnCommand;
import F_commandpattern.receivers.Light;
import org.junit.Test;

public class UndoRemoteControlTest {

    @Test
    public void should_undo_remote_control(){

        /**Receiver**/
        Light light = new Light("Living room");

        /**Command: encapsulate receiver**/
        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);

        /**Invoker: set command**/
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, onCommand, offCommand);

        /**Invoker: call execute() and undo()**/
        remoteControl.buttonOnPressed(0);
        remoteControl.buttonOffPressed(0);
        /**undoCommand = offCommand**/
        System.out.println(remoteControl);
        /**undo pressed = off undo = on**/
        remoteControl.buttonUndoPressed();

        remoteControl.buttonOffPressed(0);

        remoteControl.buttonOnPressed(0);
        /**undoCommand = onCommand**/
        System.out.println(remoteControl);
        /**undo pressed = on undo = off**/
        remoteControl.buttonUndoPressed();
    }

}