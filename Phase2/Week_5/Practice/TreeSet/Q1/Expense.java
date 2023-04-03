package Phase2.Week_5.Practice.TreeSet.Q1;

public class Expense implements Comparable<Expense>{
    private String expenseCategory;
    private Integer amount;
    Expense(String expenseCategory, Integer amount)
    {
        this.expenseCategory = expenseCategory;
        this.amount = amount;
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
        return Integer.compare(that.amount, this.amount);
    }

}
