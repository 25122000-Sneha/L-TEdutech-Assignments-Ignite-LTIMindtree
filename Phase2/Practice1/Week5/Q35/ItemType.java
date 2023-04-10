package Phase2.Practice1.Week5.Q35;

public class ItemType {
    private String name;
    private Double deposit, costPerDay;
    ItemType(String name, Double deposit, Double costPerDay)
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
    public void setDeposit(Double deposit)
    {
        this.deposit = deposit;
    }
    public Double getDeposit()
    {
        return deposit;
    }
    public void setCostPerDay(Double costPerDay)
    {
        this.costPerDay = costPerDay;
    }
    public Double getCostPerDay()
    {
        return this.costPerDay;
    }
    public String toString()
    {
        return "Name:"+this.name+"\nDeposit:"+this.deposit+"\nCost Per Day:"+String.format("%.1f", this.costPerDay);
    }
}
