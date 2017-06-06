//package db.hcl.cil.insert;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//public class InsertService 
//{
//	static final String DRIVER = "com.mysql.jdbc.Driver";
//	static final String URL = "jdbc:mysql://localhost:3306/cildatabase";
//	static final String USER = "root";
//	static final String PASS = "root";
//	static String sql;
//	
//	public static String service_id;
//	public static String service_heading;
//	public static ArrayList<String> service_offering = new ArrayList<String>();
//	
//	public static void main(String args[])
//	{
//		service_id = "offerings";
//		service_heading = "OFFERINGS";
//		service_offering.add("INNOVATIONS~");
//		service_offering.add("CONSULTING~");		
//		service_offering.add("PROJECTS~");
//		
//		
//		Connection conn = null;
//		Statement stmt = null;
//		try
//		{
//			Class.forName(DRIVER);
//			conn = DriverManager.getConnection(URL, USER, PASS);
//			stmt = conn.createStatement();
//			
//			sql = "INSERT INTO service VALUE(NULL,'" + service_heading + "', '" + service_offering.get(0) + service_offering.get(1) + service_offering.get(2) + "')";
//			stmt.executeUpdate(sql);
//			System.out.println("Done!");
//		}catch(SQLException se)
//		{
//			System.out.println(se);
//		}catch (Exception e) 
//		{
//			System.out.println(e);
//		}
//	}	
//}
