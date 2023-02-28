package Foundation.Activities.OperatorsActivity.TradeFair;

import java.util.Scanner;

public class TradeFair {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
           System.out.println("Enter the total number of people");
           int num = reader.nextInt();
           int x = (2*num)/7;
            System.out.println("Number of attendees on day 1 : "+x);
            System.out.println("Number of attendees on day 2 : "+2*x);
            System.out.println("Number of attendees on day 3 : "+x/2);
    }
}
