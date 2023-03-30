package Foundation.PatternPrinting.Practice1;
import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int count;
        for(int i=1; i<=n; i++)
        {
            count = i;
            for(int j=1; j<=n; j++)
            {
                if(j>=i)
                {
                    System.out.print(count++ +" ");
                }
            }
            System.out.println();
        }
    }
}
