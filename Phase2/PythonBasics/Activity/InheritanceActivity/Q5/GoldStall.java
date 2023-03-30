package Phase2.PythonBasics.Activity.InheritanceActivity.Q5;

public class GoldStall extends SilverStall{
	//fill your code here
	private Integer tvSet;
	GoldStall(String name, String detail, String owner, Integer cost, Integer tvSet)
	{
		super(name, detail, owner, cost);
		this.tvSet = tvSet;
	}
	public Integer getTvSet()
	{
		return this.tvSet;
	}
	public void display()
	{
		System.out.println("Stall Name:"+name);
		System.out.println("Details:"+detail);
		System.out.println("Owner Name:"+owner);
		System.out.println("TV Sets:"+tvSet);
		int totalCost = cost + (100*tvSet);
		System.out.println("Total Cost:"+totalCost);
	}

}
