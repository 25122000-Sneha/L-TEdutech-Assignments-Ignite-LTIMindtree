package Phase2.Week_6.StreamAPIActivity.Q1;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of bookings");
        int n = Integer.parseInt(reader.nextLine());
        ArrayList<TicketBooking> arr = new ArrayList<TicketBooking>();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter customer name");
            String name = reader.nextLine();
            System.out.println("Enter number of tickets");
            int tickets = Integer.parseInt(reader.nextLine());
            System.out.println("Enter the price");
            double price = Double.parseDouble(reader.nextLine());
            TicketBooking obj = new TicketBooking(name, tickets, price);
            arr.add(obj);

        }
        //List<TicketBooking> sortedList = arr.stream().sorted(Comparator.comparing(TicketBooking::getPrice)).collect(Collectors.toList());
        List<TicketBooking> sortedBookings = arr.stream().sorted((b1, b2) -> { return Double.compare(b1.getPrice(), b2.getPrice());}).collect(Collectors.toList());
        System.out.printf("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");
        for(TicketBooking obj : sortedBookings)
        {
            System.out.println(obj);
        }
        
    }
}
