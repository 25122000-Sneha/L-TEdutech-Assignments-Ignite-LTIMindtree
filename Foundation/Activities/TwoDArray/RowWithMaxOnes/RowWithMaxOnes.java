package Foundation.Activities.TwoDArray.RowWithMaxOnes;

import java.util.Scanner;

public class RowWithMaxOnes {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int m = reader.nextInt();
        int n = reader.nextInt();
        int[][] arr = new int[m][n];
        int ones ;
        int maxOnesRow=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = reader.nextInt();
            }
        }
        int maxOnesCount = 0;
        for(int i=0; i<m; i++)
        {
            ones = 0;
            for(int j=0; j<n; j++)
            {
                if(arr[i][j] == 1)
                {
                    ones ++;
                }
            }
            //System.out.println(ones);
            
            if(ones > maxOnesCount)
            {
                maxOnesCount = ones;
                maxOnesRow = i;
            }
            //System.out.println(maxOnesCount);
            //System.out.println(maxOnesRow);

        }
        System.out.println(maxOnesRow);
    }
}
/*
4
4
1 0 0 0
0 0 1 1
1 1 1 0
1 0 0 0
 */