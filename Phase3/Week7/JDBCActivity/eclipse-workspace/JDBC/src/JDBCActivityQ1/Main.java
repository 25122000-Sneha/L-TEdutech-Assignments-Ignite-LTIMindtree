package JDBCActivityQ1;
import java.util.*;
import java.io.*;
import java.sql.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemTypeDAO idao = new ItemTypeDAO();
		
		try
		{
			List<ItemType> arr = idao.getAllItemTypes();
			System.out.printf("%-5s %-15s %-10s %s\n", "Id", "Name", "Deposit", "Cost per day");
			for(ItemType obj : arr)
			{
				System.out.println(obj);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
