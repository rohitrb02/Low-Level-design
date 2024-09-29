package sdp;

public class DBConnection {

	
	//1.Eager Initialization--------------------------------------------------------------------------------------------------------------
//	private static  DBConnection dbConnection = new DBConnection();
//	
//	private DBConnection() {
//	}
//	
//	public static DBConnection getInstance() {
//		return dbConnection;
//	}
	
	//2.Lazy Initialization--------------------------------------------------------------------------------------------------------------
//	private static  DBConnection dbConnection;
//	private DBConnection() {
//	}
//	public static DBConnection getInstance() {
//		
//		if(dbConnection == null) {
//			dbConnection =  new DBConnection();
//		}
//		return dbConnection;
//	}
	
	
	
	//3.Synchronized--------------------------------------------------------------------------------------------------------------
//	private static  DBConnection dbConnection;
//	private DBConnection() {
//	}
//	synchronized public static DBConnection getInstance() {
//		
//		if(dbConnection == null) {
//			dbConnection =  new DBConnection();
//		}
//		return dbConnection;
//	}
	
	
	//4.Double Locking-------------------------------------------------------------------------------------------------------------- (Best way)
	
	// Double-checked locking (Best practice for lazy initialization)
	private static  DBConnection dbConnection;
	private DBConnection() {
		// Private constructor to prevent instantiation
	}
	public static DBConnection getInstance() {
		
		if(dbConnection == null) {
			synchronized(DBConnection.class) {
				if(dbConnection == null) {
					dbConnection =  new DBConnection();
				}
			}
		}
		return dbConnection;
	}

}
