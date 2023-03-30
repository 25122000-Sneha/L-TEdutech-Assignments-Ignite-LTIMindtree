package Foundation.PatternPrinting.Practice5;
import java.util.*;
public class Practice5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int count;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==j) && (j==(n/2)+1))
                {
                    System.out.print("*");
                }
                else 
                System.out.print("~");
            }
            System.out.println();
        }
    }
}
