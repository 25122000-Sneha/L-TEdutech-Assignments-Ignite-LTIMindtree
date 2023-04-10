package Phase2.Practice1.OOP.Q7;

public class PlatinumStall extends GoldStall{
    private Integer projector;
    PlatinumStall(String name, String detail, String owner, Integer cost, Integer tvSet, Integer projector)
    {
        super(name, detail, owner, cost, tvSet);
        this.projector = projector;
    }
    public void setProjector(Integer projector)
    {
        this.projector = projector;
    }
    public Integer getProjector()
    {
        return this.projector;
    }
    @Override 
    void display()
    {
        System.out.println("Stall Name:"+this.name);
        System.out.println("Detail:"+this.detail);
        System.out.println("Owner Name:"+this.owner);
        System.out.println("TV Sets:"+getTvSet());
        System.out.println("Projectors:"+this.projector);
        System.out.println("Total Cost:"+(this.cost + (100*this.getTvSet()) + (this.projector*500)));
    }
}
