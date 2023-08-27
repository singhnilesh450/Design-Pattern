package Factory.PizzaService.PizzaFactory;

import Factory.PizzaService.Pizzas.NYStyleCheesePizza;
import Factory.PizzaService.Pizzas.NYStylePepperoniPizza;
import Factory.PizzaService.Pizzas.Pizza;

public class NyStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else {
            pizza = new NYStyleCheesePizza();
        }

        return pizza;
    }
}