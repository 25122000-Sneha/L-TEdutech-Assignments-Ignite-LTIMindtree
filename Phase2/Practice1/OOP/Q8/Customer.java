package Phase2.Practice1.OOP.Q8;

public class Customer {
    private String name, account;
    private double balance;
    private static int noOfTransactions = 0;
    Customer(String name, String account, double balance)
    {
        this.name = name;
        this.account = account;
        this.balance = balance;
    }
    public String getName()
    {
        return this.name;
    }
    public String getAccount()
    {
        return this.account;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public int getNoOfTransactions()
    {
        return this.noOfTransactions;
    }
    void deposit(double amount)
    {
        balance += amount;
        noOfTransactions++;
        System.out.println("Your balance after the transaction is : "+balance);
    }
    void withdrawal(double amount)
    {
        if(amount > balance)
        {
            System.out.println("Insufficient Balance");
        }
        else 
        {
            balance -= amount;
            noOfTransactions++;
            System.out.println("Your balance after the transaction is : "+balance);
        }
    }

}
