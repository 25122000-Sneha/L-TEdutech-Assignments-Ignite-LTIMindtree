package Phase2.Practice1.OOP.Q7;

public class GoldStall extends SilverStall{
    private Integer tvSet;
    GoldStall(String name, String detail, String owner, Integer cost, Integer tvSet)
    {
        super(name, detail, owner, cost);
        this.tvSet = tvSet;
    }
    public void setTvSet(Integer tvSet)
    {
        this.tvSet = tvSet;
    }
    public Integer getTvSet()
    {
        return this.tvSet;
    }
    @Override 
    void display()
    {
        System.out.println("Stall Name:"+this.name);
        System.out.println("Details:"+this.detail);
        System.out.println("Owner Name:"+this.owner);
        System.out.println("TV Sets:"+this.tvSet);
        System.out.println("Total Cost:"+(this.cost + (100*this.tvSet)));
    }
}
