package Foundation.Activities.TwoDArray.MahirlQ10;
import java.util.*;
public class MahirlQ10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //System.out.println("Enter the number of elements in the array");
        int n = reader.nextInt();
        int[][] arr = new int[n][n];
        int count = 1;
        for(int j=0; j<n; j++)
        {
            if(j%2==0)
            {
                for(int i=0; i<n ;i++)
                {
                    arr[i][j] = count++;
                }
            }
            else 
            {
                for(int i=n-1; i>=0; i--)
                {
                    arr[i][j] = count++;
                }
            }
        }
        int r = reader.nextInt();
        int c = reader.nextInt();
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(arr[r-1][c-1]);
    }
}
/*
input: 
5
3
2
output:
1 10 11 20 21
2 9 12 19 22
3 8 13 18 23
4 7 14 17 24
5 6 15 16 25

8
 */
