package q5;
import java.sql.*;
import java.util.*;
public class Main2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int dltId = Integer.parseInt(reader.nextLine());
		reader.close();
		
		
		
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uName = "root";
		String pass = "Dutta@2000";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, uName, pass);
		
		PreparedStatement pst = con.prepareStatement("INSERT INTO OFFICE VALUES(?, ?, ?)");
		pst.setInt(1, 101);
		pst.setString(2,  "Zara");
		pst.setInt(3, 30000);
		pst.executeUpdate();
		
		pst.setInt(1, 102);
		pst.setString(2, "zyna");
		pst.setInt(3, 40000);
		pst.executeUpdate();
		
		
		pst.setInt(1, 103);
		pst.setString(2, "Soban");
		pst.setInt(3, 60000);
		pst.executeUpdate();
		
		pst.setInt(1, 104);
		pst.setString(2, "Kumar");
		pst.setInt(3, 70000);
		pst.executeUpdate();
		
		pst.setInt(1, 105);
		pst.setString(2, "Lavanya");
		pst.setInt(3, 80000);
		pst.executeUpdate();
		
		
		
		
		
		String query = "DELETE FROM OFFICE WHERE EID = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, dltId);
		
		ps.executeUpdate();
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM OFFICE");
		
		String data = "";
		while(rs.next())
		{
			data = rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3);
			System.out.println(data);
		}
		rs.close();
		st.close();
		ps.close();
		con.close();
		

	}

}
