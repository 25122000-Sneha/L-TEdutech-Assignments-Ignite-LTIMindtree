package Foundation.PatternPrinting.Practice6;
import java.util.*;
public class Practice6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        
        for(int i=1; i<=n; i++)
        {
            
            for(int j=1; j<=(2*n)-1; j++)
            {
                
                if((j>=(n+1)-i) && (j<=(2*n)-i))
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
