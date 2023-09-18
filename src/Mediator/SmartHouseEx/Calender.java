package Mediator.SmartHouseEx;

class Calendar extends Appliance {
    public Calendar(Mediator mediator) {
        super(mediator);
    }

    @Override
    void onEvent(String event) {
        if (event.equals("checkDayOfWeek")) {
            System.out.println("Calendar: Checking day of the week.");
        } else if (event.equals("doSprinkler")) {
            System.out.println("Calendar: Doing sprinkler.");
        } else if (event.equals("doCoffee")) {
            System.out.println("Calendar: Doing coffee.");
        } else if (event.equals("doAlarm")) {
            System.out.println("Calendar: Doing alarm.");
        }
    }
}
