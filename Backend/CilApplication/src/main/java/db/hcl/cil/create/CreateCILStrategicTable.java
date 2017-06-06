//package db.hcl.cil.create;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class CreateCILStrategicTable 
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
//			sql = "CREATE TABLE strategic(strategic_id INT UNSIGNED NOT NULL AUTO_INCREMENT,"
//			+ "strategic_heading VARCHAR(50), "
//			+ "strategic_logo varchar(50), "
//			+ "strategic_status varchar(20), " 
//			+ "PRIMARY KEY(strategic_id), "
//			+ "CHECK (strategic_status IN ('active','inactive')))";
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