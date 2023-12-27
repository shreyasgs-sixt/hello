package Decorator.Condiment;

import Decorator.Component.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float getCost() {
        return beverage.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip ";
    }
}
