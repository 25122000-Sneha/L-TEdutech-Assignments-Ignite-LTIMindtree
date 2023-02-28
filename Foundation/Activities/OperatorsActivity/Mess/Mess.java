package Foundation.Activities.OperatorsActivity.Mess;
import java.util.*;
public class Mess {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            System.out.println("Cost of item:");
            int cost = reader.nextInt();
            System.out.println("Number of items:");
            int num = reader.nextInt();
            int totalCost = cost*num;
            System.out.println("Total cost is Rs."+totalCost);
    }
}
