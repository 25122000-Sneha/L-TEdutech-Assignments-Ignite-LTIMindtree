package JdbcPractical;
import java.sql.*;
public class Demo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/aliens";               //db name in url
		String uname = "root";
		String pass = "Dutta@2000";
		String query = "select * from student";
		Class.forName("com.mysql.cj.jdbc.Driver");                         
																	
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		String userData = "";
		
		
		while(rs.next())
		{
			userData = rs.getInt(1) + " : " + rs.getString(2);
			System.out.println(userData);
			
		}
		
		
		
		st.close();
		con.close();

	}

}
