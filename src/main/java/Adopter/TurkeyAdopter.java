package Adopter;

public class TurkeyAdopter implements Duck {

    Turkey turkey;

    TurkeyAdopter(Turkey turkey) {
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
