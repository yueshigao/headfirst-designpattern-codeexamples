package K_statePattern.state;

import K_statePattern.context.GumballMachine;

public class NoQuarterState extends State {

    public NoQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter!");
        gumballMachine.setCurrentState(gumballMachine.getHasQuarterState());
    }

    @Override
    public String toString() {
        return "You haven't inserted a quarter";
    }
}
