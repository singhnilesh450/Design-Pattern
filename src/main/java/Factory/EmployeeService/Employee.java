package Factory.EmployeeService;

abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void performDuties();
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void performDuties() {
        System.out.println("Manager " + name + " is managing tasks.");
    }
}

class Engineer extends Employee {
    public Engineer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void performDuties() {
        System.out.println("Engineer " + name + " is working on engineering tasks.");
    }
}