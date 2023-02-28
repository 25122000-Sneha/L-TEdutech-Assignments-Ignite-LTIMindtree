package Foundation.PatternPrinting.Pattern8;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k;
        for(int i=1; i<=n; i++)
        {
            k=1;
            for(int j=1; j<=(2*n-1); j++)
            {
                if((j>=(n+1)-i) && (j<=(n-1)+i))
                {
                    System.out.print(k);
                    if(j<n)
                    {
                        k++;
                    }
                    else 
                    k--;
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
    1
   121
  12321
 1234321
123454321
 */