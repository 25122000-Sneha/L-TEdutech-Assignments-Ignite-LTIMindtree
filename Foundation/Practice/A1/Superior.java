package Foundation.Practice.A1;
import java.util.*;
public class Superior {
    public static int findNumberOfSuperiorElements(int[] arr, int n)
    {
        int superiors = 1;
        for(int i=arr.length-2; i>=0; i--)
        {
            int flag = 0;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]<=arr[j])
                {
                    flag ++;
                }
            }
            if(flag == 0)
            {
                superiors++;
            }
        }
        return superiors;
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextInt();
        }
        int count = findNumberOfSuperiorElements(arr, n);
        System.out.println("Number of superior elems is "+count);

    }
}
