package Phase2.Week_5.ListActivity.Q3;
class ItemType{
    private String name;
	private double deposit, costPerDay;

	ItemType(String name, double deposit, double costPerDay)
	{
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	public String getName()
	{
		return this.name;
	}
	public double getDeposit()
	{
		return this.deposit;
	}
	public double getCostPerDay()
	{
		return this.costPerDay;
	}
	public String toString()
	{
		return name+"\t"+deposit+"\t"+costPerDay;
	}
}