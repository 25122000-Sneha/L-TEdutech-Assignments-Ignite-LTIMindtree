package JDBCActivityQ3;
import java.util.*;
import java.sql.*;
public class UserDAO {
	public List<User> getAllUser() throws Exception
	{
		Connection con = DbConnection.getConnection();
		
		Statement st = con.createStatement();
		
		String query = "SELECT * FROM user";
		
		ResultSet rs = st.executeQuery(query);
		
		List<User> arr = new ArrayList<User>();
		
		while(rs.next())
		{
			Long id = rs.getLong(1);
			String name = rs.getString(2);
			String contactDetail = rs.getString(3);
			String username = rs.getString(4);
			String password = rs.getString(5);
			
			User obj = new User(name, contactDetail, username, password);
			obj.setId(id);
			arr.add(obj);
		}
		
		st.close();
		con.close();
		
		return arr;
	}
	
	public void insertDetails(User u) throws Exception
	{
		Connection con = DbConnection.getConnection();
		
		String query1 = "INSERT INTO user(name, contact_detail, username, password) VALUES(?, ?, ?, ?)";
		PreparedStatement st = con.prepareStatement(query1, Statement.RETURN_GENERATED_KEYS);

		st.setString(1,  u.getName());
		st.setString(2,  u.getContactDetail());
		st.setString(3,  u.getUsername());
		st.setString(4,  u.getPassword());
		
		st.executeUpdate();
		
		st.close();
		con.close();
		
	}
}