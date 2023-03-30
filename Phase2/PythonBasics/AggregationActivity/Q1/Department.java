package Phase2.PythonBasics.AggregationActivity.Q1;

public class Department {
    private String departmentName;
	private Staff staff;
	public Department(String departmentName, Staff s)
	{
		this.departmentName = departmentName;
		this.staff = s;
	}

	public void setDepartmentName(String name)
	{
		this.departmentName = name;
	}
	public String getDepartmentName()
	{
		return this.departmentName;
	}
	
	public void displayStaff() {
		//write your code here
		System.out.println(staff.getStaffName()+" is working in the "+departmentName+" department as "+staff.getDesignation());
	}
}
