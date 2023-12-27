package Decorator.Condiment;

import Decorator.Component.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk ";
    }

    @Override
    public float getCost() {
        return beverage.getCost() + 10;
    }
}
