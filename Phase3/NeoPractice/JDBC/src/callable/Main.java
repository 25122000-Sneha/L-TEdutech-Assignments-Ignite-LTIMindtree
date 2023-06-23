package callable;
import java.sql.*;
public class Main {
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uName = "root";
		String pass = "Dutta@2000";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		String query = "{call display_password1(?)}";
		CallableStatement st = con.prepareCall(query);
		st.setString(1,  "Linda");
		ResultSet rs = st.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		st.close();
		con.close();
	}
}
