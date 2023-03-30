package Foundation.Practice.MultiDArray;
import java.util.*;
public class m3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int m = reader.nextInt();
        int n = reader.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter matrix vals:");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = reader.nextInt();
            }
        }
        int onesCount = 0;
        int maxOnes = 0;
        int maxOnesRow = 0;
        for(int i=0; i<m; i++)
        {
            onesCount = 0;
            for(int j=0; j<n; j++)
            {
                if(arr[i][j] == 1)
                {
                    onesCount++;
                }
            }
            if(onesCount > maxOnes)
            {
                maxOnes = onesCount;
                maxOnesRow = i;
            }
        }
        System.out.println(maxOnesRow);
    }
}
 