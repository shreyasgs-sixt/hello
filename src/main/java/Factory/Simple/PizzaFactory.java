package Factory.Simple;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("VEG")) {
            pizza = new VegPizza();
        } else if (type.equals("NON_VEG")) {
            pizza = new NonVegPizza();
        }
        return pizza;
    }
}
