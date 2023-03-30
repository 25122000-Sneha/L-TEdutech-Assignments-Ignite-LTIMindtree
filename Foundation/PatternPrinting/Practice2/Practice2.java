package Foundation.PatternPrinting.Practice2;
import java.util.*;
public class Practice2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int count;
        for(int i=1; i<=n; i++)
        {
            count = (n+1) - i;
            for(int j=1; j<=n; j++)
            {
                if(j>=i)
                {
                    System.out.print(count-- +" ");
                }
            }
            System.out.println();
        }
    }
}
