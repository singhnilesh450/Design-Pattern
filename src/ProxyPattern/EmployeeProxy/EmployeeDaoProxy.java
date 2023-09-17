package ProxyPattern.EmployeeProxy;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDao employeeDao;
    public  EmployeeDaoProxy(){
        employeeDao=new EmployeeDaoImpl() ;
    }
    @Override
    public void create(String client, Employee obj) throws Exception {
        if(client.equals("ADMIN")){
            employeeDao.create(client,obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, String id) throws Exception {
        if(client.equals("ADMIN")  ){
            employeeDao.delete(client,id);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, String id) throws Exception {
        if(client.equals("ADMIN")|| client.equals("USER")){
            return employeeDao.get(client,id);

        }
        throw new Exception("Access Denied");
    }
}
