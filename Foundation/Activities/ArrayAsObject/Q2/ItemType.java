package Foundation.Activities.ArrayAsObject.Q2;

public class ItemType {
    private String name;
	double deposit, costPerDay;
	public ItemType(String name, double deposit, double costPerDay)
	{
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	} 
	public void setDeposit(double deposit)
	{
		this.deposit = deposit;
	}
	public double getDeposit()
	{
		return deposit;
	}
	public void setCostPerDay(double costPerDay)
	{
		this.costPerDay = costPerDay;
	}
	public double getCostPerDay()
	{
		return costPerDay;
	}
}
