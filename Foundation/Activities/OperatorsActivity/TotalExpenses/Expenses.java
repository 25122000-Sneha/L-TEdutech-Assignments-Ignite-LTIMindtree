package Foundation.Activities.OperatorsActivity.TotalExpenses;

import java.util.Scanner;

public class Expenses {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
			System.out.println("Enter branding expenses");
			double brand = reader.nextDouble();
			System.out.println("Enter travel expenses");
			double travel = reader.nextDouble();
			System.out.println("Enter food expenses");
			double food = reader.nextDouble();
			System.out.println("Enter logistics expenses");
			double logistics = reader.nextDouble();

			double totalExpense = brand + travel + food + logistics;
			System.out.println("Total expenses: Rs."+String.format("%.2f", totalExpense)) ;

			double brandPer = (brand/totalExpense)*100;
			double travelPer = (travel/totalExpense)*100;
			double foodPer = (food/totalExpense)*100;
			double logisticsPer = (logistics/totalExpense)*100;

			System.out.println("Branding expenses percentage: "+String.format("%.2f", brandPer)+"%");
			System.out.println("Travel expenses percentage: "+String.format("%.2f", travelPer)+"%");
			System.out.println("Food expenses percentage: "+String.format("%.2f", foodPer)+"%");
			System.out.println("Logistics expenses percentage: "+String.format("%.2f", logisticsPer)+"%");
    }
}
