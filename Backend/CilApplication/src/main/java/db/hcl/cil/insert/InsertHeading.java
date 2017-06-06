//package db.hcl.cil.insert;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class InsertHeading 
//{
//	static final String DRIVER = "com.mysql.jdbc.Driver";
//	static final String URL = "jdbc:mysql://localhost:3306/cildatabase";
//	static final String USER = "root";
//	static final String PASS = "root";
//	static String sql;
//	
//	public static String header_id;
//	public static String header_heading;
//	public static String header_description;
//	public static String header_subheading;	
//	public static String header_img;	
//	
//	public static void main(String args[])
//	{
//		header_id = "Co-Innovation lab";
//		header_heading = "Co-Innovation lab";
//		header_subheading = "A vision shared, is value multiplied";
//		header_description = "Lorem Ipsum is simply dummy text of the printing and "
//				+ "typesetting industry. Lorem Ipsum has been the industrys standard dummy text "
//				+ "ever since the 1500s, when an unknown printer took a galley of type and scrambled "
//				+ "it to make a type specimen book.";
//		header_img = "src/bitcoin.jpg";
//		
//		Connection conn = null;
//		Statement stmt = null;
//		try
//		{
//			Class.forName(DRIVER);
//			conn = DriverManager.getConnection(URL, USER, PASS);
//			stmt = conn.createStatement();
//			sql = "INSERT INTO header VALUE(NULL ,'" + header_heading + "', "
//					+ "'" + header_subheading + "','" + header_description + "', "
//					+ "'" + header_img + "')";
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
