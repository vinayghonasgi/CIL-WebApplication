//package db.hcl.cil.insert;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class InsertOnGoingProjects
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
////			sql = "INSERT INTO projects VALUE(NULL ,"
////					+ "'DB Palace', 'external')";
////			sql = "INSERT INTO projects VALUE(NULL ,"
////					+ "'Illiquid Assets', 'internal')";
////			sql = "INSERT INTO projects VALUE(NULL ,"
////					+ "'Global Claim POC', 'internal')";
////			sql = "INSERT INTO projects VALUE(NULL ,"
////					+ "'Co-Innovation Portal', 'internal')";
////			sql = "INSERT INTO projects VALUE(NULL ,"
////					+ "'Assets & Wealth Management', 'external')";
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
