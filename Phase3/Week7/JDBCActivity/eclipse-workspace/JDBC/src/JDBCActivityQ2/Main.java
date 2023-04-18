package JDBCActivityQ2;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		UserDAO udao = new UserDAO();
		try 
		{
			List<User> arr = udao.getAllUsers();
			
			System.out.printf("%-5s %-5s %-15s %-10s %s\n", "Id", "Name", "Contact Detail", "Username", "Password");
			
			for(User obj : arr)
			{
				System.out.println(obj);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
