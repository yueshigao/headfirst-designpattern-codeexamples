package K_statePattern.State;

import K_statePattern.Context.GumballMachine;

public class SoldOutState extends State {

    public SoldOutState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    public void refill(int i){
        gumballMachine.addBall(i);
        System.out.println("Refilled!");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    @Override
    public String toString() {
        return "Machine is sold out";
    }
}
