package Foundation.Activities.TwoDArray.MahirlQ9;
import java.util.*;
public class MahirlQ9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //System.out.println("Enter the number of elements in the array");
        int n = reader.nextInt();
        int[][] arr = new int[n][n];
        int count = 1;
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                for(int j=0; j<n; j++)
                {
                    arr[i][j] = count++;
                }
            }
            else 
            {
                for(int j=n-1; j>=0; j--)
                {
                    arr[i][j] = count++;
                }
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int r = reader.nextInt();
        int c = reader.nextInt();
        System.out.println(arr[r-1][c-1]);
    }
}
/*
input:
5
3
2
output:
1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25

12
 */