package Foundation.Activities.TwoDArray.RowSumColumnSum;

import java.util.Scanner;

public class RowColumnSum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the row size");
        int m = reader.nextInt();
        System.out.println("Enter the column size");
        int n = reader.nextInt();
        int rowSum , colSum ;
        int[][] arr = new int[m][n];
        System.out.println("Enter the matrix values");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = reader.nextInt();
            }
        }
        //print matrix
         System.out.println("The matrix is");
         for(int i=0; i<m; i++)
         {
             for(int j=0; j<n; j++)
             {
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }
        //row sum
        for(int i=0; i<m; i++)
        {
            rowSum = 0;
            for(int j=0; j<n; j++)
            {
                rowSum += arr[i][j];
            }
            System.out.println("Row "+(i+1)+" sum is "+rowSum);
        }
        //column sum
        for(int j=0; j<n; j++)
        {
            colSum = 0;
            for(int i=0; i<m; i++)
            {
                colSum+= arr[i][j];
            }
            System.out.println("Column "+(j+1)+" sum is "+colSum);
        }
       
    }
}
