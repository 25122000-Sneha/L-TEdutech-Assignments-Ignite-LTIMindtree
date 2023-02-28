package Foundation.Activities.ConditionalStatementActivity.DivBy7And3;

import java.util.Scanner;

public class DivBy7And3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        if((num%7==0) && (num%3==0))
        {
            System.out.println(num+" is divisible by both 7 and 3");
        }
        else
        {
            System.out.println(num+" is not divisible by both 7 and 3");
        }
    }
}
