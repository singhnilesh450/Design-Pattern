package Template.BeverageWithHookEx;

public class Client {
    public static void main(String[] args) {
      //  TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        System.out.println("\nMaking tea...");
      //  teaHook.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}