//star pattern using continue
package Foundation.Activities.BreakContinueActivity.StarPattern;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(j<=i)
                {
                    System.out.print("*");
                    //continue;
                }
                else{
                    //System.out.print(" ");
                    continue;
                }
            }
            System.out.println();
        }
    }
}
