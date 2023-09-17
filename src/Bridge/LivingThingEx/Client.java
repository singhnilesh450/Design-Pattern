package Bridge.LivingThingEx;

public class Client {
    public static void main(String[] args) {
        LivingThings livingThings=new Dog(new LandBreatheImplementor());
        LivingThings livingThings1=new Tree(new TreeBreatheImplementor());
        LivingThings livingThings2=new Fish(new WaterBreatheImplementor());
        livingThings.bratheProcess();
        livingThings1.bratheProcess();
        livingThings2.bratheProcess();
    }
}
