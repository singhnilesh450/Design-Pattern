package AbstractFactory.ElectronicDeviceService.Product;

import AbstractFactory.ElectronicDeviceService.Laptop;

public class SamsungLaptop implements Laptop {
    @Override
    public void performTask() {
        System.out.println("Performing a task on a Samsung laptop");
    }
}