package weekly1;
import java.sql.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception
	{
		Scanner reader = new Scanner(System.in);
		int dltId = reader.nextInt();
		reader.close();
		
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uName = "root";
		String pass = "Dutta@2000";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		Statement st = con.createStatement();
		st.executeUpdate("INSERT INTO OFFICE VALUES(101, 'Zara', 30000)");
		st.executeUpdate("INSERT INTO OFFICE VALUES(102, 'zyna', 40000)");
		st.executeUpdate("INSERT INTO OFFICE VALUES(103, 'Soban', 60000)");
		st.executeUpdate("INSERT INTO OFFICE VALUES(104, 'Kumar', 70000)");
		st.executeUpdate("INSERT INTO OFFICE VALUES(105, 'Lavanya', 80000)");
		
		st.close();
		
		String query = "DELETE FROM OFFICE WHERE EID = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, dltId);
		ps.executeUpdate();
		
		String selectQuery = "SELECT * FROM OFFICE";
		ps = con.prepareStatement(selectQuery);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2) + " "+rs.getInt(3));
		}
		ps.close();
		con.close();
		
	}
}
