package K_statePattern.State;

import K_statePattern.Context.GumballMachine;

public abstract class State {

    GumballMachine gumballMachine;

    State(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Wrong demand!");
    }

    public void rejectQuarter(){
        System.out.println("Wrong demand!");
    }

    public void turnCrank(){
        System.out.println("Wrong demand!");
    }

    public void dispense(){
        System.out.println("Wrong demand!");
    }

    public void refill(int i){
        System.out.println("Wrong demand!");
    }
}
