package JDBCActivityQ2;
import java.util.*;
import java.sql.*;
public class UserDAO {
	public List<User> getAllUsers() throws Exception
	{
		Connection con = DbConnection.getConnection();
		
		Statement st = con.createStatement();
		
		String query = "SELECT * FROM User";
		
		ResultSet rs = st.executeQuery(query);
		
		List<User> arr = new ArrayList<User>();
		
		while(rs.next())
		{
			Long id = rs.getLong(1);
			String name = rs.getString(2);
			String contactDetail = rs.getString(3);
			String username = rs.getString(4);
			String password = rs.getString(5);
			
			User obj = new User(id, name, contactDetail, username, password);
			arr.add(obj);
		}
		
		st.close();
		con.close();
		
		return arr;
	}
}
