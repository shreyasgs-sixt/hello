package Factory.Simple;

public class PizzaApplication {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        store.orderPizza("VEG");
        store.orderPizza("NON_VEG");
    }
}
