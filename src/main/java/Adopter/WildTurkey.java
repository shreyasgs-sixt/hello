package Adopter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("I am gobbling");
    }

    @Override
    public void fly() {
        System.out.println("I can fly for short distance");
    }
}
