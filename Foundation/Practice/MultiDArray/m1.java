package Foundation.Practice.MultiDArray;
import java.util.*;
public class m1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int m = reader.nextInt();
        int n = reader.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = reader.nextInt();
            }
        }
        int max = 0;
        for(int i=0; i<m; i++)
        {
            max = arr[i][0];
            for(int j=0; j<n; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
            System.out.println(max);
        }
    }
}
