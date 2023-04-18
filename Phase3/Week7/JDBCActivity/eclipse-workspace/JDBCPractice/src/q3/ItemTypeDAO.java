package q3;
import java.sql.*;
import java.util.*;
public class ItemTypeDAO {
	public List<ItemType> getAllItemTypes() throws Exception
	{
		String query = "SELECT * FROM item_type";
		
		Connection con = DbConnection.getConnection();
		
		List<ItemType> arr = new ArrayList<ItemType>();
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			Long id = rs.getLong(1);
			String name = rs.getString(2);
			Double deposit = rs.getDouble(3);
			Double costPerDay = rs.getDouble(4);
			
			ItemType obj = new ItemType(id, name, deposit, costPerDay);
			
			arr.add(obj);
		}
		
		return arr;
		
	}
}
