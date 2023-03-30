package Foundation.Practice.MultiDArray;
import java.util.*;
public class m4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[][] arr = new int[n][n];
        int r = reader.nextInt();
        int c = reader.nextInt();
        int count = 0;
        for(int i=0; i<n; i++)
        {
            count = n*(i+1);
            for(int j=0; j<n; j++)
            {
                arr[i][j] = count;
                count--;
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
