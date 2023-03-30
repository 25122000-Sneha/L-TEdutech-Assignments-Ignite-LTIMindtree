package Foundation.Activities.ArrayAsObject.Q2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Number of Item Type");
		int no = reader.nextInt();
		ItemType[] itemTypeArray = new ItemType[no];
		ItemTypeBO ibo = new ItemTypeBO();
		for(int i=0; i<no; i++)
		{
			System.out.println("Enter the Item Type "+(i+1)+" Name");
			String n = reader.next();
			reader.nextLine();
			System.out.println("Enter the Deposit Amount");
			//double d = reader.nextDouble();
			double d = Double.parseDouble(reader.nextLine());
			System.out.println("Enter the Cost per day");
			double c = Double.parseDouble(reader.nextLine());
			//double c = reader.nextDouble();
			ItemType obj = new ItemType(n, d, c);
			ibo.add(obj, itemTypeArray, i);
			
		}
		ibo.display(itemTypeArray);
		System.out.println("Enter the Name of the item to be searched");
		String searchItem = reader.next();
		Arrays.sort(itemTypeArray);
		ibo.search(searchItem, itemTypeArray);
    }
}
