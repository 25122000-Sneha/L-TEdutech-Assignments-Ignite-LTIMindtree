package Phase2.PythonBasics.Activity.OverridingPolyActivity.Q3;

public class TicketBooking{

	//Fill your code
	private String stageEvent, customer;
	private Integer noOfSeats;
	TicketBooking()
	{

	}
	TicketBooking(String stageEvent, String customer, Integer noOfSeats)
	{
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	public void setStageEvent(String stageEvent)
	{
		this.stageEvent = stageEvent;
	}
	public String getEvent()
	{
		return this.stageEvent;
	}
	public void setCustomer(String customer)
	{
		this.customer = customer;
	}
	public String getCustomer()
	{
		return this.customer;
	}
	public void setNoOfSeats(int noOfSeats)
	{
		this.noOfSeats = noOfSeats;
	}
	public Integer getNoOfSeats()
	{
		return this.noOfSeats;
	}
	public void makePayment(double amt)
	{
		System.out.println("Stage event:"+stageEvent);
		System.out.println("Customer:"+customer);
		System.out.println("Number of seats:"+noOfSeats);
		System.out.println("Amount "+amt+" paid in cash");
	}
	public void makePayment(String walletNum, double amt)
	{
		System.out.println("Stage event:"+stageEvent);
		System.out.println("Customer:"+customer);
		System.out.println("Number of seats:"+noOfSeats);
		System.out.println("Amount "+amt+" paid using wallet number "+walletNum);
	}
	public void makePayment(String creditCard, String ccv, String name, double amt)
	{
		System.out.println("Stage event:"+stageEvent);
		System.out.println("Customer:"+customer);
		System.out.println("Number of seats:"+noOfSeats);
		System.out.println("Holder name:"+name);
		System.out.println("Amount "+amt+" paid using "+creditCard+" card\nCCV:"+ccv);
	}


}

