package Foundation.Activities.DataEncapsulationAndStaticActivity.DisplayItemType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the item type name");
		String type = reader.nextLine();
		System.out.println("Enter the cost per day");
		double cost = reader.nextDouble();
		System.out.println("Enter the deposit");
		double deposit = reader.nextDouble();

		ItemType obj = new ItemType();
		obj.setName(type);
		obj.setCostPerDay(cost);
		obj.setDeposit(deposit);
		obj.display();
    }
}
