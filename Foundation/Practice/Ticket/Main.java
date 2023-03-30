package Foundation.Practice.Ticket;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter no of objs:");
        int n = reader.nextInt();
        System.out.println("Enter total no of tickets:");
        int t = reader.nextInt();
        Ticket.setTotalNo(t);
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter ticketId:");
            int id = reader.nextInt();
            System.out.println("Enter price:");
            int price = reader.nextInt();
            Ticket obj = new Ticket();
            obj.setTicketId(id);
            obj.setPrice(price);
            System.out.println("Enter no of tickets:");
            int no = reader.nextInt();
            System.out.println("Total no of tickets:"+obj.getTotalNo());
            int amt = obj.calculateTotalAmount(no);
            if(amt == -1)
            {
                System.out.println("Sorry tickets not available");
            }
            else 
            {
                System.out.println("Total amount:"+amt);
                System.out.println("Total no of tickets after booking:"+obj.getTotalNo());
            }
        }
    }
}
