package Foundation.Activities.DataEncapsulationAndStaticActivity.LetsRock;

import java.util.Scanner;

public class Main {
    public static void displayDetails(Event e)
    {
        System.out.println("Inside Non-Static Method");
		System.out.println("Event Name: "+e.eventType);
		System.out.println("Hall Name: "+e.hallName);
		System.out.println("Start Date: "+e.startDate);
		System.out.println("End Date: "+e.endDate);
		System.out.println("No of People: "+e.noOfPeople);
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the event name");
        String e = reader.nextLine();
        System.out.println("Enter the hall name");
        String h = reader.nextLine();
        System.out.println("Enter the start date(dd/MM/yyyy)");
        String st = reader.nextLine();
        System.out.println("Enter the end date(dd/MM/yyyy)");
        String end = reader.nextLine();
         System.out.println("Enter the no of people");
         int no = reader.nextInt();

        Event obj = new Event(e, h, st, end, no);
        obj.display();
        displayDetails(obj);
      
    }

}
