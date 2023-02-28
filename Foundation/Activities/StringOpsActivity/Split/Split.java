package Foundation.Activities.StringOpsActivity.Split;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = reader.nextLine();
		String[] arr = str.split("\\s");
		System.out.println("The words in the string are");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
    }
}
