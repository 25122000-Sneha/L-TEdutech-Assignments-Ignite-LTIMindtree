package Foundation.PatternPrinting.HalfDiamond;
import java.util.*;
public class HalfDiamond {
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
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1; i<=n-1; i++)
        {
            for(int j=1; j<=n-1; j++)
            {
                //System.out.println(j);
                if(j<=n-i)
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
