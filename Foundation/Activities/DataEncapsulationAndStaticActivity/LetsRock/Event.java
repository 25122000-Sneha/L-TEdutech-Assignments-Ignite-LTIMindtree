package Foundation.Activities.DataEncapsulationAndStaticActivity.LetsRock;

public class Event {
    String eventType, hallName, startDate, endDate;
	int noOfPeople;
	public Event(String eventType, String hallName, String startDate, String endDate, int noOfPeople)
	{
		this.eventType = eventType;
		this.hallName = hallName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfPeople = noOfPeople;
	}
	public void display()
	{
		System.out.println("Inside Static Method");
		System.out.println("Event Name: "+eventType);
		System.out.println("Hall Name: "+hallName);
		System.out.println("Start Date: "+startDate);
		System.out.println("End Date: "+endDate);
		System.out.println("No of People: "+noOfPeople);

	}
}
