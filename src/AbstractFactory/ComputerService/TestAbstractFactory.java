package AbstractFactory.ComputerService;

import AbstractFactory.ComputerService.facory.PCFactory;
import AbstractFactory.ComputerService.facory.ServerFactory;

public class TestAbstractFactory {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        ComputerFactory cf=new ComputerFactory();
        Computer pc = cf.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = cf.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}