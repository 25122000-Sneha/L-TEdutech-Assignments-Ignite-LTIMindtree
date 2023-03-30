package Phase2.Week_5.ListActivity.Q5;

public class Hall {
    private String name, contactNumber, ownerName;
    private double costPerDay;
    Hall(String name, String contactNumber, double costPerDay, String ownerName)
    {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }
    public String getName()
    {
        return this.name;
    }
    public String getContactNumber()
    {
        return this.contactNumber;
    }
    public double getCostPerDay()
    {
        return this.costPerDay;
    }
    public String getOwnerName()
    {
        return this.ownerName;
    }
    public void display()
    {
        System.out.println(name+"\t"+contactNumber+"\t"+costPerDay+"\t"+ownerName);
    }
}
