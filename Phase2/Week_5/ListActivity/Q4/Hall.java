package Phase2.Week_5.ListActivity.Q4;

public class Hall {
    private String name, contactNumber, ownerName;
	private double costPerDay;
	public Hall(String name, String contactNumber, double costPerDay, String ownerName)
	{
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}
	public String getName()
	{
		return this.name;
	}
	public String getContactNumber()
	{
		return this.contactNumber;
	}
	public double getCostPerDay()
	{
		return this.costPerDay;
	}
	public String getOwnerName()
	{
		return this.ownerName;
	}
}
