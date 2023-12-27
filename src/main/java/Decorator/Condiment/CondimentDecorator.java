package Decorator.Condiment;

import Decorator.Component.Beverage;

public abstract class CondimentDecorator implements Beverage {
     Beverage beverage;

     public CondimentDecorator(Beverage beverage) {
          this.beverage = beverage;
     }

}
