package AbstractFactory.ElectronicDeviceService;

public class TestAbstractFactory {
    public static void main(String[] args) {
        ElectronicDeviceFactory appleFactory = new AppleFactory();
        Phone applePhone = appleFactory.createPhone();
        Laptop appleLaptop = appleFactory.createLaptop();

        applePhone.makeCall();
        appleLaptop.performTask();

        ElectronicDeviceFactory samsungFactory = new SamsungFactory();
        Phone samsungPhone = samsungFactory.createPhone();
        Laptop samsungLaptop = samsungFactory.createLaptop();

        samsungPhone.makeCall();
        samsungLaptop.performTask();
    }
}
