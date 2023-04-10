package Phase2.Practice1.Week5.Q33;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the cost of the item for n days");
        int totalCost = reader.nextInt();
        int costPerDay;
        System.out.println("Enter the value of n");
        int n = reader.nextInt();
        try{
            
            costPerDay = totalCost/n;
            System.out.println("Cost per day of the item is "+costPerDay);
        }
        catch(ArithmeticException e)
        {
            System.out.println("javalang.ArithmeticException: / by zero");
        }
    }
}
