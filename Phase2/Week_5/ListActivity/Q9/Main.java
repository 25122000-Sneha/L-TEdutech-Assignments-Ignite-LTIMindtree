package Phase2.Week_5.ListActivity.Q9;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number of passengers Booked");
		int no = reader.nextInt();
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> passengerArr = new ArrayList<String>();
        ArrayList<String> extraArr = new ArrayList<String>();
		System.out.println("Enter the passenger's name who Booked");
		reader.nextLine();
        for(int i=0; i<no; i++)
		{
			String name = reader.nextLine();
			arr.add(name);
		}
        
		System.out.println("Enter the number of seats available");
		int seats = reader.nextInt();
        int i;
		for(i=0; i<seats; i++)
        {
            passengerArr.add(arr.get(i));
        }
        for(int j=i; j<arr.size(); j++)
        {
            extraArr.add(arr.get(j));
        }
		System.out.println("Extra Passengers list");
		System.out.println(extraArr);

    }
}
