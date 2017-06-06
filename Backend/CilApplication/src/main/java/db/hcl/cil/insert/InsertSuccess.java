//package db.hcl.cil.insert;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//public class InsertSuccess 
//{
//	static final String DRIVER = "com.mysql.jdbc.Driver";
//	static final String URL = "jdbc:mysql://localhost:3306/cildatabase";
//	static final String USER = "root";
//	static final String PASS = "root";
//	static String sql;
//	
//	public static String success_id;
//	public static String success_heading;
//	public static String success_sub;
//	public static ArrayList<String> success_stories = new ArrayList<String>();
//	
//	public static void main(String args[])
//	{
//		success_id = "success";
//		success_heading = "Success Stories";
//		success_sub = "What we have created";
//		success_stories.add("BitCoins~");
//		success_stories.add("Hyperledger~");
//		success_stories.add("Consensus mechanism~");
//		
//		Connection conn = null;
//		Statement stmt = null;
//		try
//		{
//			Class.forName(DRIVER);
//			conn = DriverManager.getConnection(URL, USER, PASS);
//			stmt = conn.createStatement();
//			sql = "INSERT INTO success VALUE(NULL,'" + success_heading + "', '" + success_sub + "' "
//					+ ", '" + success_stories.get(0) + success_stories.get(1) + success_stories.get(2) + "')";
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
