package AbstractFactory.ElectronicDeviceService;

import AbstractFactory.ElectronicDeviceService.Product.AppleLaptop;
import AbstractFactory.ElectronicDeviceService.Product.ApplePhone;

class AppleFactory implements ElectronicDeviceFactory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }
}

