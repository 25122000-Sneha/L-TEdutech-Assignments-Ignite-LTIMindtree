package Foundation.Activities.ArraysActivity.Mode;

import java.util.Scanner;

public class Mode {
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
        int count;
        int maxCount = 0, mode=0;
        for(int i=0; i<n; i++)
        {
            count = 0;
            int num = arr[i];
            for(int j=0; j<n; j++)
            {
                if(num==arr[j])
                {
                    count++;
                }
            }
            if(count > maxCount)
            {
                maxCount = count;
                mode = arr[i];
            }
        }
        if(maxCount == 1)
        {
            System.out.println("The mode of the array is none");
        }
        else
        {
            System.out.println("The mode of the array is "+mode);
        }
        
    }
}
