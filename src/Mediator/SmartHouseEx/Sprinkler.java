package Mediator.SmartHouseEx;

class Sprinkler extends Appliance {
    public Sprinkler(Mediator mediator) {
        super(mediator);
    }

    @Override
    void onEvent(String event) {
        if (event.equals("checkCalendar")) {
            System.out.println("Sprinkler: Checking calendar.");
        } else if (event.equals("checkShower")) {
            System.out.println("Sprinkler: Checking shower.");
        } else if (event.equals("checkTemp")) {
            System.out.println("Sprinkler: Checking temperature.");
        } else if (event.equals("checkWeather")) {
            System.out.println("Sprinkler: Checking weather.");
        }
    }
}
