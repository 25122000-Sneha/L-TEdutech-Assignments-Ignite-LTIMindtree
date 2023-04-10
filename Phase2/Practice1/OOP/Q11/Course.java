package Phase2.Practice1.OOP.Q11;

public class Course {
    private Integer id;
    private String name;
    Course(){}
    Course(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public Integer getId()
    {
        return id;
    }
    public String getName()
    {
        return this.name;
    }

}
