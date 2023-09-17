package ProxyPattern.EmployeeProxy;

public interface EmployeeDao {
    public void create(String client,Employee obj) throws Exception;
    public void delete(String client,String id) throws Exception;
    public Employee get(String client, String id) throws Exception;
}