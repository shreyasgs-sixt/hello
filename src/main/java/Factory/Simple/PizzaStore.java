package Factory.Simple;

public class PizzaStore {
    public void orderPizza(String type) {
        Pizza pizza = PizzaFactory.createPizza(type);
        pizza.getName();
    }
}
