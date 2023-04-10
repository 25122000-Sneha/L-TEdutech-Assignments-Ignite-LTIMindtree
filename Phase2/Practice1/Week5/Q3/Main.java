package Phase2.Practice1.Week5.Q3;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        char ch;
        int i = 1;
        ArrayList<ItemType> arr = new ArrayList<ItemType>();
        do{
            System.out.println("Enter the details of Item Type "+i);
            System.out.println("Name:");
            String n = reader.nextLine();
            System.out.println("Deposit:");
            double d = Double.parseDouble(reader.nextLine());
            System.out.println("Cost per Day:");
            double c = Double.parseDouble(reader.nextLine());
            ItemType obj = new ItemType(n, d, c);
            arr.add(obj);
            System.out.println("Do you want to continue?(y/n)");
            ch = reader.nextLine().charAt(0);
        }while(ch == 'y');
        System.out.printf("%-20s%-20s%-20s", "Name", "Deposit", "CostPerDay");
        for(ItemType obj : arr)
        {
            System.out.println(obj);
        }
    }
}
