package Adopter;

public class DuckTurkeySimulator {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck turkeyAdopter = new TurkeyAdopter(turkey);
        turkeyAdopter.quack();
        turkeyAdopter.fly();
    }
}
