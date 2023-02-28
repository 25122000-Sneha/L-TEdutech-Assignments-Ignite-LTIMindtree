package Foundation.Activities.ConditionalStatementActivity.DivBy2Or3;

import java.util.Scanner;

public class DivBy2Or3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        if(num%2==0 || num%3==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
