package JDBCActivityQ1;
import java.util.*;
import java.sql.*;
public class ItemTypeDAO {
	public List<ItemType> getAllItemTypes() throws Exception
	{
		String query = "SELECT * FROM item_type";
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		List<ItemType> arr = new ArrayList<ItemType>();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			long id = rs.getLong(1);
			String name = rs.getString(2);
			Double deposit = rs.getDouble(3);
			Double costPerDay = rs.getDouble(4);
			
			ItemType obj = new ItemType(id, name, deposit, costPerDay);
			
			arr.add(obj);
			
		}
		
		st.close();
		con.close();
		
		return arr;
		
	}
}
