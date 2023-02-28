package Foundation.Activities.PrimitiveDataTypeActivity.CustomizedWelcome;

import java.util.Scanner;

public class CustomeWelcome {
    public static void main(String[] args) {
        Scanner reader  = new Scanner(System.in);

		String name;

		System.out.println("Enter your name");
		name =reader.nextLine();

		System.out.println("Hello"+ " "+ name+"!"+" "+"Welcome to Event Management System.");
    }
}
