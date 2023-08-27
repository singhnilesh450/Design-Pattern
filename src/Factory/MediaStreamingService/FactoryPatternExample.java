package Factory.MediaStreamingService;

public class FactoryPatternExample {
    public static void main(String[] args) {
        StreamingPlanFactory basicPlanFactory = new BasicPlanFactory();
        StreamingPlan basicPlan = basicPlanFactory.createPlan();
        basicPlan.showFeatures();

        StreamingPlanFactory standardPlanFactory = new StandardPlanFactory();
        StreamingPlan standardPlan = standardPlanFactory.createPlan();
        standardPlan.showFeatures();

        StreamingPlanFactory premiumPlanFactory = new PremiumPlanFactory();
        StreamingPlan premiumPlan = premiumPlanFactory.createPlan();
        premiumPlan.showFeatures();
    }
}