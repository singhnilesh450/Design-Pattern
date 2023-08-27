package AbstractFactory.ElectronicDeviceService;

import AbstractFactory.ElectronicDeviceService.Product.SamsungLaptop;
import AbstractFactory.ElectronicDeviceService.Product.SamsungPhone;

public class SamsungFactory implements ElectronicDeviceFactory {
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }
}
