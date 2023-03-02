package Foundation.Activities.ArraysActivity.Deletion;

import java.util.Scanner;

public class Deletion {
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
        int index = pos -1;
        for(int i=index; i<arr.length-1; i++)
        {
            arr[i] = arr[i+1];
        }
        System.out.println("Array now:\n");
        for(int i=0; i<arr.length-1; i++)
        {
        System.out.println(arr[i]);
        }
    }
}
