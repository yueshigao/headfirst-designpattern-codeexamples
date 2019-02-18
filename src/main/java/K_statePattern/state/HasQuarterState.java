package K_statePattern.state;

import K_statePattern.context.GumballMachine;

import java.util.Random;

public class HasQuarterState extends State {

    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    public void rejectQuarter() {
        System.out.println("Returning your quarter...");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        /**Returns a pseudorandom,
         * uniformly distributed int value between 0 (inclusive)
         * and the specified value (exclusive),
         * drawn from this random number generator's sequence. **/
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && gumballMachine.getGumballCount() > 1)
            gumballMachine.setCurrentState(gumballMachine.getWinnerState());
        else gumballMachine.setCurrentState(gumballMachine.getSoldState());
    }

    @Override
    public String toString() {
        return "HasQuarterState{}";
    }
}
