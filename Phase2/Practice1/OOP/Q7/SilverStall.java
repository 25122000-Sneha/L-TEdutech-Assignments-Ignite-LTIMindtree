package Phase2.Practice1.OOP.Q7;

public class SilverStall {
    protected String name, detail, owner;
    protected Integer cost;
    SilverStall(String name, String detail, String owner, Integer cost)
    {
        this.name = name;
        this.detail = detail;
        this.owner = owner;
        this.cost = cost;
    }
    void display()
    {
        System.out.println("Stall Name:"+this.name);
        System.out.println("Details:"+this.detail);
        System.out.println("Owner Name:"+this.owner);
        System.out.println("Total cost:"+this.cost);
    }
}
