package Phase2.Practice1.Week5.Q40;
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        int n = Integer.parseInt(reader.nextLine());
        ArrayList<TicketBooking> arr = new ArrayList<TicketBooking>();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter customer name");
            String name = reader.nextLine();
            System.out.println("Enter no of tickets");
            int tickets = Integer.parseInt(reader.nextLine());
            System.out.println("Enter price");
            Double price = Double.parseDouble(reader.nextLine());
            TicketBooking obj = new TicketBooking(name, tickets, price);
            arr.add(obj);
        }
        System.out.printf("%-10s %-15s %-15s\n", "Customer", "No of Tickets", "Price");
        arr
            .stream()
            .sorted((o1,o2) -> Double.compare(o1.getPrice(), o2.getPrice()))
            .collect(Collectors.toList())
            .forEach(obj -> System.out.println(obj));
        
        
            
    }
}

