package Phase2.PythonBasics.Activity.OverridingPolyActivity.Q2;

import java.util.*;

public class Main {

	public static void main(String[] args){
		//Your code here
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the student name:");
		String n = reader.nextLine();
		System.out.println("Enter the register number:");
		int r = reader.nextInt();
		System.out.println("Enter the course id:");
		int id = reader.nextInt();
		reader.nextLine();
		System.out.println("Enter the course name:");
		String c = reader.nextLine();
		Course courseObj = new Course(id, c);
		Student s = new Student(n, r);
		s.display(courseObj);
	}

}
