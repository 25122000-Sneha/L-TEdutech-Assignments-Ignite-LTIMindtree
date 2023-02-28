package Foundation.Activities.TwoDArray.FouthRowSumMatrix;

import java.util.Scanner;

public class FourthRowSumMatrix {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the 3x3 matrix");
        int[][] arr = new int[3][3];
        int[][]  sumArr = new int[4][4];
        int rowSum, colSum;
        int fourthRowColSum = 0;
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                arr[i][j] = reader.nextInt();
                sumArr[i][j] = arr[i][j];
            }
        }
        for(int i=0; i<3; i++)
        {
            rowSum = 0;
            for(int j=0; j<3; j++)
            {
                rowSum += arr[i][j];
            }
            fourthRowColSum += rowSum;
            sumArr[i][3] = rowSum;
        }
        for(int j=0; j<3; j++)
        {
            colSum = 0;
            for(int i=0; i<3; i++)
            {
                colSum += arr[i][j];
            }
            sumArr[3][j] = colSum;
        }

        sumArr[3][3] =  fourthRowColSum;

        System.out.println("The sum matrix is\n");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(sumArr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
