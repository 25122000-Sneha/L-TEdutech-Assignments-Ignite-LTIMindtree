package Foundation.Practice.Q2;
import java.util.*;

class Customer{
    private String customerName;
    private String customerEmail;
    private String customerType;
    private String customerLocation;

    Customer(String customerName, String customerEmail, String customerType, String customerLocation)
    {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerType = customerType;
        this.customerLocation = customerLocation;
    }
    public String getName()
    {
        return this.customerName;
    }
    public String getEmail()
    {
        return this.customerEmail;
    }
    public String getType()
    {
        return this.customerType;
    }
    public String getLocation()
    {
        return this.customerLocation;
    }
}





public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the customer details");
        System.out.println("Enter the name");
        String n = reader.nextLine();
        System.out.println("Enter the email");
        String e = reader.nextLine();
        System.out.println("Enter the type");
        String t = reader.nextLine();
        System.out.println("Enter the location");
        String l = reader.nextLine();

        Customer c = new Customer(n, e, t, l);
        System.out.println("Customer Details");
        System.out.println("Name: "+c.getName());
        System.out.println("E-mail: "+c.getEmail());
        System.out.println("Type: "+c.getType());
        System.out.println("Location: "+c.getLocation());
    }
}
