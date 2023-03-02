package Foundation.Activities.DataEncapsulationAndStaticActivity.TicketCalculation;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter no of objects:");
        int objects = reader.nextInt();
        System.out.println("Enter the Total no of tickets:");
        int totalNoOfTickets = reader.nextInt();
        Ticket.setTotalNoOfTickets(totalNoOfTickets);
        for(int i=0; i<objects; i++)
        {
             System.out.println("Enter the ticketid:");
             int ticketId = reader.nextInt();
              System.out.println("Enter the price:");
              int price = reader.nextInt();
               System.out.println("Enter the no of tickets:");
               int noOfTickets = reader.nextInt();
                Ticket t = new Ticket();
                t.setTicketId(ticketId);
                t.setPrice(price);
                
                System.out.println("Total no of tickets: "+t.getTotalNoOfTickets());
                int totalAmount = t.calculateTotalAmount(noOfTickets);
                if(totalAmount==-1)
                {
                    System.out.println("Sorry tickets not available.");

                }
                else 
                {
                    System.out.println("Total amount:"+totalAmount);
                    System.out.println("Total no of ticket after booking:"+t.getTotalNoOfTickets());
                    

                }
                


               
        }
    }
}
