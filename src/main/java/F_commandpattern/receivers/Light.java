package F_commandpattern.receivers;

public class Light {

    String place;

    public Light(String place) {
        this.place = place;
    }

    public void on() {
        System.out.println(place + " Light is On");
    }

    public void off() {
        System.out.println(place + " Light is off");
    }
}
