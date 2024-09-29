// The Proxy Design Pattern is a structural design pattern that provides a surrogate or placeholder for another object to control access to it. 
//The proxy can add additional functionality, like lazy initialization, access control, logging, or other similar operations, without changing the original object's code.

package psdp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EmployeeDao employeeObj = new EmployeeDaoProxy();
			//employeeObj.create("USER", new EmployeeDo());
			employeeObj.create("ADMIN", new EmployeeDo());
			System.out.println("Operation Successfull");
		}
		catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}


//--------------------------------------------------------- WHEN TO USE PROXY DESIGN PATTERN ---------------------------------------------------------


//The Proxy Design Pattern is useful in situations where you need to control access to an object or add additional functionality before or after the object is accessed. 
//Here are some common scenarios where the Proxy Design Pattern is typically used
//1. Lazy Initialization (Virtual Proxy)
//2. Access Control (Protection Proxy)
//3. Remote Proxy
//4. Caching (Cache Proxy)
//5. Logging and Monitoring (Logging Proxy)
//6. Smart Reference
//7. Security Proxy
//8. Synchronization (Multithreading)