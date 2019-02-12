package K_statePattern.State;

import K_statePattern.Context.GumballMachine;

public class HasQuarterState extends State {

    public HasQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    public void rejectQuarter(){
        System.out.println("Returning your quarter...");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank(){
        System.out.println("You turned...");
        gumballMachine.setCurrentState(gumballMachine.getSoldState());
    }

    @Override
    public String toString() {
        return "HasQuarterState{}";
    }
}
