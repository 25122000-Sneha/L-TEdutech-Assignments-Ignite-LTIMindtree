
//ERROR ERROR ERROR ERROR


package Foundation.Activities.ArraysActivity.ArrayInsertion;

import java.util.*;

public class ArrayInsert {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = reader.nextInt();
        System.out.println("Enter the elements in the array");
        Double[] arr = new Double[n+1];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextDouble();

        }
        System.out.println("Enter the location where you wish to insert an element");
        int pos = reader.nextInt();
        int index = pos-1;
        System.out.println("Enter the value where you wish to insert");
        double val = reader.nextDouble();
        for(int i=arr.length-1; i>index; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[index] = val;
        System.out.println("Array Elements now:\n");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(String.format("%.1f", arr[i])+" ");
        }

        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
        
    }
}
