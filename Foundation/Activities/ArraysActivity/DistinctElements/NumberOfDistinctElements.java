package Foundation.Activities.ArraysActivity.DistinctElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfDistinctElements {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] arr = new int[15];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i=0; i<n; i++)
        {
            if(map.containsKey(arr[i]))
            {
                int val = map.get(arr[i]);
                map.put(arr[i], ++val);
            }
            else 
            {
                map.put(arr[i], 1);
                count++;
            }
            
        }
        System.out.println(count);
        
    }
}
