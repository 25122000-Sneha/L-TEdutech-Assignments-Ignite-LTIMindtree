package Foundation.Practice.A1;

import java.util.Scanner;

public class NonRepeatArr {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextInt();
        }
        int[] freqArr = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            freqArr[i]=1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    freqArr[i]++;
                    arr[j] = -1;
                }
            }
        }
        for(int i=0; i<freqArr.length; i++)
        {
            if((arr[i]!=-1) && (freqArr[i]==1))
            {
                System.out.println(arr[i]);
            }
        }
    }
}
