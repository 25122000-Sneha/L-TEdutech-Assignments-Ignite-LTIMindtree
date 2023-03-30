package Foundation.Activities.DataEncapsulationAndStaticActivity.Deposit;

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
	public void setAccount(String account)
	{
		this.account = account;
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
	public void setNo(int noOfTransactions)
	{
		this.noOfTransactions = noOfTransactions;
	}
	public int getNo()
	{
		return this.noOfTransactions;
	}
	public void deposit(double amount)
	{
		balance += amount;
		noOfTransactions++;
		System.out.println("Your balance after the transaction is : "+balance);
	}

	public void withdrawal(double amount)
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
