package Factory.MediaStreamingService;

class StandardPlanFactory implements StreamingPlanFactory {
    @Override
    public StreamingPlan createPlan() {
        return new StandardPlan();
    }
}