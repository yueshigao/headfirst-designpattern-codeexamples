package H_templatemethodpattern;

public abstract class Beverage {

    final void prepareReceipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }

    protected abstract void addCondiment();

    private final void pourInCup() {
        System.out.println("Pouring in cup!");
    }

    protected abstract void brew();

    protected final void boilWater() {
        System.out.println("Boiling water...");
    }

}
