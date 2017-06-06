//package db.hcl.cil.create;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class CreateCILOnGoingProjectNamesTable
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
//			sql = "CREATE TABLE ongoingprojects(ongoingprojects_id INT UNSIGNED NOT NULL AUTO_INCREMENT,"
//			+ "ongoingprojects_project_name 		VARCHAR(50) UNIQUE KEY, "
//			+ "ongoingprojects_stake_holders 		VARCHAR(100), "
//			+ "ongoingprojects_short_description 	VARCHAR(100), " 
//			+ "ongoingprojects_long_description 	VARCHAR(500), " 
//			+ "ongoingprojects_technologies_used 	VARCHAR(100), " 
//			+ "ongoingprojects_tools_used 			VARCHAR(100), " 
//			+ "ongoingprojects_build_tools 			VARCHAR(100), "
//			+ "ongoingprojects_project_team 		VARCHAR(100), " 
//			+ "ongoingprojects_duration_release 	VARCHAR(50), " 
//			+ "ongoingprojects_progress 			VARCHAR(20), " 
//			+ "projects_id 							INT NOT NULL UNIQUE KEY, " 
//			+ "PRIMARY KEY(ongoingprojects_id))";
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
