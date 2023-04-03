package Phase2.Week_5.Practice.Comparable.Q5;
import java.util.*;
class Hall implements Comparable<Hall>{
    private String name, contactNo, ownerName;
    private double costPerDay;
    public Hall(String name, String contactNo, double costPerDay, String ownerName) {
        this.name = name;
        this.contactNo = contactNo;
        this.ownerName = ownerName;
        this.costPerDay = costPerDay;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactNo() {
        return contactNo;
    }
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
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
    @Override
    public int compareTo(Hall that)
    {
        return Double.compare(this.costPerDay, that.costPerDay);
    }
    @Override
    public String toString()
    {
        return String.format("%-15s%-15s%-15s%-15s", this.name, this.contactNo, String.format("%.1f", this.costPerDay), this.ownerName);
    }
}