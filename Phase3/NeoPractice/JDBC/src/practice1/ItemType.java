package practice1;

public class ItemType {
	private Long id;
	private String name;
	private Double deposit;
	private Double costPerDay;
	
	ItemType(Long id, String name, Double deposit, Double costPerDay)
	{
		this.id = id;
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public Long getId()
	{
		return this.id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setDeposit(Double deposit)
	{
		this.deposit = deposit;
	}
	public Double getDeposit()
	{
		return this.deposit;
	}
	public void setCostPerDay(Double costPerDay)
	{
		this.costPerDay = costPerDay;
	}
	public Double getCostPerDay()
	{
		return this.costPerDay;
	}
	@Override 
	public String toString()
	{
		return String.format("%-5s %-15s %-10s %s", this.id, this.name, String.format("%.1f", this.deposit), this.costPerDay);
	}
}
