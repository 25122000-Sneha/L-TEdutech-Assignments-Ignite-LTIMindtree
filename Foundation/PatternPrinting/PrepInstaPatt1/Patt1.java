package Foundation.PatternPrinting.PrepInstaPatt1;

import java.util.Scanner;

public class Patt1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int c = reader.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=c; j++)
            {
                if(j==1 || j==c || i==1 || i==n)
                {
                    System.out.print("*");
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
4
6
******
*    *
*    *
******
 */