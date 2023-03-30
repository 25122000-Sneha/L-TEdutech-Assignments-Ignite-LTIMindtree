package Phase2.Week_5.SetActivity.Q2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		String ch;
		do
		{
			System.out.println("Enter Username");
			set.add(reader.nextLine());
			System.out.println("Do you want to continue ?(yes/no)");
			ch = reader.nextLine();
		}while(ch.equals("yes"));
		System.out.println("Number of Users = "+set.size());
    }
}
