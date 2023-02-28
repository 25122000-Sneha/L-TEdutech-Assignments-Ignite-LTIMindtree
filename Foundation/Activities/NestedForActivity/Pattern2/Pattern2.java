package Foundation.Activities.NestedForActivity.Pattern2;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            int n = reader.nextInt();
            int count = n;
            for(int i=1; i<=n; i++)
            {
                for(int j=1; j<=n; j++)
                {
                    
                    if(j<=(n+1)-i)
                    {
                        System.out.print(count--);
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                count = n-i;
                
            }
    }
}
/*
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
 */