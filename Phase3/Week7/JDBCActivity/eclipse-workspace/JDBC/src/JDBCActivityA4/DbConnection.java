package JDBCActivityA4;
import java.sql.*;
public class DbConnection {
	public static Connection getConnection() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/q4";
		String uname = "root";
		String pass = "Dutta@2000";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		return con;
	}
}
