package Phase2.Week_6.Exceptions.Codes.Q3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try{
            System.out.println("Enter the Item type details:");
            System.out.println("Enter the name:");
            String n = reader.nextLine();
            System.out.println("Enter the deposit:");
            double d = Double.parseDouble(reader.nextLine());
            System.out.println("Enter the cost per day:");
            double c = Double.parseDouble(reader.nextLine());
            ItemType obj = new ItemType(n, d, c);
            System.out.println("The details of the item type are:");
            System.out.println(obj);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }


    }
}
