//package db.hcl.cil.insert;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class InsertUpComingEvents
//{
//	static final String DRIVER = "com.mysql.jdbc.Driver";
//	static final String URL = "jdbc:mysql://localhost:3306/cildatabase";
//	static final String USER = "root";
//	static final String PASS = "root";
//	static String sql;
//		
//	
//	public static void main(String args[])
//	{
//		
//		Connection conn = null;
//		Statement stmt = null;
//		try
//		{
//			Class.forName(DRIVER);
//			conn = DriverManager.getConnection(URL, USER, PASS);
//			stmt = conn.createStatement();
////			sql = "INSERT INTO upcomingevents VALUE(NULL ,'Internet Of Things', 'Pune', '10:10 AM', '4 JUL 2017', 'Rob', '200', 'Digitalization', 'active')";
////			sql = "INSERT INTO upcomingevents VALUE(NULL ,'Blockchain Seminar', 'London', '10:20 AM', '6 JUL 2017', 'Santosh', '300', 'To make people aware of digital technologies.', 'active')";
//			sql = "INSERT INTO upcomingevents VALUE(NULL ,'Ramesh Dalavai', 'Pune', '10:15 AM', '15-JUL-2017', 'Krishna Prasad', '25', 'LAB Visit', 'active')";
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
