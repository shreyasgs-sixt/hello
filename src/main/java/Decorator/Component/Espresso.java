package Decorator.Component;

public class Espresso implements Beverage {

    @Override
    public String getDescription() {
        return "Espresso ";
    }

    @Override
    public float getCost() {
        return 50;
    }
}
