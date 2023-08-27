package AbstractFactory.ComputerService.factory;

import AbstractFactory.ComputerService.Computer;
import AbstractFactory.ComputerService.ComputerAbstractFactory;
import AbstractFactory.ComputerService.model.Server;

public class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }

}