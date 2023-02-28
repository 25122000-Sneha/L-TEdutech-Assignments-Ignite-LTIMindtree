package Foundation.Activities.StringOpsActivity.StartWith;

import java.util.Scanner;

public class StartsWith {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = reader.nextLine();
		System.out.println("Enter the start string");
		String startStr = reader.nextLine();
		if(str.startsWith(startStr))
		{
			System.out.println("\""+str+"\""+" starts with "+ "\""+startStr+"\"");
		}
		else 
		{
			System.out.println("\""+str+"\""+ " does not start with "+ "\"" +startStr+ "\"");
		}
    }
}
