package Phase2.PythonBasics.Activity.InheritanceActivity.Q1;

public class CurrentAccount extends Account{
    private String tinNumber;
	CurrentAccount(){

	}
	CurrentAccount(String accName, String accNo, String bankName, String tinNumber)
	{
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
		this.tinNumber = tinNumber;

	}

	public void display()
	{
		super.display();
		System.out.println("TIN Number:"+tinNumber);
	}
}
