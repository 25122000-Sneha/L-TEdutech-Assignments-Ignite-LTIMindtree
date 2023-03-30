package Phase2.PythonBasics.Activity.ClassObjActivity.Q6;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter the item type name");
		String n = reader.nextLine();
		System.out.println("Enter the cost per day");
		double c = reader.nextDouble();
		System.out.println("Enter the deposit");
		double d = reader.nextDouble();

		ItemType obj = new ItemType();
		obj.setName(n);
		obj.setCostPerDay(c);
		obj.setDeposit(d);
		obj.display();

    }
}
