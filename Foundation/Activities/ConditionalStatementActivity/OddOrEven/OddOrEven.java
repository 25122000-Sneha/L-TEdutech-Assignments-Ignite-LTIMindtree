package Foundation.Activities.ConditionalStatementActivity.OddOrEven;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.close();
        if(num%2==0)
        {
            System.out.println(num+" is an even number");
        }
        else
       {
           System.out.println(num+" is an odd number");
       }
    
    }
}
