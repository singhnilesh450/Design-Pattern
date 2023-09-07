package Factory.EmployeeService;

class ManagerFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee(String name, double salary) {
        return new Manager(name, salary);
    }
}

