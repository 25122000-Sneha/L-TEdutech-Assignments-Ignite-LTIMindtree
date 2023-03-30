package Phase2.PythonBasics.Activity.InheritanceActivity.Q5;
public class SilverStall {
	//fill your code here
	protected String name, detail, owner;
	protected Integer cost;
	SilverStall(String name, String detail, String owner, Integer cost)
	{
		this.name = name;
		this.detail = detail;
		this.owner = owner;
		this.cost = cost;
	}
	public void display()
	{
		System.out.println("Stall Name:"+name);
		System.out.println("Details:"+detail);
		System.out.println("Owner Name:"+owner);
		System.out.println("Total Cost:"+cost);
	}
}
