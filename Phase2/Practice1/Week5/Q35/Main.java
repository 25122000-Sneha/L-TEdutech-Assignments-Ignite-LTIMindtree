package Phase2.Practice1.Week5.Q35;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the Item type details:");
        try
        {
            System.out.println("Enter the name:");
            String name = reader.nextLine();
            System.out.println("Enter the deposit:");
            double deposit = Double.parseDouble(reader.nextLine());
            System.out.println("Enter the cost per day:");
            String str = reader.nextLine();
            double cost = Double.parseDouble(str);
            ItemType obj = new ItemType(name, deposit, cost);
            System.out.println("The details of the item type are:");
            System.out.println(obj);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e.getClass().getName()+":"+e.getMessage());
        }

    }
}
