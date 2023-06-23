package Phase3.Practice.Q2;

public class Stall {
    private String name;
    private String category;
    private String owner;
    Stall(){}
    Stall(String name, String category, String owner)
    {
        this.name = name;
        this.category = category;
        this.owner = owner;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }
    public String getCategory()
    {
        return this.category;
    }
    public void setOwner(String owner)
    {
        this.owner = owner;
    }
    public String getOwner()
    {
        return this.owner;
    }
    
}

