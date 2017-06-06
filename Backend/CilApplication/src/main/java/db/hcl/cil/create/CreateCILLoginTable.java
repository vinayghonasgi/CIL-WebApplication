//package db.hcl.cil.create;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class CreateCILLoginTable 
//{
//
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
//			Class.forName(DRIVER);
//			conn = DriverManager.getConnection(URL, USER, PASS);
//			stmt = conn.createStatement();
//			sql = "CREATE TABLE login(login_id INT UNSIGNED NOT NULL AUTO_INCREMENT," + 
//			" login_email VARCHAR(50) NOT NULL unique key," +
//			" login_user VARCHAR(20) NOT NULL unique key," + 
//			" login_pass VARCHAR(20) NOT NULL," +
//			" login_role VARCHAR(20) DEFAULT 'USER' NOT NULL," +
//			" login_status VARCHAR(20) DEFAULT 'INACTIVE' NOT NULL," +
//			" PRIMARY KEY(login_id)," +
//			" CHECK (login_status IN ('ACTIVE','INACTIVE'))," +
//			" CHECK (login_role IN ('USER','ADMIN')))";
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
