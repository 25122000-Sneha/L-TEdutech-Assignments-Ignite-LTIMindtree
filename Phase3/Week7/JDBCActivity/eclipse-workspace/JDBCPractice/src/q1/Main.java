package q1;
import java.sql.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception
	{
		String query = "SELECT * FROM student";
		
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uName = "root";
		String pass = "Dutta@2000";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, uName, pass);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		String studData;
		while(rs.next())
		{
			studData = rs.getInt(1) +" : "+rs.getString(2);
			System.out.println(studData);
		}
		
		st.close();
		con.close();
		
	}
	
}
