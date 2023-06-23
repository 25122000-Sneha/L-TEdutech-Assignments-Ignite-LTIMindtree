package Phase3.Practice.Q35;

public class ItemType {
    private String name;
    private Double deposit;
    private Double costPerDay;
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
        return "Name:"+this.getName()+"\nDeposit:"+this.getDeposit()+"\nCost Per Day:"+String.format("%.1f", this.costPerDay);
    }
}
