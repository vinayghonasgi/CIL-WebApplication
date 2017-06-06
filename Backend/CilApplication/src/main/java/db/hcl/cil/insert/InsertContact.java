//package db.hcl.cil.insert;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//public class InsertContact 
//{
//	static final String DRIVER = "com.mysql.jdbc.Driver";
//	static final String URL = "jdbc:mysql://localhost:3306/cildatabase";
//	static final String USER = "root";
//	static final String PASS = "root";
//	static String sql;
//	
//	public static String contact_id;
//	public static String contact_heading;
//	public static String contact_subheading;
//	public static ArrayList<String> contact_list = new ArrayList<String>();
//	
//	public static void main(String args[])
//	{
//		contact_id = "contact";
//		contact_heading = "CONTACT";
//		contact_subheading = "Contact us and we will get back to you within 24 hours.";
//		contact_list.add("Pune, India~");
//		contact_list.add("+91-1802545456~");
//		contact_list.add("CoInnovationLab@hcl.com~");
//		
//		Connection conn = null;
//		Statement stmt = null;
//		try
//		{
//			Class.forName(DRIVER);
//			conn = DriverManager.getConnection(URL, USER, PASS);
//			stmt = conn.createStatement();
//			sql = "INSERT INTO contact VALUE(NULL,'" + contact_heading + "' "
//					+ ", '" + contact_subheading + "', '" + contact_list.get(0) + contact_list.get(1) + contact_list.get(2) + "')";
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
