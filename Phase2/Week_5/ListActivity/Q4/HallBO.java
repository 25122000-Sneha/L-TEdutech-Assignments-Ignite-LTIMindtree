package Phase2.Week_5.ListActivity.Q4;
import java.util.*;
public class HallBO {
    public List<Hall> getHallList() {
		List<Hall> hallList=new ArrayList<>();
		hallList.add(new Hall("SPK hall","12345",Double.parseDouble("10000"),"John"));
		hallList.add(new Hall("DRG hall","67890",Double.parseDouble("15000"),"Joe"));
		hallList.add(new Hall("EFG hall","45678",Double.parseDouble("20000"),"Jack"));
		return hallList;
	}
	
	public void displayAll(List<Hall> hallList) {
		//write your code here
		System.out.println("Name\tContact Number\tCost per Day\tOwner Name");
		for (Hall x : hallList)
		{
			System.out.println(x.getName()+"\t"+x.getContactNumber()+"\t"+x.getCostPerDay()+"\t"+x.getOwnerName());
			
		}

	}
}
