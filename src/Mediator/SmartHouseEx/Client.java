package Mediator.SmartHouseEx;

public class Client {
    public static void main(String[] args) {
        HomeMediator mediator = new HomeMediator();

        // Create appliances and add them to the mediator
        Alarm alarm = new Alarm(mediator);
        CoffeePot coffeePot = new CoffeePot(mediator);
        Calendar calendar = new Calendar(mediator);
        Sprinkler sprinkler = new Sprinkler(mediator);

        mediator.addAppliance(alarm);
        mediator.addAppliance(coffeePot);
        mediator.addAppliance(calendar);
        mediator.addAppliance(sprinkler);

        // Simulate events
        alarm.sendMessage("checkCalendar");
        coffeePot.sendMessage("checkAlarm");
        calendar.sendMessage("doSprinkler");
        sprinkler.sendMessage("checkCalendar");
    }
}