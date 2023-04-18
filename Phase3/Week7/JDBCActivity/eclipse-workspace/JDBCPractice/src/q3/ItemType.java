package q3;

public class ItemType {
	private Long id;
	private String name;
	private Double deposit, costPerDay;
	ItemType(){}
	ItemType(Long id, String name, Double deposit, Double costPerDay)
	{
		this.id = id;
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	@Override
	public String toString()
	{
		return String.format("%-5s %-15s %-10s %s", this.id, this.name, String.format("%.1f", this.deposit), String.format("%.1f", this.costPerDay));
	}
}
