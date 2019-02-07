package factorypattern;

public enum Type {
    CHEESE("cheese"),
    PEPPERONI("pepperoni"),
    CLAM("clam"),
    VEGGIE("veggie")
    ;

    private final String type;

    Type(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
