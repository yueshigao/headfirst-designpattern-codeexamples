package K_statePattern.state;

import K_statePattern.context.GumballMachine;

public class SoldState extends State {

    public SoldState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getGumballCount()>0)
            gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
        if(gumballMachine.getGumballCount()==0){
            System.out.println("Ops, sold out!!");
            gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public String toString() {
        return "SoldState{}";
    }
}
