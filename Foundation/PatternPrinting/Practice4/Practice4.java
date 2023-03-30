package Foundation.PatternPrinting.Practice4;
import java.util.*;
public class Practice4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int count;
        for(int i=1; i<=n; i++)
        {
            
            for(int j=1; j<=n; j++)
            {
                if(j<=i)
                {
                    System.out.print( "*" +" ");
                }
            }
            System.out.println();
        }
    }
}
