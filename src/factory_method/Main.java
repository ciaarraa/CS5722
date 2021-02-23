package factory_method;

public class Main {

    public static void main(String[] args){
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("pepperoni");
    }
}
