package Factory.Simple;

public class VegPizza implements Pizza {
    @Override
    public void getName() {
        System.out.println("This is veg-pizza");
    }
}
