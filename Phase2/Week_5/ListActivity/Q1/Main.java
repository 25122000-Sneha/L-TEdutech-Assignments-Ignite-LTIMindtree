package Phase2.Week_5.ListActivity.Q1;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		int count = 1;
		String ch ;
		do
		{
			System.out.println("Enter the username "+count);
			String name = reader.nextLine();
			arr.add(name);
			count++;
			System.out.println("Do you want to continue?(y/n)");
			ch = reader.nextLine();

		}while(ch.equals("y"));
		System.out.println("The Names entered are:");
		for (String name : arr)
		{
			System.out.println(name);
		}
    }
}