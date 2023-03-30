package Phase2.PythonBasics.Activity.ClassObjActivity.CustomerQ3;

public class Customer {
    String customerName, customerEmail, customerType, customerLocation;
	public Customer()
	{

	}
	public Customer(String customerName, String customerEmail, String customerType, String customerLocation)
	{
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerType = customerType;
		this.customerLocation = customerLocation;
	}
	public void displayDetails(){

			//Fill your code
		System.out.println("Name: "+customerName);
    	System.out.println("E-mail: "+customerEmail);
    	System.out.println("Type: "+customerType);
    	System.out.println("Location: "+customerLocation);

	}
	
}
