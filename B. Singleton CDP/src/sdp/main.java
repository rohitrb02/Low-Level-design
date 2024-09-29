// It is used when we have create only 1 instance of the class.
// The Singleton design pattern ensures that a class has only one instance and provides a global point of access to it.

//4 ways:-
//1.Eager
//2.Lazy
//3.Synchronized Method
//4.Double Locking  (Best practice for lazy initialization)

// ex: the DatabaseConnection class ensures only one connection to the database is created and reused throughout the application. 
// This is crucial for resource management and maintaining a single point of access for database operations.

package sdp;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnection connection1 = DBConnection.getInstance();
        DBConnection connection2 = DBConnection.getInstance();

        System.out.println("Connection1: " + connection1);
        System.out.println("Connection2: " + connection2);

        // Verify that both connections are the same instance
        if (connection1 == connection2) {
            System.out.println("Both connections are the same instance.");
        } else {
            System.out.println("Different instances found.");
        }

	}

}

//--------------------------------------------------------- WHEN TO USE Singleton DESIGN PATTERN ---------------------------------------------------------

//The Singleton design pattern should be used in scenarios where you need to ensure that only one instance of a class exists and provides a global point of access to that instance.