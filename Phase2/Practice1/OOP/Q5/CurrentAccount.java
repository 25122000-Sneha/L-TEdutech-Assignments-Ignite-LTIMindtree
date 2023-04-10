package Phase2.Practice1.OOP.Q5;

public class CurrentAccount extends Account{
    private String tinNumber;
    public void setTinNumber(String tinNumber)
    {
        this.tinNumber = tinNumber;
    }
    public String getTinNumber()
    {
        return this.tinNumber;
    }
    CurrentAccount(String accName, String accNo, String bankName, String tinNumber)
    {
        super(accName, accNo, bankName);
        this.tinNumber = tinNumber;

    }
    void display()
    {
        super.display();
        System.out.println("TIN Number:"+this.tinNumber);
    }
}
