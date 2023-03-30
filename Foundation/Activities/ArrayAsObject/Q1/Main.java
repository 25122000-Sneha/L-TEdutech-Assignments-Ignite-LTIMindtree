package Foundation.Activities.ArrayAsObject.Q1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number of users:");
		int no = reader.nextInt();
		User[] userArray = new User[no];
		UserBO ubo = new UserBO();
		for(int i=0; i<no; i++)
		{
			System.out.println("Enter the details of User "+(i+1));
			System.out.println("Enter the name of the user:");
			String n = reader.next();
			System.out.println("Enter the mobile number of the user:");
			String mob = reader.next();
			System.out.println("Enter the username of the user:");
			String usn = reader.next();
			System.out.println("Enter the password of the user:");
			String p = reader.next();
			User obj = new User(n, mob, usn, p);
			ubo.addUser(userArray, obj, i);
		}
        System.out.println("User details as entered:");
		ubo.displayAll(userArray, userArray.length);
		ubo.sortUsers(userArray);
		System.out.println("After sorting:");
		ubo.displayAll(userArray, userArray.length);
		System.out.println("Enter the user to be deleted:");
		String dltUserName = reader.next();
        boolean flag = ubo.deleteUser(userArray, dltUserName);

		if(flag == true)
		{
            System.out.println("User deleted successfully");
			System.out.println("After Deleting:");
			ubo.displayAll(userArray, userArray.length - 1);
			
		}
		else 
		{
			System.out.println("No user found with given name");
		}
    }
}
