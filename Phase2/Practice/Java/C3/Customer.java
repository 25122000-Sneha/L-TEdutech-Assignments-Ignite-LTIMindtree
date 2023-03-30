package Phase2.Practice.Java.C3;

public class Customer {
    private String name, account;
    private double balance;
    private static int noOfTransactions = 0;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAccount(String acc)
    {
        this.account = acc;
    }
    public String getAccount()
    {
        return this.account;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void setNoOfTransactions(int no)
    {
        this.noOfTransactions = no;
    }
    public int getNoOfTransactions()
    {
        return this.noOfTransactions;
    }
    public void deposit(double amt)
    {
        balance += amt;
        noOfTransactions ++;
        System.out.println("Your balance after the transaction is :"+balance);
    }
    public void withdrawal(double amt)
    {
        if(amt > balance)
        {
            System.out.println("Insufficient Balance");
        }
        else 
        {
            balance -= amt;
            noOfTransactions ++;
            System.out.println("Your balance after the transaction is :"+balance);
        }

    }

}
