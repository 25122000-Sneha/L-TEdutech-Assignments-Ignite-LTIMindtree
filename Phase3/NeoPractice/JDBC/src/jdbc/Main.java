package jdbc;
import java.sql.*;
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uName = "root";
		String pass = "Dutta@2000";
		
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uName, pass);
        String query = "SHOW TABLES";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        System.out.println("Tables List:");
        while(rs.next())
        {
            System.out.println(rs.getString(1));
        }
        st.close();
        con.close();
	}

}
