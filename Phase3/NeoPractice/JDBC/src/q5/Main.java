package q5;
import java.sql.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception
    {
        Scanner reader = new Scanner(System.in);
        String bookName = reader.nextLine();
    
        String url = "jdbc:mysql://localhost:3306/aliens";
        String uName = "root";
        String pass = "Dutta@2000";
        
        String query = "DELETE FROM BOOK WHERE name = ?";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uName, pass);
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, bookName);
        ps.executeUpdate();
        
        String selectQuery = "SELECT * FROM BOOK";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(selectQuery);
        while(rs.next())
        {
            System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("author"));
        }
        rs.close();
        ps.close();
        st.close();
        con.close();
    }

}
