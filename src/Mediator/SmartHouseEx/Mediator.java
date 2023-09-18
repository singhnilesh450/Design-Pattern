package Mediator.SmartHouseEx;

interface Mediator {
    void onEvent(String event, Appliance sender);
}