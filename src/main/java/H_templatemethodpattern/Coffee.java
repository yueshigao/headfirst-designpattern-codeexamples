package H_templatemethodpattern;

public class Coffee extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Dripping water through filter");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Adding sugar and milk!");
    }

    @Override
    boolean clientWantToAddCondiment() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) return true;
        return false;
    }

    private String getUserInput() {
        return null;
    }


}
