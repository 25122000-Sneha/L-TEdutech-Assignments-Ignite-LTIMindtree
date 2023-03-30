package Phase2.PythonBasics.Activity.InheritanceActivity.Q2;

public class StageEvent extends Event{
	//write your code here
	Integer noOfSeats;
	StageEvent(String name, String detail, String type, String ownerName, double costPerDay, Integer noOfSeats)
	{
		super(name, detail, type, ownerName, costPerDay);
		this.noOfSeats = noOfSeats;
	}
	
}

