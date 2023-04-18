package q3;
import java.sql.*;
public class DbConnection {
	public static Connection getConnection() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/items";
		String uName = "root";
		String pass = "Dutta@2000";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		
		return con;
	}
}
