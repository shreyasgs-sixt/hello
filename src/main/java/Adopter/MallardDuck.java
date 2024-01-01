package Adopter;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("I am Quacking");
    }

    @Override
    public void fly() {
        System.out.println("I am Flying");
    }
}
