package Phase2.Week_6.StreamAPIActivity.Q3;
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Expenses> arr = new ArrayList<Expenses>();
        System.out.println("Enter expense for food");
        double food = reader.nextDouble();
        arr.add(new Expenses("food", food));
        System.out.println("Enter expense for rent");
        double rent = reader.nextDouble();
        arr.add(new Expenses("rent", rent));
        System.out.println("Enter expense for shopping");
        double shopping = reader.nextDouble();
        arr.add(new Expenses("shopping", shopping));
        System.out.println("Enter expense for groceries");
        double groceries = reader.nextDouble();
        arr.add(new Expenses("groceries", groceries));
        System.out.println("Enter expense for electricity");
        double electricity = reader.nextDouble();
        arr.add(new Expenses("electricity", electricity));
        System.out.println("Enter salary");
        double salary = reader.nextDouble();

        double totalExpense = arr.stream().map(obj -> obj.getCost()).reduce(0.0, (sum,cost)->sum+cost);
        //arr.stream().map(obj -> obj.getCost()).forEach(n -> System.out.println(n));
        if(totalExpense > salary)
        {
            System.out.println("Expenses exceeds Salary");
        }
        else 
        {
            System.out.println("Savings amount will be Rs."+(salary - totalExpense));
        }

    }
}
