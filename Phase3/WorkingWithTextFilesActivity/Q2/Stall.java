package Phase3.WorkingWithTextFilesActivity.Q2;

public class Stall {
    private String name, category, owner;
    Stall(){}
    public Stall(String name, String category, String owner)
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
        return name;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }
    public String getCategory()
    {
        return category;
    }
    public void setOwner(String owner)
    {
        this.owner = owner;
    }
    public String getOwner()
    {
        return owner;
    }
}
