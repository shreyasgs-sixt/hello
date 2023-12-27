package Strategy;

import Strategy.Duck.Duck;
import Strategy.Duck.MallardDuck;
import Strategy.Duck.SpongeDuck;
import Strategy.FlyBehaviour.NoFly;
import Strategy.QuackBehaviour.Squeeze;

public class DuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();

        Duck spongeDuck = new SpongeDuck();
        spongeDuck.setFlyBehaviour(new NoFly());
        spongeDuck.performFly();
        spongeDuck.setQuackBehaviour(new Squeeze());
        spongeDuck.performQuack();
        spongeDuck.display();
    }
}
