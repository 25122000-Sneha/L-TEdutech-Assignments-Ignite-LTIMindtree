package Phase2.PythonBasics.Activity.InheritanceActivity.Q4;

public class FixedAccount extends SavingAccount{
	//fill the code
	private Integer lockingPeriod;
	public FixedAccount(String accNum, double bal, String name, double minBal, Integer lockingPeriod)
	{
		super(accNum, bal, name, minBal);
		this.lockingPeriod = lockingPeriod;
	}
	public Integer getLockingPeriod()
	{
		return this.lockingPeriod;
	}
}


