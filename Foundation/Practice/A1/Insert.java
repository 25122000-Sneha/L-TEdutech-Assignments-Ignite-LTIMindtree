package Foundation.Practice.A1;
import java.util.*;
public class Insert {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        double[] arr = new double[n+1];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextDouble();
        }
        System.out.println("Enter position to insert:");
        int pos = reader.nextInt();
        System.out.println("Enter elem to insert:");
        double elem = reader.nextDouble();
        int index = pos - 1;
        for(int i=arr.length-1; i>index; i--)
        {
            arr[i] = arr[i-1];

        }
        arr[index] = elem;
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        int[] freqArr = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            //System.out.println("j");
            freqArr[i] = 1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    freqArr[i]++;
                    arr[j] = -1.0;
                }
            }
        }
        System.out.println();
        for(int i=0; i<freqArr.length; i++)
        {
            if((arr[i]!=-1.0) && (freqArr[i] > 1))
            {
                System.out.println(arr[i]);
            }
        }


    }
}
