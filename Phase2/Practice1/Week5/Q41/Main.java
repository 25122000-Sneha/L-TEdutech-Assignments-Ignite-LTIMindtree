
package Phase2.Practice1.Week5.Q41;
import java.util.*;
import java.util.stream.*;
class Expenses {
    private String expenseType;
    private Double cost;
    Expenses(){}
    Expenses(String expenseType, Double cost)
    {
        this.expenseType = expenseType;
        this.cost = cost;
    }
    public String getExpenseType() {
        return expenseType;
    }
    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    

}
class Hello {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Expenses> arr = new ArrayList<Expenses>();
        System.out.println("Enter expense for food");
        Double food = reader.nextDouble();
        Expenses e1 = new Expenses("food", food);
        arr.add(e1);
        System.out.println("Enter expense for rent");
        Double rent = reader.nextDouble();
        Expenses e2 = new Expenses("rent", rent);
        arr.add(e2);
        System.out.println("Enter expense for shopping");
        Double shop = reader.nextDouble();
        Expenses e3 = new Expenses("shopping", shop);
        arr.add(e3);
        System.out.println("Enter expense for groceries");
        Double grocery = reader.nextDouble();
        Expenses e4 = new Expenses("grocery", grocery);
        arr.add(e4);
        System.out.println("Enter expense for electricity");
        Double electricity = reader.nextDouble();
        Expenses e5 = new Expenses("electricity", electricity);
        arr.add(e5);

        System.out.println("Enter salary");
        Double salary = reader.nextDouble();

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
