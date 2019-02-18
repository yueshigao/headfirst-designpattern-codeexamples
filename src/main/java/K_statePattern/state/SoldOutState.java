package K_statePattern.state;

import K_statePattern.context.GumballMachine;

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
