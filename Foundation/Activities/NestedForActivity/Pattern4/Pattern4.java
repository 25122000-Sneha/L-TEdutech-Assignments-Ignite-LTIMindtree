package Foundation.Activities.NestedForActivity.Pattern4;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            int n = reader.nextInt();
          
            for(int i=1; i<=n; i++)
            {
                 
                for(int j=1; j<=n; j++)
                {
                    
                    if(true)
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
