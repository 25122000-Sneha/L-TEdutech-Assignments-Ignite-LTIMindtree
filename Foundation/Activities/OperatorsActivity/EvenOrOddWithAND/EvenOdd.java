package Foundation.Activities.OperatorsActivity.EvenOrOddWithAND;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
           System.out.println("Enter any number:");
           int num = reader.nextInt();
           
           if((num&1)==1 )
           {
               System.out.println(num+" is odd.");
           }
           else
           {
               System.out.println(num+" is even.");
           }
    }
}
