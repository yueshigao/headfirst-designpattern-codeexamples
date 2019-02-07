package F_commandpattern;

import F_commandpattern.commands.Command;
import F_commandpattern.commands.GarageDoorOpenCommand;
import F_commandpattern.commands.LightOnCommand;
import F_commandpattern.receivers.GarageDoor;
import F_commandpattern.receivers.Light;
import F_commandpattern.invoker.SimpleRemoteControl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.assertj.core.api.Assertions.assertThat;


public class SimpleRemoteControlTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void should_turn_on_the_light() {
        // GIVEN
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);

        // WHEN
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        // THEN
        assertThat("Light is On").containsSubsequence(systemOutRule.getLog());
    }

    @Test
    public void should_open_the_garage_door() {
        // GIVEN
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        GarageDoor garageDoor = new GarageDoor();
        Command command = new GarageDoorOpenCommand(garageDoor);

        // WHEN
        simpleRemoteControl.setCommand(command);
        simpleRemoteControl.buttonWasPressed();

        // THEN
        assertThat("Garage door is open!").containsSubsequence(systemOutRule.getLog());
    }


}