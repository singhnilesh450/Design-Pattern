package Bridge.LivingThingEx;

public class WaterBreatheImplementor implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breathe through Gills");
        System.out.println("Intake 02");
        System.out.println("Exhale C02");
    }
}
