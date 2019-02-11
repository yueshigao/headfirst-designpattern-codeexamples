package H_templatemethodpattern.sortArrayWithTemplate;

public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weight: " + weight;
    }

    @Override
    public int compareTo(Object other) {
        Duck otherDuck = (Duck) other;
        if (otherDuck.weight > weight) return -1;
        if (otherDuck.weight < weight) return 1;
        return 0;
    }
}
