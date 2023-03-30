package Foundation.Activities.DataEncapsulationAndStaticActivity.StaticMembers;

public class StaticIllustration {
    private Integer i1;
	private static Integer i2;
	
	public void setI1(Integer i1)
	{
		this.i1 = i1;
	}
	public  Integer getI1()
	{
		return i1;
	}
	public static void setI2(int val)
	{
		i2 = val;
	}
	public static Integer getI2()
	{
		return i2;
	}
	public void displayDetails()
	{
		System.out.println("i1 = "+i1+",i2 = "+i2);
	}
}
