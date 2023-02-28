package Foundation.Activities.ArraysActivity.StockSpanProb;

import java.util.Scanner;

public class StockSpan {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextInt();
        }
        
        int[] spanArr = new int[n];
        for(int i=n-1; i>=0; i--)
        {

            int currentStock =  arr[i];
            spanArr[i] = 1;
            for(int j=i-1; j>=0; j--)
            {
                if(currentStock >= arr[j] )
                {
                    spanArr[i]++;
                }
                else
                {
                    break;
                }
            }

        }

        for(int i=0; i<n; i++)
        {
            System.out.println(spanArr[i]);
        }
    }
}
/*
7

100
   
80 
   
60 
   
70 

60

75

85
 */

 /*
Result:
1
1
1
2
1
4
6
  */