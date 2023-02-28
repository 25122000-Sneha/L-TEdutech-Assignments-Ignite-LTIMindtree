package Foundation.Activities.ArraysActivity.ArrayMedian;
import java.util.*;
public class Median {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = reader.nextInt();
        System.out.println("Enter the elements in the array");
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextInt();
        }
        double median;
        Arrays.sort(arr);
        if(n%2!=0)
        {
            median = (double)arr[(n/2)]; //(n/2)th index
        }
        else 
        {
            median = (double)(arr[(n-1)/2]+arr[n/2])/2.0;
        }
        System.out.println("The median of the array is "+String.format("%.2f",median));

    }
}
