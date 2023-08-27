package Factory.MediaStreamingService;

class BasicPlanFactory implements StreamingPlanFactory {
    @Override
    public StreamingPlan createPlan() {
        return new BasicPlan();
    }
}