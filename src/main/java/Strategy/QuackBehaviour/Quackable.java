package Strategy.QuackBehaviour;

public class Quackable implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("I can quack");
    }
}
