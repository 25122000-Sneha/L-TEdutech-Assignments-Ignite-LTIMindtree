package Foundation.Activities.LoopForLoopActivity.DesignCodes.PrintN1ToN2;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                System.out.println("Enter the value of a");
                int n1 = reader.nextInt();
                System.out.println("Enter the value of b");
                int n2 = reader.nextInt();
                for(int i=n1; i<=n2; i++)
                {
                    System.out.println(i);
                }
    }
}
