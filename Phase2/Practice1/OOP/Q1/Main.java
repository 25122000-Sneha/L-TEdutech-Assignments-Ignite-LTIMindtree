package Phase2.Practice1.OOP.Q1;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Address obj = new Address();
        System.out.println("Enter Customer Address");
        System.out.println("Enter the street");
        obj.street = reader.nextLine();
        System.out.println("Enter the city");
        obj.city = reader.nextLine();
        System.out.println("Enter the pincode");
        obj.pincode = reader.nextLine();
        System.out.println("Enter the country");
        obj.country = reader.nextLine();
        obj.displayAddress();
    }
}
