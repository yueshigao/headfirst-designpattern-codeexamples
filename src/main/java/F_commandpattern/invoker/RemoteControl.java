package F_commandpattern.invoker;

import F_commandpattern.commands.Command;
import F_commandpattern.commands.NoCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker object setCommand() and execute() when time arriving
 **/
public class RemoteControl {

    List<Command> onCommands;
    List<Command> offCommands;

    /**
     * Null object Pattern:
     * instantiate each field to an empty instance to avoid null exception
     **/
    public RemoteControl() {
        onCommands = new ArrayList<>();
        offCommands = new ArrayList<>();

        /**new NoCommand(): an empty class**/
        final Command noCommand = new NoCommand();

        /**you cannot use forEach of a list to initiate this List**/
        for (int i = 0; i < 7; i++) {
            onCommands.add(noCommand);
            offCommands.add(noCommand);
        }
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands.set(slot,onCommand);
        offCommands.set(slot,offCommand);
    }

    public void buttonsOnPressed(int slot) {
        onCommands.get(slot).execute();
    }

    public void buttonsOffPressed(int slot) {
        offCommands.get(slot).execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("\n----------- Remote Control --------\n");

        for (int i = 0; i < 7; i++) {
            stringBuffer.append("slot [" + i + "]: "
                    + onCommands.get(i).getClass().getSimpleName()
                    +"            "
                    + offCommands.get(i).getClass().getSimpleName()
                    + "\n");
        }

        return stringBuffer.toString();

        /**
         *
         * the difference between canonical name, simple name and class name :

         If you're unsure about something, try writing a test first.

         I did this:

         //primitive
         System.out.println(int.class.getName());
         System.out.println(int.class.getCanonicalName());
         System.out.println(int.class.getSimpleName());

         System.out.println();

         //class
         System.out.println(String.class.getName());
         System.out.println(String.class.getCanonicalName());
         System.out.println(String.class.getSimpleName());

         System.out.println();

         //inner class
         System.out.println(HashMap.SimpleEntry.class.getName());
         System.out.println(HashMap.SimpleEntry.class.getCanonicalName());
         System.out.println(HashMap.SimpleEntry.class.getSimpleName());

         System.out.println();

         //anonymous inner class
         System.out.println(new Serializable(){}.getClass().getName());
         System.out.println(new Serializable(){}.getClass().getCanonicalName());
         System.out.println(new Serializable(){}.getClass().getSimpleName());

         Prints:

         //primitive
         int
         int
         int

         //class
         java.lang.String
         java.lang.String
         String

         //inner class
         java.util.AbstractMap$SimpleEntry
         java.util.AbstractMap.SimpleEntry
         SimpleEntry

         //anonymous inner class
         ClassnameTest$1
         null

         There's an empty line in the last block where getSimpleName returns an empty string.

         The upshot looking at this is:

         the name is the name that you'd use to dynamically load the class with, for example, a call to Class.forName with the default ClassLoader.
         the canonical name is the name that would be used in an import statement and uniquely identifies the class. Might be useful during toString or logging operations.
         the simple name loosely identifies the class, again might be useful during toString or logging operations but is not guaranteed to be unique.**/
    }

}
