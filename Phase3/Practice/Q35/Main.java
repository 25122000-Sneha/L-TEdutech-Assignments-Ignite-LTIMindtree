package Phase3.Practice.Q35;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try 
        {
            System.out.println("Enter the Item type details:");
            System.out.println("Enter the name:");
            String name = reader.nextLine();
            System.out.println("Enter the deposit:");
            double deposit = Double.parseDouble(reader.nextLine());
            System.out.println("Enter the cost per day:");
            double cost = Double.parseDouble(reader.nextLine());
            ItemType obj = new ItemType(name, deposit, cost);
            System.out.println(obj);
        }
        catch(NumberFormatException e)
        {
            System.out.println("java.lang.NumberFormatException:"+e.getMessage());
        }
    }
}
