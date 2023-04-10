package Phase2.Practice1.OOP.Q6;

public class StageEvent extends Event{
    private Integer noOfSeats;
    public void setNoOfSeats(Integer noOfSeats)
    {
        this.noOfSeats = noOfSeats;
    }
    public Integer getNoOfSeats()
    {
        return this.noOfSeats;
    }
    public StageEvent(){}
    public StageEvent(String name, String detail, String type, String organiserName, Integer noOfSeats)
    {
        super(name, detail, type, organiserName);
        this.noOfSeats = noOfSeats;
    }
    @Override 
    void display()
    {
        super.display();
        System.out.println("Number of seats:"+this.noOfSeats);
    }
}
