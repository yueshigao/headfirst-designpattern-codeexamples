package H_templatemethodpattern;

public abstract class Beverage {

    final void prepareReceipt() {
        boilWater();
        brew();
        pourInCup();
        /**Hook is a method**/
        if (clientWantToAddCondiment()) {
            addCondiment();
        }
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring in cup!");
    }

    abstract void addCondiment();

    /**Hook method: to be overridden or not**/
    boolean clientWantToAddCondiment() {
        return true;
    }

}
