package Phase2.Week_5.SetActivity.Q1;
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		char c;
		do
		{
			System.out.println("Enter the username");
			String userName = reader.nextLine();
			set.add(userName);
			System.out.println("Do you want to continue?(Y/N)");
			c = reader.nextLine().charAt(0);
		}while(c == 'Y');
		System.out.println("The unique number of usernames is "+set.size());
    }
}