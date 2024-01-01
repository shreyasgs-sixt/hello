package Factory.Abstract;

public abstract class PizzaStore {
    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.getName();
    }

    abstract Pizza createPizza(String type);
}
