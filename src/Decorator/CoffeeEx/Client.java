package Decorator.CoffeeEx;

public class Client {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println("Cost: $" + espresso.cost() + ", Description: " + espresso.getDescription());

        Coffee latte = new MilkDecorator(new Espresso());
        System.out.println("Cost: $" + latte.cost() + ", Description: " + latte.getDescription());

        Coffee sweetLatte = new SugarDecorator(new MilkDecorator(new Espresso()));
        System.out.println("Cost: $" + sweetLatte.cost() + ", Description: " + sweetLatte.getDescription());
    }
}
