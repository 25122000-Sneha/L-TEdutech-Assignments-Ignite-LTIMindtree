package Phase2.Week_6.LambdaExpActivity.Q2;

public class ItemType {
    private String name;
    private double costPerDay, deposit;
    ItemType(String name, Double costPerDay, Double deposit)
    {
        this.name = name;
        this.costPerDay = costPerDay;
        this.deposit = deposit;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCostPerDay() {
        return costPerDay;
    }
    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }
    public double getDeposit() {
        return deposit;
    }
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
    @Override
    public String toString()
    {
        return String.format("%-10s %-10s %s", this.name, this.costPerDay, this.deposit);
    }
}
