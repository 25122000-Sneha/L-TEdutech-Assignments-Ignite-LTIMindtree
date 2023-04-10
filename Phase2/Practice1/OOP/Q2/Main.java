package Phase2.Practice1.OOP.Q2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
      System.out.println("Enter the Customer Details");
      System.out.println("Enter the name");
      String n = reader.nextLine();
      System.out.println("Enter the email");
      String e = reader.nextLine();
      System.out.println("Enter the type");
      String t = reader.nextLine();
      System.out.println("Enter the location");
      String l = reader.nextLine();
      
      Customer c = new Customer(n, e, t, l);
      System.out.println("Name: "+c.getCustomerName());
      System.out.println("E-mail: "+c.getCustomerEmail());
      System.out.println("Type: "+c.getCustomerType());
      System.out.println("Location: "+c.getCustomerLocation());
    }
}
