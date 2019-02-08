package F_commandpattern.invoker;


import F_commandpattern.commands.*;
import F_commandpattern.receivers.Light;
import F_commandpattern.receivers.Stereo;
import org.junit.Test;

public class RemoteControlTest {

    @Test
    public void should_run_remote_control(){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living Room");

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightoff = new LightOffCommand(livingRoomLight);
        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightoff);

        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        remoteControl.setCommand(1,kitchenLightOn, kitchenLightOff);

        Command steroOnWithCD = new StereoOnWithCDCommand(stereo);
        Command steroOff = new NoCommand();
        remoteControl.setCommand(2,steroOnWithCD,steroOff);

        System.out.println(remoteControl);

        for (int i = 0; i <3 ; i++) {
            remoteControl.buttonOnPressed(i);
            remoteControl.buttonOffPressed(i);
        }
    }

}