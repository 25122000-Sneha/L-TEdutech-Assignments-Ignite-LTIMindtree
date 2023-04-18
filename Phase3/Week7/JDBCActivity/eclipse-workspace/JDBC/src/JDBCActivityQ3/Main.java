package JDBCActivityQ3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the user detail in CSV format");
		String detail = reader.nextLine();
		String[] detailArr = detail.split(",");
		User u = new User(Long.parseLong(detailArr[0]), detailArr[1], detailArr[2], detailArr[3], detailArr[4]);
		UserDAO udao = new UserDAO();
		
		try 
		{
			udao.insertDetails(u);
			List<User> arr = udao.getAllUsers();
			
			System.out.printf("%-5s %-10s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
			for(User obj : arr)
			{
				System.out.println(obj);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		reader.close();
		
		
	}

}
