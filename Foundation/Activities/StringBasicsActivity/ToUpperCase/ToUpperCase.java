package Foundation.Activities.StringBasicsActivity.ToUpperCase;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = reader.nextLine();
		System.out.println("Name:"+name.toUpperCase());
    }
}
