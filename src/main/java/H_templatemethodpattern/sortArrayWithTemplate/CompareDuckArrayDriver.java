package H_templatemethodpattern.sortArrayWithTemplate;

import java.util.Arrays;

public class CompareDuckArrayDriver {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7)
        };

        System.out.println("Before sorting");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("\n After sorting");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (int i = 0; i < 3; i++) {
            System.out.println(ducks[i]);
        }
    }
}
