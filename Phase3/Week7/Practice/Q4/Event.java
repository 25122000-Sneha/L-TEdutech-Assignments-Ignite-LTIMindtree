package Phase3.Week7.Practice.Q4;

public class Event {
    private String name, details, manager;
    Event(){}
    public Event(String name, String details, String manager)
    {
        this.name = name;
        this.details = details;
        this.manager = manager;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public String getManager() {
        return manager;
    }
    public void setManager(String manager) {
        this.manager = manager;
    }
    
}
