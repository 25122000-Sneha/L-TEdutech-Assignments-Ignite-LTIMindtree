package Phase2.PythonBasics.Activity.ClassObjActivity.ClassObject1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Customer Address");
        System.out.println("Enter the street");
        String street = reader.nextLine();
        System.out.println("Enter the city");
        String city = reader.nextLine();
        System.out.println("Enter the pincode");
        int pin = reader.nextInt();
        System.out.println("Enter the country");
        String country = reader.next();

        Address obj = new Address();
        obj.street = street;
        obj.city = city;
        obj.pincode = pin;
        obj.country = country;
        obj.displayAddress();
    }
}
