package Foundation.Activities.NestedForActivity.Pattern3;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            int n = reader.nextInt();
           int count = 0;
            for(int i=1; i<=n; i++)
            {
                 count = n;
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
                
                
            }
    }
}
