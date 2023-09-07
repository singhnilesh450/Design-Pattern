package Factory.PizzaService.PizzaFactory;

import Factory.PizzaService.Pizzas.ChicagoStyleCheesePizza;
import Factory.PizzaService.Pizzas.ChicagoStylePepperoniPizza;
import Factory.PizzaService.Pizzas.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else {
            pizza = new ChicagoStyleCheesePizza();
        }

        return pizza;
    }
}