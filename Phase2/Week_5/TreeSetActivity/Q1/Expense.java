package Phase2.Week_5.TreeSetActivity.Q1;
import java.util.*;
public class Expense implements Comparator<Expense>{
    private String expenseCategory;
    private Integer amount;
    Expense(){};
    Expense(String expenseCategory, Integer amount)
    {
        this.expenseCategory = expenseCategory;
        this.amount = amount;
    }
    public void setCategory(String cat)
    {
        this.expenseCategory = cat;
    }
    public void setAmount(Integer amt)
    {
        this.amount = amt;
    }
    public String getCategory()
    {
        return this.expenseCategory;
    }
    public Integer getAmount()
    {
        return this.amount;
    }
    @Override
    public int compare(Expense obj1, Expense obj2) {
        if(obj1.getAmount() < obj2.getAmount())
        {
            return 1;
        }
        else 
        return -1;
    }
}
