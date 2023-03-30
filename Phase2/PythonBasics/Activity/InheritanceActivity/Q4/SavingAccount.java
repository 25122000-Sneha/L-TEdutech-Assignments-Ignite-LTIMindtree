package Phase2.PythonBasics.Activity.InheritanceActivity.Q4;

public class SavingAccount extends Account{
	//fill the code
	protected double minimumBalance;
	public SavingAccount(String accNum, double bal, String accHolderName, double minBal)
	{
		super(accNum, bal, accHolderName);
		this.minimumBalance = minBal;
	}
}

