//package db.hcl.cil.create;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class CreateCILHeaderTable 
//{
//	static final String DRIVER = "com.mysql.jdbc.Driver";
//	static final String URL = "jdbc:mysql://localhost:3306/cildatabase";
//	static final String USER = "root";
//	static final String PASS = "root";
//	static String sql;
//	public static void main(String[] args) 
//	{
//		Connection conn = null;
//		Statement stmt = null;
//		try
//		{
//			
//			Class.forName(DRIVER);
//			conn = DriverManager.getConnection(URL, USER, PASS);
//			stmt = conn.createStatement();
//			sql = "CREATE TABLE header" + 
//			" (header_id INT UNSIGNED NOT NULL AUTO_INCREMENT," +
//			" header_heading VARCHAR(50)," +
//			" header_subheading VARCHAR(100)," + 
//			" header_description VARCHAR(1000)," + 
//			" header_img VARCHAR(100)," + 
//			" PRIMARY KEY(header_id))";
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
//		
//	}
//}
