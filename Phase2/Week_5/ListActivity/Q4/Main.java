package Phase2.Week_5.ListActivity.Q4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		HallBO hallbo= new HallBO();
		List<Hall> arr = hallbo.getHallList();
		while(true)
		{
			System.out.println("Enter an option:");
			System.out.println("1.Add\n2.Replace\n3.Display\n4.Exit");
			int ch = reader.nextInt();
			switch(ch)
			{
				case 1:
                    reader.nextLine();
                    System.out.println("Enter the name of the hall:");
                    String name = reader.nextLine();
                    System.out.println("Enter the contact number of the hall:");
                    String contact = reader.nextLine();
                    System.out.println("Enter the cost per day of the hall:");
                    double cost = reader.nextDouble();
                    reader.nextLine();
                    System.out.println("Enter the owner name of the hall:");
                    String owner = reader.nextLine();
                    Hall obj = new Hall(name, contact, cost, owner);
                    arr.add(obj);
                    System.out.println("Hall added successfully");
                    break;
				case 2:
                    reader.nextLine();
                    System.out.println("Enter the hall number which should be replaced:");
                    int hallNo = reader.nextInt();
                    int hallIndex = hallNo - 1;
                    reader.nextLine();
                    System.out.println("Enter the name of the replacement hall:");
                    String repName = reader.nextLine();
                    System.out.println("Enter the contact number of the replacement hall:");
                    String repContact = reader.nextLine();
                    System.out.println("Enter the cost per day of the replacement hall:");
                    double repCost = reader.nextDouble();
                    reader.nextLine();
                    System.out.println("Enter the owner name of the replacement hall:");
                    String repOwner = reader.nextLine();
                    Hall repObj  = new Hall(repName, repContact, repCost, repOwner);
                    arr.set(hallIndex, repObj);
                    System.out.println("Hall replaced successfully");
                    break;
				case 3:
                    reader.nextLine();
                    hallbo.displayAll(arr);
                    break;
				case 4:
                    System.out.println("Exiting Application");
                    System.exit(0);
			}
		}

    }

}
