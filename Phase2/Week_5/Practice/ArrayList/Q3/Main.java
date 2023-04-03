package Phase2.Week_5.Practice.ArrayList.Q3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<ItemType> arr = new ArrayList<ItemType>();
        char ch;
        int i = 1;
        do
        {
            System.out.println("Enter the details of Item Type "+i);
            System.out.println("Name:");
            String name = reader.nextLine();
            System.out.println("Deposit:");
            double deposit = Double.parseDouble(reader.nextLine());
            System.out.println("Cost per Day:");
            double cost = Double.parseDouble(reader.nextLine());
            
            ItemType obj = new ItemType(name, deposit, cost);
            arr.add(obj);
            i++;
            System.out.println("Do you want to continue?(y/n)");
            ch = reader.nextLine().charAt(0);

        }while(ch == 'y');
        System.out.printf("%-20s%-20s%-20s\n", "Name", "Deposit", "CostPerDay");
        for(ItemType obj : arr)
        {
            System.out.println(obj);
        }
        
    }
}
