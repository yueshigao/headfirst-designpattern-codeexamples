package F_commandpattern.receivers;

public class Stereo {

    String place;

    public Stereo(String place) {
        this.place = place;
    }

    public void on(){
        System.out.println(place + " stereo on");
    }

    public void setCD(){
        System.out.println(place + " stereo is set for CD input");
    }

    public void setVolume(){
        System.out.println(place + " stereo volume is set to 11");
    }


}
