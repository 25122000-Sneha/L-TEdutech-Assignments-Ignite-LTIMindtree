package Phase2.Practice1.Week5.Q3;

public class ItemType {
    private String name;
    private double deposit;
    private double costPerDay;
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
        return this.costPerDay;
    }
    public String toString()
    {
        return String.format("%-20s%-20s%-20s", this.name, this.deposit, this.costPerDay);
    }
}
