package Foundation.Activities.WhileAndDoWhileActivity.ReversedNum;

import java.util.Scanner;

public class ReversedNum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            System.out.println("Enter the number :");
            int num = reader.nextInt();

            int reversedNum = 0;
            while(num!=0)
            {
                int lastDigit = num%10;
                reversedNum = ( reversedNum*10) + lastDigit;
                num = num/10;
            }
            System.out.println("Reverse of the number is "+reversedNum);
    }
}
