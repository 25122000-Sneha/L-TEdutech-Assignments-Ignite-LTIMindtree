package Phase2.Week_6.Exceptions.Codes.Q3;

public class ItemType {
    private String name;
    private double deposit, costPerDay;
    ItemType(String name, double deposit, double costPerDay)
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
    public void setDeposit(double deposit)
    {
        this.deposit = deposit;
    }
    public double getDeposit()
    {
        return this.deposit;
    }
    public void setCostPerDay(double costPerDay)
    {
        this.costPerDay = costPerDay;
    }
    public double getCostPerDay()
    {
        return costPerDay;
    }
    @Override
    public String toString()
    {
        return "Name:"+this.name+"\nDeposit:"+this.deposit+"\nCost Per Day:"+this.costPerDay;
    }
}
