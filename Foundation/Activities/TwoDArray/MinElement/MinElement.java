package Foundation.Activities.TwoDArray.MinElement;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int m = reader.nextInt();
        int n = reader.nextInt();
        int min = 0;
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = reader.nextInt();
            }
        }

        min = arr[0][0];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(arr[i][j] < min)
                {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("The minimum element is "+min);
    }

}
