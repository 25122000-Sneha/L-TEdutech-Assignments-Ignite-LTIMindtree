package Phase2.PythonBasics.Activity.ClassObjActivity.Q6;

public class ItemType {
    private String name;
		private double costPerDay, deposit;
		public void setName(String name)
		{
			this.name = name;
		}
		public String getName()
		{
			return this.name;
		}
		public void setCostPerDay(double costPerDay)
		{
			this.costPerDay = costPerDay;
		}
		public double getCostPerDay()
		{
			return this.costPerDay;
		}
		public void setDeposit(double deposit)
		{
			this.deposit = deposit;
		}
		public double getDeposit()
		{
			return this.deposit;
		}


	
	public void display(){

		//Fill your code		
		System.out.println("Item type details");
		System.out.println("Name : "+name);
		System.out.println("CostPerDay : "+String.format("%.2f", costPerDay));
		System.out.println("Deposit : "+String.format("%.2f", deposit));
	
	}
}
