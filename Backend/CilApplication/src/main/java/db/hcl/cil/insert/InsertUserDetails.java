//package db.hcl.cil.insert;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class InsertUserDetails 
//{
//	static final String DRIVER = "com.mysql.jdbc.Driver";
//	static final String URL = "jdbc:mysql://localhost:3306/cildatabase";
//	static final String USER = "root";
//	static final String PASS = "root";
//	static String sql;
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
//			sql =	"INSERT INTO userdetails VALUE(NULL, 'samir', 'tilak', 'samir.t', 'samir.t@hcl.com', " +
//					"'samir81', 'ADMIN', 'ACTIVE', 'Java Manager', 'What is your mothers maiden name?', " +
//					"'samir1', 'What was your favorite place to visit as a child?', 'samir2', 'In what city were you born?', " +
//					"'samir3')";
//
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
