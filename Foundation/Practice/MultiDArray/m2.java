package Foundation.Practice.MultiDArray;
import java.util.*;
public class m2 {
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
        System.out.println("The matrix is:");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int sum;
        for(int i=0; i<m; i++)
        {
            sum = 0;
            for(int j=0; j<n; j++)
            {
                sum += arr[i][j];
            }
            System.out.println("Row "+(i+1)+" sum is "+sum);
        }
        for(int j=0; j<n; j++)
        {
            sum = 0;
            for(int i=0; i<m; i++)
            {
                sum += arr[i][j];
            }
            System.out.println("Column "+(j+1)+" sum is "+sum);
        }
        

    }
}
