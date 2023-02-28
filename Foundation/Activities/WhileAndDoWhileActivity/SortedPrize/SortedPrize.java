package Foundation.Activities.WhileAndDoWhileActivity.SortedPrize;

import java.util.Scanner;

public class SortedPrize {
    public static boolean isSorted(int n)
    {
        int num = n;
        int firstDigit = num/100;
        int lastDigit = num%10;
        n = n/10;
        int midDigit = n%10;

        if((firstDigit<=midDigit) & (midDigit<=lastDigit))
        {
            return true;
        }
        else if((firstDigit>=midDigit) & (midDigit>=lastDigit))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static int noOfDigits(int n)
    {
        int digits = 0;
        while(n!=0)
        {
            digits += 1;
            n = n/10;
        }
        return digits;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.close();

        if(noOfDigits(num) == 3)
        {
            if(isSorted(num))
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
        else 
        {
            System.out.println("no");
        }


    }
}
