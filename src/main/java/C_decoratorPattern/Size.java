package C_decoratorPattern;

public enum Size {

    TALL("tall"),
    GRANDE("grande"),
    VENTI("venti");

    private final String size;

    private Size(String size) {
        this.size=size;
    }

    @Override
    public String toString() {
        return size;
    }
}
