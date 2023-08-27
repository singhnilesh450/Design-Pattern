package Factory.EmployeeService;

public class FactoryPatternExample {
    public static void main(String[] args) {
        EmployeeFactory managerFactory = new ManagerFactory();
        Employee manager = managerFactory.createEmployee("Alice", 80000);
        manager.performDuties();

        EmployeeFactory engineerFactory = new EngineerFactory();
        Employee engineer = engineerFactory.createEmployee("Bob", 60000);
        engineer.performDuties();
    }
}
