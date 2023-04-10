package Phase2.Practice1.Week5.Q23;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the no of events");
        int n = Integer.parseInt(reader.nextLine());
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        System.out.println("Enter event details in CSV(Customer Name,Ticket Price,No of Seats Booked)");
        for(int i=0; i<n; i++)
        {
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            Integer price = Integer.parseInt(detailArr[1]);
            Integer seats = Integer.parseInt(detailArr[2]);

            if(map.containsKey(price))
            {
                map.put(price, map.get(price)+seats);
            }
            else 
            {
                map.put(price, seats);
            }
        }
        System.out.printf("%-15s %s\n","Ticket Price","Tickets Booked");
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            System.out.printf("%-15s %s\n", e.getKey(), e.getValue());
        }
    }
}
