package Foundation.Activities.LoopForLoopActivity.DesignCodes.Fibo;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                System.out.println("Enter the range:");
                int n = reader.nextInt();
                System.out.println("Fibonacci series:");
                int a=0, b = 1;
                System.out.println(a+"\n"+b);
                int count = 2, sum=0;
                while(count<n)
                {
                    sum = a + b;
                    System.out.println(sum);
                    a=b;
                    b=sum;
                    count++;
                }
    }
}
