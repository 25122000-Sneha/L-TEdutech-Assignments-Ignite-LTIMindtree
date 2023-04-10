package Phase2.Practice1.OOP.Q2;

public class Customer {
    private String customerName, customerEmail, customerType, customerLocation;
    Customer(String name, String email, String type, String location)
    {
        this.customerName = name;
        this.customerEmail = email;
        this.customerType = type;
        this.customerLocation = location;

    }
    public String getCustomerName()
    {
        return this.customerName;
    }
    public String getCustomerEmail()
    {
        return this.customerEmail;
    }
    public String getCustomerType()
    {
        return this.customerType;
    }
    public String getCustomerLocation()
    {
        return this.customerLocation;
    }
}
