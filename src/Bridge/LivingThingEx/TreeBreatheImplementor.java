package Bridge.LivingThingEx;

public class TreeBreatheImplementor implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breathe through Leaves");
        System.out.println("Intake C02");
        System.out.println("Exhale 02");
    }
}
