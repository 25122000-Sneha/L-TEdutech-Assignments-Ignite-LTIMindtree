package Phase2.PythonBasics.Activity.InheritanceActivity.Q3;




public class Exhibition extends Event {
	//your code here
	private Integer noOfStalls;
	public Exhibition(String name, String detail, String type, String organiserName, Integer noOfStalls)
	{
		super(name, detail, type, organiserName);
		this.noOfStalls = noOfStalls;
	}
	public void display()
	{
		System.out.println("Event Name:"+name);
		System.out.println("Detail:"+detail);
		System.out.println("Type:"+type);
		System.out.println("Organiser Name:"+organiserName);
		System.out.println("Number of stalls:"+noOfStalls);
	}
	
	
}

