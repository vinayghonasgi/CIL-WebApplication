//package db.hcl.cil.create;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class CreateCILPollingTable 
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
//			sql = "CREATE TABLE pollings(question_id INT UNSIGNED NOT NULL AUTO_INCREMENT,"
//			+ "question_name VARCHAR(50) UNIQUE KEY NOT NULL, "
//			+ "question_option1 		VARCHAR(25), "
//			+ "question_option1_poll 	INT, "
//			+ "question_option2 		VARCHAR(25), "
//			+ "question_option2_poll 	INT, "
//			+ "question_option3 		VARCHAR(25), "
//			+ "question_option3_poll 	INT, "
//			+ "question_option4 		VARCHAR(25), "
//			+ "question_option4_poll 	INT, "
//			+ "question_option5 		VARCHAR(25), "
//			+ "question_option5_poll 	INT, "
//			+ "question_option6 		VARCHAR(25), "
//			+ "question_option6_poll 	INT, "
//			+ "PRIMARY KEY(question_id))";
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
