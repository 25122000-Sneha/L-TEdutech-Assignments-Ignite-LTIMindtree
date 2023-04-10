package Phase2.Practice1.OOP.Q6;

public class Event {
    protected String name, detail, type, organiserName;
    public Event(){}
    public Event(String name, String detail, String type, String organiserName)
    {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiserName = organiserName;
    }
    void display()
    {
        System.out.println("Event Name:"+this.name);
        System.out.println("Detail:"+this.detail);
        System.out.println("Type:"+this.type);
        System.out.println("Organiser Name:"+this.organiserName);
    }
}
