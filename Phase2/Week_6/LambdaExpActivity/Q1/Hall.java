package Phase2.Week_6.LambdaExpActivity.Q1;

public class Hall {
    private String name, owner;
    private double costPerDay;
    Hall(String name, Double costPerDay, String owner)
    {
        this.name = name;
        this.costPerDay = costPerDay;
        this.owner = owner;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public double getCostPerDay() {
        return costPerDay;
    }
    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }
    @Override
    public String toString()
    {
        return String.format("%-15s %-10s %s", this.name, this.costPerDay, this.owner);
    }
}
