//package db.hcl.cil.create;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class CreateCILUserDetailsTable 
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
//			sql = "CREATE TABLE userdetails(userdetail_id INT UNSIGNED NOT NULL AUTO_INCREMENT," + 
//			" userdetail_firstname 	VARCHAR(20) NOT NULL," +
//			" userdetail_lastname 	VARCHAR(20) NOT NULL," +
//			" userdetail_username 	VARCHAR(20) NOT NULL UNIQUE KEY," + 
//			" userdetail_email  	VARCHAR(20) NOT NULL UNIQUE KEY," +
//			" userdetail_password	VARCHAR(20) NOT NULL," +
//			" userdetail_role		VARCHAR(20) NOT NULL DEFAULT 'USER'," +
//			" userdetail_status		VARCHAR(20) NOT NULL DEFAULT 'INACTIVE'," +
//			" userdetail_skills		VARCHAR(100) NOT NULL," +
//			" userdetail_securityq1	VARCHAR(50) NOT NULL," +
//			" userdetail_answerq1	VARCHAR(20) NOT NULL," +
//			" userdetail_securityq2	VARCHAR(50) NOT NULL," +
//			" userdetail_answerq2	VARCHAR(20) NOT NULL," +
//			" userdetail_securityq3	VARCHAR(50) NOT NULL," +
//			" userdetail_answerq3	VARCHAR(20) NOT NULL," +
//			" PRIMARY KEY(userdetail_id)," +
//			" CHECK (userdetail_status IN ('ACTIVE','INACTIVE'))," +
//			" CHECK (userdetail_role IN ('USER','ADMIN')))";
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
