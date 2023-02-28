package Foundation.Activities.ArraysActivity.Mode;

import java.util.*;

public class Mode2 {
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
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int val;
        for(int i=0; i<n; i++)
        {
            if(map.containsKey(arr[i]))
            {
                val = map.get(arr[i]);
                map.put(arr[i], ++val);
            }
            else 
            {
                map.put(arr[i], 1);
            }
        }
        //System.out.println(map.toString());
        int maxCount = 0, count=0, mode=0;
        for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
            count = e.getValue();
            if(count > maxCount)
            {
                maxCount = count;
                mode = e.getKey();
            }
        }
        if(maxCount==1)
        {
            System.out.println("The mode of the array is none");
        }
        else 
        {
            System.out.println("The mode of the array is "+mode);
        }


    }
}
