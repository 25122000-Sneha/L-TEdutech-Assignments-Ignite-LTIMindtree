package Phase2.PythonBasics.Activity.OverridingPolyActivity.Q2;



public class Student {
	//Your code here
	private String name;
	private Integer registerNo;
	public Student(String name, Integer registerNo)
	{
		this.name = name;
		this.registerNo = registerNo;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setRegisterNo(Integer registerNo)
	{
		this.registerNo = registerNo;
	}
	public Integer getRegisterNo()
	{
		return this.registerNo;
	}
	public void display(Course obj)
	{
		System.out.println(name+" is learning the "+obj.getCourseName()+" course");
	}

}

