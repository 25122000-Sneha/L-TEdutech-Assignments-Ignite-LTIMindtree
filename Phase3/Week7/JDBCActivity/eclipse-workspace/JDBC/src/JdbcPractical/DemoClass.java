package JdbcPractical;
import java.sql.*;
/*
 * 1.import package --> java.sql.*
 * 2.load and register driver --> com.mysql.jdbc.Driver
 * 3.establish connection --> Connection interface
 * 4.create statement --> Statement interface
 * 5.execute query
 * 6.process results
 * 7.close
 */

public class DemoClass {

	public static void main(String[] args){
		 
		try {
		String url = "jdbc:mysql://localhost:3306/aliens";               //db name in url
		String uname = "root";
		String pass = "Dutta@2000";
		String query = "select userName from student where userId = 3";
		Class.forName("com.mysql.jdbc.Driver");                         //deprecated driver use com.mysql.cj.jdbc.Driver
																	
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);           //DQL
		
		rs.next();
		
		String name = rs.getString("userName");
		System.out.println(name);
		
		st.close();
		con.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
		

	}

}
