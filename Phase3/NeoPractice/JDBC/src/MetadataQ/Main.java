package MetadataQ;
import java.sql.*;
public class Main {
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uName = "root";
		String pass = "Dutta@2000";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		
		String tableName = "book";
		String column = "name";
		DatabaseMetaData metaData = con.getMetaData();
		//ResultSet rs = metaData.getColumns(null,  null, tableName, null);
		ResultSet rs = metaData.getColumns(null, null, tableName, column);
		while(rs.next())
		{
			String colName = rs.getString("COLUMN_NAME");
			String colType = rs.getString("TYPE_NAME");
			int size = rs.getInt("COLUMN_SIZE");
			
			System.out.println(colName+" ("+colType+") "+size);
		}
		con.close();
	}
}
