package Phase2.Week_5.SetActivity.Q3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		HashSet<String> set1 = new HashSet<String>();
		String ch;
		do
		{
			System.out.println("Enter Email address");
			String email = reader.nextLine();
			set1.add(email);
			System.out.println("Do you want to Continue?(yes/no)");
			ch = reader.nextLine();
		}while(ch.equals("yes"));
		Set<String> set2 = new HashSet<String>();
		System.out.println("Enter the email addresses to be searched separated by comma");
		String ads = reader.nextLine();
		String[] arr = ads.split(",");
		for (String e : arr)
		{
			set2.add(e);
		}
		if(set1.containsAll(set2))
		{
			System.out.println("Email addresses are present");
		}
		else 
		{
			System.out.println("Email addresses are not present");
		}
    }
}
