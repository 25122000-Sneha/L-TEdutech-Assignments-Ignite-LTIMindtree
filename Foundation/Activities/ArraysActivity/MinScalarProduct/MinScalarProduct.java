package Foundation.Activities.ArraysActivity.MinScalarProduct;
import java.util.*;
public class MinScalarProduct {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int minScalarProduct = 0;
        Integer[] arr1 = new Integer[n];
        Integer[] arr2 = new Integer[n];
        for(int i=0; i<n; i++)
        {
            arr1[i] = reader.nextInt();

        }
        for(int i=0; i<n; i++)
        {
            arr2[i] = reader.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder()); //descending order
        for(int i=0; i<n; i++)
        {
            minScalarProduct += arr1[i]*arr2[i];
        }
        System.out.println(minScalarProduct);

    }
}
