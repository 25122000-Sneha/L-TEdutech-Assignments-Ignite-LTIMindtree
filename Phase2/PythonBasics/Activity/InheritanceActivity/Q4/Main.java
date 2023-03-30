package Phase2.PythonBasics.Activity.InheritanceActivity.Q4;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		//fill the code
		Scanner reader = new Scanner(System.in);
		//System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
		System.out.println("Enter account Detail:");
		String detail = reader.nextLine();
		AccountBO obj = new AccountBO();
		FixedAccount ac = obj.getAccountDetail(detail);
		System.out.println("Account Details:");
		
		System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
		System.out.format("%-20s %.2f %-20s %.1f %d\n", ac.accNum, ac.balance, ac.accHolderName, ac.minimumBalance, ac.getLockingPeriod());
		






	}
}

