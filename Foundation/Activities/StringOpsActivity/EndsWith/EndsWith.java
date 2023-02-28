package Foundation.Activities.StringOpsActivity.EndsWith;

import java.util.Scanner;

public class EndsWith {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = reader.nextLine();
		System.out.println("Enter the end string");
		String endStr = reader.nextLine();
		if(str.endsWith(endStr))
		{
			System.out.println("\""+str+"\""+" ends with "+ "\""+endStr+"\"");
		}
		else 
		{
			System.out.println("\""+str+"\""+ " does not end with "+ "\"" +endStr+ "\"");
		}
    }
}
