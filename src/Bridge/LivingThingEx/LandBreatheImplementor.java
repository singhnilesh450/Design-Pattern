package Bridge.LivingThingEx;

public class LandBreatheImplementor implements  BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breathe through Nose");
        System.out.println("Intake 02");
        System.out.println("Exhale C02");
    }
}
