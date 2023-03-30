package Phase2.Week_5.TreeSetActivity.Q1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		TreeSet<Expense> set = new TreeSet<Expense>(new Expense());
		String ch;
		do
		{
			System.out.println("Enter expense category");
			String c = reader.nextLine();
			System.out.println("Enter expense amount");
			int amt = reader.nextInt();
            reader.nextLine();
			Expense obj = new Expense(c, amt);
			set.add(obj);
			System.out.println("Do you want to continue(yes/no):");
			ch = reader.nextLine();
		}while(ch.equals("yes"));
		System.out.println("Top spending categories");
		System.out.println("Category\tAmount");
		int sum = 0;
		for(Expense obj : set)
		{
			System.out.println(obj.getCategory() + "\t" + obj.getAmount());
			sum += obj.getAmount();
		}
		System.out.println("Total amount spent: "+sum);
    }
}
