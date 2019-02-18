package K_statePattern.state;

import K_statePattern.context.GumballMachine;

public class WinnerState extends State {

    public WinnerState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get 2 gumballs for your quarter");
        gumballMachine.releaseBall();

        if (gumballMachine.getGumballCount() == 0)
            gumballMachine.setCurrentState(gumballMachine.getSoldOutState());

        if (gumballMachine.getGumballCount() > 0) {
            gumballMachine.releaseBall();

            if (gumballMachine.getGumballCount() == 0) {
                gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
            }else {
                gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
            }
        }
    }

    @Override
    public String toString() {
        return "WinnerState{}";
    }
}
