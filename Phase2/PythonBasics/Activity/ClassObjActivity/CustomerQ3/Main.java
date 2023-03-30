package Phase2.PythonBasics.Activity.ClassObjActivity.CustomerQ3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the Customer Details");
        System.out.println("Enter the name");
        String name = reader.nextLine();
        System.out.println("Enter the email");
        String email = reader.nextLine();
        System.out.println("Enter the type");
        String type = reader.nextLine();
        System.out.println("Enter the location");
        String location = reader.nextLine();

        Customer c = new Customer(name, email, type, location);
        c.displayDetails();
    }
}
