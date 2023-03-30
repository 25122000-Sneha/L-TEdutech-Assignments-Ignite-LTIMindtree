package Foundation.Practice.A1;
import java.util.*;
public class ArrayDlt {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextInt();
        }
        System.out.println("Enter position to dlt:");
        int pos = reader.nextInt();
        //System.out.println("Enter elem to dlt:");
        //int elem = reader.nextInt();
        int index = pos - 1;
        for(int i=index; i<arr.length-1; i++)
        {
            arr[i] = arr[i+1];
        }
        for(int i=0; i<arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
