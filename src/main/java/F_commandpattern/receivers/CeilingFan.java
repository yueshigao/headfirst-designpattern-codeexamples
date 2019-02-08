package F_commandpattern.receivers;

public class CeilingFan {

    private static final int HIGH = 3;
    private static final int MEDIUM = 2;
    private static final int OFF = 0;
    int speed;

    public void high() {
        speed = HIGH;
        System.out.println("High speed!");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Medium Speed!");
    }


    public void off() {
        speed = OFF;
        System.out.println("Ceiling fan is off!");
    }

    public int getSpeed() {
        return speed;
    }
}
