//package db.hcl.cil.create;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class CreateCILUpcomingEventsTable
//{
//	static final String DRIVER = "com.mysql.jdbc.Driver";
//	static final String URL = "jdbc:mysql://localhost:3306/cildatabase";
//	static final String USER = "root";
//	static final String PASS = "root";
//	static String sql;
//	
//	
//	public static void main(String[] args) 
//	{
//		Connection conn = null;
//		Statement stmt = null;
//		try
//		{
//			Class.forName(DRIVER);
//			conn = DriverManager.getConnection(URL, USER, PASS);
//			stmt = conn.createStatement();
//			sql = "CREATE TABLE upcomingevents(event_id INT UNSIGNED NOT NULL AUTO_INCREMENT,"
//			+ "event_name 		VARCHAR(50) UNIQUE KEY NOT NULL, "
//			+ "event_venue 		VARCHAR(100) NOT NULL, "
//			+ "event_time 		VARCHAR(100) UNIQUE KEY NOT NULL, " 
//			+ "event_date 		VARCHAR(500) NOT NULL, " 
//			+ "event_presenter 	VARCHAR(100) NOT NULL, " 
//			+ "event_audience 	VARCHAR(100) NOT NULL, " 
//			+ "event_agenda 	VARCHAR(100) NOT NULL, "
//			+ "event_status 	VARCHAR(100) NOT NULL, " 
//			+ "CHECK (event_status IN ('active','inactive')),"
//			+ "PRIMARY KEY(event_id))";
//			stmt.executeUpdate(sql);
//			System.out.println("Done!");
//			
//		}catch(SQLException se)
//		{
//			System.out.println(se);
//		}catch (Exception e) 
//		{
//			System.out.println(e);
//		}
//	}
//}
