package F_commandpattern.invoker;

import F_commandpattern.commands.Command;
import F_commandpattern.commands.Garage.GarageDoorOpenCommand;
import F_commandpattern.commands.Light.LightOnCommand;
import F_commandpattern.receivers.GarageDoor;
import F_commandpattern.receivers.Light;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;


public class SimpleRemoteControlTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void should_turn_on_the_light() {
        // GIVEN
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light("Living room");
        Command lightOnCommand = new LightOnCommand(light);

        // WHEN
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        // THEN
        /**assertThat("Light is On").containsSubsequence(systemOutRule.getLog());**/
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
       /** assertThat("Garage door is open!").containsSubsequence(systemOutRule.getLog());**/
    }


}