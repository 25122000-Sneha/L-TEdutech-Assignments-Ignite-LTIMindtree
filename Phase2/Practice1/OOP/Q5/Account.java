package Phase2.Practice1.OOP.Q5;

public class Account {
    protected String accName, accNo, bankName;
    Account(String accName, String accNo, String bankName)
    {
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
    }
    void display()
    {
        System.out.println("Account Name:"+this.accName);
        System.out.println("Account Number:"+this.accNo);
        System.out.println("Bank Name:"+this.bankName);
    }
}
