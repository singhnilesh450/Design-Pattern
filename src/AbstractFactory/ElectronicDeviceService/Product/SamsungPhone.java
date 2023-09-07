package AbstractFactory.ElectronicDeviceService.Product;

import AbstractFactory.ElectronicDeviceService.Phone;

public class SamsungPhone implements Phone {
    @Override
    public void makeCall() {
        System.out.println("Making a call with a Samsung phone");
    }
}