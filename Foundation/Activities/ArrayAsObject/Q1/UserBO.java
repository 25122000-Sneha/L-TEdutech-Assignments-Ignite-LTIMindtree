package Foundation.Activities.ArrayAsObject.Q1;
import java.util.*;
public class UserBO {
    public void addUser(User[] userArray,User userIns, int index){
		//write your code here
		userArray[index] = userIns;
		index++;
	}
	
	public void sortUsers(User[] userArray){
		//write your code here
		Comparator<User> comparator = new Comparator<User>(){
			public int compare(User obj1, User obj2)
			{
				if(obj1.getName().compareTo(obj2.getName()) > 0)
                {
                    return 1;
                }
                else 
                return -1;
			}
		};
		Arrays.sort(userArray, comparator);
	}
	
	public boolean deleteUser(User[] userArray,String name){
		//write your code here
		for(int i=0; i<userArray.length; i++)
		{
			if(userArray[i].getName().equals(name))
			{
				for(int j=i; j<userArray.length-1; j++)
				{
					userArray[j] = userArray[j+1];
				}
				return true;
			}
		}
		return false;
	
	}
	
	public void displayAll(User[] userArray, int n) {
		//write your code here
		System.out.println("User Details:");
		for(int i=0; i<n; i++)
		{
			System.out.println("User "+(i+1));
			System.out.println("Name:"+userArray[i].getName());
			System.out.println("Mobile Number:"+userArray[i].getMobileNumber());
		}

	}
}
