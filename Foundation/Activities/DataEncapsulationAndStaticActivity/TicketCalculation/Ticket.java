package Foundation.Activities.DataEncapsulationAndStaticActivity.TicketCalculation;

public class Ticket {
    private int ticketId, price;
	private static int totalNoOfTickets;
	public void setTicketId(int ticketId)
	{
		this.ticketId = ticketId;
	}
	public int getTicketId()
	{
		return ticketId;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
	public static void setTotalNoOfTickets(int total)
	{
		totalNoOfTickets = total;
	}
	public int getTotalNoOfTickets()
	{
		return totalNoOfTickets;
	}

	public int calculateTotalAmount(int noOfTickets)
	{
		if(noOfTickets < totalNoOfTickets)
		{
            totalNoOfTickets -= noOfTickets;
			return price*noOfTickets;
            
		}
		else 
		return -1;
	}

}
