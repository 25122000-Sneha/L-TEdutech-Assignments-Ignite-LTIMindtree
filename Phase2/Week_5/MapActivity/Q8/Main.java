package Phase2.Week_5.MapActivity.Q8;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of events:");
        int n = reader.nextInt();
        reader.nextLine();
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        System.out.println("Enter event details in CSV(Customer Name,Ticket Price,No of Seats Booked)");
        for(int i=0; i<n; i++)
        {
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
			int price = Integer.parseInt(detailArr[1]);
			int seats = Integer.parseInt(detailArr[2]);
			if(map.containsKey(price))
			{
				int noOfSeats = map.get(price);
				noOfSeats += seats;
				map.put(price, noOfSeats);

			}
			else 
			{
				map.put(price, seats);
			}

        }
		//System.out.println(map);
		System.out.printf("%-15s %s\n","Ticket Price","Tickets Booked");
		for(Map.Entry<Integer,Integer> e : map.entrySet())
		{
			System.out.printf("%-15s %s\n", e.getKey(), e.getValue());
		}
    }
}
