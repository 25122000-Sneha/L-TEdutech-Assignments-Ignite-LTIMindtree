package Phase2.PythonBasics.Activity.InheritanceActivity.Q1;

public class SavingsAccount extends Account{
    private String orgName;
	SavingsAccount(){

	}
	SavingsAccount(String accName, String accNo, String bankName, String orgName)
	{
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
		this.orgName = orgName;
	}

	public void display()
	{
		super.display();
		System.out.println("Organisation Name:"+orgName);
	}
}
