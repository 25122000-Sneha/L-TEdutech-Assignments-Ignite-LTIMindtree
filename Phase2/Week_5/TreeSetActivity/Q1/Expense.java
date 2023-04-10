package Phase2.Week_5.TreeSetActivity.Q1;
import java.util.*;
public class Expense implements Comparable<Expense>{
    private String expenseCategory;
    private Integer amount;
    Expense(String cat, Integer amt)
    {
        this.expenseCategory = cat;
        this.amount = amt;
    }
    public String getExpenseCategory() {
        return expenseCategory;
    }
    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    @Override 
    public int compareTo(Expense that)
    {
        return Integer.compare(this.amount, that.amount);
    }
    @Override 
    public String toString()
    {
        return String.format("%-15s%-15s", this.expenseCategory, this.amount);
    }

    
}
