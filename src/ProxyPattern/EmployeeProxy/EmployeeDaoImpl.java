package ProxyPattern.EmployeeProxy;

public class EmployeeDaoImpl implements EmployeeDao {


    @Override
    public void create(String client, Employee obj) throws Exception {
        System.out.println("Create...");
    }

    @Override
    public void delete(String client, String id) throws Exception{
        System.out.println("Delete..."+id);
    }

    @Override
    public Employee get(String client, String id) throws Exception{
        return new Employee(1,"Nilesh","ADMIN");
    }
}