package Phase2.Practice1.OOP.Q10;

public class Department {
    private String departmentName;
    private Staff staff;
    public void setDeptName(String deptName)
    {
        this.departmentName = deptName;
    }
    public String getDeptName()
    {
        return this.departmentName;
    }
    public void setStaff(Staff s)
    {
        this.staff = s;
    }
    public Staff getStaff()
    {
        return staff;
    }
    public void displayStaff()
    {
        System.out.println(staff.getStaffName()+" is working in the "+departmentName+" department as "+staff.getDesignation());
    }
}
