package Phase2.Practice1.Week5.Q5;

public class Hall {
    private String name, contactNumber, ownerName;
    private double costPerDay;
    Hall(){}
    Hall(String name, String contactNumber, Double costPerDay, String ownerName)
    {
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
    void display()
    {
        System.out.printf("%-20s%-20s%-20s%-20s\n", this.name, this.contactNumber, this.costPerDay, this.ownerName);
    }
}
