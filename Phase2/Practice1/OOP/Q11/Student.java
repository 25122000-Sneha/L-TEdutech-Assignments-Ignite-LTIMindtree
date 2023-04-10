package Phase2.Practice1.OOP.Q11;

public class Student {
    private String name;
    private Integer registerNo;
    Student(){}
    Student(String name, Integer registerNo)
    {
        this.name = name;
        this.registerNo = registerNo;
    }
    public String getName()
    {
        return this.name;
    }
    public Integer getRegisterNo()
    {
        return this.registerNo;
    }
    void display(Course obj)
    {
        System.out.println(name+" is learning the "+obj.getName()+" course");
    }
}
