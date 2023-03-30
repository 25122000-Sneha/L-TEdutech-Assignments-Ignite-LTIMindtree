package Phase2.Week_5.CompActivity.Q5;

public class Hall implements Comparable<Hall>{
    private String name, contactNumber, ownerName;
    private double costPerDay;
    
    Hall(String name, String contactNumber, double costPerDay, String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public double getCostPerDay() {
        return costPerDay;
    }
    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }
    public String toString()
    {
        return String.format("%-15s%-15s%-15s%-15s", this.name, this.contactNumber, String.format("%.1f",this.costPerDay), this.ownerName);
    }
    @Override
    public int compareTo(Hall that)
    {
        return Double.compare(this.costPerDay, that.costPerDay);
    }
}
