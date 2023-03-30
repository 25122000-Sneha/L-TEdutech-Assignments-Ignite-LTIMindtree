package Foundation.Practice.P1;
import java.util.*;
public class ReverseArr {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextInt();
        }
        
        int min = arr[0];
        for(int i=0; i<n; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);
        //System.out.println(max);
        int sec_small = Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            if((arr[i]<sec_small) && (arr[i]!=min))
            {
                sec_small = arr[i];
            }
        }
        System.out.println(sec_small);
        
        
    }
}
