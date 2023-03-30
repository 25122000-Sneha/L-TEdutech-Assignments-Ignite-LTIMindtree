package Phase2.PythonBasics.Activity.InheritanceActivity.Q3;

import java.util.*;
public class Main {

	public static void main(String[] args){
		//Your code here
		Scanner reader = new Scanner(System.in);
		String str, arr[];
		System.out.println("Choose Event type\n1.Exhibition\n2.StageEvent");
		int ch = reader.nextInt();
		switch(ch)
		{
			case 1:
						reader.nextLine();
						System.out.println("Enter the details in CSV format");
						str = reader.nextLine();
						arr = str.split(",");
						Exhibition e = new Exhibition(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]));
						e.display();
						break;
			case 2:
						reader.nextLine();
						System.out.println("Enter the details in CSV format");
						str = reader.nextLine();
						arr = str.split(",");
						StageEvent s = new StageEvent(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]));
						s.display();
						break;
			default:
						System.out.println("Invalid choice");
						break;
		}
		
		
	}
}

