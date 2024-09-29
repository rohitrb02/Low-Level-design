package psdp;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void create(String client, EmployeeDo obj) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("created new row in the employee table");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("seleted row with employeeID: " + employeeId );
	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("fetching data from DB");
		return new EmployeeDo();
	}

}
