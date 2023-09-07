package Factory.EmployeeService;

class EngineerFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee(String name, double salary) {
        return new Engineer(name, salary);
    }
}
