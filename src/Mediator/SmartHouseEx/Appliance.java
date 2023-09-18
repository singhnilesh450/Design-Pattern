package Mediator.SmartHouseEx;

abstract class Appliance {
    protected Mediator mediator;

    public Appliance(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void onEvent(String event);

    void sendMessage(String event) {
        mediator.onEvent(event, this);
    }
}