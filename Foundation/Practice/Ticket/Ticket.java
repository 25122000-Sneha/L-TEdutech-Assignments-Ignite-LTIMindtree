package Foundation.Practice.Ticket;
import java.util.*;
public class Ticket {
    private int ticketId, price;
    private static int totalNoOfTickets;
    public void setTicketId(int id)
    {
        this.ticketId = id;
    }
    public int getTicketId()
    {
        return this.ticketId;
    }
    public void setPrice(int p)
    {
        this.price = p;
    }
    public int getPrice()
    {
        return this.price;
    }
    public static void setTotalNo(int totalNo)
    {
        totalNoOfTickets = totalNo;
    }
    public int getTotalNo()
    {
        return this.totalNoOfTickets;
    }
    public int calculateTotalAmount(int noOfTickets)
    {
        if(noOfTickets <= totalNoOfTickets)
        {
            int total = price*noOfTickets;
            totalNoOfTickets -= noOfTickets;
            return total;
        }
        else 
        {
            return -1;
        }
    }
}
