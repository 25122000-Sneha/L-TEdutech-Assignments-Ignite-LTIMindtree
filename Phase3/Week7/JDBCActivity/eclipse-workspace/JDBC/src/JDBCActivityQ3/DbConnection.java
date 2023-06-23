package JDBCActivityQ3;
import java.sql.*;
public class DbConnection {
	static Connection getConnection() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uname = "root";
		String pass = "Dutta@2000";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		return con;
	}
}
