package Factory.MediaStreamingService;

class PremiumPlanFactory implements StreamingPlanFactory {
    @Override
    public StreamingPlan createPlan() {
        return new PremiumPlan();
    }
}