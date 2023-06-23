package practice1;
import java.util.*;
import java.sql.*;
public class ItemTypeDAO {
	public List<ItemType> getAllItemTypes() throws Exception
	{
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		String query = "SELECT * FROM item_type";
		
		List<ItemType> arr = new ArrayList<ItemType>();
		
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			Long id = rs.getLong("id");
			String name = rs.getString("name");
			Double deposit = rs.getDouble("deposit");
			Double costPerDay = rs.getDouble("cost_per_day");
			
			ItemType obj = new ItemType(id, name, deposit, costPerDay);
			arr.add(obj);
		}
		return arr;
	}
}
