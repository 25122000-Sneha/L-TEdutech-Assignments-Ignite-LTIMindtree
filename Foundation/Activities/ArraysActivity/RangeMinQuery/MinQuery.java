package Foundation.Activities.ArraysActivity.RangeMinQuery;
import java.util.*;
public class MinQuery {
    public static int minVal(int[] arr, int li, int ri)
    {
        int min = arr[li];
        for(int i=li+1; i<ri+1; i++)
        {
            if(min>arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextInt();
        }
        int k = reader.nextInt();
        int[] result = new int[k];
        for(int i=0; i<k; i++)
        {
            int l = reader.nextInt();
            int r = reader.nextInt();
            int li = l-1;
            int ri = r-1;
            result[i] = minVal(arr, li, ri);
        }
        for(int j=0; j<k; j++)
        {
            System.out.println(result[j]);
        }
    }

}

