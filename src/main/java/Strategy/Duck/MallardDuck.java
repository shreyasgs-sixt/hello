package Strategy.Duck;

import Strategy.FlyBehaviour.FlyWithWings;
import Strategy.QuackBehaviour.Quackable;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quackable();
    }
    @Override
    public void display() {
        System.out.println("I am Mallard duck");
    }
}
