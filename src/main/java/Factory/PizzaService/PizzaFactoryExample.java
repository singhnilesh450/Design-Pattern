package Factory.PizzaService;

import Factory.PizzaService.PizzaFactory.ChicagoStylePizzaStore;
import Factory.PizzaService.PizzaFactory.NyStylePizzaStore;
import Factory.PizzaService.PizzaFactory.PizzaStore;
import Factory.PizzaService.Pizzas.Pizza;

public class PizzaFactoryExample {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
