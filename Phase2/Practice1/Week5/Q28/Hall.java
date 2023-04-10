package Phase2.Practice1.Week5.Q28;

public class Hall implements Comparable<Hall>{
    private String name, contactNumber, ownerName;
    private Double costPerDay;
    Hall(){}
    Hall(String name, String contactNumber, Double costPerDay, String ownerName)
    {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setContactNumber(String contactNumber)
    {
        this.contactNumber = contactNumber;
    }
    public String getContactNumber()
    {
        return contactNumber;
    }
    public void setCostPerDay(Double costPerDay)
    {
        this.costPerDay = costPerDay;
    }
    public Double getCostPerDay()
    {
        return costPerDay;
    }
    public void setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;
    }
    public String getOwnerName()
    {
        return ownerName;
    }
    @Override 
    public String toString()
    {
        return String.format("%-15s%-15s%-15s%-15s", this.name, this.contactNumber, this.costPerDay, this.ownerName);
    }
    @Override 
    public int compareTo(Hall that)
    {
        return Double.compare(this.costPerDay, that.costPerDay);
    }
}
