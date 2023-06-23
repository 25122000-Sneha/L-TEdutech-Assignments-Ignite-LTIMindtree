package Phase3.NeoPractice.JDBC.Q2;
import java.sql.*;
import java.util.*;
class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner reader = new Scanner(System.in);
        String url = "jdbc:mysql://localhost/ri_db";
        String uName = "test";
        String pass = "test123";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uName, pass);
        
        String query = "INSERT INTO STUDENT VALUES(?, ?, ?)";
        
        PreparedStatement ps = con.prepareStatement(query);
        
        int n = Integer.parseInt(reader.nextLine());
        for(int i=0; i<n; i++)
        {
            int roll = Integer.parseInt(reader.nextLine());
            String name = reader.nextLine();
            int avgMarks = Integer.parseInt(reader.nextLine());
            
            ps.setInt(1, roll);
            ps.setString(2, name);
            ps.setInt(3, avgMarks);
            
            ps.executeUpdate();
        }
        
        
        String selectQuery = "SELECT * FROM STUDENT";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(selectQuery);
        String out = "";
        while(rs.next())
        {
            out = rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("average_marks");
            System.out.println(out);
        }
        
        ps.close();
        st.close();
        con.close();
        
        
    }
}
