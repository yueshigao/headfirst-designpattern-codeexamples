package C_decoratorPattern.decorator;

import C_decoratorPattern.component.Beverage;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public int getSize(){
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        if(getSize()==(Beverage.TALL)) return beverage.cost() + 0.30;
        if(getSize()==(Beverage.GRANDE)) return beverage.cost() + 0.20;
        if(getSize()==(Beverage.VENTI)) return beverage.cost() + 0.10;
        return beverage.cost();
    }
}
