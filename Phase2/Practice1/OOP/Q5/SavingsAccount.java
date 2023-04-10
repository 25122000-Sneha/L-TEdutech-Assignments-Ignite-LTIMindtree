package Phase2.Practice1.OOP.Q5;

public class SavingsAccount extends Account{
    private String orgName;
    public void setOrgName(String orgName)
    {
        this.orgName = orgName;
    }
    public String getOrgName()
    {
        return this.orgName;
    }
    SavingsAccount(String accName, String accNo, String bankName, String orgName)
    {
        super(accName, accNo, bankName);
        this.orgName = orgName;
    }
    void display()
    {
        super.display();
        System.out.println("Organisation Name:"+this.orgName);
    }
}
