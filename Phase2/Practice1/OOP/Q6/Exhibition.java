package Phase2.Practice1.OOP.Q6;

public class Exhibition extends Event{
    private Integer noOfStalls;
    public void setNoOfStalls(Integer no)
    {
        this.noOfStalls = no;
    }
    public Integer getNoOfStalls()
    {
        return this.noOfStalls;
    }
    public Exhibition(){}
    public Exhibition(String name, String detail, String type, String organiserName, Integer noOfStalls)
    {
        super(name, detail, type, organiserName);
        this.noOfStalls = noOfStalls;
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Number of stalls:"+this.noOfStalls);
    }
}
