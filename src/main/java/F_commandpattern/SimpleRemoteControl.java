package F_commandpattern;

public class SimpleRemoteControl {

    Command slot;

    /**setCommand() take a command
     * like a waitress take an order
     * and
     * give it to the receiver*/
    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
