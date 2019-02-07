package F_commandpattern;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import static org.assertj.core.api.Assertions.assertThat;


public class LightOnCommandTest {

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
        simpleRemoteControl.buttonOnWasPressed();

        // THEN
        assertThat("Light is On").containsSubsequence(systemOutRule.getLog());
    }

}