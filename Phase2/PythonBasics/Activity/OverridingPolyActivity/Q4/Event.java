package Phase2.PythonBasics.Activity.OverridingPolyActivity.Q4;


abstract class Event{
    protected String name, detail, ownerName;
    Event(String name, String detail, String ownerName)
    {
           this.name = name;
           this.detail = detail;
           this.ownerName = ownerName;
    }
    
    
    public abstract double projectedRevenue();
   
}