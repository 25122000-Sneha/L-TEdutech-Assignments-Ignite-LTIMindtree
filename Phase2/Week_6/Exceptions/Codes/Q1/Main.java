package Phase2.Week_6.Exceptions.Codes.Q1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter the cost of the item for n days");
		int cost  = reader.nextInt();
		System.out.println("Enter the value of n");
		int n = reader.nextInt();
		int costPerDay;
		try{
			costPerDay = cost/n;
            System.out.println("Cost per day of the item is "+costPerDay);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
    }
}
