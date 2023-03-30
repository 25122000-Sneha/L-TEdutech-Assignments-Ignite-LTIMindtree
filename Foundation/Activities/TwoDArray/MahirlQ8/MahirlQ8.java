package Foundation.Activities.TwoDArray.MahirlQ8;
import java.util.*;
public class MahirlQ8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //System.out.println("Enter the number of elements in the array");
        int n = reader.nextInt();
        int count;
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++)
        {
            count = n*(i+1);
            for(int j=0; j<n; j++)
            {
                arr[i][j] = count;
                count--;
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
6
4
5
output:
6 5 4 3 2 1
12 11 10 9 8 7
18 17 16 15 14 13
24 23 22 21 20 19
30 29 28 27 26 25
36 35 34 33 32 31

20
*/