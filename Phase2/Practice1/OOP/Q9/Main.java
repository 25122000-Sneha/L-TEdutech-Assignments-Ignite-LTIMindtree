package Phase2.Practice1.OOP.Q9;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int no = reader.nextInt();
        System.out.println("Enter the Total no of tickets:");
        int totalNo = reader.nextInt();
        Ticket.setTotalNoOfTickets(totalNo);
        for(int i=0; i<no; i++)
        {
            System.out.println("Enter the ticketid:");
            int id = reader.nextInt();
            System.out.println("Enter the price:");
            int price = reader.nextInt();
            System.out.println("Enter no of tickets");
            int tickets = reader.nextInt();
            Ticket obj = new Ticket();
            obj.setTicketId(id);
            obj.setPrice(price);
            System.out.println("Total no of tickets:"+Ticket.getTotalNoOfTickets());
            int totalAmt = obj.calculateTotalAmount(tickets);
            if( totalAmt == -1)
            {
                System.out.println("Sorry tickets not available");
            }
            else 
            {
                System.out.println("Total amount:"+totalAmt);
                System.out.println("Total no of tickets after booking:"+Ticket.getTotalNoOfTickets());   
            }

        }
    }
}
