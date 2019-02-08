package F_commandpattern.invoker;

import F_commandpattern.commands.*;
import F_commandpattern.receivers.Light;
import F_commandpattern.receivers.Stereo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MacroCommandRemoteControlTest {

    @Test
    public void should_control_the_party(){

        // Receiver
        Light light = new Light("Living room");
        Stereo stereo = new Stereo("Living room");

        // Command
        Command lightOnCommand = new LightOnCommand(light);
        Command stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        List<Command> onCommands = new ArrayList<>();
        onCommands.add(lightOnCommand);
        onCommands.add(stereoOnWithCDCommand);

        Command lightOffCommand = new LightOffCommand(light);
        Command stereoOffCommand = new StereoOffCommand(stereo);
        List<Command> offCommands = new ArrayList<>();
        offCommands.add(lightOffCommand);
        offCommands.add(stereoOffCommand);

        // Invoker: setCommand
        MacroCommandRemoteControl macroCommandRemoteControl = new MacroCommandRemoteControl();
        macroCommandRemoteControl.setCommand(0,onCommands,offCommands);

        // Invoker: run execute()
        System.out.println(macroCommandRemoteControl);
        System.out.println("--Pushing Macro on--");
        macroCommandRemoteControl.partyOnPressed();
        System.out.println("\n--Pushing undo--");
        macroCommandRemoteControl.undoPressed();
        System.out.println("\n--Pushing Macro off--");
        macroCommandRemoteControl.partyOffPressed();
    }
}
