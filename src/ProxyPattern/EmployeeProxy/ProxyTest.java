package ProxyPattern.EmployeeProxy;

public class ProxyTest {
    public static void main(String[] args) throws Exception {
        EmployeeDao empProxy=new EmployeeDaoProxy();
        Employee emp1=new Employee(11,"name1","ADMIN");
        Employee emp2=new Employee(12,"name2","USER");
        Employee emp3=new Employee(13,"name3","USER");
        Employee emp4=new Employee(14,"name4","USER");
        Employee emp5=new Employee(15,"name5","ADMIN");
        empProxy.create(emp1.getRole(),emp1);
        empProxy.delete(emp3.getRole(),emp3.getId()+"");
        empProxy.get(emp3.getRole(),emp3.getId()+"");
    }
}
