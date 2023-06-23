package Phase3.NeoPractice.JDBC.Q1;
//cannot execute in vscode have to add mysql connector jar and make table
import java.sql.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws Exception
    {
        Scanner reader = new Scanner(System.in);
        String url = "jdbc:mysql://localhost/ri_db";
        String uName = "test";
        String pass = "test123";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uName, pass);
        
        String query = "INSERT INTO student VALUES(?,?,?,?,?)";
        
        PreparedStatement st = con.prepareStatement(query);
        
        int n = Integer.parseInt(reader.nextLine());
        int rows = 0;
        for(int i=0; i<n; i++)
        {
            int roll = Integer.parseInt(reader.nextLine());
            String name = reader.nextLine();
            int m1 = Integer.parseInt(reader.nextLine());
            int m2 = Integer.parseInt(reader.nextLine());
            int m3 = Integer.parseInt(reader.nextLine());
            
            st.setInt(1, roll);
            st.setString(2, name);
            st.setInt(3, m1);
            st.setInt(4, m2);
            st.setInt(5, m3);
            
            int count = st.executeUpdate();
            rows+=count;
        }
        st.close();
        con.close();
        
        System.out.println(rows);
        
    }
}