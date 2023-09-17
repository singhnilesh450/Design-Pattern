package Bridge.LivingThingEx;

public class Tree extends LivingThings{
    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void bratheProcess() {
        breatheImplementor.breathe();
    }
}
