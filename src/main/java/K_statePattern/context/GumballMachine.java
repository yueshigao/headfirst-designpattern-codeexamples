package K_statePattern.context;

import K_statePattern.state.*;

public class GumballMachine {

    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State winnerState;

    private State currentState;
    private int gumballCount;

    public GumballMachine(int gumballCount) {

        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.gumballCount = gumballCount;
        currentState = noQuarterState;
    }

    /**
     * state Pattern encapsulate states in object,
     * and use context to delegate the action to the state instance
     **/
    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void returnQuarter() {
        currentState.rejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        if (currentState == soldState || currentState == winnerState) currentState.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        gumballCount--;
    }

    public void addBall(int i) {
        System.out.println("Adding " + i + "balls into machine");
        gumballCount = i;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------------Begin Inventory-----------------");
        stringBuffer.append("\nMighty Gumball Inc.");
        stringBuffer.append("\nJava-enabled Standing Gumball Model #2004");
        stringBuffer.append("\nInventory: " + gumballCount + " gumballs\n");
        stringBuffer.append(currentState + "\n");
        stringBuffer.append("------------End Inventory-------------------\n");

        return stringBuffer.toString();
    }
}
