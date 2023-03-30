package Foundation.Practice.Q4;
import java.util.*;
class Customer{
    private String name, account;
    private double balance;
    private static int noOfTransactions = 0;
    public void setName(String n)
    {
        this.name = n;
    }
    public String getName()
    {
        return name;
    }
    public void setAccount(String acc)
    {
        this.account = acc;
    }
    public String getAccount()
    {
        return account;
    }
    public void setBalance(double bal)
    {
        this.balance = bal;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setNo(int no)
    {
        this.noOfTransactions = no;
    }
    public int getNo()
    {
        return noOfTransactions;
    }

    public void deposit(double amt)
    {
        balance += amt;
        System.out.println("Your balance after the transaction is : "+balance);
        noOfTransactions++;
        
    }
    public void withdraw(double amt)
    {
        if(amt > balance)
        {
            System.out.println("Insufficient Balance");
        }
        else 
        {
            balance -= amt;
            System.out.println("Your balance after the transaction is : "+balance);
            noOfTransactions++;
        }
    }

}




public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the name");
        String n = reader.nextLine();
        System.out.println("Enter the accountType");
        String acc = reader.nextLine();
        System.out.println("Enter the balance");
        double bal = reader.nextDouble();
        Customer c = new Customer();
        c.setName(n);
        c.setAccount(acc);
        c.setBalance(bal);
        while(true)
        {
            System.out.println("Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit");
            int ch = reader.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the amount to deposit");
                    double amt = reader.nextDouble();
                    c.deposit(amt);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    double amt1 = reader.nextDouble();
                    c.withdraw(amt1);
                    break;
                case 3:
                    System.out.println("Number of Transactions done:"+c.getNo());
                    System.exit(0);
            }

        }
    }
}
