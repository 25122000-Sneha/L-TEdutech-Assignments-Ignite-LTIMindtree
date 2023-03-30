package Foundation.Practice.A1;

import java.util.*;

public class NonRepeatHash {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else 
            {
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
            if(e.getValue() == 1)
            {
                System.out.println(e.getKey());
            }
        }
    }
}
