package Phase2.Week_5.Practice.TreeSet.Q1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        TreeSet<Expense> set = new TreeSet<Expense>();
        String ch;
        int total = 0;
        do
        {
            System.out.println("Enter expense category");
            String category = reader.nextLine();
            System.out.println("Enter expense amount");
            int amt = reader.nextInt();
            reader.nextLine();
            total+=amt;
            Expense obj = new Expense(category, amt);
            set.add(obj);
            System.out.println("Do you want to continue(yes/no):");
            ch = reader.nextLine();
        }while(ch.equals("yes"));
        System.out.println("Top spending categories");
        System.out.println(String.format("%-15s%-15s\n","Category", "Amount"));
        for(Expense obj : set)
        {
            System.out.printf("%-15s%-15s\n", obj.getExpenseCategory(), obj.getAmount());
        }
        System.out.println("Total amount spent: "+total);
    }
}
