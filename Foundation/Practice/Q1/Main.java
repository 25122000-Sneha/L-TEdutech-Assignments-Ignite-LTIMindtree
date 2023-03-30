package Foundation.Practice.Q1;
import java.util.*;
class Address{
    String street;
    String city;
    int pincode;
    String country;

    void displayAddress()
    {
        System.out.println("Street: "+street);
        System.out.println("City: "+city);
        System.out.println("Pincode: "+pincode);
        System.out.println("Country: "+country);
    }
}
public class Main{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        Address obj = new Address();
        System.out.println("Enter Customer Address");
        System.out.println("Enter the street");
        obj.street = reader.nextLine();
        System.out.println("Enter the city");
        obj.city = reader.nextLine();
        System.out.println("Enter the pincode");
        obj.pincode = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter the country");
        obj.country = reader.nextLine();
        obj.displayAddress();

    }
}