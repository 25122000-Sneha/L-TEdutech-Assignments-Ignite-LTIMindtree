package q2;
import java.sql.*;
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uName = "root";
		String pass = "Dutta@2000";
		
		int id = 7;
		String name = "Rohini";
		
		String query = "INSERT INTO student VALUES(?, ?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, id);
		st.setString(2,  name);
		
		int count = st.executeUpdate();
		
		System.out.println(count+" row/s affected");
		
		st.close();
		con.close();
		
		
	}

}
