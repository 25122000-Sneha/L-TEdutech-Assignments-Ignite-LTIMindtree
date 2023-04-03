package Phase2.Week_6.Exceptions.Codes.Q7;

public class EventType {
    private long id;
    private String name;
    EventType(String name, long id)
    {
        this.id = id;
        this.name = name;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
