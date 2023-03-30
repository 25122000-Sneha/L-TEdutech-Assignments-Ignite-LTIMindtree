package Phase2.PythonBasics.Activity.InheritanceActivity.Q5;

public class PlatinumStall extends GoldStall{
	//fill your code here
	private Integer projector;
	PlatinumStall(String name, String detail, String owner, Integer cost, Integer tvSet, Integer projector)
	{
		super(name, detail, owner, cost, tvSet);
		this.projector = projector;
	}
	public Integer getProjector()
	{
		return this.projector;
	}
	public void display()
	{
		System.out.println("Stall Name:"+name);
		System.out.println("Details:"+detail);
		System.out.println("Owner Name:"+owner);
		System.out.println("TV Sets:"+getTvSet());
		System.out.println("Projectors:"+projector);
		int totalCost = cost + (100*getTvSet()) + (500*projector);
		System.out.println("Total Cost:"+totalCost);
	}
}

