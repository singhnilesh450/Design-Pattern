package AbstractFactory.ElectronicDeviceService.Product;

import AbstractFactory.ElectronicDeviceService.Laptop;

public class AppleLaptop implements Laptop {
    @Override
    public void performTask() {
        System.out.println("Performing a task on an Apple laptop");
    }
}
