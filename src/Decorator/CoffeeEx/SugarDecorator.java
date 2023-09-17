package Decorator.CoffeeEx;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
}
