package Factory.Abstract;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("CHEESE")) {
            return new NYCheesePizza();
        }
        return null;
    }
}
