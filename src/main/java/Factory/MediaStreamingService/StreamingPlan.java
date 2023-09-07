package Factory.MediaStreamingService;

abstract class StreamingPlan {
    protected String name;
    protected double price;

    public StreamingPlan(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void showFeatures();
}

class BasicPlan extends StreamingPlan {
    public BasicPlan() {
        super("Basic", 9.99);
    }

    @Override
    public void showFeatures() {
        System.out.println("Basic Plan: Standard video quality");
    }
}

class StandardPlan extends StreamingPlan {
    public StandardPlan() {
        super("Standard", 12.99);
    }

    @Override
    public void showFeatures() {
        System.out.println("Standard Plan: HD video quality");
    }
}

class PremiumPlan extends StreamingPlan {
    public PremiumPlan() {
        super("Premium", 15.99);
    }

    @Override
    public void showFeatures() {
        System.out.println("Premium Plan: Ultra HD video quality, multiple screens");
    }
}
