//package db.hcl.cil.insert;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class InsertOnGoingProjectNames
//{
//	static final String DRIVER = "com.mysql.jdbc.Driver";
//	static final String URL = "jdbc:mysql://localhost:3306/cildatabase";
//	static final String USER = "root";
//	static final String PASS = "root";
//	static String sql;
//		
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
//			
////			sql = "INSERT INTO ongoingprojects VALUE(NULL ,"
////					+ "'Assets Management',"
////					+ "'HCL',"
////					+ "'Bank',"
////					+ "'Managing Assets',"
////					+ "'DevOPS',"
////					+ "'Node.js',"
////					+ "'DRVICE',"
////					+ "'Shubhangi, Sneha',"
////					+ "'8 months',"
////					+ "'70%',"
////					+ "5)";
////			sql = "INSERT INTO ongoingprojects VALUE(NULL ,"
////					+ "'DRVICE',"
////					+ "'Deutsche Bank',"
////					+ "'Bank',"
////					+ "'Its a Decentralized Distributed Network with individual chain of Blocks.',"
////					+ "'DevOPS',"
////					+ "'Node.js',"
////					+ "'DRVICE',"
////					+ "'Manvendra, Sneha, Shashank',"
////					+ "'8 months',"
////					+ "'70%',"
////					+ "1)";
////			sql = "INSERT INTO ongoingprojects VALUE(NULL ,"
////					+ "'Illiquid Assets',"
////					+ "'Anthony',"
////					+ "'Decentralized Network',"
////					+ "'Its a Decentralized Distributed Network with individual chain of Blocks.',"
////					+ "'Ethereum, Hyperledger, Solidity',"
////					+ "'Ethereum, Geth, Node.js',"
////					+ "'Ethereum, Geth, Node.js, Truffle',"
////					+ "'Kaushik, Antriksh, Sachdev, Sathwik',"
////					+ "'6 months',"
////					+ "'50%',"
////					+ "2)";
////			sql = "INSERT INTO ongoingprojects VALUE(NULL ,"
////			+ "'Blockchain',"
////			+ "'Krishna Prasad',"
////			+ "'Decentralized Network',"
////			+ "'Its a Decentralized Distributed Network with individual chain of Blocks.',"
////			+ "'Ethereum, Hyperledger, Solidity',"
////			+ "'Ethereum, Geth, Node.js',"
////			+ "'Ethereum, Geth, Node.js, Truffle',"
////			+ "'Kaushik, Antriksh, Sachdev, Sathwik',"
////			+ "'6 months',"
////			+ "'60%',"
////			+ "3)";
////			sql = "INSERT INTO ongoingprojects VALUE(NULL ,"
////					+ "'Co-Innovation Lab UI',"
////					+ "'Santosh Kumar',"
////					+ "'Co-Innovation Web Portal',"
////					+ "'Its a Web portal for Co-Innovation Lab Employees',"
////					+ "'JAVA/J2EE, Spring MVC, Spring JDBC, REST, Microsevices',"
////					+ "'Spring Boots,Eclipse, Maven, MYSQL',"
////					+ "'Eclipse IDE, MYSQL, MAVEN, Microservices',"
////					+ "'Suman, Ankita, Gajendra',"
////					+ "'5 months',"
////					+ "'80%',"
////					+ " 4)";
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
