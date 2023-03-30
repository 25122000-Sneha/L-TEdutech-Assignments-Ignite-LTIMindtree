package Foundation.Practice.MultiDArray;
import java.util.*;
public class m6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[][] arr = new int[n][n];
        int r = reader.nextInt();
        int c = reader.nextInt();
        int val = 1;
        for(int j=0; j<n; j++)
        {
            if(j%2==0)
            {
                for(int i=0; i<n; i++)
                {
                    arr[i][j] = val;
                    val++;
                }

            }
            else 
            {
                for(int i=n-1; i>=0; i--)
                {
                    arr[i][j] = val;
                    val++;
                }
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(arr[r-1][c-1]);
    }
}
