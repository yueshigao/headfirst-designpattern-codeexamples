package F_commandpattern.invoker;

import F_commandpattern.commands.Command;
import F_commandpattern.commands.Light.LightOffCommand;
import F_commandpattern.commands.Light.LightOnCommand;
import F_commandpattern.commands.MacroCommand;
import F_commandpattern.commands.Stereo.StereoOffCommand;
import F_commandpattern.commands.Stereo.StereoOnWithCDCommand;
import F_commandpattern.receivers.Light;
import F_commandpattern.receivers.Stereo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MacroCommandV2RemoteControlTest {

    @Test
    public void should_control_the_party(){

        // Receiver
        Light light = new Light("Living room");
        Stereo stereo = new Stereo("Living room");

        // Command
        List<Command> partyOnCommands = buildPartyOnCommands(light, stereo);
        MacroCommand macroOn = new MacroCommand(partyOnCommands);

        List<Command> partyOffCommands = buildPartyOffCommands(light, stereo);
        MacroCommand macroOff = new MacroCommand(partyOffCommands);

        // Invoker: setCommand
        RemoteControl macroCommandRemoteControl = new RemoteControl();
        macroCommandRemoteControl.setCommand(0,macroOn,macroOff);

        // Invoker: run execute()
        System.out.println(macroCommandRemoteControl);
        System.out.println("--Pushing Macro on--");
        macroCommandRemoteControl.buttonOnPressed(0);
        System.out.println(macroCommandRemoteControl);
        System.out.println("\n--Pushing undo--");
        macroCommandRemoteControl.buttonOffPressed(0);
        System.out.println("\n--Pushing Macro off--");
        macroCommandRemoteControl.buttonUndoPressed();
        System.out.println(macroCommandRemoteControl);
    }






    private List<Command> buildPartyOffCommands(Light light, Stereo stereo) {
        Command lightOffCommand = new LightOffCommand(light);
        Command stereoOffCommand = new StereoOffCommand(stereo);
        List<Command> partyOffCommands = new ArrayList<>();
        partyOffCommands.add(lightOffCommand);
        partyOffCommands.add(stereoOffCommand);
        return partyOffCommands;
    }

    private List<Command> buildPartyOnCommands(Light light, Stereo stereo) {
        Command lightOnCommand = new LightOnCommand(light);
        Command stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        List<Command> partyOnCommands = new ArrayList<>();
        partyOnCommands.add(lightOnCommand);
        partyOnCommands.add(stereoOnWithCDCommand);
        return partyOnCommands;
    }
}
