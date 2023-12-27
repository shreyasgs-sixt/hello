package Decorator;

import Decorator.Component.Beverage;
import Decorator.Component.DarkChocolate;
import Decorator.Component.Espresso;
import Decorator.Condiment.Milk;
import Decorator.Condiment.Whip;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + espresso.getCost());

        Beverage darkChocolate = new DarkChocolate();
        darkChocolate = new Milk(darkChocolate);
        darkChocolate = new Whip(darkChocolate);
        System.out.println(darkChocolate.getDescription() + darkChocolate.getCost());
    }
}
