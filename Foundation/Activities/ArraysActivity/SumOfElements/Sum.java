package Foundation.Activities.ArraysActivity.SumOfElements;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] arr = new int[15];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum+= arr[i];
        }
        System.out.println("The sum of the elements in the array is "+sum);
    }
}
