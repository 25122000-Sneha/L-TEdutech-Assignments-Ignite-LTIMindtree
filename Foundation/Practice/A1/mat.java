package Foundation.Practice.A1;
import java.util.*;
public class mat {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[][] newArr = new int[4][4];
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                arr[i][j] = reader.nextInt();
                newArr[i][j] = arr[i][j];
            }
        }
        int sum;
        int totalSum = 0;
        for(int i=0; i<3; i++)
        {
            sum = 0;
            for(int j=0; j<3; j++)
            {
                sum+= arr[i][j];
            }
            newArr[i][3] = sum;
            totalSum += sum;
        }
        for(int j=0; j<3; j++)
        {
            sum = 0;
            for(int i=0; i<3; i++)
            {
                sum += arr[i][j];
            }
            newArr[3][j] = sum;
        }
        newArr[3][3] = totalSum;

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
