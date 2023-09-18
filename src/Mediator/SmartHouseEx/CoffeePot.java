package Mediator.SmartHouseEx;

class CoffeePot extends Appliance {
    public CoffeePot(Mediator mediator) {
        super(mediator);
    }

    @Override
    void onEvent(String event) {
        if (event.equals("checkCalendar")) {
            System.out.println("CoffeePot: Checking calendar.");
        } else if (event.equals("checkAlarm")) {
            System.out.println("CoffeePot: Checking alarm.");
        }
    }
}
