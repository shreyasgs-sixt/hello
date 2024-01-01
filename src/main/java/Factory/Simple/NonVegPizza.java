package Factory.Simple;

public class NonVegPizza implements Pizza {
    @Override
    public void getName() {
        System.out.println("This is non-veg Pizza");
    }
}
