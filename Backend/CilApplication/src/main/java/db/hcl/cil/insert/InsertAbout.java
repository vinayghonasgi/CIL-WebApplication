//package db.hcl.cil.insert;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//public class InsertAbout 
//{
//	static final String DRIVER = "com.mysql.jdbc.Driver";
//	static final String URL = "jdbc:mysql://localhost:3306/cildatabase";
//	static final String USER = "root";
//	static final String PASS = "root";
//	static String sql;
//	
//	public static String about_id;
//	public static String about_heading;
//	public static String about_description;
//	public static String about_subheading;	
//	public static ArrayList<String> about_list = new ArrayList<String>();
//	
//	public static void main(String args[])
//	{
//		about_id = "about";
//		about_heading = "About Co-Innovation Lab";
//		about_description = "The Co-Innovation Lab format provides a standalone "
//				+ "entrepreneurial environment where business stakeholders and end-users are "
//				+ "able to directly engage with the product design team";
//		about_subheading = "KEY ADVANTAGES";
//		
//		about_list.add("Capability to work closely, collaboratively and directly with "
//								+ "business stakeholders on new products and service ideas.~");
//		about_list.add("Rapid creation of prototypes, enabling business stakeholders "
//								+ "to touch and feel their ideas.~");
//		about_list.add("Quick sharing of concepts with clients to arrive at winning ideas.~");
//		about_list.add("Within walking distance of stakeholders and end-users.~");
//		about_list.add("Reduces the time from business idea to business value.~");
//		
//		Connection conn = null;
//		Statement stmt = null;
//		try
//		{
//			Class.forName(DRIVER);
//			conn = DriverManager.getConnection(URL, USER, PASS);
//			stmt = conn.createStatement();
//			sql = "INSERT INTO about VALUE(NULL,'" + about_heading + "',"
//					+ " '" + about_subheading + "', '" + about_description + "',"
//					+ " '" + about_list.get(0) + about_list.get(1) + about_list.get(2) + about_list.get(3) + about_list.get(4) + "')";
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
