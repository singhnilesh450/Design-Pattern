package Template.BeverageWithHookEx;
/*A hook is a method that is declared in the
abstract class, but only given an empty or default
implementation. This gives subclasses the ability to
“hook into” the algorithm at various points, if they
wish; a subclass is also free to ignore the hook. */
public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater() {
        System.out.println("Boiling water");
    }
    void pourInCup() {
        System.out.println("Pouring into cup");
    }
    boolean customerWantsCondiments() {
        return true;
    }
}