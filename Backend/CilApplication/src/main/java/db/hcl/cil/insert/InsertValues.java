//package db.hcl.cil.insert;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//public class InsertValues 
//{
//	static final String DRIVER = "com.mysql.jdbc.Driver";
//	static final String URL = "jdbc:mysql://localhost:3306/cildatabase";
//	static final String USER = "root";
//	static final String PASS = "root";
//	static String sql;
//	
//	public static String keyvalues_id;
//	public static String keyvalues_heading;
//	public static ArrayList<String> keyvalues_linklist = new ArrayList<String>();
//	
//	public static void main(String args[])
//	{
//		keyvalues_id = "Co-Innovation lab";
//		keyvalues_heading = "Our Values";
//		keyvalues_linklist.add("Placing customer at the centre of the design process ensures "
//				+ "the creation of products that service real world end users needs. This serves to "
//				+ "enhance both strategy and design so that they accurately fulfill the user experience.~");
//		keyvalues_linklist.add("Creating innovative design requires the collective knowledge of "
//				+ "stakeholders,end users and a multi-disciplinary design team. A truly collaborative team "
//				+ "enables the rapid development and validations of ideas-shortening the time to market.~");
//		keyvalues_linklist.add("Focused highly skilled multi disciplinary desgin teams underpin "
//				+ "an effective collaborative design methodology. Placing the appropriate design skills "
//				+ "together allows the full depth of the teams knowledge to be leveraged better.~");
//		
//		Connection conn = null;
//		Statement stmt = null;
//		try
//		{
//			Class.forName(DRIVER);
//			conn = DriverManager.getConnection(URL, USER, PASS);
//			stmt = conn.createStatement();
//			sql = "INSERT INTO keyvalues VALUE(NULL,'" + keyvalues_heading + "' "
//					+ ", '" + keyvalues_linklist.get(0)+ keyvalues_linklist.get(1) + keyvalues_linklist.get(2) + "')";
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
