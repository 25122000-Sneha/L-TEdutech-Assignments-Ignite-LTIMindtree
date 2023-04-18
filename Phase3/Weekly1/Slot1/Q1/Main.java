package Q1;
import java.sql.*;
public class Main {
	public static void main(String[] args) throws Exception
	{
		String query = "SELECT * FROM users WHERE mark1 > 70 AND mark2 > 70 AND mark3 > 70";
		
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uName = "root";
		String pass = "Dutta@2000";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		String data = "";
		while(rs.next())
		{
			data = rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("mark1") + " " + rs.getInt("mark2") + " " + rs.getInt("mark3");
			System.out.println(data);
		}
		
		rs.close();
		st.close();
		con.close();
	}
	
}
