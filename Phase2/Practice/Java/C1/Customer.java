package Phase2.Practice.Java.C1;
import java.util.*;
class Customer{
    String customerName, customerEmail, customerType, customerAddress;
    Customer(String customerName, String email, String type, String address)
    {
        this.customerName = customerName;
        this.customerEmail = email;
        this.customerType = type;
        this.customerAddress = address;
    }
    void displayDetails()
    {
        System.out.println("Name:"+customerName);
        System.out.println("E-mail:"+customerEmail);
        System.out.println("Type:"+customerType);
        System.out.println("Location:"+customerAddress);
    }

}
