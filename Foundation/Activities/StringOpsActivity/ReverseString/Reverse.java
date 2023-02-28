package Foundation.Activities.StringOpsActivity.ReverseString;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();
		System.out.println("Enter a string to reverse");
		String reversed="";
		for(int i=str.length()-1; i>=0; i--)
		{
			reversed += str.charAt(i);
		}
		System.out.println("Reverse of the string is "+reversed);
    }
}
