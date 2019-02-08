package H_templatemethodpattern;

public class Tea extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Steeping in the tea");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Adding some lemon!");
    }

}
