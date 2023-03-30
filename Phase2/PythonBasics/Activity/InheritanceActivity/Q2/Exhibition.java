package Phase2.PythonBasics.Activity.InheritanceActivity.Q2;

public class Exhibition extends Event{
	//write	your code here
	Integer noOfStall;
	Exhibition(String name, String detail, String type, String ownerName, double costPerDay, Integer noOfStall)
	{
		super(name, detail, type, ownerName, costPerDay);
		this.noOfStall = noOfStall;
	}
	
	
}
