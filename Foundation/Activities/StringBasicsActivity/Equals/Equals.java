package Foundation.Activities.StringBasicsActivity.Equals;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
		System.out.println("Address 1:");
		String ad1 = reader.nextLine();
		System.out.println("Address 2:");
		String ad2 = reader.nextLine();

		if(ad1.equals(ad2))
		{
			System.out.println("RED");

		}
		else if(ad1.replaceAll(" ", "").equals(ad2.replaceAll(" ", "")))
		{
			System.out.println("YELLOW");
		}
		else if(ad1.equalsIgnoreCase(ad2))
		{
			System.out.println("BLUE");
		}
		else 
		{
			System.out.println("GREEN");
		}
    }
}
