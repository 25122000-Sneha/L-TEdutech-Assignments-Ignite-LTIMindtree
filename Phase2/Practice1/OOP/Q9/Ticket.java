package Phase2.Practice1.OOP.Q9;

public class Ticket {
    private int ticketId, price;
    private static int totalNoOfTickets;
    public int getTicketId() {
        return ticketId;
    }
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public static int getTotalNoOfTickets() {
        return totalNoOfTickets;
    }
    public static void setTotalNoOfTickets(int totalNoOfTickets) {
        Ticket.totalNoOfTickets = totalNoOfTickets;
    }
    int calculateTotalAmount(int noOfTickets)
    {
        if(noOfTickets > totalNoOfTickets)
        {
            return -1;
        }
        else 
        {
            totalNoOfTickets -= noOfTickets;
            return price*noOfTickets;
        }
    }
}
