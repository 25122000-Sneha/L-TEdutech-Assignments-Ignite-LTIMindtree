package Phase2.Practice1.Week5.Q15;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String ch;
        TreeSet<Expense> set = new TreeSet<Expense>();
        do
        {
            System.out.println("Enter expense category");
            String c = reader.nextLine();
            System.out.println("Enter expense amount");
            int amt = Integer.parseInt(reader.nextLine());
            Expense obj = new Expense(c, amt);
            set.add(obj);
            System.out.println("Do you want to continue(yes/no):");
            ch = reader.nextLine();
        }while(ch.equals("yes"));
        int sum = 0;
        System.out.println("Top spending categories");
        System.out.printf("%-15s%-15s\n", "Category", "Amount");
        Iterator itr = set.descendingIterator();
        while(itr.hasNext())
        {
            Expense obj = (Expense)itr.next();
            sum += obj.getAmount();
            System.out.println(obj);
        }
        System.out.println("Total amount spent: "+sum);

    }
}
