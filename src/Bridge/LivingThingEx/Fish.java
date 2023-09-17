package Bridge.LivingThingEx;

public class Fish extends LivingThings{
    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void bratheProcess() {

        breatheImplementor.breathe();
    }
}
