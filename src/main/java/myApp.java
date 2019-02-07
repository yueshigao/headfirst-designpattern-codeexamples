import E_singletonpattern.ChocolateBoiler;

public class myApp {

    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.drain();

        chocolateBoiler.fill();
        chocolateBoiler.boil();
    }
}
