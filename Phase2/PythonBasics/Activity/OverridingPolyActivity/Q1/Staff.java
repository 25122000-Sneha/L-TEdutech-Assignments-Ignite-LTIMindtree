package Phase2.PythonBasics.Activity.OverridingPolyActivity.Q1;
class Staff{
    private String staffName, designation;
	public Staff(String staffName, String designation)
	{
		this.staffName = staffName;
		this.designation = designation;
	}
	public void setStaffName(String name)
	{
		this.staffName = name;
	}
	public String getStaffName()
	{
		return this.staffName;
	}
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	public String getDesignation()
	{
		return this.designation;
	}
}