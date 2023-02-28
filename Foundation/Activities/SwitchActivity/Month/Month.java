package Foundation.Activities.SwitchActivity.Month;

import java.util.Scanner;


public class Month {
    public static boolean isLeap(int year)
    {
        if(year % 400 == 0)
        return true;
        else if(year % 4 == 0 && year % 100 != 0)
        return true;
        else 
        return false;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the month:");
        int month = reader.nextInt();
        System.out.println("Enter the year:");
        int year = reader.nextInt();
        int days = 0;
        String monthName = "";
        switch(month)
        {
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                if(isLeap(year))
                days = 29;
                else 
                days = 28;
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6:
                monthName = "June";
                days = 30;
                break;
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12:
                monthName = "December";
                days = 31;
                break;
            default:
                System.out.println("Invalid Month");
                System.exit(0);
        }
        System.out.println(monthName+" of "+year+" has "+days+" days.");
    }
}
