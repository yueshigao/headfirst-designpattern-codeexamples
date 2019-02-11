package H_templatemethodpattern.beverageExapmle;

public class OrderBeverage {

    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        System.out.println("\n------Making tea-------");
        tea.prepareReceipt();

        System.out.println("\n------Making coffee-------");
        coffee.prepareReceipt();
    }
}
