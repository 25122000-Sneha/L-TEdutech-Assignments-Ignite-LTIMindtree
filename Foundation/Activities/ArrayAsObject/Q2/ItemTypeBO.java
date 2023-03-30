package Foundation.Activities.ArrayAsObject.Q2;

public class ItemTypeBO {
    public void add(ItemType n1,ItemType[] itemTypeArray,Integer index){
		//Your code here
		itemTypeArray[index] = n1;
		System.out.println("New item added successfully");
	}
    
	public void search(String search,ItemType[] itemTypeArray){
		//Your code here
		int flag = 0;
		for(int i=0; i<itemTypeArray.length; i++)
		{
			if(itemTypeArray[i].getName().equals(search))
			{
                System.out.println("Searched Item Type is:");
				System.out.println("Name:"+itemTypeArray[i].getName());
				System.out.println("Deposit Amount:"+itemTypeArray[i].getDeposit());
				System.out.println("Cost Per Day:"+itemTypeArray[i].getCostPerDay());
				flag++;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("Searched Item Type not found");
		}

	}
	public void display(ItemType[] itemTypeArray){
		//Your code here
		for(int i=0; i<itemTypeArray.length; i++)
		{
			System.out.println("Item Type Number "+(i+1)+":");
			System.out.println("Name:"+itemTypeArray[i].getName());
			System.out.println("Deposit Amount:"+itemTypeArray[i].getDeposit());
			System.out.println("Cost Per Day:"+itemTypeArray[i].getDeposit());
		}
	}
}
