package AbstractFactory.ElectronicDeviceService;

interface ElectronicDeviceFactory {
    Phone createPhone();
    Laptop createLaptop();
}