package Phase2.Week_5.ListActivity.Q3;
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
		char ch;
		ArrayList<ItemType> arr = new ArrayList<ItemType>();
        int count = 1;
		do
		{
            System.out.println("Enter the details of Item Type "+count);System.out.println("Enter the details of Item Type "+count);
			System.out.println("Name:");
			String name = reader.nextLine();
			System.out.println("Deposit:");
			double deposit = reader.nextDouble();
			System.out.println("Cost per Day:");
			double costPerDay = reader.nextDouble();
			ItemType obj = new ItemType(name, deposit, costPerDay);
			arr.add(obj);
            count++;
            reader.nextLine();
			System.out.println("Do you want to continue?(y/n)");
			ch = reader.nextLine().charAt(0);
		}while(ch == 'y');
        System.out.println("Name\tDeposit\tCostPerDay");
		for (ItemType x : arr)
		{
			System.out.println(x);
		}
    }
}