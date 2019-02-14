package C_decoratorPattern.component;

public abstract class Beverage {

    protected static final int TALL = 3;
    protected static final int GRANDE = 2;
    protected static final int VENTI = 1;

    String description = "Unknown beverage";
    int size;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
