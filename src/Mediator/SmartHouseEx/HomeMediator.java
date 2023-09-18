package Mediator.SmartHouseEx;

import java.util.ArrayList;
import java.util.List;

class HomeMediator implements Mediator {
    private List<Appliance> appliances = new ArrayList<>();

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    @Override
    public void onEvent(String event, Appliance sender) {
        for (Appliance appliance : appliances) {
            if (appliance != sender) {
                appliance.onEvent(event);
            }
        }
    }
}
