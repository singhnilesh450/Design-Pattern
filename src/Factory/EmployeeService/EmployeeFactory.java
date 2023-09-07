package Factory.EmployeeService;

interface EmployeeFactory {
    Employee createEmployee(String name, double salary);
}
