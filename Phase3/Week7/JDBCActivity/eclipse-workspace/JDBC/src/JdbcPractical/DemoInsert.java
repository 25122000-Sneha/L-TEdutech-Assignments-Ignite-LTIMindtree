package JdbcPractical;
import java.sql.*;
public class DemoInsert {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/aliens";               //db name in url
		String uname = "root";
		String pass = "Dutta@2000";
		
		int id = 5;
		String name = "Mona";
		//String query = "insert into student values(4, 'Mohini')";
		
		String query = "insert into student values(" + id + ", " + "'" + name + "')"; 
		
		Class.forName("com.mysql.cj.jdbc.Driver");                         
																	
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		
		int count = st.executeUpdate(query);        //DML
		
		System.out.println(count + " row/s affected");
		
		
		st.close();
		con.close();

	}

}
