package Phase2.PythonBasics.Activity.InheritanceActivity.Q2;

import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Main {
	public static void main(String args[]) throws Exception{
		//write your code here
		Scanner reader = new Scanner(System.in);
		double costPerDay, gst, totalCost;
		String start,end;
		String startArr[], endArr[];
		long daysBetween;
		LocalDate date1, date2;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		System.out.println("Enter your choice:\n1.Exhibition event\n2.Stage event");
		int ch = reader.nextInt();
		reader.nextLine();
		switch(ch)
		{
			case 1:
						System.out.println("Enter the details of exhibition:");
						String str1 = reader.nextLine();
						String[] arr1 = str1.split(",");
						int stall = Integer.parseInt(arr1[5]);
						costPerDay = Double.parseDouble(arr1[4]);
						Exhibition e = new Exhibition(arr1[0], arr1[1], arr1[2], arr1[3], costPerDay,stall );
						System.out.println("Enter the starting date of the event:");
						start = reader.nextLine();
						System.out.println("Enter the ending date of the event:");
						end = reader.nextLine();
						
						date1 = LocalDate.parse(start, dtf);
        				date2 = LocalDate.parse(end, dtf);
						daysBetween = ChronoUnit.DAYS.between(date1, date2);
						totalCost = (int)daysBetween*e.costPerDay;
						gst = 0.05 * totalCost;
						System.out.println("The GST to be paid is Rs."+gst);
						break;
			case 2:
						System.out.println("Enter the details of stage event:");
						String str2 = reader.nextLine();
						String[] arr2 = str2.split(",");
						int seat = Integer.parseInt(arr2[5]);
						costPerDay = Double.parseDouble(arr2[4]);
						StageEvent s = new StageEvent(arr2[0], arr2[1], arr2[2], arr2[3], costPerDay, seat);
						System.out.println("Enter the starting date of the event:");
						start = reader.nextLine();
						System.out.println("Enter the ending date of the event:");
						end = reader.nextLine();
						date1 = LocalDate.parse(start, dtf);
        				date2 = LocalDate.parse(end, dtf);
						daysBetween = ChronoUnit.DAYS.between(date1, date2);
						
						totalCost =(int)daysBetween*s.costPerDay;
						gst = 0.15 * totalCost;
						System.out.println("The GST to be paid is Rs."+gst);
						break;
						
		}

	}
}

