package JDBCActivityQ3;
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
	
	public void insertDetails(User u) throws Exception
	{
		Connection con = DbConnection.getConnection();
		
		String query1 = "INSERT INTO User VALUES(?, ?, ?, ?, ?)";
		PreparedStatement st = con.prepareStatement(query1);
		st.setLong(1, u.getId());
		st.setString(2,  u.getName());
		st.setString(3,  u.getContactDetail());
		st.setString(4,  u.getUsername());
		st.setString(5,  u.getPassword());
		
		int count = st.executeUpdate();
		
		st.close();
		con.close();
		
	}
}
