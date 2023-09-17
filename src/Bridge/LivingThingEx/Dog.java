package Bridge.LivingThingEx;

public class Dog extends LivingThings{
    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void bratheProcess() {
        breatheImplementor.breathe();
    }
}
