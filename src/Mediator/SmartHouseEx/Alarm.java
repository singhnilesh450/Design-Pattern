package Mediator.SmartHouseEx;

class Alarm extends Appliance {
    public Alarm(Mediator mediator) {
        super(mediator);
    }

    @Override
    void onEvent(String event) {
        if (event.equals("checkCalendar")) {
            System.out.println("Alarm: Checking calendar.");
        } else if (event.equals("checkSprinkler")) {
            System.out.println("Alarm: Checking sprinkler.");
        } else if (event.equals("startCoffee")) {
            System.out.println("Alarm: Starting coffee.");
        }
    }
}
