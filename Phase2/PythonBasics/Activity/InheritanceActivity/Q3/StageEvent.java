package Phase2.PythonBasics.Activity.InheritanceActivity.Q3;



public class StageEvent extends Event{
	//Your code here
	private Integer noOfSeats;
	public StageEvent(String name, String detail, String type, String organiserName, Integer noOfSeats)
	{
		super(name, detail, type, organiserName);
		this.noOfSeats = noOfSeats;
	}
	public void display()
	{
		System.out.println("Event Name:"+name);
		System.out.println("Detail:"+detail);
		System.out.println("Type:"+type);
		System.out.println("Organiser Name:"+organiserName);
		System.out.println("Number of seats:"+noOfSeats);
	}

}
