package Phase2.PythonBasics.Activity.OverridingPolyActivity.Q1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter the name of the staff:");
		String n = reader.nextLine();
		System.out.println("Enter the staff designation:");
		String desig = reader.nextLine();
		System.out.println("Enter the department name:");
		String d = reader.nextLine();

		Staff s = new Staff(n, desig);
		Department obj = new Department(d, s);
		obj.displayStaff();
    }
}
