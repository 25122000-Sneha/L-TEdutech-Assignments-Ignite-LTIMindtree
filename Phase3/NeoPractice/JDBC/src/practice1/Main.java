package practice1;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception
	{
		ItemTypeDAO idao = new ItemTypeDAO();
		
		List<ItemType> list = idao.getAllItemTypes();
		
		System.out.printf("%-5s %-15s %-10s %s\n", "ID", "Name", "Deposit", "Cost per day");
		
		for(ItemType obj : list)
		{
			System.out.println(obj);
		}
	}
}
