package Decorator.Component;

public class DarkChocolate implements Beverage {
    @Override
    public String getDescription() {
        return "Dark Chocolate ";
    }

    @Override
    public float getCost() {
        return 60;
    }
}
