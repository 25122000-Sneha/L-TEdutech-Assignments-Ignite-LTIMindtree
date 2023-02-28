package Foundation.Activities.ArraysActivity.CompatibleArrays;

import java.util.Scanner;

public class CompatibleArrays {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] arr1 = new int[15];
        int[] arr2 = new int[15];

        for(int i=0; i<n; i++)
        {
            arr1[i] = reader.nextInt();

        }
        for(int i=0; i<n; i++)
        {
            arr2[i] = reader.nextInt();
        }
        if(arr1.length == arr2.length)
        {
            int flag = 0;
            for(int i=0; i<n; i++)
            {
                if(arr1[i] >= arr2[i])
                {
                    flag++;
                }
            }
            if(flag==n)
            {
                System.out.println("Compatible");
            }
            else 
            {
                System.out.println("Incompatible");
            }
        }
        else 
        {
            System.out.println("Incompatible");
        }
    }
}
