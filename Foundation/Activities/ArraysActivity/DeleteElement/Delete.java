package Foundation.Activities.ArraysActivity.DeleteElement;

import java.util.Scanner;

public class Delete {
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
        System.out.println("Enter the location where you wish to delete an element");
        int pos = reader.nextInt();
        
        int index = pos - 1;
        if(pos > arr.length)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else 
        {
            for(int i=index; i<arr.length-1; i++)
            {
                arr[i] = arr[i+1];
            }
        }
        System.out.println("Array after deletion is");
        for(int i=0; i<arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
