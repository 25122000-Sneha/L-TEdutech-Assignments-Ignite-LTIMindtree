package Phase2.PythonBasics.Activity.OverridingPolyActivity.Q2;



public class Course {
	//Your code here
	private Integer id;
	private String name;
	public Course(Integer id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setCourseName(String course)
	{
		this.name = course;
	}
	public String getCourseName()
	{
		return this.name;
	}

	
}

