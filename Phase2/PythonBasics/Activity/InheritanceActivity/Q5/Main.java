package Phase2.PythonBasics.Activity.InheritanceActivity.Q5;
import java.util.*;
public class Main {
	public static void main(String[] args){
		//fill your code here
		String str, arr[];
		Scanner reader = new Scanner(System.in);
		System.out.println("Choose Stall Type\n1.Silver Stall\n2.Gold Stall\n3.Platinum Stall");
		int ch = reader.nextInt();
		
		switch(ch)
		{
			case 1:
						reader.nextLine();
						System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost)");
						str = reader.nextLine();
						arr = str.split(",");
						SilverStall ss = new SilverStall(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]));
						ss.display();
						break;
			case 2:
						reader.nextLine();
						System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set)");
						str = reader.nextLine();
						arr = str.split(",");
						GoldStall gs = new GoldStall(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]));
						gs.display();
						break;
			case 3:
						reader.nextLine();
						System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)");
						str = reader.nextLine();
						arr = str.split(",");
						PlatinumStall ps = new PlatinumStall(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]));
						ps.display();
						break;
			default:
						System.exit(0);
						
		}
	}
}

