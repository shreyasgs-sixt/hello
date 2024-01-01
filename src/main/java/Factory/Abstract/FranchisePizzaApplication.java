package Factory.Abstract;

public class FranchisePizzaApplication {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        store.orderPizza("CHEESE");
    }
}
