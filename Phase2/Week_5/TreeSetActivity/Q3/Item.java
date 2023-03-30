package Phase2.Week_5.TreeSetActivity.Q3;

public class Item {
    private String name;
    private int amount;
    Item()
    {

    }
    Item(String name, int amount)
    {
        this.name = name;
        this.amount = amount;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAmount(int amt)
    {
        this.amount = amt;
    }
    public int getAmount()
    {
        return this.amount;
    }
    
}
