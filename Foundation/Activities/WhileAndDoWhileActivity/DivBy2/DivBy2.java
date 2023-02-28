package Foundation.Activities.WhileAndDoWhileActivity.DivBy2;

import java.util.Scanner;

public class DivBy2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the Range :");
        int n1 = reader.nextInt();
        int n2 = reader.nextInt();
        int val=n1;
        while(val<=n2)
        {
            if((val%2==0) & (val%3!=0) & (val%5!=0))            //logical and doesn't check second condition if first is false so we use bitwise and
            {
                System.out.print(val+" ");
            }
            val++;
        }
    }
}
