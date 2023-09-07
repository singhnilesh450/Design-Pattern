package AbstractFactory.ElectronicDeviceService.Product;

import AbstractFactory.ElectronicDeviceService.Phone;

public class ApplePhone implements Phone {
    @Override
    public void makeCall() {
        System.out.println("Making a call with an Apple phone");
    }
}





