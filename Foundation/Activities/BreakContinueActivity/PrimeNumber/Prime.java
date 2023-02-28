package Foundation.Activities.BreakContinueActivity.PrimeNumber;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int flag = 0;
        int i=2;
        while(i<n)
        {
            if(n%i==0)
            {
                flag++;
                break;
            }
			i++;
        }
        if(flag==0)
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
